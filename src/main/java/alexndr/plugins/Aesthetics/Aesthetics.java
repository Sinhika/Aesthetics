package alexndr.plugins.Aesthetics;

import alexndr.api.logger.LogHelper;
import alexndr.api.registry.Plugin;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author AleXndrTheGr8st
 */
@Mod( modid=ModInfo.ID, name=ModInfo.NAME, version=ModInfo.VERSION, dependencies=ModInfo.DEPENDENCIES,
		acceptedMinecraftVersions=ModInfo.ACCEPTED_VERSIONS, updateJSON=ModInfo.VERSIONURL)
public class Aesthetics 
{
	@Mod.Instance
	public static Aesthetics INSTANCE;
	
	@SidedProxy(clientSide = "alexndr.plugins.Aesthetics.ProxyClient", 
	    		serverSide = "alexndr.plugins.Aesthetics.ProxyCommon")
	public static ProxyCommon proxy;

	public static Plugin plugin = new Plugin(ModInfo.ID, ModInfo.NAME);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		LogHelper.info("Loading Aesthetics...");
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.load(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		LogHelper.info("Aesthetics loaded");
	}
} // end class Aesthetics
