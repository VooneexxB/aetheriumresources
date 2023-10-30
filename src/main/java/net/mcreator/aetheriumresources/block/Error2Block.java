
package net.mcreator.aetheriumresources.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.aetheriumresources.procedures.ErrorEntityWalksOnTheBlockProcedure;

import java.util.Random;

public class Error2Block extends Block {
	public Error2Block() {
		super(BlockBehaviour.Properties.of(Material.DECORATION, MaterialColor.COLOR_PINK)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("aetheriumresources:failure-breaking")),
						() -> new SoundEvent(new ResourceLocation("aetheriumresources:failure-step")),
						() -> new SoundEvent(new ResourceLocation("aetheriumresources:failure-placing")),
						() -> new SoundEvent(new ResourceLocation("aetheriumresources:failure-hit")),
						() -> new SoundEvent(new ResourceLocation("aetheriumresources:failure-fall"))))
				.strength(60f, 1200f).requiresCorrectToolForDrops().speedFactor(0.6f).jumpFactor(0.8f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public int getSignal(BlockState blockstate, BlockGetter blockAccess, BlockPos pos, Direction direction) {
		return 15;
	}

	@Override
	public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.BLOCKED;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.IGNORE;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 3;
		return false;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 2; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.2D;
			double dy = (random.nextFloat() - 0.5D) * 0.2D;
			double dz = (random.nextFloat() - 0.5D) * 0.2D;
			world.addParticle(ParticleTypes.ELECTRIC_SPARK, x0, y0, z0, dx, dy, dz);
		}
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		ErrorEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
