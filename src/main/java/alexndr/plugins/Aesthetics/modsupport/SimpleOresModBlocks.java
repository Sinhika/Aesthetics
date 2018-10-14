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

public class SimpleOresModBlocks 
{
    // Blocks
	public static SimpleBlock copper_bricks = new SimpleBlock("copper_bricks", Aesthetics.plugin, Material.IRON,
            ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock tin_bricks= new SimpleBlock("tin_bricks", Aesthetics.plugin, Material.IRON,
            ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock onyx_bricks = new SimpleBlock("onyx_bricks", Aesthetics.plugin, Material.ROCK,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.STONE);
	public static SimpleBlock adamantium_bricks = new SimpleBlock("adamantium_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock mythril_bricks = new SimpleBlock("mythril_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	
    public static SimpleStairs copper_brick_stairs = new SimpleStairs("copper_brick_stairs", Aesthetics.plugin,
            copper_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
    public static SimpleStairs tin_brick_stairs= new SimpleStairs("tin_brick_stairs", Aesthetics.plugin, tin_bricks.getDefaultState(),
            ContentCategories.Block.GENERAL);
    public static SimpleStairs onyx_brick_stairs = new SimpleStairs("onyx_brick_stairs", Aesthetics.plugin,
            onyx_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
    public static SimpleStairs adamantium_brick_stairs= new SimpleStairs("adamantium_brick_stairs", Aesthetics.plugin,
            adamantium_bricks.getDefaultState(),
            ContentCategories.Block.GENERAL);
    public static SimpleStairs mythril_brick_stairs = new SimpleStairs("mythril_brick_stairs", Aesthetics.plugin,
            mythril_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
    
	public static SimpleDoor copper_door_block = new SimpleDoor("copper_door", Aesthetics.plugin, Material.IRON,
			"copper_door", ContentCategories.Block.OTHER);
	public static SimpleDoor tin_door_block = new SimpleDoor("tin_door", Aesthetics.plugin, Material.IRON, "tin_door",
			ContentCategories.Block.OTHER);
	public static SimpleDoor adamantium_door_block = new SimpleDoor("adamantium_door", Aesthetics.plugin, Material.IRON,
			"adamantium_door", ContentCategories.Block.OTHER);
	public static SimpleDoor onyx_door_block = new SimpleDoor("onyx_door", Aesthetics.plugin, Material.IRON,
			"onyx_door", ContentCategories.Block.OTHER);
	public static SimpleDoor mythril_door_block = new SimpleDoor("mythril_door", Aesthetics.plugin, Material.IRON,
			"mythril_door", ContentCategories.Block.OTHER);

	public static SimpleBars copper_bars = new SimpleBars("copper_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars tin_bars = new SimpleBars("tin_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars onyx_bars = new SimpleBars("onyx_bars", Aesthetics.plugin, Material.ROCK, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars adamantium_bars = new SimpleBars("adamantium_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars mythril_bars = new SimpleBars("mythril_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);

	/**
	 * configure mod blocks from config settings.
	 */
	public static void configureBlocks() 
	{
        if (Settings.SOBricks) 
        {
        	if (Settings.copperBricks.isEnabled())
        		copper_bricks.setConfigEntry(Settings.copperBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.tinBricks.isEnabled())
        		tin_bricks.setConfigEntry(Settings.tinBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBricks.isEnabled())
        			mythril_bricks.setConfigEntry(Settings.mythrilBricks)
        			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        		if (Settings.onyxBricks.isEnabled())
        			onyx_bricks.setConfigEntry(Settings.onyxBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        		if (Settings.adamantiumBricks.isEnabled())
        			adamantium_bricks.setConfigEntry(Settings.adamantiumBricks)
        			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	}
            if (Settings.SOBrickStairs) 
            {
            	if (Settings.copperBricks.isEnabled())
            		copper_brick_stairs.setConfigEntry(Settings.copperBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.tinBricks.isEnabled())
            		tin_brick_stairs.setConfigEntry(Settings.tinBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	
            	if (ModSupport.use_simple_ores) 
            	{
            		if (Settings.mythrilBricks.isEnabled())
            			mythril_brick_stairs.setConfigEntry(Settings.mythrilBricks)
            			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            		if (Settings.onyxBricks.isEnabled())
            			onyx_brick_stairs.setConfigEntry(Settings.onyxBricks)
            			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            		if (Settings.adamantiumBricks.isEnabled())
            			adamantium_brick_stairs.setConfigEntry(Settings.adamantiumBricks)
            			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	}
             } // end-if SOBrickStairs
        } // end if SOBricks

        if (Settings.SODoors) 
        {
        	if (Settings.copperDoor.isEnabled())
        		copper_door_block.setConfigEntry(Settings.copperDoor);
        	if (Settings.tinDoor.isEnabled())
        		tin_door_block.setConfigEntry(Settings.tinDoor);
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilDoor.isEnabled())
        			mythril_door_block.setConfigEntry(Settings.mythrilDoor);
        		if (Settings.adamantiumDoor.isEnabled())
        			adamantium_door_block.setConfigEntry(Settings.adamantiumDoor);
        		if (Settings.onyxDoor.isEnabled())
        			onyx_door_block.setConfigEntry(Settings.onyxDoor);
        	}
        } // end if SODoors

        if (Settings.SOBars) 
        {
        	if (Settings.copperBars.isEnabled())
        		copper_bars.setConfigEntry(Settings.copperBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.tinBars.isEnabled())
        		tin_bars.setConfigEntry(Settings.tinBars).setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBars.isEnabled())
        			mythril_bars.setConfigEntry(Settings.mythrilBars)
        			.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        		if (Settings.onyxBars.isEnabled())
        			onyx_bars.setConfigEntry(Settings.onyxBars).setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        		if (Settings.adamantiumBars.isEnabled())
        			adamantium_bars.setConfigEntry(Settings.adamantiumBars)
        			.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	}
        } // end SOBars
	} // end configureBlocks()

	/**
	 * Register blocks with Forge.
	 * 
	 * @param registry Forge block registry interface.
	 */
	public static void register(IForgeRegistry<Block> registry) 
	{
        if (Settings.SOBricks) 
        {
        	if (Settings.copperBricks.isEnabled()) registry.register(copper_bricks);
        	if (Settings.tinBricks.isEnabled()) registry.register(tin_bricks);

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBricks.isEnabled()) registry.register(mythril_bricks);
        		if (Settings.onyxBricks.isEnabled()) registry.register(onyx_bricks);
        		if (Settings.adamantiumBricks.isEnabled()) registry.register(adamantium_bricks);
        	}
            if (Settings.SOBrickStairs) 
            {
            	if (Settings.copperBricks.isEnabled()) registry.register(copper_brick_stairs);
            	if (Settings.tinBricks.isEnabled()) registry.register(tin_brick_stairs);

            	if (ModSupport.use_simple_ores) 
            	{
            		if (Settings.mythrilBricks.isEnabled()) registry.register(mythril_brick_stairs);
            		if (Settings.onyxBricks.isEnabled()) registry.register(onyx_brick_stairs);
            		if (Settings.adamantiumBricks.isEnabled()) registry.register(adamantium_brick_stairs);
            	}
             } // end-if SOBrickStairs
        } // end-if SOBricks

        if (Settings.SODoors) 
        {
        	if (Settings.copperDoor.isEnabled()) registry.register(copper_door_block);
        	if (Settings.tinDoor.isEnabled()) registry.register(tin_door_block);

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilDoor.isEnabled()) registry.register(mythril_door_block);
        		if (Settings.adamantiumDoor.isEnabled()) registry.register(adamantium_door_block);
        		if (Settings.onyxDoor.isEnabled()) registry.register(onyx_door_block);
        	}
        } // end if SODoors

        if (Settings.SOBars) 
        {
        	if (Settings.copperBars.isEnabled()) registry.register(copper_bars);
        	if (Settings.tinBars.isEnabled()) registry.register(tin_bars);

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBars.isEnabled()) registry.register(mythril_bars);
        		if (Settings.onyxBars.isEnabled()) registry.register(onyx_bars);
        		if (Settings.adamantiumBars.isEnabled()) registry.register(adamantium_bars);
        	}
        } // end SOBars

	} // end register()
	
	/**
	 * register ItemBlocks with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void registerItemBlocks(IForgeRegistry<Item> registry) 
	{
        if (Settings.SOBricks) 
        {
        	if (Settings.copperBricks.isEnabled()) registry.register(copper_bricks.createItemBlock());
        	if (Settings.tinBricks.isEnabled()) registry.register(tin_bricks.createItemBlock());
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBricks.isEnabled()) registry.register(mythril_bricks.createItemBlock());
        		if (Settings.onyxBricks.isEnabled()) registry.register(onyx_bricks.createItemBlock());
        		if (Settings.adamantiumBricks.isEnabled()) registry.register(adamantium_bricks.createItemBlock());
        	}
        	
            if (Settings.SOBrickStairs) 
            {
            	if (Settings.copperBricks.isEnabled()) registry.register(copper_brick_stairs.createItemBlock());
            	if (Settings.tinBricks.isEnabled()) registry.register(tin_brick_stairs.createItemBlock());

            	if (ModSupport.use_simple_ores) 
            	{
            		if (Settings.mythrilBricks.isEnabled()) registry.register(mythril_brick_stairs.createItemBlock());
            		if (Settings.onyxBricks.isEnabled()) registry.register(onyx_brick_stairs.createItemBlock());
            		if (Settings.adamantiumBricks.isEnabled()) registry.register(adamantium_brick_stairs.createItemBlock());
            	}
             } // end-if SOBrickStairs
        } // end-if SOBricks

        if (Settings.SOBars) 
        {
        	if (Settings.copperBars.isEnabled()) registry.register(copper_bars.createItemBlock());
        	if (Settings.tinBars.isEnabled()) registry.register(tin_bars.createItemBlock());

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBars.isEnabled()) registry.register(mythril_bars.createItemBlock());
        		if (Settings.onyxBars.isEnabled()) registry.register(onyx_bars.createItemBlock());
        		if (Settings.adamantiumBars.isEnabled()) registry.register(adamantium_bars.createItemBlock());
        	}
        }
	} // end registerItemBlocks()

	/**
	 * register models of ItemBlocks with Forge.
	 */
	public static void registerModels() 
	{
        if (Settings.SOBricks) 
        {
        	if (Settings.copperBricks.isEnabled()) copper_bricks.registerItemModel(Item.getItemFromBlock(copper_bricks));
        	if (Settings.tinBricks.isEnabled()) tin_bricks.registerItemModel(Item.getItemFromBlock(tin_bricks));
        	
        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBricks.isEnabled()) mythril_bricks.registerItemModel(Item.getItemFromBlock(mythril_bricks));
        		if (Settings.onyxBricks.isEnabled()) onyx_bricks.registerItemModel(Item.getItemFromBlock(onyx_bricks));
        		if (Settings.adamantiumBricks.isEnabled()) adamantium_bricks.registerItemModel(Item.getItemFromBlock(adamantium_bricks));
        	}
        	
            if (Settings.SOBrickStairs) 
            {
            	if (Settings.copperBricks.isEnabled()) copper_brick_stairs.registerItemModel(Item.getItemFromBlock(copper_brick_stairs));
            	if (Settings.tinBricks.isEnabled()) tin_brick_stairs.registerItemModel(Item.getItemFromBlock(tin_brick_stairs));
            	
            	if (ModSupport.use_simple_ores) 
            	{
            		if (Settings.mythrilBricks.isEnabled()) mythril_brick_stairs.registerItemModel(Item.getItemFromBlock(mythril_brick_stairs));
            		if (Settings.onyxBricks.isEnabled()) onyx_brick_stairs.registerItemModel(Item.getItemFromBlock(onyx_brick_stairs));
            		if (Settings.adamantiumBricks.isEnabled()) adamantium_brick_stairs.registerItemModel(Item.getItemFromBlock(adamantium_brick_stairs));
            	}
             } // end-if SOBrickStairs
        } // end-if SOBricks

        if (Settings.SOBars) 
        {
        	if (Settings.copperBars.isEnabled()) copper_bars.registerItemModel(Item.getItemFromBlock(copper_bars));
        	if (Settings.tinBars.isEnabled()) tin_bars.registerItemModel(Item.getItemFromBlock(tin_bars));

        	if (ModSupport.use_simple_ores) 
        	{
        		if (Settings.mythrilBars.isEnabled()) mythril_bars.registerItemModel(Item.getItemFromBlock(mythril_bars));
        		if (Settings.onyxBars.isEnabled()) onyx_bars.registerItemModel(Item.getItemFromBlock(onyx_bars));
        		if (Settings.adamantiumBars.isEnabled()) adamantium_bars.registerItemModel(Item.getItemFromBlock(adamantium_bars));
        	}
        } // end SOBars

	} // end registerModels()
	
		
} // end class
