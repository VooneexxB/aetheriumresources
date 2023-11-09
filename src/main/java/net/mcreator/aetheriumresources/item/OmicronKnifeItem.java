
package net.mcreator.aetheriumresources.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class OmicronKnifeItem extends SwordItem {
	public OmicronKnifeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 23f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				3, -2.2f,

				new Item.Properties().tab(null).fireResistant());
	}

}
