package EnderUnknown.Chemistry.Metallurgy.Metals.Transition;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalRhenium extends Metals{
	
	public MetalRhenium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 20;
		this.Reactability = 3;
		this.Hardness = "normal";
		this.Element = "Re";
		
	}
}
