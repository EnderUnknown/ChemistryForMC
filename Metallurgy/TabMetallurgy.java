package EnderUnknown.Chemistry.Metallurgy;

import EnderUnknown.Chemistry.Metallurgy.Metals.MetalManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TabMetallurgy extends CreativeTabs{
	public TabMetallurgy(){
		super("Metallurgy");
		}
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem()
	{
		return new ItemStack(MetalManager.francium);
	}
}
