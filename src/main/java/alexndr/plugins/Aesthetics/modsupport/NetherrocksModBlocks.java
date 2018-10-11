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

public class NetherrocksModBlocks 
{
    // Blocks
    public static SimpleBlock fyrite_bricks = new SimpleBlock("fyrite_bricks", Aesthetics.plugin, Material.IRON,
            ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
    public static SimpleBlock malachite_bricks = new SimpleBlock("malachite_bricks", Aesthetics.plugin, Material.IRON,
            ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
	public static SimpleBlock ashstone_bricks = new SimpleBlock("ashstone_bricks", Aesthetics.plugin, Material.ROCK,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.STONE);
	public static SimpleBlock illumenite_bricks = new SimpleBlock("illumenite_bricks", Aesthetics.plugin,
			Material.GLASS, ContentCategories.Block.GENERAL).setStepSound(SoundType.GLASS);
	public static SimpleBlock dragonstone_bricks = new SimpleBlock("dragonstone_bricks", Aesthetics.plugin,
			Material.ROCK, ContentCategories.Block.GENERAL).setStepSound(SoundType.STONE);
	public static SimpleBlock argonite_bricks = new SimpleBlock("argonite_bricks", Aesthetics.plugin, Material.IRON,
			ContentCategories.Block.GENERAL).setStepSound(SoundType.METAL);
    
	public static SimpleStairs fyrite_brick_stairs = new SimpleStairs("fyrite_brick_stairs", Aesthetics.plugin,
			fyrite_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs malachite_brick_stairs = new SimpleStairs("malachite_brick_stairs", Aesthetics.plugin,
			malachite_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs ashstone_brick_stairs = new SimpleStairs("ashstone_brick_stairs", Aesthetics.plugin,
			ashstone_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs illumenite_brick_stairs = new SimpleStairs("illumenite_brick_stairs", Aesthetics.plugin,
			illumenite_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs dragonstone_brick_stairs = new SimpleStairs("dragonstone_brick_stairs",
			Aesthetics.plugin, dragonstone_bricks.getDefaultState(), ContentCategories.Block.GENERAL);
	public static SimpleStairs argonite_brick_stairs = new SimpleStairs("argonite_brick_stairs", Aesthetics.plugin,
			argonite_bricks.getDefaultState(), ContentCategories.Block.GENERAL);

    public static SimpleDoor dragonstone_door_block = new SimpleDoor("dragonstone_door", Aesthetics.plugin, Material.IRON, 
            "dragonstone_door",ContentCategories.Block.OTHER);
    public static SimpleDoor argonite_door_block = new SimpleDoor("argonite_door", Aesthetics.plugin, Material.IRON,
            "argonite_door", ContentCategories.Block.OTHER);
	public static SimpleDoor ashstone_door_block = new SimpleDoor("ashstone_door", Aesthetics.plugin, Material.IRON,
			"ashstone_door", ContentCategories.Block.OTHER);
	public static SimpleDoor fyrite_door_block = new SimpleDoor("fyrite_door", Aesthetics.plugin, Material.IRON,
			"fyrite_door", ContentCategories.Block.OTHER);
	public static SimpleDoor illumenite_door_block = new SimpleDoor("illumenite_door", Aesthetics.plugin, Material.IRON,
			"illumenite_door", ContentCategories.Block.OTHER);
	public static SimpleDoor malachite_door_block = new SimpleDoor("malachite_door", Aesthetics.plugin, Material.IRON,
			"malachite_door", ContentCategories.Block.OTHER);

	public static SimpleBars fyrite_bars = new SimpleBars("fyrite_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars malachite_bars = new SimpleBars("malachite_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars ashstone_bars = new SimpleBars("ashstone_bars", Aesthetics.plugin, Material.ROCK, true,
			ContentCategories.Block.GENERAL);
	public static SimpleBars illumenite_bars = new SimpleBars("illumenite_bars", Aesthetics.plugin, Material.GLASS,
			true, ContentCategories.Block.GENERAL);
	public static SimpleBars dragonstone_bars = new SimpleBars("dragonstone_bars", Aesthetics.plugin, Material.ROCK,
			true, ContentCategories.Block.GENERAL);
	public static SimpleBars argonite_bars = new SimpleBars("argonite_bars", Aesthetics.plugin, Material.IRON, true,
			ContentCategories.Block.GENERAL);

	/**
	 * configure mod blocks from config settings.
	 */
	public static void configureBlocks() 
	{
        if (Settings.NRBricks) 
        {
        	if (Settings.fyriteBricks.isEnabled())
        		fyrite_bricks.setConfigEntry(Settings.fyriteBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.malachiteBricks.isEnabled())
        		malachite_bricks.setConfigEntry(Settings.malachiteBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.ashstoneBricks.isEnabled())
        		ashstone_bricks.setConfigEntry(Settings.ashstoneBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.illumeniteBricks.isEnabled())
        		illumenite_bricks.setConfigEntry(Settings.illumeniteBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.dragonstoneBricks.isEnabled())
        		dragonstone_bricks.setConfigEntry(Settings.dragonstoneBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.argoniteBricks.isEnabled())
        		argonite_bricks.setConfigEntry(Settings.argoniteBricks)
					.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (Settings.NRBrickStairs) 
            {
            	if (Settings.fyriteBricks.isEnabled())
            		fyrite_brick_stairs.setConfigEntry(Settings.fyriteBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.malachiteBricks.isEnabled())
            		malachite_brick_stairs.setConfigEntry(Settings.malachiteBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.ashstoneBricks.isEnabled())
            		ashstone_brick_stairs.setConfigEntry(Settings.ashstoneBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.illumeniteBricks.isEnabled())
            		illumenite_brick_stairs.setConfigEntry(Settings.illumeniteBricks)
            			.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.dragonstoneBricks.isEnabled())
            		dragonstone_brick_stairs.setConfigEntry(Settings.dragonstoneBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.argoniteBricks.isEnabled())
            		argonite_brick_stairs.setConfigEntry(Settings.argoniteBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            }  // end-if 
        } // end-if NRBrickStairs

        if (Settings.NRDoors) 
        {
        	if (Settings.dragonstoneDoor.isEnabled())
        		dragonstone_door_block.setConfigEntry(Settings.dragonstoneDoor);
        	if (Settings.argoniteDoor.isEnabled())
        		argonite_door_block.setConfigEntry(Settings.argoniteDoor);
        	if (Settings.ashstoneDoor.isEnabled())
        		ashstone_door_block.setConfigEntry(Settings.ashstoneDoor);
        	if (Settings.fyriteDoor.isEnabled())
        		fyrite_door_block.setConfigEntry(Settings.fyriteDoor);
        	if (Settings.illumeniteDoor.isEnabled())
        		illumenite_door_block.setConfigEntry(Settings.illumeniteDoor);
        	if (Settings.malachiteDoor.isEnabled())
        		malachite_door_block.setConfigEntry(Settings.malachiteDoor);
	       } // end-if NRDoors

        if (Settings.NRBars) 
        {
        	if (Settings.fyriteBars.isEnabled())
        		fyrite_bars.setConfigEntry(Settings.fyriteBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.malachiteBars.isEnabled())
        		malachite_bars.setConfigEntry(Settings.malachiteBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.ashstoneBars.isEnabled())
        		ashstone_bars.setConfigEntry(Settings.ashstoneBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.illumeniteBars.isEnabled())
        		illumenite_bars.setConfigEntry(Settings.illumeniteBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.dragonstoneBars.isEnabled())
        		dragonstone_bars.setConfigEntry(Settings.dragonstoneBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        	if (Settings.argoniteBars.isEnabled())
        		argonite_bars.setConfigEntry(Settings.argoniteBars)
					.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
        } // end-if NRBars
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
