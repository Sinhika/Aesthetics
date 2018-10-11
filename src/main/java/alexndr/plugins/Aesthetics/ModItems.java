package alexndr.plugins.Aesthetics;

import alexndr.plugins.Aesthetics.modsupport.FusionModItems;
import alexndr.plugins.Aesthetics.modsupport.ModSupport;
import alexndr.plugins.Aesthetics.modsupport.NetherrocksModItems;
import alexndr.plugins.Aesthetics.modsupport.SimpleOresModItems;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems 
{
	/**
	 * configure mod items from config settings.
	 */
	public static void configureItems() 
	{
		if(ModSupport.use_simple_ores) 
			SimpleOresModItems.configureItems();
		
		if(ModSupport.use_fusion)
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
		if(ModSupport.use_simple_ores) 
			SimpleOresModItems.register(registry);
		
		if(ModSupport.use_fusion)
			FusionModItems.register(registry);
		
		if(ModSupport.use_netherrocks)
			NetherrocksModItems.register(registry);
	} // end register()

	/**
	 * register Item models with Forge.
	 */
	public static void registerModels() {
		if(ModSupport.use_simple_ores) 
			SimpleOresModItems.registerModels();
		
		if(ModSupport.use_fusion)
			FusionModItems.registerModels();
		
		if(ModSupport.use_netherrocks)
			NetherrocksModItems.registerModels();
	} // end registerModels()

	/**
	 * register ingots and suchlike with the ore dictionary.
	 */
//	public static void registerOreDictionary() {
//	} // end registerOreDictionary()

} // end class
