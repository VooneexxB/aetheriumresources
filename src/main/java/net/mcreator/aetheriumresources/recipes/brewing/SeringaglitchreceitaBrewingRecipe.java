
package net.mcreator.aetheriumresources.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.ItemStack;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SeringaglitchreceitaBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new SeringaglitchreceitaBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem() == AetheriumresourcesModItems.SERINGA.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == AetheriumresourcesModItems.MATERIAORGANICA.get();
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(AetheriumresourcesModItems.SERINGA_GLITCH.get());
		}
		return ItemStack.EMPTY;
	}
}
