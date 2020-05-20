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
            new DeferredRegister<>(ForgeRegistries.BLOCKS, Aesthetics.MODID);

    // Blocks - bricks - vanilla
    public static RegistryObject<Block> iron_bricks = BLOCKS.register("iron_bricks",
            () -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));
    public static RegistryObject<Block> gold_bricks = BLOCKS.register("gold_bricks",
            () -> new Block(Block.Properties.from(Blocks.GOLD_BLOCK)));
    public static RegistryObject<Block> diamond_bricks = BLOCKS.register("diamond_bricks",
            () -> new Block(Block.Properties.from(Blocks.DIAMOND_BLOCK)));
    
    // Blocks - bricks - Simple Ores
    public static RegistryObject<Block> copper_bricks = BLOCKS.register("copper_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.ORANGE_TERRACOTTA)
                    .hardnessAndResistance(3.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> tin_bricks = BLOCKS.register("tin_bricks",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(4.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> onyx_bricks = BLOCKS.register("onyx_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.OBSIDIAN)
                    .hardnessAndResistance(20.0F, 100.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> adamantium_bricks = BLOCKS.register("adamantium_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.GREEN)
                    .hardnessAndResistance(7.0F, 12.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> mythril_bricks = BLOCKS.register("mythril_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE)
                    .hardnessAndResistance(7.0F, 6.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));

    // Blocks - bricks - Netherrocks
    public static RegistryObject<Block> argonite_bricks = BLOCKS.register("argonite_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE)
                    .hardnessAndResistance(7.0F, 72.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> ashstone_bricks = BLOCKS.register("ashstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance(7.0F, 72.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> dragonstone_bricks = BLOCKS.register("dragonstone_bricks",
            () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK)
                    .hardnessAndResistance(10.0F, 72.0F)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> fyrite_bricks = BLOCKS.register("fyrite_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.TNT)
                    .hardnessAndResistance(7.0F, 72.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));
    public static RegistryObject<Block> illumenite_bricks = BLOCKS.register("illumenite_bricks",
            () -> new Block(Block.Properties.create(Material.GLASS, MaterialColor.YELLOW)
                    .hardnessAndResistance(7.0F, 72.0F).sound(SoundType.GLASS)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1).lightValue(15)));
    public static RegistryObject<Block> malachite_bricks = BLOCKS.register("malachite_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.EMERALD)
                    .hardnessAndResistance(7.0F, 72.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(1)));

    // Blocks - bricks - Fusion
    public static RegistryObject<Block> bronze_bricks = BLOCKS.register("bronze_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.YELLOW_TERRACOTTA)
                    .hardnessAndResistance(5.0F, 10.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> steel_bricks = BLOCKS.register("steel_bricks",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(7.0F, 12.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> sinisite_bricks = BLOCKS.register("sinisite_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.BLUE)
                    .hardnessAndResistance(10.0F, 24.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
    public static RegistryObject<Block> thyrium_bricks = BLOCKS.register("thyrium_bricks",
            () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.CYAN)
                    .hardnessAndResistance(7.0F, 12.0F).sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(0)));
   
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

    // Blocks - stairs - netherrocks
    public static RegistryObject<StairsBlock> argonite_brick_stairs = BLOCKS.register("argonite_brick_stairs", 
            () -> new StairsBlock( () -> argonite_bricks.get().getDefaultState(), 
                                   Block.Properties.from(argonite_bricks.get())));
    public static RegistryObject<StairsBlock> ashstone_brick_stairs = BLOCKS.register("ashstone_brick_stairs", 
            () -> new StairsBlock( () -> ashstone_bricks.get().getDefaultState(), 
                                   Block.Properties.from(ashstone_bricks.get())));
    public static RegistryObject<StairsBlock> dragonstone_brick_stairs = BLOCKS.register("dragonstone_brick_stairs", 
            () -> new StairsBlock( () -> dragonstone_bricks.get().getDefaultState(), 
                                   Block.Properties.from(dragonstone_bricks.get())));
    public static RegistryObject<StairsBlock> fyrite_brick_stairs = BLOCKS.register("fyrite_brick_stairs", 
            () -> new StairsBlock( () -> fyrite_bricks.get().getDefaultState(), 
                                   Block.Properties.from(fyrite_bricks.get())));
    public static RegistryObject<StairsBlock> illumenite_brick_stairs = BLOCKS.register("illumenite_brick_stairs", 
            () -> new StairsBlock( () -> illumenite_bricks.get().getDefaultState(), 
                                   Block.Properties.from(illumenite_bricks.get())));
    public static RegistryObject<StairsBlock> malachite_brick_stairs = BLOCKS.register("malachite_brick_stairs", 
            () -> new StairsBlock( () -> malachite_bricks.get().getDefaultState(), 
                                   Block.Properties.from(malachite_bricks.get())));
   
    // Blocks - stairs - fusion
    public static RegistryObject<StairsBlock> bronze_brick_stairs = BLOCKS.register("bronze_brick_stairs", 
            () -> new StairsBlock( () -> bronze_bricks.get().getDefaultState(), 
                                   Block.Properties.from(bronze_bricks.get())));
    public static RegistryObject<StairsBlock> steel_brick_stairs = BLOCKS.register("steel_brick_stairs", 
            () -> new StairsBlock( () -> steel_bricks.get().getDefaultState(), 
                                   Block.Properties.from(steel_bricks.get())));
    public static RegistryObject<StairsBlock> sinisite_brick_stairs = BLOCKS.register("sinisite_brick_stairs", 
            () -> new StairsBlock( () -> sinisite_bricks.get().getDefaultState(), 
                                   Block.Properties.from(sinisite_bricks.get())));
    public static RegistryObject<StairsBlock> thyrium_brick_stairs = BLOCKS.register("thyrium_brick_stairs", 
            () -> new StairsBlock( () -> thyrium_bricks.get().getDefaultState(), 
                                   Block.Properties.from(thyrium_bricks.get())));
  
    // Blocks - doors - simpleores
    // NB: using the shortcut that the bricks have the same properties as the metal blocks.
    public static RegistryObject<SimpleDoor> copper_door = BLOCKS.register("copper_door",
            () -> new SimpleDoor(Block.Properties.from(copper_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> tin_door = BLOCKS.register("tin_door",
            () -> new SimpleDoor(Block.Properties.from(tin_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> adamantium_door = BLOCKS.register("adamantium_door",
            () -> new SimpleDoor(Block.Properties.from(adamantium_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> onyx_door = BLOCKS.register("onyx_door",
            () -> new SimpleDoor(Block.Properties.from(onyx_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> mythril_door = BLOCKS.register("mythril_door",
            () -> new SimpleDoor(Block.Properties.from(mythril_bricks.get()).notSolid()));
   
    // Blocks - doors - netherrocks
    public static RegistryObject<SimpleDoor> argonite_door = BLOCKS.register("argonite_door",
            () -> new SimpleDoor(Block.Properties.from(argonite_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> ashstone_door = BLOCKS.register("ashstone_door",
            () -> new SimpleDoor(Block.Properties.from(ashstone_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> dragonstone_door = BLOCKS.register("dragonstone_door",
            () -> new SimpleDoor(Block.Properties.from(dragonstone_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> fyrite_door = BLOCKS.register("fyrite_door",
            () -> new SimpleDoor(Block.Properties.from(fyrite_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> illumenite_door = BLOCKS.register("illumenite_door",
            () -> new SimpleDoor(Block.Properties.from(illumenite_bricks.get()).notSolid()));
    public static RegistryObject<SimpleDoor> malachite_door = BLOCKS.register("malachite_door",
            () -> new SimpleDoor(Block.Properties.from(malachite_bricks.get()).notSolid()));
   
    // Blocks - doors - fusion
    public static RegistryObject<SimpleDoor> bronze_door = BLOCKS.register("bronze_door",
            () -> new SimpleDoor(Block.Properties.from(bronze_bricks.get()).notSolid()));
    
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
    
    // Blocks - bars - netherrocks
    public static RegistryObject<SimpleBars> argonite_bars = BLOCKS.register("argonite_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> ashstone_bars = BLOCKS.register("ashstone_bars",
            () -> new SimpleBars(Block.Properties.create(Material.ROCK, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.STONE).notSolid()));
    public static RegistryObject<SimpleBars> dragonstone_bars = BLOCKS.register("dragonstone_bars",
            () -> new SimpleBars(Block.Properties.create(Material.ROCK, MaterialColor.AIR)
                    .hardnessAndResistance(10.0F).sound(SoundType.STONE).notSolid()));
    public static RegistryObject<SimpleBars> fyrite_bars = BLOCKS.register("fyrite_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> illumenite_bars = BLOCKS.register("illumenite_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid().lightValue(14)));
    public static RegistryObject<SimpleBars> malachite_bars = BLOCKS.register("malachite_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
   
    // Blocks - bars - fusion
    public static RegistryObject<SimpleBars> bronze_bars = BLOCKS.register("bronze_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> sinisite_bars = BLOCKS.register("sinisite_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(10.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> steel_bars = BLOCKS.register("steel_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));
    public static RegistryObject<SimpleBars> thyrium_bars = BLOCKS.register("thyrium_bars",
            () -> new SimpleBars(Block.Properties.create(Material.IRON, MaterialColor.AIR)
                    .hardnessAndResistance(7.0F).sound(SoundType.METAL).notSolid()));

} // end-class
