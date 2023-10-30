
package net.mcreator.aetheriumresources.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModPotions;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ErrorrecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new ErrorrecipeBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		Item inputItem = input.getItem();
		return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
				&& PotionUtils.getPotion(input) == AetheriumresourcesModPotions.ERRORETAPA_2.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == AetheriumresourcesModItems.MATERIAORGANICA.get();
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionUtils.setPotion(new ItemStack(input.getItem()), AetheriumresourcesModPotions.POCAOEFEITO.get());
		}
		return ItemStack.EMPTY;
	}
}
