package alexndr.plugins.Aesthetics;

import alexndr.api.config.ConfigHelper;
import alexndr.api.config.types.ConfigBlock;
import alexndr.api.config.types.ConfigEntry;
import alexndr.api.logger.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class Settings 
{
	public static final String CONFIGURE_BRICKS = "Bricks";
	public static final String CONFIGURE_SOBLOCKS = "Simple Ores Blocks";
	public static final String CONFIGURE_FBLOCKS = "Fusion Blocks";
	public static final String CONFIGURE_NRBLOCKS = "Netherrocks Blocks";
	
	private static Configuration settings = new Configuration();
	
	public static void createOrLoadSettings(FMLPreInitializationEvent event) 
	{
		settings = ConfigHelper.GetConfig(event, "AleXndr", ModInfo.ID + ".cfg");

		LogHelper.verbose(ModInfo.ID, "loading settings...");
		try {
			settings.load();
			ConfigHelper.createHelpEntry(settings, ModInfo.URL);
			
			// Toggles
			configureGeneral();
			
			//Blocks
			configureVanilla();
			
			if (enableSimpleOres) 
			{
				configureSimpleOres();
			} // end if simple ores
			
			if(enableFusion) 
			{
				configureFusion();
			} // end if fusion
			
			if(Loader.isModLoaded("netherrocks") && enableNetherrocks) 
			{
				configureNetherrocks();
			}
		} // end try
		catch (Exception e) {
			LogHelper.severe(ModInfo.ID, "Failed to load settings");
			e.printStackTrace();
		} 
		finally {
			settings.save();
			LogHelper.verbose(ModInfo.ID, "Settings loaded successfully");
		}
	} // end createOrLoadSettings()

	public static void configureGeneral()
	{
		enableSimpleOres = settings.getBoolean("EnableSimpleOres", Configuration.CATEGORY_GENERAL, 
				true, "Enable Simple Ores-based blocks");
		enableFusion = settings.getBoolean("EnableFusion", Configuration.CATEGORY_GENERAL, true,
				"Enable Fusion-based blocks");
		enableNetherrocks = settings.getBoolean("EnableNetherrocks", Configuration.CATEGORY_GENERAL, true,
				"Enable Netherrocks-based blocks");
		
		MCBricks = settings.getBoolean("EnableVanillaBricks", Configuration.CATEGORY_GENERAL, true,
				"Enable vanilla-based bricks");
		MCBrickStairs = settings.getBoolean("EnableVanillaBrickStairs", Configuration.CATEGORY_GENERAL, true,
				"Enable vanilla-based brick stairs");
		
		if (enableSimpleOres) 
		{
			ConfigEntry SOToggles = new ConfigEntry("SimpleOres", 
													Configuration.CATEGORY_GENERAL, true);
			SOToggles.GetConfig(settings);
			
			SOBricks = settings.getBoolean("EnableBricks", SOToggles.getSubCategory(), 
					Loader.isModLoaded("simpleores"), 
					"Enable Simple Ores-based bricks");
			SOBrickStairs = settings.getBoolean("EnableBrickStairs", SOToggles.getSubCategory(), 
					Loader.isModLoaded("simpleores"), 
					"Enable Simple Ores-based brick stairs");
			SODoors = settings.getBoolean("EnableDoors", SOToggles.getSubCategory(), 
					Loader.isModLoaded("simpleores"), 
					"Enable Simple Ores-based doors");
			SOBars = settings.getBoolean("EnableBars", SOToggles.getSubCategory(), 
					Loader.isModLoaded("simpleores"), 
					"Enable Simple Ores-based bars");
		} // end-if simpleores
		
		if(enableFusion) 
		{
			ConfigEntry FToggles = new ConfigEntry("Fusion", Configuration.CATEGORY_GENERAL, true);
			FToggles.GetConfig(settings);
			
			FBricks = settings.getBoolean("EnableBricks", FToggles.getSubCategory(), 
					Loader.isModLoaded("fusion"), 
					"Enable Fusion-based bricks");
			FBrickStairs = settings.getBoolean("EnableBrickStairs", FToggles.getSubCategory(), 
					Loader.isModLoaded("fusion"), 
					"Enable Fusion-based brick stairs");
			FDoors = settings.getBoolean("EnableDoors", FToggles.getSubCategory(), 
					Loader.isModLoaded("fusion"), 
					"Enable Fusion-based doors");
			FBars = settings.getBoolean("EnableBars", FToggles.getSubCategory(), 
					Loader.isModLoaded("fusion"), 
					"Enable Fusion-based bars");
		}
		if(Loader.isModLoaded("netherrocks") && enableNetherrocks) 
		{
			ConfigEntry NRToggles = new ConfigEntry("Netherrocks", Configuration.CATEGORY_GENERAL, true);
			NRToggles.GetConfig(settings);
			NRBricks = settings.getBoolean("EnableBricks", NRToggles.getSubCategory(), true, 
					"Enable Netherrocks-based bricks");
			NRBrickStairs = settings.getBoolean("EnableBrickStairs", NRToggles.getSubCategory(), true, 
					"Enable Netherrocks-based brick stairs");
			NRDoors = settings.getBoolean("EnableDoors", NRToggles.getSubCategory(), true, 
					"Enable Netherrocks-based doors");
			NRBars = settings.getBoolean("EnableBars", NRToggles.getSubCategory(), true, 
					"Enable Netherrocks-based bars");
		}
	} // end configureGeneral()
	
	
	public static void configureVanilla()
	{
		ironBricks = new ConfigBlock("Iron Bricks", CONFIGURE_BRICKS).setHardness(15.0F)
				.setResistance(20.F).setLightValue(0.0F).setHarvestTool("pickaxe");
		ironBricks.GetConfig(settings);
		
		goldBricks = new ConfigBlock("Gold Bricks", CONFIGURE_BRICKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		goldBricks.GetConfig(settings);
		
		diamondBricks = new ConfigBlock("Diamond Bricks", CONFIGURE_BRICKS).setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		diamondBricks.GetConfig(settings);
	} // end configureVanilla()
	
	public static void configureSimpleOres()
	{
		copperBricks = new ConfigBlock("Copper Bricks", CONFIGURE_SOBLOCKS)
						.setHardness(15.0F).setResistance(20.0F)
						.setLightValue(0.0F).setHarvestTool("pickaxe");
		copperBricks.GetConfig(settings);
		
		tinBricks = new ConfigBlock("Tin Bricks", CONFIGURE_SOBLOCKS)
						.setHardness(15.0F).setResistance(20.0F)
						.setLightValue(0.0F).setHarvestTool("pickaxe");
		tinBricks.GetConfig(settings);
		
		mythrilBricks = new ConfigBlock("Mythril Bricks", CONFIGURE_SOBLOCKS)
						.setHardness(15.0F).setResistance(20.0F)
						.setLightValue(0.0F).setHarvestTool("pickaxe");
		mythrilBricks.GetConfig(settings);
		
		adamantiumBricks = new ConfigBlock("Adamantium Bricks", CONFIGURE_SOBLOCKS)
						.setHardness(15.0F).setResistance(20.0F)
						.setLightValue(0.0F).setHarvestTool("pickaxe");
		adamantiumBricks.GetConfig(settings);
		
		onyxBricks = new ConfigBlock("Onyx Bricks", CONFIGURE_SOBLOCKS)
						.setHardness(15.0F).setResistance(20.0F)
						.setLightValue(0.0F).setHarvestTool("pickaxe");
		onyxBricks.GetConfig(settings);
		
		copperDoor = new ConfigBlock("Copper Door", CONFIGURE_SOBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		copperDoor.GetConfig(settings);
		
		tinDoor = new ConfigBlock("Tin Door", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		tinDoor.GetConfig(settings);
		
		mythrilDoor = new ConfigBlock("Mythril Door", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		mythrilDoor.GetConfig(settings);
		
		adamantiumDoor = new ConfigBlock("Adamantium Door", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		adamantiumDoor.GetConfig(settings);
		
		onyxDoor = new ConfigBlock("Onyx Door", CONFIGURE_SOBLOCKS).setHardness(20.0F).setResistance(29.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		onyxDoor.GetConfig(settings);
		
		copperBars = new ConfigBlock("Copper Bars", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		copperBars.GetConfig(settings);
		
		tinBars = new ConfigBlock("Tin Bars", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		tinBars.GetConfig(settings);
		
		mythrilBars = new ConfigBlock("Mythril Bars", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		mythrilBars.GetConfig(settings);
		
		adamantiumBars = new ConfigBlock("Adamantium Bars", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		adamantiumBars.GetConfig(settings);
		
		onyxBars = new ConfigBlock("Onyx Bars", CONFIGURE_SOBLOCKS).setHardness(7.0F).setResistance(12.0F)
				.setLightValue(0.0F).setHarvestTool("pickaxe");
		onyxBars.GetConfig(settings);
	} // end configureSimpleOres()
	
	public static void configureFusion()
	{
		steelBricks = new ConfigBlock("Steel Bricks", CONFIGURE_FBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		steelBricks.GetConfig(settings);
		
		bronzeBricks = new ConfigBlock("Bronze Bricks", CONFIGURE_FBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		bronzeBricks.GetConfig(settings);
		
		thyriumBricks = new ConfigBlock("Thyrium Bricks", CONFIGURE_FBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		thyriumBricks.GetConfig(settings);
		
		sinisiteBricks = new ConfigBlock("Sinisite Bricks", CONFIGURE_FBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		sinisiteBricks.GetConfig(settings);

		bronzeDoor = new ConfigBlock("Bronze Door", CONFIGURE_FBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		bronzeDoor.GetConfig(settings);

		steelBars = new ConfigBlock("Steel Bars", CONFIGURE_FBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		steelBars.GetConfig(settings);
		
		bronzeBars = new ConfigBlock("Bronze Bars", CONFIGURE_FBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		bronzeBars.GetConfig(settings);
		
		thyriumBars = new ConfigBlock("Thyrium Bars", CONFIGURE_FBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		thyriumBars.GetConfig(settings);
		
		sinisiteBars = new ConfigBlock("Sinisite Bars", CONFIGURE_FBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		sinisiteBars.GetConfig(settings);
	} // end configureFusion()
	
	public static void configureNetherrocks()
	{
		fyriteBricks = new ConfigBlock("Fyrite Bricks", CONFIGURE_NRBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		fyriteBricks.GetConfig(settings);
		
		malachiteBricks = new ConfigBlock("Malachite Bricks", CONFIGURE_NRBLOCKS)
				.setHardness(15.0F).setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		malachiteBricks.GetConfig(settings);
		
		ashstoneBricks = new ConfigBlock("Ashstone Bricks", CONFIGURE_NRBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		ashstoneBricks.GetConfig(settings);
		
		illumeniteBricks = new ConfigBlock("Illumenite Bricks", CONFIGURE_NRBLOCKS)
				.setHardness(15.0F).setResistance(20.0F).setLightValue(1.0F).setHarvestTool("pickaxe");
		illumeniteBricks.GetConfig(settings);
		
		dragonstoneBricks = new ConfigBlock("Dragonstone Bricks", CONFIGURE_NRBLOCKS)
				.setHardness(15.0F).setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		dragonstoneBricks.GetConfig(settings);
		
		argoniteBricks = new ConfigBlock("Argonite Bricks", CONFIGURE_NRBLOCKS).setHardness(15.0F)
				.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		argoniteBricks.GetConfig(settings);

		dragonstoneDoor = new ConfigBlock("Dragonstone Door", CONFIGURE_NRBLOCKS)
				.setHardness(10.0F).setResistance(44.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		dragonstoneDoor.GetConfig(settings);
		
        ashstoneDoor = new ConfigBlock("Ashstone Door", CONFIGURE_NRBLOCKS)
                        .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F)
                        .setHarvestTool("pickaxe");
        ashstoneDoor.GetConfig(settings);
        
        argoniteDoor = new ConfigBlock("Argonite Door", CONFIGURE_NRBLOCKS)
                        .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F)
                        .setHarvestTool("pickaxe");
        argoniteDoor.GetConfig(settings);
        
        fyriteDoor = new ConfigBlock("Fyrite Door", CONFIGURE_NRBLOCKS)
                        .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F)
                        .setHarvestTool("pickaxe");
        fyriteDoor.GetConfig(settings);
        
        illumeniteDoor = new ConfigBlock("Illumenite Door", CONFIGURE_NRBLOCKS)
                        .setHardness(7.0F).setResistance(10.0F).setLightValue(1.0F)
                        .setHarvestTool("pickaxe");
        illumeniteDoor.GetConfig(settings);
        
        malachiteDoor = new ConfigBlock("Malachite Door", CONFIGURE_NRBLOCKS)
                        .setHardness(7.0F).setResistance(10.0F).setLightValue(0.0F)
                        .setHarvestTool("pickaxe");
		malachiteDoor.GetConfig(settings);

		fyriteBars = new ConfigBlock("Fyrite Bars", CONFIGURE_NRBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		fyriteBars.GetConfig(settings);
		
		malachiteBars = new ConfigBlock("Malachite Bars", CONFIGURE_NRBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		malachiteBars.GetConfig(settings);
		
		ashstoneBars = new ConfigBlock("Ashstone Bars", CONFIGURE_NRBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		ashstoneBars.GetConfig(settings);
		
		illumeniteBars = new ConfigBlock("Illumenite Bars", CONFIGURE_NRBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(1.0F).setHarvestTool("pickaxe");
		illumeniteBars.GetConfig(settings);
		
		dragonstoneBars = new ConfigBlock("Dragonstone Bars", CONFIGURE_NRBLOCKS)
				.setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		dragonstoneBars.GetConfig(settings);
		
		argoniteBars = new ConfigBlock("Argonite Bars", CONFIGURE_NRBLOCKS).setHardness(7.0F)
				.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe");
		argoniteBars.GetConfig(settings);
	} // end configureNetherrocks()
	
	public static ConfigBlock ironBricks, goldBricks, diamondBricks;
	public static ConfigBlock copperBricks, tinBricks, mythrilBricks, adamantiumBricks, onyxBricks;
	public static ConfigBlock mythrilDoor, adamantiumDoor, onyxDoor, tinDoor, copperDoor;
	public static ConfigBlock copperBars, tinBars, mythrilBars, adamantiumBars, onyxBars;
	public static ConfigBlock steelBricks, bronzeBricks, thyriumBricks, sinisiteBricks;
	public static ConfigBlock bronzeDoor;
	public static ConfigBlock steelBars, bronzeBars, thyriumBars, sinisiteBars;
	public static ConfigBlock fyriteBricks, malachiteBricks, ashstoneBricks, illumeniteBricks, dragonstoneBricks, argoniteBricks;
	public static ConfigBlock dragonstoneDoor, ashstoneDoor, argoniteDoor, fyriteDoor, illumeniteDoor,
	                          malachiteDoor;
	public static ConfigBlock fyriteBars, malachiteBars, ashstoneBars, illumeniteBars, dragonstoneBars, argoniteBars;
	
	public static boolean enableSimpleOres, enableFusion, enableNetherrocks;
	public static boolean MCBricks, MCBrickStairs;
	public static boolean SOBricks, SOBrickStairs, SODoors, SOBars;
	public static boolean FBricks, FBrickStairs, FDoors, FBars;
	public static boolean NRBricks, NRBrickStairs, NRDoors, NRBars;
} // end class
