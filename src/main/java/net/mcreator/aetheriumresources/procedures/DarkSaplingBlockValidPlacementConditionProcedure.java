package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkSaplingBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:dirt")))
				&& !(world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("aetherium_resources:sapling/liquids")))
				&& !(world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("aetherium_resources:sapling/liquids")))
				&& !(world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("aetherium_resources:sapling/liquids")))
				&& !(world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("aetherium_resources:sapling/liquids")))
				&& !(world.getBlockState(new BlockPos(x - 1, y, z)))
						.is(BlockTags.create(new ResourceLocation("aetherium_resources:sapling/liquids")));
	}
}
