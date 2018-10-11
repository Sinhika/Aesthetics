package alexndr.plugins.Aesthetics.modsupport;

import alexndr.api.content.blocks.SimpleBars;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.registry.ContentCategories;
import alexndr.plugins.Aesthetics.Aesthetics;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class FusionModBlocks 
{
	public static SimpleBlock steel_bricks = new SimpleBlock("steel_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock bronze_bricks = new SimpleBlock("bronze_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock thyrium_bricks = new SimpleBlock("thyrium_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock sinisite_bricks = new SimpleBlock("sinisite_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	
	public static SimpleStairs steel_brick_stairs = new SimpleStairs("steel_brick_stairs", Aesthetics.plugin,
			steel_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs bronze_brick_stairs = new SimpleStairs("bronze_brick_stairs", Aesthetics.plugin,
            bronze_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs thyrium_brick_stairs = new SimpleStairs("thyrium_brick_stairs", Aesthetics.plugin,
            thyrium_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs sinisite_brick_stairs = new SimpleStairs("sinisite_brick_stairs", Aesthetics.plugin,
            sinisite_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	
	public static SimpleDoor bronze_door_block = new SimpleDoor("bronze_door", Aesthetics.plugin, Material.IRON,
			"bronze_door", ContentCategories.Block.OTHER);
	
	public static SimpleBars steel_bars = new SimpleBars("steel_bars", Aesthetics.plugin, Material.IRON, true,
            ContentCategories.Block.GENERAL);
	public static SimpleBars bronze_bars = new SimpleBars("bronze_bars", Aesthetics.plugin, Material.IRON, true,
            ContentCategories.Block.GENERAL);
	public static SimpleBars thyrium_bars = new SimpleBars("thyrium_bars", Aesthetics.plugin, Material.IRON, true,
            ContentCategories.Block.GENERAL);
	public static SimpleBars sinisite_bars = new SimpleBars("sinisite_bars", Aesthetics.plugin, Material.IRON, true,
            ContentCategories.Block.GENERAL);
	
	/**
	 * configure mod blocks from config settings.
	 */
	public static void configureBlocks() 
	{
        if (Settings.FBricks) 
        {
        	if (Settings.steelBricks.isEnabled())
        		steel_bricks.setConfigEntry(Settings.steelBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBricks.isEnabled())
            		bronze_bricks.setConfigEntry(Settings.bronzeBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.thyriumBricks.isEnabled())
            		thyrium_bricks.setConfigEntry(Settings.thyriumBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.sinisiteBricks.isEnabled())
            		sinisite_bricks.setConfigEntry(Settings.sinisiteBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            } // end if simpleores

            if (Settings.FBrickStairs) 
            {
            	if (Settings.steelBricks.isEnabled())
            		steel_brick_stairs.setConfigEntry(Settings.steelBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

                if (ModSupport.use_simple_ores) 
                {
                	if (Settings.bronzeBricks.isEnabled())
                		bronze_brick_stairs.setConfigEntry(Settings.bronzeBricks)
							.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                	if (Settings.thyriumBricks.isEnabled())
                		thyrium_brick_stairs.setConfigEntry(Settings.thyriumBricks)
							.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                	if (Settings.sinisiteBricks.isEnabled())
                		sinisite_brick_stairs.setConfigEntry(Settings.sinisiteBricks)
							.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                }
            }
        } // end-if FBricks

        if (Settings.FDoors && Settings.bronzeDoor.isEnabled()) 
        {
            bronze_door_block.setConfigEntry(Settings.bronzeDoor);
        }

        if (Settings.FBars) 
        {
        	if (Settings.steelBars.isEnabled())
        		steel_bars.setConfigEntry(Settings.steelBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBars.isEnabled())
            		bronze_bars.setConfigEntry(Settings.bronzeBars)
						.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            	if (Settings.thyriumBars.isEnabled())
            		thyrium_bars.setConfigEntry(Settings.thyriumBars)
						.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            	if (Settings.sinisiteBars.isEnabled())
            		sinisite_bars.setConfigEntry(Settings.sinisiteBars)
						.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            } // end-if simpleores
        } // end-if FBars
	} // end configureBlocks()

	/**
	 * Register blocks with Forge.
	 * 
	 * @param registry Forge block registry interface.
	 */
	public static void register(IForgeRegistry<Block> registry) 
	{
        if (Settings.FBricks) 
        {
        	if (Settings.steelBricks.isEnabled()) registry.register(steel_bricks);
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBricks.isEnabled()) registry.register(bronze_bricks);
            	if (Settings.thyriumBricks.isEnabled()) registry.register(thyrium_bricks);
            	if (Settings.sinisiteBricks.isEnabled()) registry.register(sinisite_bricks);
            }
        } // end-if FBricks
        if (Settings.FBrickStairs) 
        {
        	if (Settings.steelBricks.isEnabled()) registry.register(steel_brick_stairs);
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBricks.isEnabled()) registry.register(bronze_brick_stairs);
            	if (Settings.thyriumBricks.isEnabled()) registry.register(thyrium_brick_stairs);
            	if (Settings.sinisiteBricks.isEnabled()) registry.register(sinisite_brick_stairs);
            }
        } // end-if FBrickStairs
        if (Settings.FDoors && ModSupport.use_simple_ores && Settings.bronzeDoor.isEnabled()) 
        {
        	registry.register(bronze_door_block);
        } // end-if FDoors
        if (Settings.FBars) 
        {
        	if (Settings.steelBars.isEnabled()) registry.register(steel_bars);
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBars.isEnabled()) registry.register(bronze_bars);
            	if (Settings.thyriumBars.isEnabled()) registry.register(thyrium_bars);
            	if (Settings.sinisiteBars.isEnabled()) registry.register(sinisite_bars);
            }
        } // end-if FBars
	} // end register()
	
	/**
	 * register ItemBlocks with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void registerItemBlocks(IForgeRegistry<Item> registry) 
	{
        if (Settings.FBricks) 
        {
        	if (Settings.steelBricks.isEnabled()) registry.register(steel_bricks.createItemBlock());
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBricks.isEnabled()) registry.register(bronze_bricks.createItemBlock());
            	if (Settings.thyriumBricks.isEnabled()) registry.register(thyrium_bricks.createItemBlock());
            	if (Settings.sinisiteBricks.isEnabled()) registry.register(sinisite_bricks.createItemBlock());
            }
        } // end-if FBricks
        if (Settings.FBrickStairs) 
        {
        	if (Settings.steelBricks.isEnabled()) registry.register(steel_brick_stairs.createItemBlock());
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBricks.isEnabled()) registry.register(bronze_brick_stairs.createItemBlock());
            	if (Settings.thyriumBricks.isEnabled()) registry.register(thyrium_brick_stairs.createItemBlock());
            	if (Settings.sinisiteBricks.isEnabled()) registry.register(sinisite_brick_stairs.createItemBlock());
            }
        } // end-if FBrickStairs
//        if (Settings.FDoors && ModSupport.use_simple_ores && Settings.bronzeDoor.isEnabled()) 
//        {
        	// door items are registered separately, as items.
//        } // end-if FDoors
        if (Settings.FBars) 
        {
        	if (Settings.steelBars.isEnabled()) registry.register(steel_bars.createItemBlock());
            if (ModSupport.use_simple_ores) 
            {
            	if (Settings.bronzeBars.isEnabled()) registry.register(bronze_bars.createItemBlock());
            	if (Settings.thyriumBars.isEnabled()) registry.register(thyrium_bars.createItemBlock());
            	if (Settings.sinisiteBars.isEnabled()) registry.register(sinisite_bars.createItemBlock());
            }
        } // end-if FBars
	} // end registerItemBlocks()

	/**
	 * register models of ItemBlocks with Forge.
	 */
	public static void registerModels() 
	{
		if (Settings.FBricks) 
		{
			if (Settings.steelBricks.isEnabled()) 
				steel_bricks.registerItemModel(Item.getItemFromBlock(steel_bricks));
			if (ModSupport.use_simple_ores) 
			{
				if (Settings.bronzeBricks.isEnabled()) 
					bronze_bricks.registerItemModel(Item.getItemFromBlock(bronze_bricks));
				if (Settings.thyriumBricks.isEnabled())
					thyrium_bricks.registerItemModel(Item.getItemFromBlock(thyrium_bricks));
				if (Settings.sinisiteBricks.isEnabled()) 
					sinisite_bricks.registerItemModel(Item.getItemFromBlock(sinisite_bricks));
			}
		} // end-if FBricks
        if (Settings.FBrickStairs) 
        {
        	if (Settings.steelBricks.isEnabled())
        		steel_brick_stairs.registerItemModel(Item.getItemFromBlock(steel_brick_stairs));
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.bronzeBricks.isEnabled()) 
        			bronze_brick_stairs.registerItemModel(Item.getItemFromBlock(bronze_brick_stairs));
        		if (Settings.thyriumBricks.isEnabled()) 
        			thyrium_brick_stairs.registerItemModel(Item.getItemFromBlock(thyrium_brick_stairs));
        		if (Settings.sinisiteBricks.isEnabled()) 
        			sinisite_brick_stairs.registerItemModel(Item.getItemFromBlock(sinisite_brick_stairs));
        	}
        } // end-if FBrickStairs
//        if (Settings.FDoors && ModSupport.use_simple_ores && Settings.bronzeDoor.isEnabled()) 
//        {
        	// door blocks do not have item models; the associated item does.
//        } // end-if FDoors
        if (Settings.FBars) {
        	if (Settings.steelBars.isEnabled())
				steel_bars.registerItemModel(Item.getItemFromBlock(steel_bars));
            if (ModSupport.use_simple_ores) {
            	if (Settings.bronzeBars.isEnabled())
    				bronze_bars.registerItemModel(Item.getItemFromBlock(bronze_bars));
            	if (Settings.thyriumBars.isEnabled())
    				thyrium_bars.registerItemModel(Item.getItemFromBlock(thyrium_bars));
            	if (Settings.sinisiteBars.isEnabled())
    				sinisite_bars.registerItemModel(Item.getItemFromBlock(sinisite_bars));
            }
        } // end-if FBars
	} // end registerModels()
	
	/**
	 * ore dictionary registrations for blocks.
	 */
//	public static void registerOreDictionary()
//	{
//	} // end registerOreDictionary()
		

} // end class
