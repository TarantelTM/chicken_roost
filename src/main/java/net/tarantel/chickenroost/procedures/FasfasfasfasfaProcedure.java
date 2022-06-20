package net.tarantel.chickenroost.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class FasfasfasfasfaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ItemStack food = ItemStack.EMPTY;
		ItemStack chicken = ItemStack.EMPTY;
		boolean itstrue = false;
		chicken = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0));
		if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/chickens")))) {
			if (food.is(ItemTags.create(new ResourceLocation("forge:seeds")))) {
				return true;
			}
		}
		return false;
	}
}
