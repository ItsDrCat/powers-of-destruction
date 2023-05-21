
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.mcreator.powwersofdestruction.client.renderer.ThrowableknifeRenderer;
import net.mcreator.powwersofdestruction.client.renderer.ThrowableNukeRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PowersOfDestructionModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(PowersOfDestructionModEntities.THROWABLEKNIFE, ThrowableknifeRenderer::new);
		EntityRendererRegistry.register(PowersOfDestructionModEntities.THROWABLE_NUKE, ThrowableNukeRenderer::new);
	}
}
