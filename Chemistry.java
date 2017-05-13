package EnderUnknown.Chemistry;

import EnderUnknown.Chemistry.Handlers.RecipeHandler;
import EnderUnknown.Chemistry.Metallurgy.TabMetallurgy;
import EnderUnknown.Chemistry.Metallurgy.Blocks.BlockManager;
import EnderUnknown.Chemistry.Metallurgy.Metals.MetalManager;
import EnderUnknown.Chemistry.Util.Utils;
import EnderUnknown.Chemistry.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Chemistry {

	public static final CreativeTabs TabMetallurgy = new TabMetallurgy();
	
	@Mod.Instance(Reference.MODID)
	public static Chemistry instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event){
		MetalManager.init();
		BlockManager.init();
		MetalManager.registers();
		BlockManager.registers();
		
		proxy.registerRenders();
		proxy.registerTileEntities();
		
		
	}
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		RecipeHandler.registerCraftingRecipes();
		
		Utils.getLogger().info("Chemistry is loaded and ready");
		
	}
	
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
		
	}
}
