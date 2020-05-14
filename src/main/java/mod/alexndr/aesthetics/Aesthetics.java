package mod.alexndr.aesthetics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.alexndr.aesthetics.config.ConfigHolder;
import mod.alexndr.aesthetics.init.ModBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Aesthetics.MODID)
public class Aesthetics
{
    // modid 
    public static final String MODID = "aesthetics";
    
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Aesthetics()
    {
        LOGGER.info("Hello from Aesthetics!");
        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(modEventBus);
        // Register Configs
        modLoadingContext.registerConfig(ModConfig.Type.COMMON, ConfigHolder.SERVER_SPEC);
        modLoadingContext.registerConfig(ModConfig.Type.CLIENT, ConfigHolder.CLIENT_SPEC);
    } // end ctor()

    
} // end class
