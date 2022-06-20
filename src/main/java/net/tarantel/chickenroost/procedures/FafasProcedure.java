package net.tarantel.chickenroost.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;

import java.util.concurrent.atomic.AtomicReference;

public class FafasProcedure {
	public static void execute(ItemStack itemstack) {
		if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack)).getItem() == itemstack.getItem()) {
			itemstack.getOrCreateTag().putDouble("level", 1);
		}
	}
}
