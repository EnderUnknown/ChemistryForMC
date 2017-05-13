package EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalBerryllium extends Metals{
	
	public MetalBerryllium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 2;
		this.Reactability = 2;
		this.Hardness = "normal";
		this.Element = "Be";
		
	}
}
