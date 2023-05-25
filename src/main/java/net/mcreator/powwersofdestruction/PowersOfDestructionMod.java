/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.powwersofdestruction;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.nbt.CompoundTag;

import net.mcreator.powwersofdestruction.init.PowersOfDestructionModTabs;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModSounds;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModProcedures;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModItems;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModGameRules;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModEntities;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModCommands;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModBlocks;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.api.ModInitializer;

public class PowersOfDestructionMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "powers_of_destruction";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PowersOfDestructionMod");
		PowersOfDestructionModTabs.load();
		PowersOfDestructionModGameRules.load();

		PowersOfDestructionModEntities.load();
		PowersOfDestructionModBlocks.load();
		PowersOfDestructionModItems.load();

		PowersOfDestructionModProcedures.load();
		PowersOfDestructionModCommands.load();

		PowersOfDestructionModSounds.load();

		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if (handler.getPlayer().getExtraCustomData().getCompound("PlayerPersisted").isEmpty()) {
				handler.getPlayer().getExtraCustomData().put("PlayerPersisted", new CompoundTag());
			}
			PowersOfDestructionMod.LOGGER.info(handler.getPlayer().getExtraCustomData());
		});
	}
}
