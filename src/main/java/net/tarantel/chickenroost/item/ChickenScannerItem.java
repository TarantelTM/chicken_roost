
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.init.ChickenRoostModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ChickenScannerItem extends Item {
	public ChickenScannerItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_CHICKEN_ROOST).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
