package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModMobEffects;

public class MateriaorganicaPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 200, 3));
	}
}
