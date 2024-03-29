package mod.alexndr.aesthetics.config;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper
{
    public static void bakeClient(final ModConfig config) {}

    public static void bakeServer(final ModConfig config) 
    {
        AestheticsConfig.INSTANCE.putFlag("vanilla_enabled", 
                                          ConfigHolder.SERVER.serverEnableVanillaBlocks.get());
        
        /* disable Netherrocks recipes if Netherrocks is not loaded */
        boolean val = ConfigHolder.SERVER.serverEnableNetherrocksBlocks.get() 
                && ModList.get().isLoaded("netherrocks");
        AestheticsConfig.INSTANCE.putFlag("netherrocks_enabled", val);
        
        /* disable Fusion recipes if Fusion is not loaded */
        val = ConfigHolder.SERVER.serverEnableFusionBlocks.get() 
                && ModList.get().isLoaded("fusion");
        AestheticsConfig.INSTANCE.putFlag("fusion_enabled", val);
        
        /* Note: allows Steel & Bronze if some other mod provides the ingredients */
        AestheticsConfig.INSTANCE.putFlag("bronze_enabled", 
                                          ConfigHolder.SERVER.serverEnableBronzeBlocks.get());
        AestheticsConfig.INSTANCE.putFlag("steel_enabled", 
                                           ConfigHolder.SERVER.serverEnableSteelBlocks.get());

    } // end bakeServer()

} // end class
