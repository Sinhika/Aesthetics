package alexndr.plugins.Aesthetics;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * @author AleXndrTheGr8st
 */
public class RecipesSimpleOres 
{

    public static void addRecipes()
    {
        if (Settings.SOBricks) 
        {
            //Bricks
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            ContentSimpleOres.copper_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotCopper" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            ContentSimpleOres.tin_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotTin" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            ContentSimpleOres.mythril_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotMythril" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            ContentSimpleOres.adamantium_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotAdamantium" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            ContentSimpleOres.onyx_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "gemOnyx" }));

            //Brick Stairs
            if (Settings.SOBrickStairs) 
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentSimpleOres.copper_brick_stairs, 4), true,
                                new Object[]
                                { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                ContentSimpleOres.copper_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentSimpleOres.tin_brick_stairs, 4), true,
                                new Object[]
                                { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                ContentSimpleOres.tin_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentSimpleOres.mythril_brick_stairs, 4), true,
                                new Object[]
                                { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                ContentSimpleOres.mythril_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentSimpleOres.adamantium_brick_stairs, 4), true,
                                new Object[]
                                { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                ContentSimpleOres.adamantium_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentSimpleOres.onyx_brick_stairs, 4), true,
                                new Object[]
                                { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                ContentSimpleOres.onyx_bricks }));
            } // end-if SOBrickStairs
        } // end-if SOBricks
        
		if (Settings.SODoors) 
		{
		    //Doors
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.copper_door, 3), true, new Object[]
            { "XX", "XX", "XX", Character.valueOf('X'), "ingotCopper" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.tin_door, 3), true, new Object[]
            { "XX", "XX", "XX", Character.valueOf('X'), "ingotTin" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.mythril_door, 3), true, new Object[]
            { "XX", "XX", "XX", Character.valueOf('X'), "ingotMythril" }));
            GameRegistry.addRecipe(
                            new ShapedOreRecipe(new ItemStack(ContentSimpleOres.adamantium_door, 3),
                                            true, new Object[]
                            { "XX", "XX", "XX",
                            Character.valueOf('X'), "ingotAdamantium" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.onyx_door, 3), true,
                            new Object[]
                            { "XX", "XX", "XX", Character.valueOf('X'), "gemOnyx" }));
		} // end-if SODoors
		
		//Bars
        if (Settings.SOBars) 
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.copper_bars, 16), true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'), "ingotCopper" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.tin_bars, 16), true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'), "ingotTin" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.mythril_bars, 16), true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'), "ingotMythril" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.adamantium_bars, 16), true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'),
                            "ingotAdamantium" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(
                            new ItemStack(ContentSimpleOres.onyx_bars, 16), true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'), "gemOnyx" }));
        } // end-if SOBars
	} // end addRecipes()
} // end class
