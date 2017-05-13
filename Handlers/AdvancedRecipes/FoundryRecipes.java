package EnderUnknown.Chemistry.Handlers.AdvancedRecipes;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import EnderUnknown.Chemistry.Metallurgy.Metals.MetalManager;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;


public class FoundryRecipes {
	private static final FoundryRecipes FOUNDRY_BASE = new FoundryRecipes();
    /** The list of foundry results. */
    private final Map<ItemStack, ItemStack> meltingList = Maps.<ItemStack, ItemStack>newHashMap();
    /** A list which contains how many experience points each recipe output will give. */
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    /**
     * Returns an instance of FoundryRecipes.
     */
    public static FoundryRecipes instance()
    {
        return FOUNDRY_BASE;
    }
    private FoundryRecipes(){
    	this.addFoundryRecipe(new ItemStack(MetalManager.aluminium), new ItemStack(Items.APPLE), 0.35F);
    }

    /**
     * Adds a foundry recipe, where the input item is an instance of Block.
     */
    public void addFoundryRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addFoundry(Item.getItemFromBlock(input), stack, experience);
    }

    /**
     * Adds a foundry recipe using an Item as the input item.
     */
    public void addFoundry(Item item, ItemStack stack, float experience)
    {
        this.addFoundryRecipe(new ItemStack(item, 1, 32767), stack, experience);
    }

    /**
     * Adds a foundry recipe using an ItemStack as the input for the recipe.
     */
    public void addFoundryRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getFoundryResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.info("Ignored foundry recipe with conflicting input: " + input + " = " + stack); return; }
        this.meltingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    /**
     * Returns the foundry result of an item.
     */
    public ItemStack getFoundryResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.meltingList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return (ItemStack)entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }

    /**
     * Compares two itemstacks to ensure that they are the same. This checks both the item and the metadata of the item.
     */
    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getSmeltingList()
    {
        return this.meltingList;
    }

    public float getFoundryExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }

        return 0.0F;
    }
}

