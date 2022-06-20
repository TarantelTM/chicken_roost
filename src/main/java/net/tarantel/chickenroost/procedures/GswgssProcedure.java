package net.tarantel.chickenroost.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import java.util.Random;

public class GswgssProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.is(ItemTags.create(new ResourceLocation("minecraft:logs")))) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
