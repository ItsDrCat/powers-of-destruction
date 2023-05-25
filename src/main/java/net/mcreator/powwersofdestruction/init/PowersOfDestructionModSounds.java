
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PowersOfDestructionModSounds {
	public static SoundEvent NUCLEAR_BOOM = new SoundEvent(new ResourceLocation("powers_of_destruction", "nuclear_boom"));
	public static SoundEvent EXPLOSION_TOTEM_USE = new SoundEvent(new ResourceLocation("powers_of_destruction", "explosion_totem_use"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("powers_of_destruction", "nuclear_boom"), NUCLEAR_BOOM);
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("powers_of_destruction", "explosion_totem_use"), EXPLOSION_TOTEM_USE);
	}
}
