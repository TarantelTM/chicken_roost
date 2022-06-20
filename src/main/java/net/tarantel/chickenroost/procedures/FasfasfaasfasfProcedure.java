package net.tarantel.chickenroost.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class FasfasfaasfasfProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("tagName") == 0) {
			(itemstack).grow(1);
		}
	}
}
