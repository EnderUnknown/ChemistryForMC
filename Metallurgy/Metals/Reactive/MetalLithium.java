package EnderUnknown.Chemistry.Metallurgy.Metals.Reactive;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalLithium extends Metals{
	
	public MetalLithium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 1;
		this.Reactability = 7;
		this.Hardness = "soft";
		this.Element = "Li";
		
	}
}
