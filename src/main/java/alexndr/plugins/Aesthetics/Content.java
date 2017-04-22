package alexndr.plugins.Aesthetics;

import alexndr.api.content.blocks.SimpleBlock;
import alexndr.api.content.blocks.SimpleDoor;
import alexndr.api.content.blocks.SimpleStairs;
import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentCategories;
import alexndr.api.registry.ContentRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * @author AleXndrTheGr8st
 */
public class Content 
{
	
	public static void preInitialize() 
	{
	    // doBlocks first, so that door blocks are initialized
		try {
			doBlocks();
			LogHelper.verbose(ModInfo.NAME, "All blocks were added successfully");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.NAME,
							"Blocks were not added successfully. This is a serious problem!");
			e.printStackTrace();
		}
		// then doItems, so door items have door blocks.
        try {
            doItems();
            LogHelper.verbose(ModInfo.NAME, "All items were added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.NAME,
                            "Items were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
	} // end preInitialize()
	
	public static void initialize()
	{
		try {
			//setTabs();
			LogHelper.verbose(ModInfo.NAME, "Successfully set tabs for all blocks/items");
		} 
		catch (Exception e) {
			LogHelper.severe(ModInfo.NAME,
							"Tabs were not successfully set for blocks/items. This is a serious problem!");
			e.printStackTrace();
		}
	} // end initialize()
	
	public static void doItems() 
	{
		if(ModSupport.use_simple_ores) 
			ContentSimpleOres.doItems();
		
		if(ModSupport.use_fusion)
			ContentFusion.doItems();
		
		if(ModSupport.use_netherrocks)
			ContentNetherrocks.doItems();
	} // end doItems()
	
	public static void doBlocks() 
	{
        if (Settings.MCBricks.asBoolean()) 
        {
            iron_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON, ContentCategories.Block.GENERAL)
                            .setConfigEntry(Settings.ironBricks).setStepSound(SoundType.METAL)
                            .setUnlocalizedName("iron_bricks").setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            gold_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.goldBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("gold_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            diamond_bricks = new SimpleBlock(Aesthetics.plugin, Material.IRON,
                            ContentCategories.Block.GENERAL).setConfigEntry(Settings.diamondBricks)
                                            .setStepSound(SoundType.METAL)
                                            .setUnlocalizedName("diamond_bricks")
                                            .setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));

            if (Settings.MCBrickStairs.asBoolean()) 
            {
                iron_brick_stairs = new SimpleStairs(Aesthetics.plugin, iron_bricks.getDefaultState(),
                                                    ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.ironBricks).setUnlocalizedName("iron_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                gold_brick_stairs = new SimpleStairs(Aesthetics.plugin, gold_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.goldBricks).setUnlocalizedName("gold_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
                diamond_brick_stairs = new SimpleStairs(Aesthetics.plugin, diamond_bricks.getDefaultState(),
                                ContentCategories.Block.GENERAL)
                		.setConfigEntry(Settings.diamondBricks).setUnlocalizedName("diamond_brick_stairs")
                		.setCreativeTab(TabHelper.blocksTab(SimpleCoreAPI.plugin));
            } // end if MCBrickStairs
        } // end-if MCBricks
		
		if(ModSupport.use_simple_ores) 
			ContentSimpleOres.doBlocks();
		if(ModSupport.use_fusion)
			ContentFusion.doBlocks();
		if(ModSupport.use_netherrocks)
			ContentNetherrocks.doBlocks();
	}  // end doblocks()
	
	public static void doAchievements() 
	{
		if(ModSupport.use_simple_ores) 
			ContentSimpleOres.doAchievements();
		if(ModSupport.use_fusion)
			ContentFusion.doAchievements();
		if(ModSupport.use_netherrocks)
			ContentNetherrocks.doAchievements();
	} // end()
	
	public static void setTabs() 
	{
		for(Block block : ContentRegistry.getPluginBlocks(Aesthetics.plugin.getName()))
			if(!(block instanceof SimpleDoor))
				block.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
		for(Item item : ContentRegistry.getPluginItems(Aesthetics.plugin.getName()))
			item.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
	} // end setTabs()
	
	//Blocks
	public static Block iron_bricks, gold_bricks, diamond_bricks;
	public static Block iron_brick_stairs, gold_brick_stairs, diamond_brick_stairs;
}
