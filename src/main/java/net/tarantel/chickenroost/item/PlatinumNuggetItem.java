
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.init.ChickenRoostModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PlatinumNuggetItem extends Item {
	public PlatinumNuggetItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_ROOST_NUGGETS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
