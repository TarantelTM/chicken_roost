package net.tarantel.chickenroost.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;

public class FasfasfasfasfasProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String breedtag = "";
		String breedtag2 = "";
		ItemStack breedchicken = ItemStack.EMPTY;
		ItemStack food = ItemStack.EMPTY;
		double slotcounter = 0;
		double foundcounter = 0;
		breedchicken = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0));
		food = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1));
		foundcounter = 4;
		if (breedchicken.is(ItemTags.create(new ResourceLocation("forge:roost/chickens")))) {
			if (food.is(ItemTags.create(new ResourceLocation("forge:roost/chickenfood")))) {
				breedtag = breedchicken.getOrCreateTag().getString("breedchancetag");
				slotcounter = 1;
				for (int index0 = 0; index0 < (int) (foundcounter); index0++) {
					slotcounter = slotcounter + 1;
					if ((new Object() {
						public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
										.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
							return _retval.get();
						}
					}.getItemStack(world, new BlockPos(x, y, z), (int) slotcounter)).getItem() == (ItemStack.EMPTY).getItem()) {
						foundcounter = 0;
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = (int) slotcounter;
								final ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags()
										.getTag(ItemTags.create(new ResourceLocation((breedtag).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
								_setstack.setCount(1);
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
						slotcounter = 1;
					}
					if (foundcounter > 4) {
						foundcounter = 0;
					}
				}
			}
		}
	}
}
