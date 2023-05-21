
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PowersOfDestructionModSounds {
	public static SoundEvent NUCLEAR_BOOM = new SoundEvent(new ResourceLocation("powers_of_destruction", "nuclear_boom"));

	public static void load() {
		Registry.register(Registry.SOUND_EVENT, new ResourceLocation("powers_of_destruction", "nuclear_boom"), NUCLEAR_BOOM);
	}
}
