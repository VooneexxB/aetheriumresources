
package net.mcreator.aetheriumresources.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;

public class TwistedDesertBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16316922).waterColor(-15066598).waterFogColor(-15263977)
				.skyColor(-16316922).foliageColorOverride(-6029329).grassColorOverride(-1513240)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("aetheriumresources:twistedambience")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("aetheriumresources:moodtwisted")), 6000, 8, 2))
				.ambientAdditionsSound(
						new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("aetheriumresources:twistedadditions")), 0.0111D))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.SNOWFLAKE, 0.007f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.3f)
				.downfall(0.6f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}
}
