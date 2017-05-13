package EnderUnknown.Chemistry.Metallurgy.Metals.Transition;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalNiobium extends Metals{
	
	public MetalNiobium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 9;
		this.Reactability = 3;
		this.Hardness = "soft";
		this.Element = "Nb";
		
	}
}
