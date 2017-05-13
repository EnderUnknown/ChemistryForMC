package EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalCalcium extends Metals{
	
	public MetalCalcium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 2;
		this.Reactability = 3;
		this.Hardness = "normal";
		this.Element = "Ca";
		
	}
}
