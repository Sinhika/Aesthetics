package alexndr.plugins.Aesthetics;

import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.registry.ContentCategories;
import alexndr.plugins.Aesthetics.modsupport.FusionModBlocks;
import alexndr.plugins.Aesthetics.modsupport.ModSupport;
import alexndr.plugins.Aesthetics.modsupport.NetherrocksModBlocks;
import alexndr.plugins.Aesthetics.modsupport.SimpleOresModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks 
{
	 // VANILLA CONTENT
	//Blocks
	public static SimpleBlock iron_bricks = 
			new SimpleBlock("iron_bricks", Aesthetics.plugin, Material.IRON, ContentCategories.Block.GENERAL)
					.setStepSound(SoundType.METAL);
	public static SimpleBlock gold_bricks = 
			new SimpleBlock("gold_bricks", Aesthetics.plugin, Material.IRON, ContentCategories.Block.GENERAL)
					.setStepSound(SoundType.METAL);
	public static SimpleBlock diamond_bricks = 
			new SimpleBlock("diamond_bricks", Aesthetics.plugin, Material.IRON, ContentCategories.Block.GENERAL)
					.setStepSound(SoundType.METAL);
	public static SimpleStairs iron_brick_stairs = 
			new SimpleStairs("iron_brick_stairs", Aesthetics.plugin, iron_bricks.getDefaultState(),
					ContentCategories.Block.GENERAL);
	public static SimpleStairs gold_brick_stairs = 
			new SimpleStairs("gold_brick_stairs", Aesthetics.plugin, gold_bricks.getDefaultState(),
					ContentCategories.Block.GENERAL);
	public static SimpleStairs diamond_brick_stairs = 
			new SimpleStairs("diamond_brick_stairs", Aesthetics.plugin, diamond_bricks.getDefaultState(),
					ContentCategories.Block.GENERAL);
	
	/**
	 * configure mod blocks from config settings.
	 */
	public static void configureBlocks() 
	{
        if (Settings.MCBricks) 
        {
            iron_bricks.setConfigEntry(Settings.ironBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            gold_bricks.setConfigEntry(Settings.goldBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            diamond_bricks.setConfigEntry(Settings.diamondBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (Settings.MCBrickStairs) 
            {
                iron_brick_stairs.setConfigEntry(Settings.ironBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
				gold_brick_stairs.setConfigEntry(Settings.goldBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                diamond_brick_stairs.setConfigEntry(Settings.diamondBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            } // end if MCBrickStairs
        } // end-if MCBricks
		
		if(ModSupport.use_simple_ores) 
			SimpleOresModBlocks.configureBlocks();
		if(ModSupport.use_fusion)
			FusionModBlocks.configureBlocks();
		if(ModSupport.use_netherrocks)
			NetherrocksModBlocks.configureBlocks();
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
	
	/**
	 * ore dictionary registrations for blocks.
	 */
	public static void registerOreDictionary()
	{
	} // end registerOreDictionary()
		

} // end class
