package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GUIstateCombustaoProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "combustao") == 1) {
			return true;
		}
		return false;
	}
}
