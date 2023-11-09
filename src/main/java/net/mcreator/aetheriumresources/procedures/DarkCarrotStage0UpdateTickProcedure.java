package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkCarrotStage0UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stage3 = Blocks.AIR.defaultBlockState();
		BlockState stage2 = Blocks.AIR.defaultBlockState();
		BlockState stage1 = Blocks.AIR.defaultBlockState();
		BlockState stage0 = Blocks.AIR.defaultBlockState();
		stage0 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_0.get().defaultBlockState();
		stage1 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_1.get().defaultBlockState();
		stage2 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_2.get().defaultBlockState();
		stage3 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_3.get().defaultBlockState();
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "GrowthTime") <= 0) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage0.getBlock() && stage1.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage1, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage1.getBlock()
					&& stage2.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage2, 3);
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == stage2.getBlock()
					&& stage3.canSurvive(world, new BlockPos(x, y, z))) {
				world.setBlock(new BlockPos(x, y, z), stage3, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("GrowthTime", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("GrowthTime", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "GrowthTime")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
