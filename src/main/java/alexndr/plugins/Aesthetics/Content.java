package alexndr.plugins.Aesthetics;

import alexndr.api.logger.LogHelper;
import alexndr.plugins.Aesthetics.modsupport.ModSupport;

/**
 * @author AleXndrTheGr8st
 */
public class Content 
{
	
	public static void preInitialize() 
	{
//	    // doBlocks first, so that door blocks are initialized
//		try {
//			doBlocks();
//			LogHelper.verbose(ModInfo.ID, "All blocks were added successfully");
//		} 
//		catch (Exception e) {
//			LogHelper.severe(ModInfo.ID,
//							"Blocks were not added successfully. This is a serious problem!");
//			e.printStackTrace();
//		}
		// then doItems, so door items have door blocks.
        try {
            doItems();
            LogHelper.verbose(ModInfo.ID, "All items were added successfully");
        } 
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Items were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
	} // end preInitialize()
	
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
	}  // end doblocks()
	
//	public static void doAchievements() 
//	{
//		if(ModSupport.use_simple_ores) 
//			ContentSimpleOres.doAchievements();
//		if(ModSupport.use_fusion)
//			ContentFusion.doAchievements();
//		if(ModSupport.use_netherrocks)
//			ContentNetherrocks.doAchievements();
//	} // end()
	
//	public static void setTabs() 
//	{
//		for(Block block : ContentRegistry.getPluginBlocks(Aesthetics.plugin.getName()))
//			if(!(block instanceof SimpleDoor))
//				block.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
//		for(Item item : ContentRegistry.getPluginItems(Aesthetics.plugin.getName()))
//			item.setCreativeTab(TabHelper.decorationsTab(SimpleCoreAPI.plugin));
//	} // end setTabs()
	
}
