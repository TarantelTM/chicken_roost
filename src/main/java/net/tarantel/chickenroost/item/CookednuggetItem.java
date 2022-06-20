
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.init.ChickenRoostModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookednuggetItem extends Item {
	public CookednuggetItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_ROOST_NUGGETS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f)

						.meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 10;
	}
}
