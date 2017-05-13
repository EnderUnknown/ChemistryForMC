package EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalMagnesium extends Metals{
	
	public MetalMagnesium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 2;
		this.Reactability = 4;
		this.Hardness = "normal";
		this.Element = "Mg";
		
	}
}
