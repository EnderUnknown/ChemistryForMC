package EnderUnknown.Chemistry.Metallurgy.Metals;



import java.util.List;

import EnderUnknown.Chemistry.Util.Utils;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class Metals extends Item{

	/** Sets the density of the metal Stack */
	protected int Density = 22;
	/** Sets the reactability of the metal stack */
	protected int Reactability = 0; 
	/** Sets the hardness of the metal stack
	 *  3 types of hardness are soft, normal, hard*/
	protected String Hardness = "normal";
	/** Sets the element of the metal stack*/
	protected String Element = "none";
	/** Boolean: Sets if the element is known */
	protected Boolean Known = true;
	
	public Metals Density(int density){
		this.Density = density;
		return this;
	}	
	public Metals Reactability(int reactability){
		this.Reactability = reactability;
		return this;
	}
	public Metals Hardness(String hardness){
		this.Hardness = hardness;
		return this;
	}
	public Metals Element(String element){
		this.Element = element;
		return this;
	}
	public Metals Known(Boolean known){
		this.Known = known;
		return this;
	}
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.add(TextFormatting.YELLOW.toString() + this.Element);
		if(this.Known == true){
			if(this.Hardness == "soft"){
				tooltip.add(TextFormatting.GREEN + Utils.getLang().localize("hardness.soft"));
			}
			else if(this.Hardness == "normal"){
				tooltip.add(TextFormatting.WHITE + Utils.getLang().localize("hardness.normal"));
			}
			else if(this.Hardness == "hard"){
				tooltip.add(TextFormatting.RED + Utils.getLang().localize("hardness.hard"));
			}
			tooltip.add(TextFormatting.BLUE + "Density: "+ this.Density);
			tooltip.add(TextFormatting.BOLD + TextFormatting.DARK_RED.toString() + "Reactability: "+ this.Reactability);
		
		}
		else{
			tooltip.add(TextFormatting.GRAY + "Unknown Element");
		}
	}
}
