
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Potion> POCAOEFEITO = REGISTRY.register("pocaoefeito",
			() -> new Potion(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> ERRORETAPA_1 = REGISTRY.register("erroretapa_1", () -> new Potion());
	public static final RegistryObject<Potion> ERRORETAPA_2 = REGISTRY.register("erroretapa_2", () -> new Potion());
}
