package alexndr.plugins.Aesthetics.modsupport;

import alexndr.api.content.items.SimpleDoorItem;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.plugins.Aesthetics.Aesthetics;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class SimpleOresModItems 
{
	// Items
	public static SimpleDoorItem copper_door = new SimpleDoorItem("copper_door", Aesthetics.plugin,
			SimpleOresModBlocks.copper_door_block);
	public static SimpleDoorItem tin_door = new SimpleDoorItem("tin_door", Aesthetics.plugin,
			SimpleOresModBlocks.tin_door_block);
	public static SimpleDoorItem adamantium_door = new SimpleDoorItem("adamantium_door", Aesthetics.plugin,
			SimpleOresModBlocks.adamantium_door_block);
	public static SimpleDoorItem onyx_door = new SimpleDoorItem("onyx_door", Aesthetics.plugin,
			SimpleOresModBlocks.onyx_door_block);
	public static SimpleDoorItem mythril_door = new SimpleDoorItem("mythril_door", Aesthetics.plugin,
			SimpleOresModBlocks.mythril_door_block);
    
	/**
	 * configure mod items from config settings.
	 */
	public static void configureItems() 
	{
		if (Settings.SODoors) {
			if (Settings.copperDoor.isEnabled())
				copper_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
			if (Settings.tinDoor.isEnabled())
				tin_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
			
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilDoor.isEnabled())
        			mythril_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        		if (Settings.adamantiumDoor.isEnabled())
        			adamantium_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        		if (Settings.onyxDoor.isEnabled())
        			onyx_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	}
		} // end-if SODoors
	}
	
	/**
	 * register Items with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void register(IForgeRegistry<Item> registry) 
	{
		if (Settings.SODoors) {
			if (Settings.copperDoor.isEnabled()) registry.register(copper_door);
    		if (Settings.tinDoor.isEnabled()) registry.register(tin_door);
			
        	if (ModSupport.use_simple_ores) 
        	{
    			if (Settings.mythrilDoor.isEnabled()) registry.register(mythril_door);
        		if (Settings.adamantiumDoor.isEnabled()) registry.register(adamantium_door);
        		if (Settings.onyxDoor.isEnabled()) registry.register(onyx_door);
        	}
		} // end-if SODoors
	} // end register()

	/**
	 * register Item models with Forge.
	 */
	public static void registerModels() 
	{
		if (Settings.SODoors) {
    		if (Settings.tinDoor.isEnabled()) tin_door.registerItemModel();
			if (Settings.copperDoor.isEnabled()) copper_door.registerItemModel();
			
        	if (ModSupport.use_simple_ores) 
        	{
    			if (Settings.mythrilDoor.isEnabled()) mythril_door.registerItemModel();
        		if (Settings.adamantiumDoor.isEnabled()) adamantium_door.registerItemModel();
        		if (Settings.onyxDoor.isEnabled()) onyx_door.registerItemModel();
        	}
		} // end-if SODoors
	} // end registerModels()


} // end class
