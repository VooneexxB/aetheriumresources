package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

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
