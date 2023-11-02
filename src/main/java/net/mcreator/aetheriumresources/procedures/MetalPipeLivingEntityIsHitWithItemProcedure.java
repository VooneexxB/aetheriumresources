package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class MetalPipeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 3), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() * 3)));
	}
}
