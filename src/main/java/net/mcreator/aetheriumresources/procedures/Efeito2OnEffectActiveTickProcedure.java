package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class Efeito2OnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("effect2", (entity.getPersistentData().getDouble("effect2") + 1));
		if (entity.getPersistentData().getDouble("effect2") == 5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")), SoundSource.VOICE,
									(float) 0.3, (float) 0.6);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")), SoundSource.VOICE,
									(float) 0.3, (float) 0.6, false);
						}
					}
					entity.getPersistentData().putDouble("effect2", 0);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 400);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 99999, 2, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999, 2, (false), (false)));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 3, 0.5, 0.5, 0.5, 1);
	}
}
