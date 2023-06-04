package net.mcreator.powwersofdestruction.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.powwersofdestruction.PowersOfDestructionMod;

import java.util.Map;

public class BobRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowersOfDestructionMod.LOGGER.warn("Failed to load dependency world for procedure BobRightclicked!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("powers_of_destruction:textures/items/bob.png"));
			Minecraft.getInstance().getTextureManager().register(new ResourceLocation("minecraft:textures/blocks/dirt.png"),
					Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("powers_of_destruction:textures/items/bob.png")));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("powers_of_destruction:textures/items/bob.png"));
			Minecraft.getInstance().getTextureManager().register(new ResourceLocation("minecraft:textures/blocks/stone.png"),
					Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("powers_of_destruction:textures/items/bob.png")));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("powers_of_destruction:textures/items/bob.png"));
			Minecraft.getInstance().getTextureManager().register(new ResourceLocation("minecraft:textures/blocks/deepslate.png"),
					Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("powers_of_destruction:textures/items/bob.png")));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("powers_of_destruction:textures/items/bob.png"));
			Minecraft.getInstance().getTextureManager().register(new ResourceLocation("minecraft:textures/blocks/sand.png"),
					Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("powers_of_destruction:textures/items/bob.png")));
		}
	}
}
