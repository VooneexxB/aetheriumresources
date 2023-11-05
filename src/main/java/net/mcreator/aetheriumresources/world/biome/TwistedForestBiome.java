
package net.mcreator.aetheriumresources.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModBlocks;

import java.util.List;

public class TwistedForestBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-5376004).waterColor(-15066598).waterFogColor(-15263977)
				.skyColor(-5376004).foliageColorOverride(-6029329).grassColorOverride(-1513240)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("aetheriumresources:twistedambience")))
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("aetheriumresources:moodtwisted")), 6000, 8, 2))
				.ambientAdditionsSound(
						new AmbientAdditionsSettings(new SoundEvent(new ResourceLocation("aetheriumresources:twistedadditions")), 0.0111D))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("aetheriumresources:twistedmusic")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.SNOWFLAKE, 0.007f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("aetheriumresources:tree_twisted_forest",
						FeatureUtils.register("aetheriumresources:tree_twisted_forest", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(
										BlockStateProvider.simple(AetheriumresourcesModBlocks.TWISTED_FOREST_LOG.get().defaultBlockState()),
										new ForkingTrunkPlacer(4, 2, 2),
										BlockStateProvider.simple(AetheriumresourcesModBlocks.TWISTED_FOREST_LEAVES.get().defaultBlockState()),
										new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2))
										.ignoreVines().build()),
						List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
								PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
								BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).temperature(0.2f)
				.downfall(0.55f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}
}
