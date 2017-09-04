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
public class ContentFusion
{
     
   public static void doItems()
    {
        if (Settings.FDoors) 
        {
            bronze_door = new SimpleDoorItem(Aesthetics.plugin, (SimpleDoor) bronze_door_block)
             		.setUnlocalizedName("bronze_door")
             		.setCreativeTab(TabHelper.redstoneTab(SimpleCoreAPI.plugin));
        }
    } // end doItems()


    public static void doBlocks()
    {
        if (Settings.FBricks) 
        {
            steel_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                                           ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.steelBricks).setStepSound(SoundType.METAL)
                            .setUnlocalizedName("steel_bricks")
                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (ModSupport.use_simple_ores) 
            {
                bronze_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.bronzeBricks)
                                .setStepSound(SoundType.METAL)
                                .setUnlocalizedName("bronze_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                thyrium_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.thyriumBricks)
                                .setStepSound(SoundType.METAL)
                                .setUnlocalizedName("thyrium_bricks")
                                .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                sinisite_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.sinisiteBricks)
                                .setStepSound(SoundType.METAL)
                                .setUnlocalizedName("sinisite_bricks")
                                .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            } // end if simpleores

            if (Settings.FBrickStairs) 
            {
                steel_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                steel_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.steelBricks).setUnlocalizedName("steel_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

                if (ModSupport.use_simple_ores) 
                {
                    bronze_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                    bronze_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                    		.setConfigEntry(Settings.bronzeBricks)
                    		.setUnlocalizedName("bronze_brick_stairs")
                    		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                    thyrium_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                    thyrium_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                    		.setConfigEntry(Settings.thyriumBricks)
                    		.setUnlocalizedName("thyrium_brick_stairs")
                    		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                    sinisite_brick_stairs = new SimpleStairs(Aesthetics.plugin,
                                    sinisite_bricks.getDefaultState(), ContentCategories.Block.GENERAL)
                    		.setConfigEntry(Settings.sinisiteBricks)
                    		.setUnlocalizedName("sinisite_brick_stairs")
                    		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                }
            }
        } // end-if FBricks

        if (Settings.FDoors) 
        {
            bronze_door_block = new SimpleDoor(Aesthetics.plugin, Material.IRON, "bronze_door",
                            ContentCategories.Block.OTHER).setConfigEntry(Settings.bronzeDoor)
                            .setUnlocalizedName("bronze_door");
        }

        if (Settings.FBars) 
        {
            steel_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                                        ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.steelBars).setUnlocalizedName("steel_bars")
                            .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            if (ModSupport.use_simple_ores) 
            {
                bronze_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.bronzeBars).setUnlocalizedName("bronze_bars")
                                .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
                thyrium_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.thyriumBars).setUnlocalizedName("thyrium_bars")
                                .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
                sinisite_bars = new SimpleBars(Aesthetics.plugin, Material.IRON, true,
                                ContentCategories.Block.GENERAL)
                                .setConfigEntry(Settings.sinisiteBars).setUnlocalizedName("sinisite_bars")
                                .setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
            } // end-if simpleores
        } // end-if FBars
    } // end doBlocks()


    public static void doAchievements()
    {

    }

    // Blocks
    public static Block steel_bricks, bronze_bricks, thyrium_bricks, sinisite_bricks;
    public static Block steel_brick_stairs, bronze_brick_stairs, thyrium_brick_stairs,
                    sinisite_brick_stairs;
    public static Block bronze_door_block;
    public static Block steel_bars, bronze_bars, thyrium_bars, sinisite_bars;

    // Items
    public static Item bronze_door;
} // end class
