package mod.alexndr.aesthetics.client;

import mod.alexndr.aesthetics.Aesthetics;
import mod.alexndr.aesthetics.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Subscribe to events from the MOD EventBus that should be handled on the PHYSICAL CLIENT side in this class
 *
 * @author Cadiboo
 */
@EventBusSubscriber(modid = Aesthetics.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEventSubscriber
{
    /**
     * We need to register our renderers on the client because rendering code does not exist on the server
     * and trying to use it on a dedicated server will crash the game.
     * <p>
     * This method will be called by Forge when it is time for the mod to do its client-side setup
     * This method will always be called after the Registry events.
     * This means that all Blocks, Items, TileEntityTypes, etc. will all have been registered already
     */
    @SubscribeEvent
    public static void onFMLClientSetupEvent(final FMLClientSetupEvent event) 
    {
        // doors with see-through windows.
        RenderTypeLookup.setRenderLayer(ModBlocks.adamantium_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.copper_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.tin_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.onyx_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.mythril_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.argonite_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ashstone_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.dragonstone_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.fyrite_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.illumenite_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.malachite_door.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.bronze_door.get(), (layer) -> layer 
                == RenderType.cutout());
        
        // bars, which are see-through between the bars, obviously.
        RenderTypeLookup.setRenderLayer(ModBlocks.copper_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.tin_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.onyx_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.adamantium_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.mythril_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.argonite_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ashstone_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.dragonstone_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.fyrite_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.illumenite_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.malachite_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.bronze_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.sinisite_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.steel_bars.get(), (layer) -> layer 
                == RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.thyrium_bars.get(), (layer) -> layer 
                == RenderType.cutout());
    
    } // end onFMLClientSetupEvent

} // end class
