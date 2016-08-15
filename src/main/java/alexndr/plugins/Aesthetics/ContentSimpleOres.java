package alexndr.plugins.Aesthetics;

import alexndr.api.content.blocks.SimpleBars;
import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.content.items.SimpleDoorItem;
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
                            .setUnlocalizedName("copper_door");
            mythril_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) mythril_door_block)
                            .setUnlocalizedName("mythril_door");
            tin_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) tin_door_block)
                            .setUnlocalizedName("tin_door");
            adamantium_door = new SimpleDoorItem(Aesthetics.plugin,
                            (SimpleDoor) adamantium_door_block)
                                            .setUnlocalizedName("adamantium_door");
            onyx_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) onyx_door_block)
                            .setUnlocalizedName("onyx_door");
        } // end-if SODoors
    } // end doItems()


    public static void doBlocks()
    {
        if (Settings.SOBricks.asBoolean()) 
        {
            copper_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.copperBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("copper_bricks");
            tin_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.tinBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("tin_bricks");
            mythril_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.mythrilBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("mythril_bricks");
            onyx_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.onyxBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("onyx_bricks");
            adamantium_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL)
                                            .setConfigEntry(Settings.adamantiumBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("adamantium_bricks");
  
            if (Settings.SOBrickStairs.asBoolean()) 
            {
                copper_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                copper_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                                                .setUnlocalizedName("copper_brick_stairs");
                tin_brick_stairs = new SimpleStairs(Aesthetics.plugin, tin_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                                                .setUnlocalizedName("tin_brick_stairs");
                mythril_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                mythril_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                                                .setUnlocalizedName("mythril_brick_stairs");
                onyx_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                onyx_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                                                .setUnlocalizedName("onyx_brick_stairs");
                adamantium_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                adamantium_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                                                .setUnlocalizedName("adamantium_brick_stairs");
             } // end-if SOBrickStairs
        } // end if SOBricks

        if (Settings.SODoors.asBoolean()) 
        {
            copper_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "copper_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.copperDoor)
                            .setUnlocalizedName("copper_door_block");
            tin_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "tin_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.tinDoor)
                            .setUnlocalizedName("tin_door_block");
            mythril_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "mythril_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.mythrilDoor)
                            .setUnlocalizedName("mythril_door_block");
            adamantium_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON,
                            "adamantium_door", ContentCategories.Block.OTHER)
                             .setConfigEntry(Settings.adamantiumDoor)
                             .setUnlocalizedName("adamantium_door_block");
            onyx_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "onyx_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.onyxDoor)
                            .setUnlocalizedName("onyx_door_block");
        } // end if SODoors

        if (Settings.SOBars.asBoolean()) 
        {
            copper_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.copperBars)
                            .setUnlocalizedName("copper_bars");
            tin_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.tinBars)
                            .setUnlocalizedName("tin_bars");
            mythril_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.mythrilBars)
                            .setUnlocalizedName("mythril_bars");
            onyx_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.onyxBars)
                            .setUnlocalizedName("onyx_bars");
            adamantium_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.adamantiumBars)
                            .setUnlocalizedName("adamantium_bars");
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
