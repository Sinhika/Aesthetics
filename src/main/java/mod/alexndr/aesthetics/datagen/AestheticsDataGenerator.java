package mod.alexndr.aesthetics.datagen;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;
import mod.alexndr.aesthetics.Aesthetics;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

/**
 * bundles up the GatherDataEvent handler and all the necessary data providers for
 * data generation.
 * @author Sinhika
 */
@EventBusSubscriber(modid = Aesthetics.MODID, bus = MOD)
public class AestheticsDataGenerator
{
	   /**
     * GatherDataEvent handler.
     * @param event the GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer())
        {
            gen.addProvider(new ModBlockTags(gen, event.getExistingFileHelper()));
        }
     } // end gatherData()

} // end class
