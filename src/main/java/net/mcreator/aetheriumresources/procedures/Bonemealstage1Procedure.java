package net.mcreator.aetheriumresources.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Bonemealstage1Procedure {
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
			activeStage = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_1.get().defaultBlockState();
			nextStage1 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_2.get().defaultBlockState();
			nextStage2 = AetheriumresourcesModBlocks.DARK_CARROT_STAGE_3.get().defaultBlockState();
			random = Math.random();
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == activeStage.getBlock()) {
				if (random >= 0.8 && nextStage3.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage3, 3);
				} else if (random >= 0.5 && nextStage2.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage2, 3);
				} else if (nextStage1.canSurvive(world, new BlockPos(x, y, z))) {
					world.setBlock(new BlockPos(x, y, z), nextStage1, 3);
				}
			}
		}
	}
}