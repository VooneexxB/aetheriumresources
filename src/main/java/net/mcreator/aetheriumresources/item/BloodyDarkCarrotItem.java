
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.aetheriumresources.procedures.BloodyDarkCarrotPlayerFinishesUsingItemProcedure;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;

public class BloodyDarkCarrotItem extends Item {
	public BloodyDarkCarrotItem() {
		super(new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 16;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BloodyDarkCarrotPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
