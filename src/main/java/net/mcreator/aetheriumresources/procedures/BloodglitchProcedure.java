package net.mcreator.aetheriumresources.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

public class BloodglitchProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == AetheriumresourcesModItems.SERINGA.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 3));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(AetheriumresourcesModItems.SERINGA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AetheriumresourcesModItems.SERINGADESANGUE.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
					.setHoverName(new TextComponent((entity.getDisplayName().getString())));
		}
	}
}
