
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class PowersOfDestructionModTabs {
	public static CreativeModeTab TAB_PO_DTAB;

	public static void load() {
		TAB_PO_DTAB = FabricItemGroupBuilder.create(new ResourceLocation("powers_of_destruction", "po_dtab")).icon(() -> new ItemStack(PowersOfDestructionModItems.THROWABLE_NUKE)).build();
	}
}
