
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.world.level.GameRules;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class PowersOfDestructionModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> ALLOWNUKES;

	public static void load() {
		ALLOWNUKES = GameRuleRegistry.register("allowNukes", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(true));
	}
}
