
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class AetheriumresourcesModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.STRIPPED_TWISTED_FOREST_LOG.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.STRIPPED_TWISTED_FOREST_WOOD.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_PLANKS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_FENCE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_FENCE_GATE.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_SLAB.get().asItem())
			event.setBurnTime(150);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_STAIRS.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_TRAPDOOR.get().asItem())
			event.setBurnTime(300);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_BUTTON.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == AetheriumresourcesModBlocks.TWISTED_FOREST_DOOR.get().asItem())
			event.setBurnTime(200);
	}
}
