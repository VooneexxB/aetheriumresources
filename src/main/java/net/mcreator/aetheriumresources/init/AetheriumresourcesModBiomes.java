
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.aetheriumresources.world.biome.TwistedDesertBiome;
import net.mcreator.aetheriumresources.world.biome.DarkforestBiome;
import net.mcreator.aetheriumresources.world.biome.DarkdesertBiome;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Biome> DARKDESERT = REGISTRY.register("darkdesert", () -> DarkdesertBiome.createBiome());
	public static final RegistryObject<Biome> DARKFOREST = REGISTRY.register("darkforest", () -> DarkforestBiome.createBiome());
	public static final RegistryObject<Biome> TWISTED_DESERT = REGISTRY.register("twisted_desert", () -> TwistedDesertBiome.createBiome());
}
