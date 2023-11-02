package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.entity.Entity;

public class MetalPipeItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
