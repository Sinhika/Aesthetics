package alexndr.plugins.Aesthetics.modsupport;

import alexndr.plugins.Aesthetics.Settings;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

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

	/**
	 * Because many other mods provide copper and tin, enable support for Copper & Tin blocks & items
	 * if they exist in the ore dictionary.
	 * 
	 * @return true if copper or tin exists in the ore dictionary, false if not.
	 */
	public static boolean hasLimitedSimpleOres()
	{
    	return (OreDictionary.doesOreNameExist("ingotCopper") 
    			|| OreDictionary.doesOreNameExist("ingotTin"));
	}
	
	/**
	 * Because many other mods provide bronze & steel, enable support for bronze & steel 
	 * blocks & items if they exist in the ore dictionary.
	 * @return true if steel or bronze exist in the ore dictionary, false if not.
	 */
	public static boolean hasLimitedFusion()
	{
		return (OreDictionary.doesOreNameExist("ingotSteel")
				|| OreDictionary.doesOreNameExist("ingotBronze"));
	}
} // end class
