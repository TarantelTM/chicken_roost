
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.procedures.ChickenNuggetPlayerFinishesUsingItemProcedure;
import net.tarantel.chickenroost.init.ChickenRoostModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class ChickenNuggetItem extends Item {
	public ChickenNuggetItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_ROOST_NUGGETS).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ChickenNuggetPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
