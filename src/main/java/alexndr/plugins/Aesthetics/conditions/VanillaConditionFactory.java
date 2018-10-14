package alexndr.plugins.Aesthetics.conditions;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import alexndr.plugins.Aesthetics.ModInfo;
import alexndr.plugins.Aesthetics.Settings;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class VanillaConditionFactory implements IConditionFactory 
{

	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) 
	{
		boolean value = JsonUtils.getBoolean(json , "value", true);
		String key = JsonUtils.getString(json, "type");
		
		// bricks
		if (key.equals(ModInfo.ID + ":vanilla_bricks_enabled")) {
			return () -> Settings.MCBricks == value;
		}
		
		// stairs
		if (key.equals(ModInfo.ID + ":vanilla_brick_stairs_enabled")) {
			return () -> Settings.MCBrickStairs == value;
		}
		
		return null;
	}

} // end class