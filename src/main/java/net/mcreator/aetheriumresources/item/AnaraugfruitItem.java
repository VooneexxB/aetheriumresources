
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.aetheriumresources.procedures.AnaraugfruitRightclickedOnBlockProcedure;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;

public class AnaraugfruitItem extends Item {
	public AnaraugfruitItem() {
		super(new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f)

						.build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AnaraugfruitRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
