package alexndr.plugins.Aesthetics.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import alexndr.plugins.Aesthetics.ModInfo;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class SimpleOresConditionFactory implements IConditionFactory {

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json , "value", true);
		String key = JsonUtils.getString(json, "type");
		
		// at all
		if (key.equals(ModInfo.ID + "simpleores_enabled")) {
			return () -> Settings.enableSimpleOres == value;
		}
		// bricks
		if (key.equals(ModInfo.ID + "simpleores_bricks_enabled")) {
			return () -> Settings.SOBricks == value;
		}
		// stairs
		if (key.equals(ModInfo.ID + "simpleores_brick_stairs_enabled")) {
			return () -> Settings.SOBrickStairs == value;
		}
		// doors
		if (key.equals(ModInfo.ID + "simpleores_doors_enabled")) {
			return () -> Settings.SODoors == value;
		}
		// bars
		if (key.equals(ModInfo.ID + "simpleores_bars_enabled")) {
			return () -> Settings.SOBars == value;
		}
		
		return null;
	}

} // end-class
