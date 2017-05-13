package EnderUnknown.Chemistry.proxy;

import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.tileentity.TileEntityFoundryPrimitive;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	
	public void registerRenders(){
		
	}
	public void registerTileEntities() {

		GameRegistry.registerTileEntity(TileEntityFoundryPrimitive.class, Reference.MODID + ":foundryprimitive");

	}
	public void preInit() {
		
	}
	public void init() {
		
	}
}
