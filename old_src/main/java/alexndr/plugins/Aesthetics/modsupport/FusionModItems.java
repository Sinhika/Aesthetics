package alexndr.plugins.Aesthetics.modsupport;

import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.items.SimpleDoorItem;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.plugins.Aesthetics.Aesthetics;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class FusionModItems 
{
    public static SimpleDoorItem bronze_door = new SimpleDoorItem("bronze_door", Aesthetics.plugin, 
    										(SimpleDoor) FusionModBlocks.bronze_door_block);
    
	/**
	 * configure mod items from config settings.
	 */
	public static void configureItems() 
	{
      if (Settings.FDoors && Settings.bronzeDoor.isEnabled()) 
      {
          bronze_door.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
      }
	}
	
	/**
	 * register Items with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void register(IForgeRegistry<Item> registry) 
	{
	      if (Settings.FDoors && Settings.bronzeDoor.isEnabled()) 
	      {
	    	  registry.register(bronze_door);
	      }
	} // end register()

	/**
	 * register Item models with Forge.
	 */
	public static void registerModels() 
	{
	      if (Settings.FDoors && Settings.bronzeDoor.isEnabled()) 
	      {
	    	  bronze_door.registerItemModel();
	      }
	} // end registerModels()

} // end class
