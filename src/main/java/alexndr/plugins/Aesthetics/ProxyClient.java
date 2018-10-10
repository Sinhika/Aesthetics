package alexndr.plugins.Aesthetics;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ProxyClient extends alexndr.plugins.Aesthetics.ProxyCommon 
{
	
	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
//		if(event.getSide() == Side.CLIENT) 
//		{
//			if (ModSupport.use_simple_ores && Settings.SODoors)
//			{
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentSimpleOres.copper_door_block, 
//												  ContentSimpleOres.copper_door);
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentSimpleOres.tin_door_block, 
//						  ContentSimpleOres.tin_door);
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentSimpleOres.adamantium_door_block, 
//						  ContentSimpleOres.adamantium_door);
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentSimpleOres.onyx_door_block, 
//						  ContentSimpleOres.onyx_door);
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentSimpleOres.mythril_door_block, 
//						  ContentSimpleOres.mythril_door);
//				
//			}
//			if (ModSupport.use_netherrocks && Settings.NRDoors) 
//			{
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentNetherrocks.argonite_door_block, 
//						ContentNetherrocks.argonite_door);
//				
//			}
//			if (ModSupport.use_fusion && Settings.FDoors) {
//				renderHelper.addDoorRenderDetails(Aesthetics.plugin, ContentFusion.bronze_door_block, 
//						ContentFusion.bronze_door);
//				
//			}
//			renderHelper.renderItemsAndBlocks();
//			renderHelper.renderItemStuff(event);
//		}
	} // end preInit()
	
	@Override
    public void load(FMLInitializationEvent event)
    {
		super.load(event);
    } // end load
    
	@Override
    public void postInit(FMLPostInitializationEvent event) 
    { 
		super.postInit(event);
    } // end postInit()    

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) 
	{
    	ModItems.registerModels();
    	ModBlocks.registerModels();
	}


} // end class
