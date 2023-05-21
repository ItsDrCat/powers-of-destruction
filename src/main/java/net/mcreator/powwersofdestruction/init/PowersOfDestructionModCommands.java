
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.mcreator.powwersofdestruction.command.TestCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class PowersOfDestructionModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			TestCommand.register(dispatcher, commandBuildContext);
		});
	}
}
