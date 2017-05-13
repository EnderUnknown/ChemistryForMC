package EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalRadium extends Metals{
	
	public MetalRadium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 6;
		this.Reactability = 6;
		this.Hardness = "normal";
		this.Element = "Ra";
		
	}
}
