package mod.alexndr.aesthetics.config;

import net.minecraftforge.fml.config.ModConfig;

public final class ConfigHelper
{
    public static void bakeClient(final ModConfig config) {}

    public static void bakeServer(final ModConfig config) 
    {
        AestheticsConfig.INSTANCE.putFlag("vanilla_enabled", 
                                          ConfigHolder.SERVER.serverEnableVanillaBlocks.get());
        AestheticsConfig.INSTANCE.putFlag("simpleores_enabled", 
                                          ConfigHolder.SERVER.serverEnableSimpleOresBlocks.get());
        AestheticsConfig.INSTANCE.putFlag("netherrocks_enabled", 
                                           ConfigHolder.SERVER.serverEnableNetherrocksBlocks.get());
        AestheticsConfig.INSTANCE.putFlag("fusion_enabled", 
                                           ConfigHolder.SERVER.serverEnableFusionBlocks.get());
    } // end bakeServer()

} // end class
