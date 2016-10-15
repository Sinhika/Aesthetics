package alexndr.plugins.Aesthetics;

import alexndr.api.registry.ContentRegistry;
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
		ModSupport.preInit();
		Content.preInitialize();
	} // end ()
	
    public void load(FMLInitializationEvent event)
    {
		//Content
		Content.initialize();
		Recipes.initialize();
    } // end load()
    
    public void postInit(FMLPostInitializationEvent event) 
    { 
    } // end postInit()    
    
} // end class
