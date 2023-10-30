package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModMobEffects;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

public class SeringaGlitchLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AetheriumresourcesModItems.SERINGA_GLITCH.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(AetheriumresourcesModMobEffects.EFEITO.get(), 200, 3));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AetheriumresourcesModItems.SERINGA_GLITCH.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
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
