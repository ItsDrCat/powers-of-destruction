
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.powwersofdestruction.entity.ThrowableknifeEntity;
import net.mcreator.powwersofdestruction.entity.ThrowableNukeEntity;
import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class PowersOfDestructionModEntities {
	public static EntityType<ThrowableknifeEntity> THROWABLEKNIFE;
	public static EntityType<ThrowableNukeEntity> THROWABLE_NUKE;

	public static void load() {
		THROWABLEKNIFE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PowersOfDestructionMod.MODID, "throwableknife"), createArrowEntityType(ThrowableknifeEntity::new));
		THROWABLE_NUKE = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PowersOfDestructionMod.MODID, "throwable_nuke"), createArrowEntityType(ThrowableNukeEntity::new));
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
