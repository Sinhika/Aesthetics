package mod.alexndr.aesthetics;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.alexndr.aesthetics.config.AestheticsConfig;
import mod.alexndr.aesthetics.config.ConfigHelper;
import mod.alexndr.aesthetics.config.ConfigHolder;
import mod.alexndr.aesthetics.init.ModBlocks;
import mod.alexndr.aesthetics.init.ModItemGroups;
import mod.alexndr.simplecorelib.config.FlagCondition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber(modid = Aesthetics.MODID, bus = MOD)
public final class ModEventSubscriber 
{
	private static final Logger LOGGER = LogManager.getLogger(Aesthetics.MODID + " Mod Event Subscriber");

    /**
     * For best inter-mod compatibility, run ore generation in a DeferredWorkQueue, per dieseiben07.
     * @param event
     */
    @SubscribeEvent
    public static void onCommonSetup(final FMLCommonSetupEvent event)
    {
    } // end onCommonSetup

	/**
	 * This method will be called by Forge when it is time for the mod to register its Items.
	 * This method will always be called after the Block registry method.
	 */
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event)
	{
		final IForgeRegistry<Item> registry = event.getRegistry();

		// We need to go over the entire registry so that we include any potential Registry Overrides
        // Automatically register BlockItems for all our Blocks
        ModBlocks.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                // You can do extra filtering here if you don't want some blocks to have an BlockItem automatically registered for them
                // .filter(block -> needsItemBlock(block))
                // Register the BlockItem for the block
                .forEach(block -> {
                    // Make the properties, and make it so that the item will be on our ItemGroup (CreativeTab)
                    final Item.Properties properties = 
                            new Item.Properties().tab(ModItemGroups.MOD_ITEM_GROUP);
                    // Create the new BlockItem with the block and it's properties
                    final BlockItem blockItem = new BlockItem(block, properties);
                    // Set the new BlockItem's registry name to the block's registry name
                    blockItem.setRegistryName(block.getRegistryName());
                    // Register the BlockItem
                    registry.register(blockItem);
                });
		LOGGER.debug("Registered BlockItems");
	}  // end onRegisterItems()

	@SubscribeEvent
	public static void onModConfigEvent(final ModConfigEvent event)
	{
		final ModConfig config = event.getConfig();

        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.CLIENT_SPEC)
        {
            ConfigHelper.bakeClient(config);
        }
        else if (config.getSpec() == ConfigHolder.SERVER_SPEC)
        {
            ConfigHelper.bakeServer(config);
        }
	} // onModConfigEvent

    @SubscribeEvent
    public static void onRegisterRecipeSerializers(
            @Nonnull final RegistryEvent.Register<RecipeSerializer<?>> event)
    {
        CraftingHelper.register(new FlagCondition.Serializer(AestheticsConfig.INSTANCE, 
                new ResourceLocation(Aesthetics.MODID, "flag")));
    } // end registerRecipeSerializers

} // end class ModEventSubscriber
