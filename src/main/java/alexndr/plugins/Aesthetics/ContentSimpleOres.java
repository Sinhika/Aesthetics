package alexndr.plugins.Aesthetics;

import alexndr.api.content.blocks.SimpleBars;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.content.items.SimpleDoorItem;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.registry.ContentCategories;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * @author AleXndrTheGr8st
 */
public class ContentSimpleOres
{
    public static void doItems()
    {
        if (Settings.SODoors.asBoolean()) 
        {
            copper_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) copper_door_block)
            		.setConfigEntry(Settings.copperDoor.asConfigItem())
            		.setUnlocalizedName("copper_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            mythril_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) mythril_door_block)
            		.setConfigEntry(Settings.mythrilDoor.asConfigItem())
            		.setUnlocalizedName("mythril_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            tin_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) tin_door_block)
            		.setConfigEntry(Settings.tinDoor.asConfigItem())
            		.setUnlocalizedName("tin_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            adamantium_door = new SimpleDoorItem(Aesthetics.plugin,(SimpleDoor) adamantium_door_block)
            		.setConfigEntry(Settings.adamantiumDoor.asConfigItem())
            		.setUnlocalizedName("adamantium_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
            onyx_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) onyx_door_block)
            		.setConfigEntry(Settings.onyxDoor.asConfigItem())
            		.setUnlocalizedName("onyx_door").setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        } // end-if SODoors
    } // end doItems()


    public static void doBlocks()
    {
        if (Settings.SOBricks.asBoolean()) 
        {
            copper_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.copperBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("copper_bricks")
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
  
            if (Settings.SOBrickStairs.asBoolean()) 
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

        if (Settings.SODoors.asBoolean()) 
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

        if (Settings.SOBars.asBoolean()) 
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
    } // end doBlocks()


    public static void doAchievements()
    {

    }

    // Blocks
    public static Block copper_bricks, tin_bricks, onyx_bricks, adamantium_bricks, mythril_bricks;
    public static Block copper_brick_stairs, tin_brick_stairs, onyx_brick_stairs,
                    adamantium_brick_stairs, mythril_brick_stairs;
    public static Block copper_door_block, tin_door_block, adamantium_door_block, onyx_door_block,
                    mythril_door_block;
    public static Block copper_bars, tin_bars, onyx_bars, adamantium_bars, mythril_bars;

    // Items
    public static Item copper_door, tin_door, adamantium_door, onyx_door, mythril_door;
} // end class
