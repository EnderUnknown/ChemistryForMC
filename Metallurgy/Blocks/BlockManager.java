package EnderUnknown.Chemistry.Metallurgy.Blocks;

import EnderUnknown.Chemistry.Chemistry;
import EnderUnknown.Chemistry.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockManager {

	public static Block periodictable;
	public static Block foundryprimitive;
	public static Block foundryprimitive_lit;
	
	public static void init(){

		periodictable = new BlockPeriodicTable("periodictable", "periodictable");
		foundryprimitive = new BlockFoundryPrimitive(false, "foundryprimitive", "foundryprimitive");
		foundryprimitive_lit = new BlockFoundryPrimitive(false,"foundryprimitive_lit","foundryprimitive_lit");
	}
	
	public static void registers(){
		registerBlock(periodictable);
		registerBlock(foundryprimitive);
		
		registerBlockNoTab(foundryprimitive_lit);
	}
	
	public static void registerRenders(){
		registerRenders(periodictable);
		registerRenders(foundryprimitive);
		registerRenders(foundryprimitive_lit);
	}
	
	public static void registerBlock(Block block){
		block.setCreativeTab(Chemistry.TabMetallurgy);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	public static void registerBlockNoTab(Block block){
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	public static void registerRenders(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
}
