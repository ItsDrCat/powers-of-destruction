package net.mcreator.powwersofdestruction.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

import net.mcreator.powwersofdestruction.init.PowersOfDestructionModItems;
import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class TotemExplodeProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency world for procedure TotemExplode!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency x for procedure TotemExplode!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency y for procedure TotemExplode!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency z for procedure TotemExplode!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency entity for procedure TotemExplode!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency itemstack for procedure TotemExplode!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"playsound powers_of_destruction:explosion_totem_use neutral @a");
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowersOfDestructionModItems.TOTEM_OF_EXPLOSION);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		new Object() {
			private int ticks = 0;

			public void startDelay(LevelAccessor world) {
				ServerTickEvents.END_SERVER_TICK.register((server) -> {
					this.ticks++;
					if (this.ticks == 30) {
						for (int index0 = 0; index0 < (int) (Mth.nextDouble(RandomSource.create(), 7, 14)); index0++) {
							new Object() {
								private int ticks = 0;

								public void startDelay(LevelAccessor world) {
									ServerTickEvents.END_SERVER_TICK.register((server) -> {
										this.ticks++;
										if (this.ticks == 2) {
											if (world instanceof Level _level && !_level.isClientSide())
												_level.explode(null, (x + Mth.nextDouble(RandomSource.create(), -10, 10)), (y + Mth.nextDouble(RandomSource.create(), -10, 10)), (z + Mth.nextDouble(RandomSource.create(), -10, 10)),
														(float) Mth.nextDouble(RandomSource.create(), 6, 10), Explosion.BlockInteraction.DESTROY);
											return;
										}
									});
								}
							}.startDelay(world);
						}
						return;
					}
				});
			}
		}.startDelay(world);
	}
}
