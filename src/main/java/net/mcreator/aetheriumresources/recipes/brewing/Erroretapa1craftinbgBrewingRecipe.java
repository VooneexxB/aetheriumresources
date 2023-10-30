
package net.mcreator.aetheriumresources.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModPotions;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Erroretapa1craftinbgBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new Erroretapa1craftinbgBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem() == Items.HONEY_BOTTLE;
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem() == Items.AMETHYST_SHARD;
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionUtils.setPotion(new ItemStack(Items.POTION), AetheriumresourcesModPotions.ERRORETAPA_1.get());
		}
		return ItemStack.EMPTY;
	}
}
