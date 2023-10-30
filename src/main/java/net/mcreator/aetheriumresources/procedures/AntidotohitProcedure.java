package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

public class AntidotohitProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AetheriumresourcesModItems.SERINGA_ANTIDOTO.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AetheriumresourcesModItems.SERINGA.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
