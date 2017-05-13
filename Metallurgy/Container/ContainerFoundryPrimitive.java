package EnderUnknown.Chemistry.Metallurgy.Container;

import EnderUnknown.Chemistry.Handlers.AdvancedRecipes.FoundryRecipes;
import EnderUnknown.Chemistry.Metallurgy.Container.slots.SlotFuel;
import EnderUnknown.Chemistry.Metallurgy.Container.slots.SlotOutputFoundryPrimitive;
import EnderUnknown.Chemistry.Metallurgy.tileentity.TileEntityFoundryPrimitive;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerFoundryPrimitive extends Container
{
    private final IInventory tileFoundry;
    private int cookTime;
    private int totalCookTime;
    private int foundryBurnTime;
    private int currentItemBurnTime;

    public ContainerFoundryPrimitive(InventoryPlayer playerInventory, IInventory foundryInventory)
    {
        this.tileFoundry = foundryInventory;
        this.addSlotToContainer(new Slot(foundryInventory, 0, 56, 17));
        this.addSlotToContainer(new SlotFuel(foundryInventory, 1, 56, 53));
        this.addSlotToContainer(new SlotOutputFoundryPrimitive(playerInventory.player, foundryInventory, 2, 116, 35));

        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k)
        {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
    }

    public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.tileFoundry);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = (IContainerListener)this.listeners.get(i);

            if (this.cookTime != this.tileFoundry.getField(2))
            {
                icontainerlistener.sendProgressBarUpdate(this, 2, this.tileFoundry.getField(2));
            }

            if (this.foundryBurnTime != this.tileFoundry.getField(0))
            {
                icontainerlistener.sendProgressBarUpdate(this, 0, this.tileFoundry.getField(0));
            }

            if (this.currentItemBurnTime != this.tileFoundry.getField(1))
            {
                icontainerlistener.sendProgressBarUpdate(this, 1, this.tileFoundry.getField(1));
            }

            if (this.totalCookTime != this.tileFoundry.getField(3))
            {
                icontainerlistener.sendProgressBarUpdate(this, 3, this.tileFoundry.getField(3));
            }
        }

        this.cookTime = this.tileFoundry.getField(2);
        this.foundryBurnTime = this.tileFoundry.getField(0);
        this.currentItemBurnTime = this.tileFoundry.getField(1);
        this.totalCookTime = this.tileFoundry.getField(3);
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data)
    {
        this.tileFoundry.setField(id, data);
    }

    /**
     * Determines whether supplied player can use this container
     */
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return this.tileFoundry.isUsableByPlayer(playerIn);
    }

    /**
     * Take a stack from the specified inventory slot.
     * 
     */
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 1 && index != 0)
            {
                if (!FoundryRecipes.instance().getFoundryResult(itemstack1).isEmpty())
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (TileEntityFoundryPrimitive.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return ItemStack.EMPTY;
            }
  
            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
}