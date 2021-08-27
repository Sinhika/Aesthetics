package mod.alexndr.aesthetics.datagen;

import java.util.List;

import mod.alexndr.aesthetics.Aesthetics;
import mod.alexndr.aesthetics.init.ModBlocks;
import mod.alexndr.simplecorelib.datagen.MiningBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTags extends MiningBlockTags
{

	public ModBlockTags(DataGenerator gen, ExistingFileHelper existingFileHelper)
	{
		super(gen, Aesthetics.MODID, existingFileHelper);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addTags()
	{
        registerMiningTags();
	}

    private void registerMiningTags()
    {
        // do nothing; super() generates all the vanilla blocktags, and we don't want that.
    	registerMineableTags(List.of(ModBlocks.gold_bricks.get(), ModBlocks.gold_brick_stairs.get(),
    			ModBlocks.iron_bricks.get(), ModBlocks.iron_brick_stairs.get(), ModBlocks.diamond_bricks.get(),
    			ModBlocks.diamond_brick_stairs.get()),
    			List.of(ModBlocks.iron_bricks.get(), ModBlocks.iron_brick_stairs.get()),
    			List.of(ModBlocks.gold_bricks.get(), ModBlocks.gold_brick_stairs.get(),ModBlocks.diamond_bricks.get(),
    					ModBlocks.diamond_brick_stairs.get()),
    			List.of(),
    			List.of());
    } // end registerMiningTags
} // end class
