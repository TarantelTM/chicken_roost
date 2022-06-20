
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.init.ChickenRoostModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ChickenStickItem extends Item {
	public ChickenStickItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_CHICKEN_ROOST).durability(16).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
