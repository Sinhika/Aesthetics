package alexndr.plugins.Aesthetics.modsupport;

import alexndr.api.content.items.SimpleDoorItem;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.plugins.Aesthetics.Aesthetics;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class NetherrocksModItems 
{
    // Items
	public static SimpleDoorItem dragonstone_door = new SimpleDoorItem("dragonstone_door", Aesthetics.plugin,
			NetherrocksModBlocks.dragonstone_door_block);
	public static SimpleDoorItem argonite_door = new SimpleDoorItem("argonite_door", Aesthetics.plugin,
			NetherrocksModBlocks.argonite_door_block);
	public static SimpleDoorItem ashstone_door = new SimpleDoorItem("ashstone_door", Aesthetics.plugin,
			NetherrocksModBlocks.ashstone_door_block);
	public static SimpleDoorItem fyrite_door = new SimpleDoorItem("fyrite_door", Aesthetics.plugin,
			NetherrocksModBlocks.fyrite_door_block);
	public static SimpleDoorItem illumenite_door = new SimpleDoorItem("illumenite_door", Aesthetics.plugin,
			NetherrocksModBlocks.illumenite_door_block);
	public static SimpleDoorItem malachite_door = new SimpleDoorItem("malachite_door", Aesthetics.plugin,
			NetherrocksModBlocks.malachite_door_block);
    
	/**
	 * configure mod items from config settings.
	 */
	public static void configureItems() 
	{
        if (Settings.NRDoors) 
        {
        	if (Settings.dragonstoneDoor.isEnabled())
        		dragonstone_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	if (Settings.argoniteDoor.isEnabled())
        		argonite_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	if (Settings.ashstoneDoor.isEnabled())
        		ashstone_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	if (Settings.fyriteDoor.isEnabled())
        		fyrite_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	if (Settings.illumeniteDoor.isEnabled())
        		illumenite_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        	if (Settings.malachiteDoor.isEnabled())
        		malachite_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        }
	}
	
	/**
	 * register Items with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void register(IForgeRegistry<Item> registry) 
	{
		if (Settings.NRDoors) 
		{
			if (Settings.dragonstoneDoor.isEnabled()) registry.register(dragonstone_door);
			if (Settings.argoniteDoor.isEnabled()) registry.register(argonite_door);
			if (Settings.ashstoneDoor.isEnabled()) registry.register(ashstone_door);
			if (Settings.fyriteDoor.isEnabled()) registry.register(fyrite_door);
			if (Settings.illumeniteDoor.isEnabled()) registry.register(illumenite_door);
			if (Settings.malachiteDoor.isEnabled()) registry.register(malachite_door);
		} // end-if NRDoors
	} // end register()

	/**
	 * register Item models with Forge.
	 */
	public static void registerModels() 
	{
		if (Settings.NRDoors) 
		{
			if (Settings.dragonstoneDoor.isEnabled()) dragonstone_door.registerItemModel();
			if (Settings.argoniteDoor.isEnabled()) argonite_door.registerItemModel();
			if (Settings.ashstoneDoor.isEnabled()) ashstone_door.registerItemModel();
			if (Settings.fyriteDoor.isEnabled()) fyrite_door.registerItemModel();
			if (Settings.illumeniteDoor.isEnabled()) illumenite_door.registerItemModel();
			if (Settings.malachiteDoor.isEnabled()) malachite_door.registerItemModel();
		} // end-if NRDoors
	} // end registerModels()

} // end class