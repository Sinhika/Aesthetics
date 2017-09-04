package alexndr.plugins.Aesthetics;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * @author AleXndrTheGr8st
 */
public class RecipesFusion 
{
	public static void addRecipes() 
	{
		//Bricks
        if (Settings.FBricks) 
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(ContentFusion.steel_bricks, true, new Object[]{
                            "XX", "XX", Character.valueOf('X'), "ingotSteel"}));
            
            if (ModSupport.use_simple_ores) 
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(ContentFusion.bronze_bricks, true,
                                new Object[]
                { "XX", "XX", Character.valueOf('X'), "ingotBronze" }));
                GameRegistry.addRecipe(new ShapedOreRecipe(ContentFusion.thyrium_bricks, true,
                                new Object[]
                { "XX", "XX", Character.valueOf('X'), "ingotThyrium" }));
                GameRegistry.addRecipe(new ShapedOreRecipe(ContentFusion.sinisite_bricks, true,
                                new Object[]
                { "XX", "XX", Character.valueOf('X'), "ingotSinisite" }));
            } // end-if simpleores
            
            //Brick Stairs
            if (Settings.FBrickStairs) 
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ContentFusion.steel_brick_stairs, 4), true, new Object[]{
                                "X  ", "XX ", "XXX", Character.valueOf('X'), ContentFusion.steel_bricks}));
                if (ModSupport.use_simple_ores)
                {
                    GameRegistry.addRecipe(new ShapedOreRecipe(
                                    new ItemStack(ContentFusion.bronze_brick_stairs, 4), true,
                                    new Object[]
                                    { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                    ContentFusion.bronze_bricks }));
                    GameRegistry.addRecipe(new ShapedOreRecipe(
                                    new ItemStack(ContentFusion.thyrium_brick_stairs, 4), true,
                                    new Object[]
                                    { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                    ContentFusion.thyrium_bricks }));
                    GameRegistry.addRecipe(new ShapedOreRecipe(
                                    new ItemStack(ContentFusion.sinisite_brick_stairs, 4), true,
                                    new Object[]
                                    { "X  ", "XX ", "XXX", Character.valueOf('X'),
                                    ContentFusion.sinisite_bricks }));
                } // end-if simpleores
            } // end-if FBrickStairs
        } // end-if FBricks
        
		//Doors
		if (Settings.FDoors && ModSupport.use_simple_ores) 
		{
		    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ContentFusion.bronze_door, 3), true, new Object[]{
		                    "XX", "XX", "XX", Character.valueOf('X'), "ingotBronze"}));
		} // end-if FDoors
	       
		//Bars
        if (Settings.FBars) 
        {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ContentFusion.steel_bars, 16),
                            true,
                            new Object[]
                            { "XXX", "XXX", Character.valueOf('X'), "ingotSteel" }));
            if (ModSupport.use_simple_ores) 
            {
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentFusion.bronze_bars, 16), true, new Object[]
                { "XXX", "XXX", Character.valueOf('X'), "ingotBronze" }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentFusion.thyrium_bars, 16), true, new Object[]
                { "XXX", "XXX", Character.valueOf('X'), "ingotThyrium" }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                new ItemStack(ContentFusion.sinisite_bars, 16), true, new Object[]
                { "XXX", "XXX", Character.valueOf('X'), "ingotSinisite" }));
            } // end-if simpleores
        } // end-if FBars
        
	} // end addRecipes()
	
} // end-class
