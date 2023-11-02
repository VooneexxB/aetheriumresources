/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.aetheriumresources;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModPotions;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModMobEffects;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModFeatures;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModEntities;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModBlocks;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModBlockEntities;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("aetheriumresources")
public class AetheriumresourcesMod {
	public static final Logger LOGGER = LogManager.getLogger(AetheriumresourcesMod.class);
	public static final String MODID = "aetheriumresources";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public AetheriumresourcesMod() {
		AetheriumresourcesModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		AetheriumresourcesModBlocks.REGISTRY.register(bus);
		AetheriumresourcesModItems.REGISTRY.register(bus);
		AetheriumresourcesModEntities.REGISTRY.register(bus);
		AetheriumresourcesModBlockEntities.REGISTRY.register(bus);
		AetheriumresourcesModFeatures.REGISTRY.register(bus);

		AetheriumresourcesModMobEffects.REGISTRY.register(bus);
		AetheriumresourcesModPotions.REGISTRY.register(bus);
		AetheriumresourcesModBiomes.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
