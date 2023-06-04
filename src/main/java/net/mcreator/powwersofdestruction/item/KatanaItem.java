
package net.mcreator.powwersofdestruction.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.powwersofdestruction.init.PowersOfDestructionModTabs;

public class KatanaItem extends SwordItem {
	public KatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 452;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 6.4f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().tab(PowersOfDestructionModTabs.TAB_POD_TAB_TEST));
	}
}
