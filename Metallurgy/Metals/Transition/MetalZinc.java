package EnderUnknown.Chemistry.Metallurgy.Metals.Transition;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalZinc extends Metals{
	
	public MetalZinc(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 7;
		this.Reactability = 3;
		this.Hardness = "hard";
		this.Element = "Zn";
		
	}
}
