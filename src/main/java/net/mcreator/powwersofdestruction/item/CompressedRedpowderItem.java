
package net.mcreator.powwersofdestruction.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.powwersofdestruction.init.PowersOfDestructionModTabs;

public class CompressedRedpowderItem extends Item {
	public CompressedRedpowderItem() {
		super(new Item.Properties().tab(PowersOfDestructionModTabs.TAB_PO_DTAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
