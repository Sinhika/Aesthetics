package alexndr.plugins.Aesthetics.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import alexndr.plugins.Aesthetics.ModInfo;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class NetherrocksConditionFactory implements IConditionFactory {

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json , "value", true);
		String key = JsonUtils.getString(json, "type");
		
		// at all
		if (key.equals(ModInfo.ID + ":netherrocks_enabled")) {
			return () -> Settings.enableNetherrocks == value;
		}
		// bricks
		if (key.equals(ModInfo.ID + ":netherrocks_bricks_enabled")) {
			return () -> Settings.NRBricks == value;
		}
		// stairs
		if (key.equals(ModInfo.ID + ":netherrocks_brick_stairs_enabled")) {
			return () -> Settings.NRBrickStairs == value;
		}
		// doors
		if (key.equals(ModInfo.ID + ":netherrocks_doors_enabled")) {
			return () -> Settings.NRDoors == value;
		}
		// bars
		if (key.equals(ModInfo.ID + ":netherrocks_bars_enabled")) {
			return () -> Settings.NRBars == value;
		}
		return null;
	}

} // end-class
