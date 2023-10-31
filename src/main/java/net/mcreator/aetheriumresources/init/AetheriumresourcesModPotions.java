
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Potion> POCAOEFEITO = REGISTRY.register("pocaoefeito",
			() -> new Potion(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> ERRORETAPA_1 = REGISTRY.register("erroretapa_1",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 2, false, true)));
	public static final RegistryObject<Potion> ERRORETAPA_2 = REGISTRY.register("erroretapa_2",
			() -> new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.BLINDNESS, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 2, false, true)));
	public static final RegistryObject<Potion> ERROR_ETAPA_3 = REGISTRY.register("error_etapa_3",
			() -> new Potion(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 3600, 2, false, true),
					new MobEffectInstance(MobEffects.HUNGER, 3600, 3, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.POISON, 3600, 2, false, true)));
	public static final RegistryObject<Potion> ERRORETAPA_4 = REGISTRY.register("erroretapa_4",
			() -> new Potion(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 3600, 3, false, true),
					new MobEffectInstance(MobEffects.BLINDNESS, 3600, 3, false, true), new MobEffectInstance(MobEffects.WITHER, 3600, 3, false, true),
					new MobEffectInstance(MobEffects.UNLUCK, 3600, 3, false, true)));
	public static final RegistryObject<Potion> ERRORETAPAFINAL = REGISTRY.register("erroretapafinal",
			() -> new Potion(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 3600, 5, false, true),
					new MobEffectInstance(MobEffects.GLOWING, 3600, 2, false, true),
					new MobEffectInstance(MobEffects.LEVITATION, 3600, 2, false, true)));
}
