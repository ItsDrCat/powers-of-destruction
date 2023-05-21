
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.powwersofdestruction.block.InstantTNTBlock;
import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

public class PowersOfDestructionModBlocks {
	public static Block INSTANT_TNT;

	public static void load() {
		INSTANT_TNT = Registry.register(Registry.BLOCK, new ResourceLocation(PowersOfDestructionMod.MODID, "instant_tnt"), new InstantTNTBlock());
	}

	public static void clientLoad() {
		InstantTNTBlock.clientInit();
	}
}
