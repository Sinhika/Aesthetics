package alexndr.plugins.Aesthetics;

import java.util.List;

import com.google.common.collect.Lists;

import alexndr.api.core.SimpleCoreAPI;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.logger.LogHelper;
import alexndr.api.registry.ContentRegistry;
import alexndr.api.registry.Plugin;
import alexndr.plugins.Aesthetics.modsupport.ModSupport;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
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
		ModBlocks.configureBlocks();  // always precede items so Door blocks get created first.
		ModItems.configureItems();
	} // end ()
	
    public void load(FMLInitializationEvent event)
    {
		//Content
		setTabIcons();
//		Recipes.initialize();
    } // end load()
    
    public void postInit(FMLPostInitializationEvent event) 
    { 
    } // end postInit()    
    
	private static void setTabIcons() {
		LogHelper.verbose(ModInfo.NAME, "Setting tab icons");
		List<Item> list = Lists.newArrayList(Item.getItemFromBlock(ModBlocks.iron_bricks), 
								Item.getItemFromBlock(Blocks.IRON_BARS), 
								Items.IRON_INGOT, Items.IRON_PICKAXE, 
								Items.IRON_SWORD, 
								Item.getItemFromBlock(Blocks.FURNACE));
		SimpleCoreAPI.setTabIcons(list);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
   	 	//Registers
		ModBlocks.register(event.getRegistry());
	} // end registerBlocks()

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
    	ModItems.register(event.getRegistry());
    	ModBlocks.registerItemBlocks(event.getRegistry());
	}

	public void registerItemRenderer(Plugin plugin, Item item, int meta, String id) {
	}

} // end class
