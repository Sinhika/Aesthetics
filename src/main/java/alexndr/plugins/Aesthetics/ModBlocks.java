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
        	if (Settings.ironBricks.isEnabled())
				iron_bricks.setConfigEntry(Settings.ironBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.goldBricks.isEnabled())
				gold_bricks.setConfigEntry(Settings.goldBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
        	if (Settings.diamondBricks.isEnabled())
				diamond_bricks.setConfigEntry(Settings.diamondBricks)
						.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (Settings.MCBrickStairs) 
            {
            	if (Settings.ironBricks.isEnabled())
            		iron_brick_stairs.setConfigEntry(Settings.ironBricks).setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.goldBricks.isEnabled())
					gold_brick_stairs.setConfigEntry(Settings.goldBricks)
							.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            	if (Settings.diamondBricks.isEnabled())
					diamond_brick_stairs.setConfigEntry(Settings.diamondBricks)
							.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            } // end if MCBrickStairs
        } // end-if MCBricks
		
		if (ModSupport.use_simple_ores) { 
			SimpleOresModBlocks.configureBlocks();
		}
		if (ModSupport.use_fusion) {
			FusionModBlocks.configureBlocks();
		}
		if (ModSupport.use_netherrocks) {
			NetherrocksModBlocks.configureBlocks();
		}
	} // end configureBlocks()

	/**
	 * Register blocks with Forge.
	 * 
	 * @param registry Forge block registry interface.
	 */
	public static void register(IForgeRegistry<Block> registry) 
	{
        if (Settings.MCBricks) 
        {
        	if (Settings.ironBricks.isEnabled()) registry.register(iron_bricks);
        	if (Settings.goldBricks.isEnabled()) registry.register(gold_bricks);
        	if (Settings.diamondBricks.isEnabled()) registry.register(diamond_bricks);

        	if (Settings.MCBrickStairs) 
            {
            	if (Settings.ironBricks.isEnabled()) registry.register(iron_brick_stairs);
            	if (Settings.goldBricks.isEnabled()) registry.register(gold_brick_stairs);
            	if (Settings.diamondBricks.isEnabled()) registry.register(diamond_brick_stairs);
            } // end-if
        } // end-if
        
		if(ModSupport.use_simple_ores) 
			SimpleOresModBlocks.register(registry);
		if(ModSupport.use_fusion)
			FusionModBlocks.register(registry);
		if(ModSupport.use_netherrocks)
			NetherrocksModBlocks.register(registry);

	} // end register()
	
	/**
	 * register ItemBlocks with Forge.
	 * 
	 * @param registry Forge item registry interface.
	 */
	public static void registerItemBlocks(IForgeRegistry<Item> registry) 
	{
        if (Settings.MCBricks) 
        {
        	if (Settings.ironBricks.isEnabled()) registry.register(iron_bricks.createItemBlock());
        	if (Settings.goldBricks.isEnabled()) registry.register(gold_bricks.createItemBlock());
        	if (Settings.diamondBricks.isEnabled()) registry.register(diamond_bricks.createItemBlock());

        	if (Settings.MCBrickStairs) 
            {
            	if (Settings.ironBricks.isEnabled()) registry.register(iron_brick_stairs.createItemBlock());
            	if (Settings.goldBricks.isEnabled()) registry.register(gold_brick_stairs.createItemBlock());
            	if (Settings.diamondBricks.isEnabled()) registry.register(diamond_brick_stairs.createItemBlock());
            } // end-if
        } // end-if
        
		if(ModSupport.use_simple_ores) 
			SimpleOresModBlocks.registerItemBlocks(registry);
		if(ModSupport.use_fusion)
			FusionModBlocks.registerItemBlocks(registry);
		if(ModSupport.use_netherrocks)
			NetherrocksModBlocks.registerItemBlocks(registry);

	} // end registerItemBlocks()

	/**
	 * register models of ItemBlocks with Forge.
	 */
	public static void registerModels() 
	{
        if (Settings.MCBricks) 
        {
        	if (Settings.ironBricks.isEnabled())
        		iron_bricks.registerItemModel(Item.getItemFromBlock(iron_bricks));
        	if (Settings.goldBricks.isEnabled())
        		gold_bricks.registerItemModel(Item.getItemFromBlock(gold_bricks));
        	if (Settings.diamondBricks.isEnabled())
        		diamond_bricks.registerItemModel(Item.getItemFromBlock(diamond_bricks));

        	if (Settings.MCBrickStairs) 
            {
            	if (Settings.ironBricks.isEnabled())
            		iron_brick_stairs.registerItemModel(Item.getItemFromBlock(iron_brick_stairs));
            	if (Settings.goldBricks.isEnabled())
            		gold_brick_stairs.registerItemModel(Item.getItemFromBlock(gold_brick_stairs));
            	if (Settings.diamondBricks.isEnabled())
            		diamond_brick_stairs.registerItemModel(Item.getItemFromBlock(diamond_brick_stairs));
            } // end-if
        } // end-if
        
		if(ModSupport.use_simple_ores) 
			SimpleOresModBlocks.registerModels();
		if(ModSupport.use_fusion)
			FusionModBlocks.registerModels();
		if(ModSupport.use_netherrocks)
			NetherrocksModBlocks.registerModels();

	} // end registerModels()
	
	/**
	 * ore dictionary registrations for blocks.
	 */
//	public static void registerOreDictionary()
//	{
//	} // end registerOreDictionary()
		

} // end class
