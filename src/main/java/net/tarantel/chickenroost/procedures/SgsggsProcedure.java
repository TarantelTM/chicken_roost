package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.init.ChickenRoostModItems;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.nbt.CompoundTag;

import java.util.concurrent.atomic.AtomicReference;

public class SgsggsProcedure {
	public static void execute(ItemStack itemstack) {
		/*if ((new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(2, itemstack)).getItem() == ChickenRoostModItems.E_CHICKEN_COBBLE.get()) {
			{
				CompoundTag _nbtTag = ChickenRoostModItems.E_CHICKEN_COBBLE.get().getTag();
				if (_nbtTag != null)
					(new Object() {
						public ItemStack getItemStack(int sltid, ItemStack _isc) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
							return _retval.get();
						}
					}.getItemStack(2, itemstack)).setTag(_nbtTag.copy());
			}
		}*/
	}
}
