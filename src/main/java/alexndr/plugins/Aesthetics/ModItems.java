package alexndr.plugins.Aesthetics;

import alexndr.plugins.Aesthetics.modsupport.FusionModItems;
import alexndr.plugins.Aesthetics.modsupport.ModSupport;
import alexndr.plugins.Aesthetics.modsupport.NetherrocksModItems;
import alexndr.plugins.Aesthetics.modsupport.SimpleOresModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems 
{
	/**
	 * configure mod items from config settings.
	 */
	public static void configureItems() 
	{
		if(ModSupport.use_simple_ores || ModSupport.hasLimitedSimpleOres()) 
			SimpleOresModItems.configureItems();
		
		if(ModSupport.use_fusion || ModSupport.hasLimitedFusion())
			FusionModItems.configureItems();
		
		if(ModSupport.use_netherrocks)
			NetherrocksModItems.configureItems();
		
	}
	
	/**
	 * register Items with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void register(IForgeRegistry<Item> registry) {
		if(ModSupport.use_simple_ores || ModSupport.hasLimitedSimpleOres()) 
			SimpleOresModItems.register(registry);
		
		if(ModSupport.use_fusion || ModSupport.hasLimitedFusion())
			FusionModItems.register(registry);
		
		if(ModSupport.use_netherrocks)
			NetherrocksModItems.register(registry);
	} // end register()

	/**
	 * register Item models with Forge.
	 */
	public static void registerModels() {
		if(ModSupport.use_simple_ores || ModSupport.hasLimitedSimpleOres()) 
			SimpleOresModItems.registerModels();
		
		if(ModSupport.use_fusion || ModSupport.hasLimitedFusion())
			FusionModItems.registerModels();
		
		if(ModSupport.use_netherrocks)
			NetherrocksModItems.registerModels();
	} // end registerModels()

	/**
	 * register ingots and suchlike with the ore dictionary.
	 */
	public static void registerOreDictionary() 
	{
		// if vanilla diamond is not registered as an ore, register it,
		// because of IC2 diamonds which should also be usable in diamond recipes.
		if (! OreDictionary.doesOreNameExist("gemDiamond"))
		{
			OreDictionary.registerOre("gemDiamond", Items.DIAMOND);
		}
	} // end registerOreDictionary()

} // end class
