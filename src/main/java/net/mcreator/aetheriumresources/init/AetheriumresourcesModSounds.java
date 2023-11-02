
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AetheriumresourcesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("aetheriumresources", "error-breaking"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "error-breaking")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "error-placing"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "error-placing")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "failure-breaking"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "failure-breaking")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "failure-placing"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "failure-placing")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "failure-step"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "failure-step")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "failure-fall"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "failure-fall")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "error-fall"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "error-fall")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "error-hit"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "error-hit")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "failure-hit"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "failure-hit")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "potionerror"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "potionerror")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "truedeath"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "truedeath")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "breakingworld"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "breakingworld")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "falsehopedisc"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "falsehopedisc")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "swordslash1"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "swordslash1")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "parasita"), new SoundEvent(new ResourceLocation("aetheriumresources", "parasita")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "thunderstorm"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "thunderstorm")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "death"), new SoundEvent(new ResourceLocation("aetheriumresources", "death")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "simulacra"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "simulacra")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "theend"), new SoundEvent(new ResourceLocation("aetheriumresources", "theend")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "elektrodeath"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "elektrodeath")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "twistedambience"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "twistedambience")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "moodtwisted"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "moodtwisted")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "twistedadditions"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "twistedadditions")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "twistedmusic"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "twistedmusic")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "blockhitmetalpipe"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "blockhitmetalpipe")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "throwpipe"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "throwpipe")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "error-step"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "error-step")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "metalpipehit"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "metalpipehit")));
		REGISTRY.put(new ResourceLocation("aetheriumresources", "pipeprojectilehit"),
				new SoundEvent(new ResourceLocation("aetheriumresources", "pipeprojectilehit")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
