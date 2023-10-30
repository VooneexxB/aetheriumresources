
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.aetheriumresources.client.model.Modelglitchv1;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AetheriumresourcesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelglitchv1.LAYER_LOCATION, Modelglitchv1::createBodyLayer);
	}
}
