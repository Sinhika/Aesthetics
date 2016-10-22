package alexndr.plugins.Aesthetics;

import java.util.List;

import com.google.common.collect.Lists;

import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyCommon 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		//Configuration
        ContentRegistry.registerPlugin(Aesthetics.plugin);
		Settings.createOrLoadSettings(event);
		
		//Content
		if (! TabHelper.wereTabsInitialized()) {
			SimpleCoreAPI.tabPreInit();
		}
		ModSupport.preInit();

		Content.preInitialize();
	} // end ()
	
    public void load(FMLInitializationEvent event)
    {
		//Content
		Content.initialize();
		Recipes.initialize();
		setTabIcons();
    } // end load()
    
    public void postInit(FMLPostInitializationEvent event) 
    { 
    } // end postInit()    
    
	private static void setTabIcons() {
		LogHelper.verbose(ModInfo.NAME, "Setting tab icons");
		List<Item> list = Lists.newArrayList(Item.getItemFromBlock(Content.iron_bricks), 
								Item.getItemFromBlock(Blocks.IRON_BARS), 
								Items.IRON_INGOT, Items.IRON_PICKAXE, 
								Items.IRON_SWORD, 
								Item.getItemFromBlock(Blocks.FURNACE));
		SimpleCoreAPI.setTabIcons(list);
	}

} // end class
