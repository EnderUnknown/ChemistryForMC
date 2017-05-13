package EnderUnknown.Chemistry.Metallurgy.Metals;

import EnderUnknown.Chemistry.Chemistry;
import EnderUnknown.Chemistry.Reference;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalBarium;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalBerryllium;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalCalcium;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalMagnesium;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalRadium;
import EnderUnknown.Chemistry.Metallurgy.Metals.AlkaliEarthMetal.MetalStrontium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Post_Transition.MetalAluminium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalCaesium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalFrancium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalLithium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalPotassium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalRubidium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Reactive.MetalSodium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalCadmium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalChromium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalCobalt;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalCopper;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalHafnium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalIridium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalManganese;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalMercury;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalMolybdenum;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalNickel;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalNiobium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalOsmium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalPalladium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalPlatinum;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalRhenium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalRhodium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalRuthenium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalRutherfordium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalScandium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalSilver;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalTantalum;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalTechnetium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalTitanium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalTungsten;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalVanadium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalYttrium;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalZinc;
import EnderUnknown.Chemistry.Metallurgy.Metals.Transition.MetalZirconium;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MetalManager {

	public static MetalLithium lithium;
	public static MetalSodium sodium;
	public static MetalPotassium potassium;
	public static MetalRubidium rubidium;
	public static MetalCaesium caesium;
	public static MetalFrancium francium;
	public static MetalMagnesium magnesium;
	public static MetalCalcium calcium;
	public static MetalStrontium strontium;
	public static MetalRadium radium;
	public static MetalBerryllium berryllium;
	public static MetalScandium scandium;
	public static MetalTitanium titanium;
	public static MetalVanadium vanadium;
	public static MetalChromium chromium;
	public static MetalManganese manganese;
	public static MetalCobalt cobalt;
	public static MetalNickel nickel;
	public static MetalCopper copper;
	public static MetalZinc zinc;
	public static MetalBarium barium;
	public static MetalYttrium yttrium;
	public static MetalZirconium zirconium;
	public static MetalNiobium niobium;
	public static MetalMolybdenum molybdenum; 
	public static MetalTechnetium technetium;
	public static MetalRuthenium ruthenium;
	public static MetalRhodium rhodium;
	public static MetalPalladium palladium;
	public static MetalSilver silver;
	public static MetalCadmium cadmium;
	public static MetalHafnium hafnium;
	public static MetalTantalum tantalum;
	public static MetalTungsten tungsten;
	public static MetalRhenium rhenium;
	public static MetalOsmium osmium;
	public static MetalIridium iridium;
	public static MetalPlatinum platinum;
	public static MetalMercury mercury;
	public static MetalRutherfordium rutherfordium;
	public static MetalAluminium aluminium;
	
	public static void init(){

		lithium = new MetalLithium("lithium", "lithium");
		sodium = new MetalSodium("sodium", "sodium");
		potassium = new MetalPotassium("potassium","potassium");
		rubidium = new MetalRubidium("rubidium","rubidium");
		caesium = new MetalCaesium("caesium","caesium");
		francium = new MetalFrancium("francium", "francium");
		magnesium = new MetalMagnesium("magnesium","magnesium");
		calcium = new MetalCalcium("calcium", "calcium");
		strontium = new MetalStrontium("strontium", "strontium");
		radium = new MetalRadium("radium","radium");
		berryllium = new MetalBerryllium("berryllium","berryllium");
		scandium = new MetalScandium("scandium","scandium");
		titanium = new MetalTitanium("titanium", "titanium");
		vanadium = new MetalVanadium("vanadium", "vanadium");
		chromium = new MetalChromium("chromium","chromium");
		manganese = new MetalManganese("manganese", "manganese");
		cobalt = new MetalCobalt("cobalt","cobalt");
		nickel = new MetalNickel("nickel", "nickel");
		copper = new MetalCopper("copper","copper");
		zinc = new MetalZinc("zinc","zinc");
		barium = new MetalBarium("barium","barium");
		yttrium = new MetalYttrium("yttrium","yttrium");
		zirconium = new MetalZirconium("zirconium","zirconium");
		niobium = new MetalNiobium("niobium","niobium");
		molybdenum = new MetalMolybdenum("molybdenum","molybdenum");
		technetium = new MetalTechnetium("technetium","technetium");
		ruthenium = new MetalRuthenium("ruthenium","ruthenium");
		rhodium = new MetalRhodium("rhodium","rhodium");
		palladium = new MetalPalladium("palladium", "palladium");
		silver = new MetalSilver("silver","silver");
		cadmium = new MetalCadmium("cadmium","cadmium");
		hafnium = new MetalHafnium("hafnium","hafnium");
		tantalum = new MetalTantalum("tantalum","tantalum");
		tungsten = new MetalTungsten("tungsten","tungsten");
		rhenium = new MetalRhenium("rhenium","rhenium");
		osmium = new MetalOsmium("osmium","osmium");
		iridium = new MetalIridium("iridium","iridium");
		platinum = new MetalPlatinum("platinum","platinum");
		mercury = new MetalMercury("mercury","mercury");
		rutherfordium = new MetalRutherfordium("rutherfordium","rutherfordium");
		aluminium = new MetalAluminium("aluminium","aluminium");
	}
	
	public static void registers(){

		registerItem(lithium);
		registerItem(sodium);
		registerItem(potassium);
		registerItem(rubidium);
		registerItem(caesium);
		registerItem(francium);
		registerItem(magnesium);
		registerItem(calcium);
		registerItem(strontium);
		registerItem(radium);
		registerItem(berryllium);
		registerItem(scandium);
		registerItem(titanium);
		registerItem(vanadium);
		registerItem(chromium);
		registerItem(manganese);
		registerItem(cobalt);
		registerItem(nickel);
		registerItem(copper);
		registerItem(zinc);
		registerItem(barium);
		registerItem(yttrium);
		registerItem(zirconium);
		registerItem(niobium);
		registerItem(molybdenum);
		registerItem(technetium);
		registerItem(ruthenium);
		registerItem(rhodium);
		registerItem(palladium);
		registerItem(silver);
		registerItem(cadmium);
		registerItem(hafnium);
		registerItem(tantalum);
		registerItem(tungsten);
		registerItem(rhenium);
		registerItem(osmium);
		registerItem(iridium);
		registerItem(platinum);
		registerItem(mercury);
		registerItem(rutherfordium);
		registerItem(aluminium);
	}
	
	public static void registerRenders(){

		registerRenders(lithium);
		registerRenders(sodium);
		registerRenders(potassium);
		registerRenders(rubidium);
		registerRenders(caesium);
		registerRenders(francium);
		registerRenders(magnesium);
		registerRenders(calcium);
		registerRenders(strontium);
		registerRenders(radium);
		registerRenders(berryllium);
		registerRenders(scandium);
		registerRenders(titanium);
		registerRenders(vanadium);
		registerRenders(chromium);
		registerRenders(manganese);
		registerRenders(cobalt);
		registerRenders(nickel);
		registerRenders(copper);
		registerRenders(zinc);
		registerRenders(barium);
		registerRenders(yttrium);
		registerRenders(zirconium);
		registerRenders(niobium);
		registerRenders(molybdenum);
		registerRenders(technetium);
		registerRenders(ruthenium);
		registerRenders(rhodium);
		registerRenders(palladium);
		registerRenders(silver);
		registerRenders(cadmium);
		registerRenders(hafnium);
		registerRenders(tantalum);
		registerRenders(tungsten);
		registerRenders(rhenium);
		registerRenders(osmium);
		registerRenders(iridium);
		registerRenders(platinum);
		registerRenders(mercury);
		registerRenders(rutherfordium);
		registerRenders(aluminium);
		}
	
	public static void registerItem(Item item){
		item.setCreativeTab(Chemistry.TabMetallurgy);
		GameRegistry.register(item);
	}
	
	public static void registerRenders(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
}
