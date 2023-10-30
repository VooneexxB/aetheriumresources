
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresources.potion.EfeitoMobEffect;
import net.mcreator.aetheriumresources.potion.Efeito2MobEffect;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<MobEffect> EFEITO = REGISTRY.register("efeito", () -> new EfeitoMobEffect());
	public static final RegistryObject<MobEffect> EFEITO_2 = REGISTRY.register("efeito_2", () -> new Efeito2MobEffect());
}
