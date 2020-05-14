package mod.alexndr.aesthetics.init;

import mod.alexndr.aesthetics.Aesthetics;
import mod.alexndr.aesthetics.api.content.SimpleBars;
import mod.alexndr.aesthetics.api.content.SimpleDoor;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
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
            new DeferredRegister<>(ForgeRegistries.BLOCKS, Aesthetics.MODID);

    // Blocks - bricks - vanilla
    public static RegistryObject<Block> iron_bricks = BLOCKS.register("iron_bricks",
            () -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static RegistryObject<Block> gold_bricks = BLOCKS.register("gold_bricks",
            () -> new Block(Block.Properties.from(Blocks.GOLD_BLOCK)));
    public static RegistryObject<Block> diamond_bricks = BLOCKS.register("diamond_bricks",
            () -> new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK)));
    
    // Blocks - bricks - Simple Ores
    // NB: the only reason we're calling simpleores stuff directly during init is that it is currently
    // REQUIRED and thus has to be loaded. Don't do this for Netherrocks or Fusion blocks.
    public static RegistryObject<Block> copper_bricks = BLOCKS.register("copper_bricks",
            () -> new Block(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.copper_block.get())));
    public static RegistryObject<Block> tin_bricks = BLOCKS.register("tin_bricks",
            () -> new Block(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.tin_block.get())));
    public static RegistryObject<Block> onyx_bricks = BLOCKS.register("onyx_bricks",
            () -> new Block(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.onyx_block.get())));
    public static RegistryObject<Block> adamantium_bricks = BLOCKS.register("adamantium_bricks",
            () -> new Block(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.adamantium_block.get())));
    public static RegistryObject<Block> mythril_bricks = BLOCKS.register("mythril_bricks",
            () -> new Block(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.mythril_block.get())));

    // Blocks - stairs - vanilla
    public static RegistryObject<StairsBlock> iron_brick_stairs = BLOCKS.register("iron_brick_stairs", 
            () -> new StairsBlock( () -> iron_bricks.get().getDefaultState(), 
                                   Block.Properties.from(iron_bricks.get())));
    public static RegistryObject<StairsBlock> gold_brick_stairs = BLOCKS.register("gold_brick_stairs", 
            () -> new StairsBlock( () -> gold_bricks.get().getDefaultState(), 
                                   Block.Properties.from(gold_bricks.get())));
    public static RegistryObject<StairsBlock> diamond_brick_stairs = BLOCKS.register("diamond_brick_stairs", 
            () -> new StairsBlock( () -> diamond_bricks.get().getDefaultState(), 
                                   Block.Properties.from(diamond_bricks.get())));

    // Blocks - stairs - simpleores
    public static RegistryObject<StairsBlock> copper_brick_stairs = BLOCKS.register("copper_brick_stairs", 
            () -> new StairsBlock( () -> copper_bricks.get().getDefaultState(), 
                                   Block.Properties.from(copper_bricks.get())));
    public static RegistryObject<StairsBlock> tin_brick_stairs = BLOCKS.register("tin_brick_stairs", 
            () -> new StairsBlock( () -> tin_bricks.get().getDefaultState(), 
                                   Block.Properties.from(tin_bricks.get())));
    public static RegistryObject<StairsBlock> onyx_brick_stairs = BLOCKS.register("onyx_brick_stairs", 
            () -> new StairsBlock( () -> onyx_bricks.get().getDefaultState(), 
                                   Block.Properties.from(onyx_bricks.get())));
    public static RegistryObject<StairsBlock> adamantium_brick_stairs = BLOCKS.register("adamantium_brick_stairs", 
            () -> new StairsBlock( () -> adamantium_bricks.get().getDefaultState(), 
                                   Block.Properties.from(adamantium_bricks.get())));
    public static RegistryObject<StairsBlock> mythril_brick_stairs = BLOCKS.register("mythril_brick_stairs", 
            () -> new StairsBlock( () -> mythril_bricks.get().getDefaultState(), 
                                   Block.Properties.from(mythril_bricks.get())));

    // Blocks - doors - simpleores
    public static RegistryObject<SimpleDoor> copper_door = BLOCKS.register("copper_door",
            () -> new SimpleDoor(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.copper_block.get())
                                .notSolid()));
    public static RegistryObject<SimpleDoor> tin_door = BLOCKS.register("tin_door",
            () -> new SimpleDoor(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.tin_block.get())
                                .notSolid()));
    public static RegistryObject<SimpleDoor> adamantium_door = BLOCKS.register("adamantium_door",
            () -> new SimpleDoor(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.adamantium_block.get())
                                .notSolid()));
    public static RegistryObject<SimpleDoor> onyx_door = BLOCKS.register("onyx_door",
            () -> new SimpleDoor(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.onyx_block.get())
                                .notSolid()));
    public static RegistryObject<SimpleDoor> mythril_door = BLOCKS.register("mythril_door",
            () -> new SimpleDoor(Block.Properties.from(mod.alexndr.simpleores.init.ModBlocks.mythril_block.get())
                                .notSolid()));
   
    // Blocks - bars - simpleores
    public static RegistryObject<SimpleBars> copper_bars = BLOCKS.register("copper_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(3.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> tin_bars = BLOCKS.register("tin_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(4.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> onyx_bars = BLOCKS.register("onyx_bars",
            () -> new SimpleBars(Block.Properties.create(Material.ROCK, MaterialColor.AIR)
                    .hardnessAndResistance(20.0F).sound(SoundType.STONE).notSolid()));
    public static RegistryObject<SimpleBars> adamantium_bars = BLOCKS.register("adamantium_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> mythril_bars = BLOCKS.register("mythril_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
  
} // end-class
