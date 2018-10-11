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
	public static SimpleBlock tin_bricks;
	public static SimpleBlock onyx_bricks;
	public static SimpleBlock adamantium_bricks;
	public static SimpleBlock mythril_bricks;
	
    public static SimpleStairs copper_brick_stairs;
    public static SimpleStairs tin_brick_stairs;
    public static SimpleStairs onyx_brick_stairs;
    public static SimpleStairs adamantium_brick_stairs;
    public static SimpleStairs mythril_brick_stairs;
    
	public static SimpleDoor copper_door_block;
	public static SimpleDoor tin_door_block;
	public static SimpleDoor adamantium_door_block;
	public static SimpleDoor onyx_door_block;
	public static SimpleDoor mythril_door_block;

	public static SimpleBars copper_bars;
	public static SimpleBars tin_bars;
	public static SimpleBars onyx_bars;
	public static SimpleBars adamantium_bars;
	public static SimpleBars mythril_bars;

	/**
	 * configure mod blocks from config settings.
	 */
	public static void configureBlocks() 
	{
        if (Settings.SOBricks) 
        {
			copper_bricks.setConfigEntry(Settings.copperBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            tin_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.tinBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("tin_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            mythril_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.mythrilBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("mythril_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            onyx_bricks = new SimpleBlock(Aesthetics.plugin, Material.ROCK,
                            ContentCategories.Block.GENERAL)
                                            .setConfigEntry(Settings.onyxBricks)
                                            .setStepSound(SoundType.STONE)
                                            .setUnlocalizedName("onyx_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            adamantium_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL)
                                            .setConfigEntry(Settings.adamantiumBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("adamantium_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
  
            if (Settings.SOBrickStairs) 
            {
                copper_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                copper_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.copperBricks).setUnlocalizedName("copper_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                tin_brick_stairs = new SimpleStairs(Aesthetics.plugin, tin_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.tinBricks).setUnlocalizedName("tin_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                mythril_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                mythril_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.mythrilBricks).setUnlocalizedName("mythril_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                onyx_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                onyx_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.onyxBricks).setUnlocalizedName("onyx_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                adamantium_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                adamantium_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.adamantiumBricks)
                		.setUnlocalizedName("adamantium_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
             } // end-if SOBrickStairs
        } // end if SOBricks

        if (Settings.SODoors) 
        {
            copper_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "copper_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.copperDoor)
            				.setUnlocalizedName("copper_door");
            tin_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "tin_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.tinDoor)
            				.setUnlocalizedName("tin_door");
            mythril_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "mythril_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.mythrilDoor)
                            .setUnlocalizedName("mythril_door");
            adamantium_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "adamantium_door", ContentCategories.Block.OTHER)
                             .setConfigEntry(Settings.adamantiumDoor)
                             .setUnlocalizedName("adamantium_door");
            onyx_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "onyx_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.onyxDoor)
                            .setUnlocalizedName("onyx_door");
        } // end if SODoors

        if (Settings.SOBars) 
        {
            copper_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.copperBars)
                            .setUnlocalizedName("copper_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            tin_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.tinBars)
                            .setUnlocalizedName("tin_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            mythril_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.mythrilBars)
                            .setUnlocalizedName("mythril_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            onyx_bars = new SimpleBars(Aesthetics.plugin, Material.ROCK, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.onyxBars)
                            .setUnlocalizedName("onyx_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            adamantium_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.adamantiumBars)
                            .setUnlocalizedName("adamantium_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        } // end SOBars
	} // end configureBlocks()

	/**
	 * Register blocks with Forge.
	 * 
	 * @param registry Forge block registry interface.
	 */
	public static void register(IForgeRegistry<Block> registry) 
	{
	} // end register()
	
	/**
	 * register ItemBlocks with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void registerItemBlocks(IForgeRegistry<Item> registry) 
	{
	} // end registerItemBlocks()

	/**
	 * register models of ItemBlocks with Forge.
	 */
	public static void registerModels() 
	{
	} // end registerModels()
	
		
} // end class
