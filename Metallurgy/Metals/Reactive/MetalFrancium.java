package EnderUnknown.Chemistry.Metallurgy.Metals.Reactive;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalFrancium extends Metals{
	
	public MetalFrancium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 3;
		this.Reactability = 12;
		this.Hardness = "soft";
		this.Element = "Fr";
		
	}
}
