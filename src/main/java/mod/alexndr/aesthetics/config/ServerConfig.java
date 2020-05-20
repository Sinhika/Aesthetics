package mod.alexndr.aesthetics.config;

import mod.alexndr.aesthetics.Aesthetics;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ServerConfig
{
    final ForgeConfigSpec.BooleanValue serverEnableVanillaBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableSimpleOresBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableNetherrocksBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableFusionBlocks;

    ServerConfig(final ForgeConfigSpec.Builder builder)
    {
        builder.push("General");
        serverEnableVanillaBlocks = builder.comment("Enable vanilla aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableVanillaBlocks")
                .define("EnableVanillaBlocks", true);
        serverEnableSimpleOresBlocks = builder.comment("Enable Simple Ores aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableSimpleOresBlocks")
                .define("EnableSimpleOresBlocks", true);
        serverEnableNetherrocksBlocks = builder.comment("Enable Netherrocks aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableNetherrocksBlocks")
                .define("EnableNetherrocksBlocks", true);
        serverEnableFusionBlocks = builder.comment("Enable Fusion aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableFusionBlocks")
                .define("EnableFusionBlocks", true);
        builder.pop();
    } // end ctor
    
} // end-class
