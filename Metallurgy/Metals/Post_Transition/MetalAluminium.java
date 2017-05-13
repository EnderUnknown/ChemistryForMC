package EnderUnknown.Chemistry.Metallurgy.Metals.Post_Transition;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalAluminium extends Metals{
	
	public MetalAluminium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 3;
		this.Reactability = 3;
		this.Hardness = "soft";
		this.Element = "Al";
		
	}
}
