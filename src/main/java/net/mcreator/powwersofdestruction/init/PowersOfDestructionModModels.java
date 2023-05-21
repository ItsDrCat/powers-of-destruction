
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.powwersofdestruction.init;

import net.mcreator.powwersofdestruction.client.model.Modelknife_model;
import net.mcreator.powwersofdestruction.client.model.Modelcustom_model;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class PowersOfDestructionModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelknife_model.LAYER_LOCATION, Modelknife_model::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
	}
}
