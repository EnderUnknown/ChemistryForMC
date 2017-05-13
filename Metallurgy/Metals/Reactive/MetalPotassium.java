package EnderUnknown.Chemistry.Metallurgy.Metals.Reactive;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalPotassium extends Metals{
	
	public MetalPotassium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 1;
		this.Reactability = 9;
		this.Hardness = "soft";
		this.Element = "K";
		
	}
}
