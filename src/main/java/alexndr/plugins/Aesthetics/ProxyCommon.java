package alexndr.plugins.Aesthetics;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ProxyCommon 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		//Configuration
		Settings.createOrLoadSettings(event);
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
