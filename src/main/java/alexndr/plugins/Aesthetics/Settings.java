package alexndr.plugins.Aesthetics;

import java.io.File;

import alexndr.api.config.Configuration;
import alexndr.api.config.types.ConfigBlock;
import alexndr.api.config.types.ConfigEntry;
import alexndr.api.config.types.ConfigValue;
import alexndr.api.helpers.game.TabHelper;
import alexndr.api.logger.LogHelper;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class Settings 
{
	private static Configuration settings = new Configuration();
	
	public static void createOrLoadSettings(FMLPreInitializationEvent event) 
	{
		settings.setModName(ModInfo.NAME);
		File configDir = new File(event.getModConfigurationDirectory(), "AleXndr");
		File settingsFile = new File(configDir, "AestheticsSettings.xml");
		settings.setFile(settingsFile);
		
		LogHelper.verbose("Aesthetics: Loading Settings...");
		try {
			settings.load();
			settings.createHelpEntry(ModInfo.URL);
			
			//Toggles
			ConfigEntry toggles = new ConfigEntry("Aesthetics Toggles", "Toggles");
			toggles.createNewValue("EnableSimpleOres").setActive().setDataType("@B").setCurrentValue("true")
					.setDefaultValue("true");
			toggles.createNewValue("EnableFusion").setActive().setDataType("@B").setCurrentValue("true")
					.setDefaultValue("true");
			toggles.createNewValue("EnableNetherrocks").setActive().setDataType("@B").setCurrentValue("true")
					.setDefaultValue("true");
			toggles = settings.get(toggles);
			enableSimpleOres = toggles.getValueByName("EnableSimpleOres");
			enableFusion = toggles.getValueByName("EnableFusion");
			enableNetherrocks = toggles.getValueByName("EnableNetherrocks");
			
			ConfigEntry contentToggles = new ConfigEntry("Vanilla Content Toggles", "Toggles");
			contentToggles.createNewValue("EnableVanillaBricks").setActive().setDataType("@B").setCurrentValue("true")
					.setDefaultValue("true");
			contentToggles.createNewValue("EnableVanillaBrickStairs").setActive().setDataType("@B")
					.setCurrentValue("true").setDefaultValue("true");
			contentToggles = settings.get(contentToggles);
			MCBricks = contentToggles.getValueByName("EnableVanillaBricks");
			MCBrickStairs = contentToggles.getValueByName("EnableVanillaBrickStairs");
			
			if(Loader.isModLoaded("simpleores") && enableSimpleOres.asBoolean()) 
			{
				ConfigEntry SOToggles = new ConfigEntry("SimpleOres Content Toggles", "Toggles");
				
				SOToggles.createNewValue("EnableBricks").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				SOToggles.createNewValue("EnableBrickStairs").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				SOToggles.createNewValue("EnableDoors").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				SOToggles.createNewValue("EnableBars").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				SOToggles = settings.get(SOToggles);
				SOBricks = SOToggles.getValueByName("EnableBricks");
				SOBrickStairs = SOToggles.getValueByName("EnableBrickStairs");
				SODoors = SOToggles.getValueByName("EnableDoors");
				SOBars =  SOToggles.getValueByName("EnableBars");
			}
			if(Loader.isModLoaded("fusion") && enableFusion.asBoolean()) 
			{
				ConfigEntry FToggles = new ConfigEntry("Fusion Content Toggles", "Toggles");
				FToggles.createNewValue("EnableBricks").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				FToggles.createNewValue("EnableBrickStairs").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				FToggles.createNewValue("EnableDoors").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				FToggles.createNewValue("EnableBars").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				FToggles = settings.get(FToggles);
				FBricks = FToggles.getValueByName("EnableBricks");
				FBrickStairs = FToggles.getValueByName("EnableBrickStairs");
				FDoors = FToggles.getValueByName("EnableDoors");
				FBars = FToggles.getValueByName("EnableBars");
			}
			if(Loader.isModLoaded("netherrocks") && enableNetherrocks.asBoolean()) 
			{
				ConfigEntry NRToggles = new ConfigEntry("Netherrocks Content Toggles", "Toggles");
				NRToggles.createNewValue("EnableBricks").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				NRToggles.createNewValue("EnableBrickStairs").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				NRToggles.createNewValue("EnableDoors").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				NRToggles.createNewValue("EnableBars").setActive().setDataType("@B").setCurrentValue("true")
						.setDefaultValue("true");
				NRToggles = settings.get(NRToggles);
				NRBricks =  NRToggles.getValueByName("EnableBricks");
				NRBrickStairs = NRToggles.getValueByName("EnableBrickStairs");
				NRDoors = NRToggles.getValueByName("EnableDoors");
				NRBars = NRToggles.getValueByName("EnableBars");
			}
			
			//Blocks
            ironBricks = settings.get(new ConfigBlock("Iron Bricks", "Bricks").setHardness(15.0F)
                            .setResistance(20.F).setLightValue(0.0F).setHarvestTool("pickaxe"))
                            .asConfigBlock();
            goldBricks = settings.get(new ConfigBlock("Gold Bricks", "Bricks").setHardness(15.0F)
                            .setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
                            .asConfigBlock();
            diamondBricks = settings
                            .get(new ConfigBlock("Diamond Bricks", "Bricks").setHardness(15.0F)
                                            .setResistance(20.0F).setLightValue(0.0F)
                                            .setHarvestTool("pickaxe"))
                            .asConfigBlock();
			
			if(Loader.isModLoaded("simpleores")) 
			{
                copperBricks = settings
                                .get(new ConfigBlock("Copper Bricks", "SimpleOresBlocks")
                                                .setHardness(15.0F).setResistance(20.0F)
                                                .setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                tinBricks = settings
                                .get(new ConfigBlock("Tin Bricks", "SimpleOresBlocks")
                                                .setHardness(15.0F).setResistance(20.0F)
                                                .setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                mythrilBricks = settings
                                .get(new ConfigBlock("Mythril Bricks", "SimpleOresBlocks")
                                                .setHardness(15.0F).setResistance(20.0F)
                                                .setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                adamantiumBricks = settings
                                .get(new ConfigBlock("Adamantium Bricks", "SimpleOresBlocks")
                                                .setHardness(15.0F).setResistance(20.0F)
                                                .setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                onyxBricks = settings
                                .get(new ConfigBlock("Onyx Bricks", "SimpleOresBlocks")
                                                .setHardness(15.0F).setResistance(20.0F)
                                                .setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();

                copperDoor = settings.get(new ConfigBlock("Mythril Door", "SimpleOresBlocks").setHardness(7.0F)
                                .setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
                                ).asConfigBlock();
                tinDoor = settings.get(new ConfigBlock("Mythril Door", "SimpleOresBlocks").setHardness(7.0F)
                                .setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
                                ).asConfigBlock();
				mythrilDoor = settings.get(new ConfigBlock("Mythril Door", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				adamantiumDoor = settings.get(new ConfigBlock("Adamantium Door", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				onyxDoor = settings.get(new ConfigBlock("Onyx Door", "SimpleOresBlocks").setHardness(20.0F)
						.setResistance(29.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();

				copperBars = settings.get(new ConfigBlock("Copper Bars", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				tinBars = settings.get(new ConfigBlock("Tin Bars", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				mythrilBars = settings.get(new ConfigBlock("Mythril Bars", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				adamantiumBars = settings.get(new ConfigBlock("Adamantium Bars", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				onyxBars = settings.get(new ConfigBlock("Onyx Bars", "SimpleOresBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
			} // end if simple ores
			
			if(Loader.isModLoaded("fusion")) 
			{
				steelBricks = settings.get(new ConfigBlock("Steel Bricks", "FusionBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				bronzeBricks = settings.get(new ConfigBlock("Bronze Bricks", "FusionBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				thyriumBricks = settings.get(new ConfigBlock("Thyrium Bricks", "FusionBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
				                .asConfigBlock();
				sinisiteBricks = settings.get(new ConfigBlock("Sinisite Bricks", "FusionBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();

				bronzeDoor = settings.get(new ConfigBlock("Bronze Door", "FusionBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();

				steelBars = settings.get(new ConfigBlock("Steel Bars", "FusionBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				bronzeBars = settings.get(new ConfigBlock("Bronze Bars", "FusionBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				thyriumBars = settings.get(new ConfigBlock("Thyrium Bars", "FusionBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				sinisiteBars = settings.get(new ConfigBlock("Sinisite Bars", "FusionBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
			} // end if fusion
			
			if(Loader.isModLoaded("netherrocks")) 
			{
				fyriteBricks = settings.get(new ConfigBlock("Fyrite Bricks", "NetherrocksBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				malachiteBricks = settings.get(new ConfigBlock("Malachite Bricks", "NetherrocksBlocks")
						.setHardness(15.0F).setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						)
						.asConfigBlock();
				ashstoneBricks = settings.get(new ConfigBlock("Ashstone Bricks", "NetherrocksBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				illumeniteBricks = settings.get(new ConfigBlock("Illumenite Bricks", "NetherrocksBlocks")
						.setHardness(15.0F).setResistance(20.0F).setLightValue(1.0F).setHarvestTool("pickaxe")
						)
						.asConfigBlock();
				dragonstoneBricks = settings.get(new ConfigBlock("Dragonstone Bricks", "NetherrocksBlocks")
						.setHardness(15.0F).setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						)
						.asConfigBlock();
				argoniteBricks = settings.get(new ConfigBlock("Argonite Bricks", "NetherrocksBlocks").setHardness(15.0F)
						.setResistance(20.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();

				dragonstoneDoor = settings.get(new ConfigBlock("Dragonstone Door", "NetherrocksBlocks")
						.setHardness(10.0F).setResistance(44.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
                ashstoneDoor = settings.get(new ConfigBlock("Ashstone Door", "NetherrocksBlocks")
                                .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                argoniteDoor = settings.get(new ConfigBlock("Argonite Door", "NetherrocksBlocks")
                                .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                fyriteDoor = settings.get(new ConfigBlock("Fyrite Door", "NetherrocksBlocks")
                                .setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
                illumeniteDoor = settings.get(new ConfigBlock("Illumenite Door", "NetherrocksBlocks")
                                .setHardness(7.0F).setResistance(10.0F).setLightValue(1.0F).setHarvestTool("pickaxe"))
                                .asConfigBlock();
//                malachiteDoor = settings.get(new ConfigBlock("Malachite Door", "NetherrocksBlocks")
//                                .setHardness(7.0F).setResistance(10.0F).setLightValue(0.0F).setHarvestTool("pickaxe"))
//                                .asConfigBlock();

				fyriteBars = settings.get(new ConfigBlock("Fyrite Bars", "NetherrocksBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				malachiteBars = settings.get(new ConfigBlock("Malachite Bars", "NetherrocksBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				ashstoneBars = settings.get(new ConfigBlock("Ashstone Bars", "NetherrocksBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				illumeniteBars = settings.get(new ConfigBlock("Illumenite Bars", "NetherrocksBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(1.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
				dragonstoneBars = settings.get(new ConfigBlock("Dragonstone Bars", "NetherrocksBlocks")
						.setHardness(7.0F).setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						)
						.asConfigBlock();
				argoniteBars = settings.get(new ConfigBlock("Argonite Bars", "NetherrocksBlocks").setHardness(7.0F)
						.setResistance(12.0F).setLightValue(0.0F).setHarvestTool("pickaxe")
						).asConfigBlock();
			}
		} // end try
		catch (Exception e) {
			LogHelper.severe(ModInfo.NAME, "Failed to load settings");
			e.printStackTrace();
		} 
		finally {
			settings.save();
			LogHelper.verbose(ModInfo.NAME, "Settings loaded successfully");
		}
	} // end createOrLoadSettings()
	
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
	
	public static ConfigValue updateChecker;
	public static ConfigValue enableSimpleOres, enableFusion, enableNetherrocks;
	public static ConfigValue MCBricks, MCBrickStairs;
	public static ConfigValue SOBricks, SOBrickStairs, SODoors, SOBars;
	public static ConfigValue FBricks, FBrickStairs, FDoors, FBars;
	public static ConfigValue NRBricks, NRBrickStairs, NRDoors, NRBars;
} // end class
