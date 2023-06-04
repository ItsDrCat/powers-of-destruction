
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.powwersofdestruction.item.TotemOfExplosionItem;
import net.mcreator.powwersofdestruction.item.ThrowableknifeItem;
import net.mcreator.powwersofdestruction.item.ThrowableNukeItem;
import net.mcreator.powwersofdestruction.item.RedpowderItem;
import net.mcreator.powwersofdestruction.item.KatanaItem;
import net.mcreator.powwersofdestruction.item.CompressedRedpowderItem;
import net.mcreator.powwersofdestruction.item.BoomBladeItem;
import net.mcreator.powwersofdestruction.item.BobItem;
import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

public class PowersOfDestructionModItems {
	public static Item BOOM_BLADE;
	public static Item THROWABLEKNIFE;
	public static Item THROWABLE_NUKE;
	public static Item REDPOWDER;
	public static Item COMPRESSED_REDPOWDER;
	public static Item INSTANT_TNT;
	public static Item TOTEM_OF_EXPLOSION;
	public static Item BOB;
	public static Item KATANA;

	public static void load() {
		BOOM_BLADE = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "boom_blade"), new BoomBladeItem());
		THROWABLEKNIFE = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "throwableknife"), new ThrowableknifeItem());
		THROWABLE_NUKE = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "throwable_nuke"), new ThrowableNukeItem());
		REDPOWDER = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "redpowder"), new RedpowderItem());
		COMPRESSED_REDPOWDER = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "compressed_redpowder"), new CompressedRedpowderItem());
		INSTANT_TNT = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "instant_tnt"), new BlockItem(PowersOfDestructionModBlocks.INSTANT_TNT, new Item.Properties().tab(PowersOfDestructionModTabs.TAB_PO_DTAB)));
		TOTEM_OF_EXPLOSION = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "totem_of_explosion"), new TotemOfExplosionItem());
		BOB = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "bob"), new BobItem());
		KATANA = Registry.register(Registry.ITEM, new ResourceLocation(PowersOfDestructionMod.MODID, "katana"), new KatanaItem());
	}
}
