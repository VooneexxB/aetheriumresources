
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;
import net.mcreator.aetheriumresources.init.AetheriumresourcesModSounds;

public class TheendItem extends RecordItem {
	public TheendItem() {
		super(0, AetheriumresourcesModSounds.REGISTRY.get(new ResourceLocation("aetheriumresources:theend")),
				new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(1).rarity(Rarity.RARE));
	}
}
