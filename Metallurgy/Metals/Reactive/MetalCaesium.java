package EnderUnknown.Chemistry.Metallurgy.Metals.Reactive;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalCaesium extends Metals{
	
	public MetalCaesium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 2;
		this.Reactability = 11;
		this.Hardness = "soft";
		this.Element = "Cs";
		
	}
}
