package alexndr.plugins.Aesthetics.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import alexndr.plugins.Aesthetics.ModInfo;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class FusionConditionFactory implements IConditionFactory {

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json , "value", true);
		String key = JsonUtils.getString(json, "type");
		
		// at all
		if (key.equals(ModInfo.ID + ":fusion_enabled")) {
			return () -> Settings.enableFusion == value;
		}
		// bricks
		if (key.equals(ModInfo.ID + ":fusion_bricks_enabled")) {
			return () -> Settings.FBricks == value;
		}
		// stairs
		if (key.equals(ModInfo.ID + ":fusion_brick_stairs_enabled")) {
			return () -> Settings.FBrickStairs == value;
		}
		// doors
		if (key.equals(ModInfo.ID + ":fusion_doors_enabled")) {
			return () -> Settings.FDoors == value;
		}
		// bars
		if (key.equals(ModInfo.ID + ":fusion_bars_enabled")) {
			return () -> Settings.FBars == value;
		}
		return null;
	}

} // end-class
