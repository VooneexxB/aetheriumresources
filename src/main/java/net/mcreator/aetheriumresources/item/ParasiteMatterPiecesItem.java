
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.aetheriumresources.init.AetheriumresourcesModTabs;

public class ParasiteMatterPiecesItem extends Item {
	public ParasiteMatterPiecesItem() {
		super(new Item.Properties().tab(AetheriumresourcesModTabs.TAB_AETHERIUM_TAB).stacksTo(16).fireResistant().rarity(Rarity.RARE));
	}
}
