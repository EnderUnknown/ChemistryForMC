package EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalStrontium extends Metals{
	
	public MetalStrontium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 4;
		this.Reactability = 6;
		this.Hardness = "soft";
		this.Element = "St";
		
	}
}
