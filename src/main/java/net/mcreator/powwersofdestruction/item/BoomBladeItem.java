
package net.mcreator.powwersofdestruction.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.mcreator.powwersofdestruction.procedures.BoomBladeRightclickedOnBlockProcedure;
import net.mcreator.powwersofdestruction.init.PowersOfDestructionModTabs;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class BoomBladeItem extends SwordItem {
	public BoomBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 175;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.BLAZE_ROD));
			}
		}, 3, -3.3f, new Item.Properties().tab(PowersOfDestructionModTabs.TAB_PO_DTAB).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;
		BoomBladeRightclickedOnBlockProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x).put("y", y).put("z", z).build());
		return retval;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		BoomBladeRightclickedOnBlockProcedure.execute(
				com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", context.getLevel()).put("x", context.getClickedPos().getX()).put("y", context.getClickedPos().getY()).put("z", context.getClickedPos().getZ()).build());
		return retval;
	}

	@Override
	@Environment(EnvType.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
