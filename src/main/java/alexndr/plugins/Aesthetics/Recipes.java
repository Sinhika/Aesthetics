package alexndr.plugins.Aesthetics;

import alexndr.api.logger.LogHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * @author AleXndrTheGr8st
 */
public class Recipes 
{
    private static boolean simpleores = Loader.isModLoaded("simpleores")
                                        && Settings.enableSimpleOres.asBoolean();
    private static boolean fusion = Loader.isModLoaded("fusion")
                                    && Settings.enableFusion.asBoolean();
    private static boolean netherrocks = Loader.isModLoaded("netherrocks")
                                         && Settings.enableNetherrocks.asBoolean();

	
	public static void initialize()
	{
        try {
            addRecipes();
            LogHelper.verbose("Aesthetics", "All recipes were added successfully.");
        }
        catch (Exception e) {
            LogHelper.severe("Aesthetics",
                            "Recipes were not added successfully. This is a serious problem!");
            e.printStackTrace();
        }
	}
	
	public static void addRecipes() {
		doRecipes();
		if(simpleores)
			RecipesSimpleOres.addRecipes();
		if(netherrocks)
			RecipesNetherrocks.addRecipes();
		if(fusion)
			RecipesFusion.addRecipes();
	}
	
	public static void doRecipes() 
	{
        if (Settings.MCBricks.asBoolean()) 
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

            if (Settings.MCBrickStairs.asBoolean()) 
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
