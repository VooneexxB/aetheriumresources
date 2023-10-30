package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EfeitoOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("effect", (entity.getPersistentData().getDouble("effect") + 1));
		if (entity.getPersistentData().getDouble("effect") == 5) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _worldorig = world;
				world = _origLevel.getServer().getLevel(Level.OVERWORLD);
				if (world != null) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")),
									SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")),
									SoundSource.PLAYERS, 1, 1, false);
						}
					}
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("effect").bypassArmor(), (float) 0.5);
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					{
						Entity _ent = entity;
						_ent.setYRot(30);
						_ent.setXRot(30);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
					entity.setShiftKeyDown((true));
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(0);
								_ent.setXRot(30);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((false));
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("effect").bypassArmor(), 1);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 40);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(60);
								_ent.setXRot(60);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((true));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 80);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(60);
								_ent.setXRot(0);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((false));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 120);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(90);
								_ent.setXRot(90);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((true));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 160);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(0);
								_ent.setXRot(90);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((true));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 200);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(120);
								_ent.setXRot(120);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((false));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 240);
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
							if (entity instanceof LivingEntity _entity)
								_entity.swing(InteractionHand.MAIN_HAND, true);
							{
								Entity _ent = entity;
								_ent.setYRot(120);
								_ent.setXRot(0);
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entity.setShiftKeyDown((false));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 280);
					entity.getPersistentData().putDouble("effect", 0);
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("effect").bypassArmor(), (float) 0.5);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")),
									SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z,
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("aetheriumresources:potionerror")),
									SoundSource.PLAYERS, 1, 1, false);
						}
					}
				}
				world = _worldorig;
			}
		}
	}
}
