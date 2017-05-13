package EnderUnknown.Chemistry.Metallurgy.Metals.Reactive;


import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.Metals;
import net.minecraft.util.ResourceLocation;

public class MetalRubidium extends Metals{
	
	public MetalRubidium(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID,registryName));
		
		this.Density = 2;
		this.Reactability = 10;
		this.Hardness = "soft";
		this.Element = "Rb";
		
	}
}
