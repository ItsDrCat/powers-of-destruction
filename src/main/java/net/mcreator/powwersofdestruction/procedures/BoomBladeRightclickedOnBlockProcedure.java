package net.mcreator.powwersofdestruction.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

import java.util.Map;

public class BoomBladeRightclickedOnBlockProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency world for procedure BoomBladeRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency x for procedure BoomBladeRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency y for procedure BoomBladeRightclickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency z for procedure BoomBladeRightclickedOnBlock!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 2, Explosion.BlockInteraction.BREAK);
	}
}
