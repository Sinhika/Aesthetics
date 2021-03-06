package mod.alexndr.aesthetics.init;

import mod.alexndr.aesthetics.Aesthetics;
import net.minecraft.block.PaneBlock;
import mod.alexndr.simplecorelib.helpers.LightUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Block}s.
 * Suppliers that create Blocks are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Block Registry Event is fired by Forge and it is time for the mod to
 * register its Blocks, our Blocks are created and registered by the DeferredRegister.
 * The Block Registry Event will always be called before the Item registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Sinhika, notes by Cadiboo
 */
public final class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = 
            DeferredRegister.create(ForgeRegistries.BLOCKS, Aesthetics.MODID);

    // Blocks - bricks - vanilla
    public static RegistryObject<Block> iron_bricks = BLOCKS.register("iron_bricks",
            () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)));
    public static RegistryObject<Block> gold_bricks = BLOCKS.register("gold_bricks",
            () -> new Block(Block.Properties.copy(Blocks.GOLD_BLOCK)));
    public static RegistryObject<Block> diamond_bricks = BLOCKS.register("diamond_bricks",
            () -> new Block(Block.Properties.copy(Blocks.DIAMOND_BLOCK)));
    
    // Blocks - bricks - Simple Ores
    public static RegistryObject<Block> copper_bricks = BLOCKS.register("copper_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE)
                    .strength(3.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> tin_bricks = BLOCKS.register("tin_bricks",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(4.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> onyx_bricks = BLOCKS.register("onyx_bricks",
            () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.PODZOL)
                    .strength(20.0F, 100.0F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> adamantium_bricks = BLOCKS.register("adamantium_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN)
                    .strength(7.0F, 12.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> mythril_bricks = BLOCKS.register("mythril_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(7.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));

    // Blocks - bricks - Netherrocks
    public static RegistryObject<Block> argonite_bricks = BLOCKS.register("argonite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> ashstone_bricks = BLOCKS.register("ashstone_bricks",
            () -> new Block(Block.Properties.of(Material.STONE)
                    .strength(7.0F, 72.0F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> dragonstone_bricks = BLOCKS.register("dragonstone_bricks",
            () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.NETHER)
                    .strength(10.0F, 72.0F).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> fyrite_bricks = BLOCKS.register("fyrite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.FIRE)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> illumenite_bricks = BLOCKS.register("illumenite_bricks",
            () -> new Block(Block.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
                    .strength(7.0F, 72.0F).sound(SoundType.GLASS).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)
                    .lightLevel(LightUtils.setFixedLight(15))));
    public static RegistryObject<Block> malachite_bricks = BLOCKS.register("malachite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.EMERALD)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));

    // Blocks - bricks - Fusion
    public static RegistryObject<Block> bronze_bricks = BLOCKS.register("bronze_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_YELLOW)
                    .strength(5.0F, 10.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> steel_bricks = BLOCKS.register("steel_bricks",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(7.0F, 12.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> sinisite_bricks = BLOCKS.register("sinisite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(10.0F, 24.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> thyrium_bricks = BLOCKS.register("thyrium_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN)
                    .strength(7.0F, 12.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
   
    // Blocks - stairs - vanilla
    public static RegistryObject<StairsBlock> iron_brick_stairs = BLOCKS.register("iron_brick_stairs", 
            () -> new StairsBlock( () -> iron_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(iron_bricks.get())));
    public static RegistryObject<StairsBlock> gold_brick_stairs = BLOCKS.register("gold_brick_stairs", 
            () -> new StairsBlock( () -> gold_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(gold_bricks.get())));
    public static RegistryObject<StairsBlock> diamond_brick_stairs = BLOCKS.register("diamond_brick_stairs", 
            () -> new StairsBlock( () -> diamond_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(diamond_bricks.get())));

    // Blocks - stairs - simpleores
    public static RegistryObject<StairsBlock> copper_brick_stairs = BLOCKS.register("copper_brick_stairs", 
            () -> new StairsBlock( () -> copper_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(copper_bricks.get())));
    public static RegistryObject<StairsBlock> tin_brick_stairs = BLOCKS.register("tin_brick_stairs", 
            () -> new StairsBlock( () -> tin_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(tin_bricks.get())));
    public static RegistryObject<StairsBlock> onyx_brick_stairs = BLOCKS.register("onyx_brick_stairs", 
            () -> new StairsBlock( () -> onyx_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(onyx_bricks.get())));
    public static RegistryObject<StairsBlock> adamantium_brick_stairs = BLOCKS.register("adamantium_brick_stairs", 
            () -> new StairsBlock( () -> adamantium_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(adamantium_bricks.get())));
    public static RegistryObject<StairsBlock> mythril_brick_stairs = BLOCKS.register("mythril_brick_stairs", 
            () -> new StairsBlock( () -> mythril_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(mythril_bricks.get())));

    // Blocks - stairs - netherrocks
    public static RegistryObject<StairsBlock> argonite_brick_stairs = BLOCKS.register("argonite_brick_stairs", 
            () -> new StairsBlock( () -> argonite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(argonite_bricks.get())));
    public static RegistryObject<StairsBlock> ashstone_brick_stairs = BLOCKS.register("ashstone_brick_stairs", 
            () -> new StairsBlock( () -> ashstone_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(ashstone_bricks.get())));
    public static RegistryObject<StairsBlock> dragonstone_brick_stairs = BLOCKS.register("dragonstone_brick_stairs", 
            () -> new StairsBlock( () -> dragonstone_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(dragonstone_bricks.get())));
    public static RegistryObject<StairsBlock> fyrite_brick_stairs = BLOCKS.register("fyrite_brick_stairs", 
            () -> new StairsBlock( () -> fyrite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(fyrite_bricks.get())));
    public static RegistryObject<StairsBlock> illumenite_brick_stairs = BLOCKS.register("illumenite_brick_stairs", 
            () -> new StairsBlock( () -> illumenite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(illumenite_bricks.get())));
    public static RegistryObject<StairsBlock> malachite_brick_stairs = BLOCKS.register("malachite_brick_stairs", 
            () -> new StairsBlock( () -> malachite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(malachite_bricks.get())));
   
    // Blocks - stairs - fusion
    public static RegistryObject<StairsBlock> bronze_brick_stairs = BLOCKS.register("bronze_brick_stairs", 
            () -> new StairsBlock( () -> bronze_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(bronze_bricks.get())));
    public static RegistryObject<StairsBlock> steel_brick_stairs = BLOCKS.register("steel_brick_stairs", 
            () -> new StairsBlock( () -> steel_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(steel_bricks.get())));
    public static RegistryObject<StairsBlock> sinisite_brick_stairs = BLOCKS.register("sinisite_brick_stairs", 
            () -> new StairsBlock( () -> sinisite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(sinisite_bricks.get())));
    public static RegistryObject<StairsBlock> thyrium_brick_stairs = BLOCKS.register("thyrium_brick_stairs", 
            () -> new StairsBlock( () -> thyrium_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(thyrium_bricks.get())));
  
    // Blocks - doors - simpleores
    // NB: using the shortcut that the bricks have the same properties as the metal blocks.
    public static RegistryObject<DoorBlock> copper_door = BLOCKS.register("copper_door",
            () -> new DoorBlock(Block.Properties.copy(copper_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> tin_door = BLOCKS.register("tin_door",
            () -> new DoorBlock(Block.Properties.copy(tin_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> adamantium_door = BLOCKS.register("adamantium_door",
            () -> new DoorBlock(Block.Properties.copy(adamantium_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> onyx_door = BLOCKS.register("onyx_door",
            () -> new DoorBlock(Block.Properties.copy(onyx_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> mythril_door = BLOCKS.register("mythril_door",
            () -> new DoorBlock(Block.Properties.copy(mythril_bricks.get()).noOcclusion()));
   
    // Blocks - doors - netherrocks
    public static RegistryObject<DoorBlock> argonite_door = BLOCKS.register("argonite_door",
            () -> new DoorBlock(Block.Properties.copy(argonite_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> ashstone_door = BLOCKS.register("ashstone_door",
            () -> new DoorBlock(Block.Properties.copy(ashstone_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> dragonstone_door = BLOCKS.register("dragonstone_door",
            () -> new DoorBlock(Block.Properties.copy(dragonstone_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> fyrite_door = BLOCKS.register("fyrite_door",
            () -> new DoorBlock(Block.Properties.copy(fyrite_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> illumenite_door = BLOCKS.register("illumenite_door",
            () -> new DoorBlock(Block.Properties.copy(illumenite_bricks.get()).noOcclusion()));
    public static RegistryObject<DoorBlock> malachite_door = BLOCKS.register("malachite_door",
            () -> new DoorBlock(Block.Properties.copy(malachite_bricks.get()).noOcclusion()));
   
    // Blocks - doors - fusion
    public static RegistryObject<DoorBlock> bronze_door = BLOCKS.register("bronze_door",
            () -> new DoorBlock(Block.Properties.copy(bronze_bricks.get()).noOcclusion()));
    
    // Blocks - bars - simpleores
    public static RegistryObject<PaneBlock> copper_bars = BLOCKS.register("copper_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(3.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> tin_bars = BLOCKS.register("tin_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(4.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> onyx_bars = BLOCKS.register("onyx_bars",
            () -> new PaneBlock(Block.Properties.of(Material.STONE, MaterialColor.NONE)
                    .strength(20.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static RegistryObject<PaneBlock> adamantium_bars = BLOCKS.register("adamantium_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> mythril_bars = BLOCKS.register("mythril_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    
    // Blocks - bars - netherrocks
    public static RegistryObject<PaneBlock> argonite_bars = BLOCKS.register("argonite_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> ashstone_bars = BLOCKS.register("ashstone_bars",
            () -> new PaneBlock(Block.Properties.of(Material.STONE, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static RegistryObject<PaneBlock> dragonstone_bars = BLOCKS.register("dragonstone_bars",
            () -> new PaneBlock(Block.Properties.of(Material.STONE, MaterialColor.NONE)
                    .strength(10.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static RegistryObject<PaneBlock> fyrite_bars = BLOCKS.register("fyrite_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> illumenite_bars = BLOCKS.register("illumenite_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()
                    .lightLevel(LightUtils.setFixedLight(14))));
    public static RegistryObject<PaneBlock> malachite_bars = BLOCKS.register("malachite_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
   
    // Blocks - bars - fusion
    public static RegistryObject<PaneBlock> bronze_bars = BLOCKS.register("bronze_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(5.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> sinisite_bars = BLOCKS.register("sinisite_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(10.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> steel_bars = BLOCKS.register("steel_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<PaneBlock> thyrium_bars = BLOCKS.register("thyrium_bars",
            () -> new PaneBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));


} // end-class
