package mod.alexndr.aesthetics.config;

import mod.alexndr.aesthetics.Aesthetics;
import net.minecraftforge.common.ForgeConfigSpec;

public final class ServerConfig
{
    final ForgeConfigSpec.BooleanValue serverEnableVanillaBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableNetherrocksBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableFusionBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableSteelBlocks;
    final ForgeConfigSpec.BooleanValue serverEnableBronzeBlocks;

    ServerConfig(final ForgeConfigSpec.Builder builder)
    {
        builder.push("General");
        serverEnableVanillaBlocks = builder.comment("Enable vanilla aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableVanillaBlocks")
                .define("EnableVanillaBlocks", true);
        serverEnableNetherrocksBlocks = builder.comment("Enable Netherrocks aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableNetherrocksBlocks")
                .define("EnableNetherrocksBlocks", true);
        serverEnableFusionBlocks = builder.comment("Enable Fusion aesthetic blocks?")
                .translation(Aesthetics.MODID + "config.EnableFusionBlocks")
                .define("EnableFusionBlocks", true);
        builder.pop();
        builder.push("Blocks whose ingredients may come from other mods");
        serverEnableSteelBlocks = 
                builder.comment("Enable/disable steel blocks regardless of Fusion setting?")
                .translation(Aesthetics.MODID + "config.EnableSteelBlocks")
                .define("EnableSteelBlocks", true);
        serverEnableBronzeBlocks = 
                builder.comment("Enable/disable bronze blocks regardless of Fusion setting?")
                .translation(Aesthetics.MODID + "config.EnableBronzeBlocks")
                .define("EnableBronzeBlocks", true);
        builder.pop();
    } // end ctor
    
} // end-class
