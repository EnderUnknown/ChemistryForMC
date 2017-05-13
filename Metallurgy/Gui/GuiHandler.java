package EnderUnknown.Chemistry.Metallurgy.Gui;



import EnderUnknown.Chemistry.Metallurgy.Container.ContainerFoundryPrimitive;
import EnderUnknown.Chemistry.Metallurgy.tileentity.TileEntityFoundryPrimitive;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;



public class GuiHandler implements IGuiHandler {



	public static final int foundryprimitive = 0;

	@Override

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == foundryprimitive) {

			return new ContainerFoundryPrimitive(player.inventory, (TileEntityFoundryPrimitive) world.getTileEntity(new BlockPos(x, y, z)));

		}

		return null;

	}


	@Override

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

		if(ID == foundryprimitive) {

			return new GuiFoundryPrimitive(player.inventory, (TileEntityFoundryPrimitive) world.getTileEntity(new BlockPos(x, y, z)));

		}

		return null;

	}



}