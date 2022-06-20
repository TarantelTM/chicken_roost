package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.network.ChickenRoostModVariables;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class TrainerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack tempitem = ItemStack.EMPTY;
		ItemStack getfood = ItemStack.EMPTY;
		ItemStack chicken = ItemStack.EMPTY;
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putString("showtimer", (new java.text.DecimalFormat("##.#").format((new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "timer")) / 20) + "s"));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
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
		getfood = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1));
		if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/chickens")))) {
			if (getfood.is(ItemTags.create(new ResourceLocation("forge:seeds")))) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("timer", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "timer")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getfood.getItem() == (ItemStack.EMPTY).getItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("timer", ChickenRoostModVariables.training_speed_tick);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else if (chicken.getItem() == (ItemStack.EMPTY).getItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("timer", ChickenRoostModVariables.training_speed_tick);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "timer") <= 0) {
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/chickens")))) {
				if (getfood.is(ItemTags.create(new ResourceLocation("forge:seeds")))) {
					chicken.getOrCreateTag().putDouble("roost_xp",
							(chicken.getOrCreateTag().getDouble("roost_xp") + ChickenRoostModVariables.trainingxp_perfood));
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final int _amount = 1;
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("timer", ChickenRoostModVariables.training_speed_tick);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier1")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_1) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_1) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_1);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier2")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_2) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_2) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_2);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier3")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_3) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_3) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_3);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier4")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_4) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_4) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_4);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier5")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_5) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_5) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_5);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier6")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_6) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_6) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_6);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier7")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_7) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_7) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_7);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier8")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_8) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_8) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_8);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
			if (chicken.is(ItemTags.create(new ResourceLocation("forge:roost/tier9")))) {
				if (chicken.getOrCreateTag().getDouble("roost_xp") >= ChickenRoostModVariables.xp_tier_9) {
					chicken.getOrCreateTag().putDouble("roost_lvl", (chicken.getOrCreateTag().getDouble("roost_lvl") + 1));
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
				if (chicken.getOrCreateTag().getDouble("roost_lvl") >= ChickenRoostModVariables.maxlevel_tier_9) {
					chicken.getOrCreateTag().putDouble("roost_lvl", ChickenRoostModVariables.maxlevel_tier_9);
					chicken.getOrCreateTag().putDouble("roost_xp", 0);
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = chicken;
							_setstack.setCount(1);
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				}
			}
		}
	}
}
