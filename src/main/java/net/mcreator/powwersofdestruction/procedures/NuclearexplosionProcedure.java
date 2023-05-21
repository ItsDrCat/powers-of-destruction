package net.mcreator.powwersofdestruction.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.powwersofdestruction.init.PowersOfDestructionModGameRules;
import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

import java.util.Map;

public class NuclearexplosionProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency world for procedure Nuclearexplosion!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency x for procedure Nuclearexplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency y for procedure Nuclearexplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency z for procedure Nuclearexplosion!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.getLevelData().getGameRules().getBoolean(PowersOfDestructionModGameRules.ALLOWNUKES) == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound powers_of_destruction:nuclear_boom neutral @a");
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 25), y, (z + 25), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + -25), y, (z + -25), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 0), y, (z + -25), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + -25), y, (z + 0), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 25), y, (z + 0), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 0), y, (z + 25), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + -25), y, (z + 25), 200, Explosion.BlockInteraction.DESTROY);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (x + 25), y, (z + -25), 200, Explosion.BlockInteraction.DESTROY);
			for (int index0 = 0; index0 < (int) (15); index0++) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 100 * Math.random()), (y + 10 * Math.random()), (z + 10 * Math.random()), 175, Explosion.BlockInteraction.DESTROY);
			}
			for (int index1 = 0; index1 < (int) (15); index1++) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 100 * Math.random()), (y - 10 * Math.random()), (z - 10 * Math.random()), 175, Explosion.BlockInteraction.DESTROY);
			}
			for (int index2 = 0; index2 < (int) (15); index2++) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 100 * Math.random()), (y + 10 * Math.random()), (z - 10 * Math.random()), 175, Explosion.BlockInteraction.DESTROY);
			}
			for (int index3 = 0; index3 < (int) (15); index3++) {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 100 * Math.random()), (y - 10 * Math.random()), (z + 10 * Math.random()), 175, Explosion.BlockInteraction.DESTROY);
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"say Nukes are disabled");
		}
	}
}
