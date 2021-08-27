package mod.alexndr.aesthetics.init;

import mod.alexndr.aesthetics.Aesthetics;
import mod.alexndr.simplecorelib.helpers.LightUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
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
    
    // Blocks - bricks - Netherrocks
    public static RegistryObject<Block> argonite_bricks = BLOCKS.register("argonite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> ashstone_bricks = BLOCKS.register("ashstone_bricks",
            () -> new Block(Block.Properties.of(Material.STONE)
                    .strength(7.0F, 72.0F).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> dragonstone_bricks = BLOCKS.register("dragonstone_bricks",
            () -> new Block(Block.Properties.of(Material.STONE, MaterialColor.NETHER)
                    .strength(10.0F, 72.0F).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> fyrite_bricks = BLOCKS.register("fyrite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.FIRE)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> illumenite_bricks = BLOCKS.register("illumenite_bricks",
            () -> new Block(Block.Properties.of(Material.GLASS, MaterialColor.COLOR_YELLOW)
                    .strength(7.0F, 72.0F).sound(SoundType.GLASS).requiresCorrectToolForDrops()
                    .lightLevel(LightUtils.setFixedLight(15))));
    public static RegistryObject<Block> malachite_bricks = BLOCKS.register("malachite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.EMERALD)
                    .strength(7.0F, 72.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    // Blocks - bricks - Fusion
    public static RegistryObject<Block> bronze_bricks = BLOCKS.register("bronze_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_YELLOW)
                    .strength(5.0F, 10.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> steel_bricks = BLOCKS.register("steel_bricks",
            () -> new Block(Block.Properties.of(Material.METAL)
                    .strength(7.0F, 12.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> sinisite_bricks = BLOCKS.register("sinisite_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
                    .strength(10.0F, 24.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
    public static RegistryObject<Block> thyrium_bricks = BLOCKS.register("thyrium_bricks",
            () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN)
                    .strength(7.0F, 12.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
   
    // Blocks - stairs - vanilla
    public static RegistryObject<StairBlock> iron_brick_stairs = BLOCKS.register("iron_brick_stairs", 
            () -> new StairBlock( () -> iron_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(iron_bricks.get())));
    public static RegistryObject<StairBlock> gold_brick_stairs = BLOCKS.register("gold_brick_stairs", 
            () -> new StairBlock( () -> gold_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(gold_bricks.get())));
    public static RegistryObject<StairBlock> diamond_brick_stairs = BLOCKS.register("diamond_brick_stairs", 
            () -> new StairBlock( () -> diamond_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(diamond_bricks.get())));

    // Blocks - stairs - netherrocks
    public static RegistryObject<StairBlock> argonite_brick_stairs = BLOCKS.register("argonite_brick_stairs", 
            () -> new StairBlock( () -> argonite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(argonite_bricks.get())));
    public static RegistryObject<StairBlock> ashstone_brick_stairs = BLOCKS.register("ashstone_brick_stairs", 
            () -> new StairBlock( () -> ashstone_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(ashstone_bricks.get())));
    public static RegistryObject<StairBlock> dragonstone_brick_stairs = BLOCKS.register("dragonstone_brick_stairs", 
            () -> new StairBlock( () -> dragonstone_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(dragonstone_bricks.get())));
    public static RegistryObject<StairBlock> fyrite_brick_stairs = BLOCKS.register("fyrite_brick_stairs", 
            () -> new StairBlock( () -> fyrite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(fyrite_bricks.get())));
    public static RegistryObject<StairBlock> illumenite_brick_stairs = BLOCKS.register("illumenite_brick_stairs", 
            () -> new StairBlock( () -> illumenite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(illumenite_bricks.get())));
    public static RegistryObject<StairBlock> malachite_brick_stairs = BLOCKS.register("malachite_brick_stairs", 
            () -> new StairBlock( () -> malachite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(malachite_bricks.get())));
   
    // Blocks - stairs - fusion
    public static RegistryObject<StairBlock> bronze_brick_stairs = BLOCKS.register("bronze_brick_stairs", 
            () -> new StairBlock( () -> bronze_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(bronze_bricks.get())));
    public static RegistryObject<StairBlock> steel_brick_stairs = BLOCKS.register("steel_brick_stairs", 
            () -> new StairBlock( () -> steel_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(steel_bricks.get())));
    public static RegistryObject<StairBlock> sinisite_brick_stairs = BLOCKS.register("sinisite_brick_stairs", 
            () -> new StairBlock( () -> sinisite_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(sinisite_bricks.get())));
    public static RegistryObject<StairBlock> thyrium_brick_stairs = BLOCKS.register("thyrium_brick_stairs", 
            () -> new StairBlock( () -> thyrium_bricks.get().defaultBlockState(), 
                                   Block.Properties.copy(thyrium_bricks.get())));
  
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
    
    // Blocks - bars - netherrocks
    public static RegistryObject<IronBarsBlock> argonite_bars = BLOCKS.register("argonite_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<IronBarsBlock> ashstone_bars = BLOCKS.register("ashstone_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.STONE, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static RegistryObject<IronBarsBlock> dragonstone_bars = BLOCKS.register("dragonstone_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.STONE, MaterialColor.NONE)
                    .strength(10.0F).requiresCorrectToolForDrops().sound(SoundType.STONE).noOcclusion()));
    public static RegistryObject<IronBarsBlock> fyrite_bars = BLOCKS.register("fyrite_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<IronBarsBlock> illumenite_bars = BLOCKS.register("illumenite_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()
                    .lightLevel(LightUtils.setFixedLight(14))));
    public static RegistryObject<IronBarsBlock> malachite_bars = BLOCKS.register("malachite_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
   
    // Blocks - bars - fusion
    public static RegistryObject<IronBarsBlock> bronze_bars = BLOCKS.register("bronze_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(5.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<IronBarsBlock> sinisite_bars = BLOCKS.register("sinisite_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(10.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<IronBarsBlock> steel_bars = BLOCKS.register("steel_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));
    public static RegistryObject<IronBarsBlock> thyrium_bars = BLOCKS.register("thyrium_bars",
            () -> new IronBarsBlock(Block.Properties.of(Material.METAL, MaterialColor.NONE)
                    .strength(7.0F).requiresCorrectToolForDrops().sound(SoundType.METAL).noOcclusion()));


} // end-class
