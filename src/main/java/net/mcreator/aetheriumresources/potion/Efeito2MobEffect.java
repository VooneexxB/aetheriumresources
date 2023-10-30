
package net.mcreator.aetheriumresources.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresources.procedures.Efeito2OnEffectActiveTickProcedure;

public class Efeito2MobEffect extends MobEffect {
	public Efeito2MobEffect() {
		super(MobEffectCategory.NEUTRAL, -10140681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetheriumresources.efeito_2";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Efeito2OnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
