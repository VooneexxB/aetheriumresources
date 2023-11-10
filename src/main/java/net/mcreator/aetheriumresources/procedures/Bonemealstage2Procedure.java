package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Bonemealstage2Procedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		BlockState activeStage = Blocks.AIR.defaultBlockState();
		BlockState nextStage1 = Blocks.AIR.defaultBlockState();
		BlockState nextStage2 = Blocks.AIR.defaultBlockState();
		BlockState nextStage3 = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("crops:fertilizer")))) {
			activeStage = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_2.get().defaultBlockState();
			nextStage1 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_3.get().defaultBlockState();
			random = Math.random();
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == activeStage.getBlock()) {
				if (nextStage1.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage1, 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")),
									SoundSource.BLOCKS, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
