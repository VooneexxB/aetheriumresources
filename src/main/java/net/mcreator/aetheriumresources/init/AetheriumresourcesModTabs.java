
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AetheriumresourcesModTabs {
	public static CreativeModeTab TAB_AETHERIUM_TAB;

	public static void load() {
		TAB_AETHERIUM_TAB = new CreativeModeTab("tabaetherium_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AetheriumresourcesModBlocks.ERROR.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
