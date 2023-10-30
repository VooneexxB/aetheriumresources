
package net.mcreator.aetheriumresources.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.ItemStack;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AntidotorecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new AntidotorecipeBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem() == AetheriumresourcesModItems.SERINGA_GLITCH.get();
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == AetheriumresourcesModItems.PARASITE_MATTER_PIECES.get();
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(AetheriumresourcesModItems.SERINGA_ANTIDOTO.get());
		}
		return ItemStack.EMPTY;
	}
}
