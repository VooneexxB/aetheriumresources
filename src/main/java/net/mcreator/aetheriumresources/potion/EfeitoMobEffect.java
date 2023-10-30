
package net.mcreator.aetheriumresources.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.aetheriumresources.procedures.EfeitoOnEffectActiveTickProcedure;

public class EfeitoMobEffect extends MobEffect {
	public EfeitoMobEffect() {
		super(MobEffectCategory.HARMFUL, -5367041);
	}

	@Override
	public String getDescriptionId() {
		return "effect.aetheriumresources.efeito";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EfeitoOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
