package EnderUnknown.Chemistry.Handlers;

import EnderUnknown.Chemistry.Metallurgy.Blocks.BlockManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCraftingRecipes(){
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.periodictable), new Object[] { " i ", "sps", " i ", 's', new ItemStack(Items.DYE,1,0), 'i', Items.IRON_INGOT, 'p', Items.PAPER });
	}
}
