package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModBlocks;

public class BonemealBush2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		BlockState activeStage = Blocks.AIR.defaultBlockState();
		BlockState nextStage1 = Blocks.AIR.defaultBlockState();
		BlockState nextStage2 = Blocks.AIR.defaultBlockState();
		BlockState nextStage3 = Blocks.AIR.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.is(ItemTags.create(new ResourceLocation("crops:fertilizer")))) {
			activeStage = AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_1.get().defaultBlockState();
			nextStage1 = AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_2.get().defaultBlockState();
			nextStage2 = AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_3.get().defaultBlockState();
			random = Math.random();
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == activeStage.getBlock()) {
				if (random >= 0.5 && nextStage2.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage2, 3);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.BLOCKS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")),
									SoundSource.BLOCKS, 1, 1, false);
						}
					}
				} else if (nextStage1.canSurvive(world, new BlockPos(x, y, z))) {
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
