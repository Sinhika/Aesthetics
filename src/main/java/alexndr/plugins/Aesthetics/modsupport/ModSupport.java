package alexndr.plugins.Aesthetics.modsupport;

import alexndr.plugins.Aesthetics.Settings;
import net.minecraftforge.fml.common.Loader;

/**
 * Check to see which mods are loaded and enabled.
 * @author Sinhika
 *
 */
public class ModSupport 
{
	public static boolean use_simple_ores = false;
	public static boolean use_netherrocks = false;
	public static boolean use_fusion = false;
	
	public static void preInit() 
	{
		use_simple_ores = Loader.isModLoaded("simpleores") && Settings.enableSimpleOres;
		use_netherrocks = Loader.isModLoaded("netherrocks") && Settings.enableNetherrocks;
		use_fusion = Loader.isModLoaded("fusion") && Settings.enableFusion;
	}

} // end class
