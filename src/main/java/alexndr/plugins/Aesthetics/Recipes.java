package alexndr.plugins.Aesthetics;

import alexndr.api.logger.LogHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * @author AleXndrTheGr8st
 */
public class Recipes 
{
	
	public static void initialize()
	{
        try {
            addRecipes();
            LogHelper.verbose(ModInfo.ID, "All recipes were added successfully.");
        }
        catch (Exception e) {
            LogHelper.severe(ModInfo.ID,
                            "Recipes were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
	} // end intialize()
	
	public static void addRecipes() 
	{
		doRecipes();
		if(ModSupport.use_simple_ores)
			RecipesSimpleOres.addRecipes();
		if(ModSupport.use_netherrocks)
			RecipesNetherrocks.addRecipes();
		if(ModSupport.use_fusion)
			RecipesFusion.addRecipes();
	}
	
	public static void doRecipes() 
	{
        if (Settings.MCBricks) 
        {
            // Bricks
            GameRegistry.addRecipe(new ShapedOreRecipe(Content.iron_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotIron" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(Content.gold_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "ingotGold" }));
            GameRegistry.addRecipe(new ShapedOreRecipe(Content.diamond_bricks, true,
                            new Object[]
                                            { "XX", "XX", Character.valueOf('X'), "gemDiamond" }));

            if (Settings.MCBrickStairs) 
            {
                // Brick Stairs
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                                new ItemStack(Content.iron_brick_stairs, 4), true,
                                                new Object[]
                                                { "X  ", "XX ", "XXX",
                                Character.valueOf('X'), Content.iron_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                                new ItemStack(Content.gold_brick_stairs, 4), true,
                                                new Object[]
                                                { "X  ", "XX ", "XXX",
                                Character.valueOf('X'), Content.gold_bricks }));
                GameRegistry.addRecipe(new ShapedOreRecipe(
                                                new ItemStack(Content.diamond_brick_stairs, 4),
                                                true, new Object[]
                                                { "X  ", "XX ", "XXX",
                                Character.valueOf('X'), Content.diamond_bricks }));
            } // end-if MCBrickStairs
        } // end-if MCBricks
	} // end doRecipes()
} // end class
