
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.mcreator.powwersofdestruction.procedures.NuclearexplosionProcedure;
import net.mcreator.powwersofdestruction.procedures.InstantTNTExplodeProcedure;
import net.mcreator.powwersofdestruction.procedures.BoomBladeRightclickedOnBlockProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PowersOfDestructionModProcedures {
	public static void load() {
		new BoomBladeRightclickedOnBlockProcedure();
		new NuclearexplosionProcedure();
		new InstantTNTExplodeProcedure();
	}
}
