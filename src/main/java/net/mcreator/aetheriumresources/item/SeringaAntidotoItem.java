
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.aetheriumresources.procedures.AntidotousoProcedure;
import net.mcreator.aetheriumresources.procedures.AntidotohitProcedure;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class SeringaAntidotoItem extends Item {
	public SeringaAntidotoItem() {
		super(new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(1).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE,
					new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Item modifier", 1d, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED,
					new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Item modifier", -2.4, AttributeModifier.Operation.ADDITION));
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(AetheriumresourcesModItems.SERINGA.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AntidotousoProcedure.execute(entity);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		AntidotohitProcedure.execute(entity, sourceentity);
		return retval;
	}
}
