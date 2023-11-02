
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.aetheriumresources.client.gui.MicroscopioGUIScreen;
import net.mcreator.aetheriumresources.client.gui.AmethystMachineGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AetheriumresourcesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AetheriumresourcesModMenus.AMETHYST_MACHINE_GUI, AmethystMachineGUIScreen::new);
			MenuScreens.register(AetheriumresourcesModMenus.MICROSCOPIO_GUI, MicroscopioGUIScreen::new);
		});
	}
}
