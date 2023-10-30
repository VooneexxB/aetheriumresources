
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.aetheriumresources.procedures.MateriaorganicaPlayerFinishesUsingItemProcedure;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;

public class MateriaorganicaItem extends Item {
	public MateriaorganicaItem() {
		super(new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(64).fireResistant().rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.3f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MateriaorganicaPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
