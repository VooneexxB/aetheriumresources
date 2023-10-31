
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.aetheriumresources.world.features.plants.TwistedGrassFeature;
import net.mcreator.aetheriumresources.world.features.plants.DarkgrassFeature;
import net.mcreator.aetheriumresources.world.features.ores.TwistedMatterFeature;
import net.mcreator.aetheriumresources.world.features.ores.EnrichedDarkMatterFeature;
import net.mcreator.aetheriumresources.world.features.ores.DarkmatterFeature;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class AetheriumresourcesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AetheriumresourcesMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ENRICHED_DARK_MATTER = register("enriched_dark_matter", EnrichedDarkMatterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EnrichedDarkMatterFeature.GENERATE_BIOMES,
					EnrichedDarkMatterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DARKGRASS = register("darkgrass", DarkgrassFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, DarkgrassFeature.GENERATE_BIOMES, DarkgrassFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DARKMATTER = register("darkmatter", DarkmatterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DarkmatterFeature.GENERATE_BIOMES, DarkmatterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TWISTED_MATTER = register("twisted_matter", TwistedMatterFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TwistedMatterFeature.GENERATE_BIOMES, TwistedMatterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TWISTED_GRASS = register("twisted_grass", TwistedGrassFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, TwistedGrassFeature.GENERATE_BIOMES, TwistedGrassFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
