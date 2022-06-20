package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.network.ChickenRoostModVariables;
import net.tarantel.chickenroost.init.ChickenRoostModItems;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Random;

public class NewbreedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String perfectbreed = "";
		String badbreed = "";
		String goodbreed = "";
		double randomchance = 0;
		double newfoundcounter = 0;
		double foundcounter = 0;
		double slotcounter = 0;
		ItemStack breedchicken = ItemStack.EMPTY;
		ItemStack food = ItemStack.EMPTY;
		ItemStack outputchicken = ItemStack.EMPTY;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2)).getItem() == (ItemStack.EMPTY).getItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", (new java.text.DecimalFormat("##.#").format(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "showtimer")) + "s"));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("breedspeed", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "breedspeed")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 3)).getItem() == (ItemStack.EMPTY).getItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", (new java.text.DecimalFormat("##.#").format(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "showtimer")) + "s"));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("breedspeed", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "breedspeed")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 4)).getItem() == (ItemStack.EMPTY).getItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", (new java.text.DecimalFormat("##.#").format(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "showtimer")) + "s"));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("breedspeed", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "breedspeed")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 5)).getItem() == (ItemStack.EMPTY).getItem()) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", (new java.text.DecimalFormat("##.#").format(new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "showtimer")) + "s"));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("breedspeed", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "breedspeed")) - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", " ");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("breedspeed", ChickenRoostModVariables.breed_speed_tick);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("showtimer", ((new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "breedspeed")) / 20));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
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
		if (breedchicken.is(ItemTags.create(new ResourceLocation("forge:roost_breedablechi")))) {
			if (food.is(ItemTags.create(new ResourceLocation("forge:seeds")))) {
				newfoundcounter = 4;
				{
					int _value = 2;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("mynewstate");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else {
				{
					int _value = 1;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("mynewstate");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("showtimertostring", " ");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putString("showtimertostring", " ");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			{
				int _value = 1;
				BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("mynewstate");
				if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "breedspeed") <= 0) {
			randomchance = Math.random();
			foundcounter = 4;
			if (breedchicken.is(ItemTags.create(new ResourceLocation("forge:roost_breedablechi")))) {
				if (food.is(ItemTags.create(new ResourceLocation("forge:seeds")))) {
					badbreed = breedchicken.getOrCreateTag().getString("badbreedtag");
					goodbreed = breedchicken.getOrCreateTag().getString("goodbreedtag");
					perfectbreed = breedchicken.getOrCreateTag().getString("perfectbreedtag");
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
							if (randomchance > 0.3) {
								outputchicken = new ItemStack((ForgeRegistries.ITEMS.tags()
										.getTag(ItemTags.create(new ResourceLocation((badbreed).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
							}
							if (randomchance == 0.3) {
								outputchicken = new ItemStack((ForgeRegistries.ITEMS.tags()
										.getTag(ItemTags.create(new ResourceLocation((perfectbreed).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
							}
							if (randomchance <= 0.2) {
								outputchicken = new ItemStack((ForgeRegistries.ITEMS.tags()
										.getTag(ItemTags.create(new ResourceLocation((goodbreed).toLowerCase(java.util.Locale.ENGLISH))))
										.getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
							}
							foundcounter = 0;
							{
								BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
								if (_ent != null) {
									final int _slotid = (int) slotcounter;
									final ItemStack _setstack = outputchicken;
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
									_blockEntity.getTileData().putDouble("breedspeed", ChickenRoostModVariables.breed_speed_tick);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							slotcounter = 1;
						} else {
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("breedspeed", ChickenRoostModVariables.breed_speed_tick);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
						if (foundcounter > 4) {
							foundcounter = 0;
						}
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("showtimertostring", " ");
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("showtimertostring", " ");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_COBBLE.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_cobble");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cobble");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_FLINT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_flint");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_flint");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SAND.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sand");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sand");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GRAVEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_gravel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_gravel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:gravelgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:gravelgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:gravelbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GRANIT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_granit");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_granit");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ANDESITE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_andesite");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_andersite");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_COPPER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_copper");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_copper");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:coppergoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:coppergoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:copperbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_IRON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_iron");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_iron");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:irongoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:irongoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:ironbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_REDSTONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_redstone");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_redstone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:redstonegoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:redstonegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:redstonebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_LAPIS.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_lapis");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_lapis");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:lapisgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:lapisgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:lapisbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_DIAMOND.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_diamond");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_diamond");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:diamondgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:diamondgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:diamondbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_OBSIDIAN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_obsidian");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_obsidian");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:obsidiangoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:obsidiangoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:obsidianbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GOLD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_gold");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_gold");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:goldgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:goldgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:goldbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SLIME.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_slime");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_slime");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:slimegoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:slimegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:slimebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BIRCHWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_birchwood");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_birchwood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_OAKWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_oakwood");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_oakwood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.E_OSMIUM_CHICKEN.get()) {
	    outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownosmium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_osmium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:osmiumgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:osmiumgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:osmiumbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CERTUSQ.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_certusq");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_certus_quartz");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_TIN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:owntin");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_tin");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 14);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_REFINED_OBSI.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownrefinedobsidiannugget");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_refined_obsi");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_BRONZE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownbronze");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_bronze");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_REFINED_GLOWSTONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownrefinedglowstonenugget");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_refined_glowstone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_STEEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownsteel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_steel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_URANIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownuranium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_uranium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:uraniumgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:uraniumgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:uraniumbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_LEAD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:ownlead");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_lead");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 15);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_BIO_FUEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_biofuel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_bio_fuel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 14);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_AE_SILICON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_silicon");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_silicon");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_AE_FLUIX_CRYSTAL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_fluixcrystal");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_fluix_crystal");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_AE_CHARGED_CERTUS.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_chargedcertus");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_charged_certus");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_MANASTEEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:myownmanasteel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_manasteel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_TERRASTEEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:myownterrasteel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_terrasteel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_ELEMENTIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "chicken_roost:myownelementium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_elementium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_LIVINGROCK.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_livingrock");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_livingrock");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_LIVINGWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_livingwood");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_livingwood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CRIMSTON_STEM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_crimstonstem");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_crimston_stem");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_WARPED_STEM.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_warpedstem");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_warped_stem");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SPRUCEWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sprucewood");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sprucewood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GLASS.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_glass");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_glass");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_WOOL.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_wool");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_wool");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SOUL_SAND.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_soulsand");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_soul_sand");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NETHERRACK.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherrack");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_netherrack");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:netherrackperfecttag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:netherrackgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:netherrackbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SOUL_SOIL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_soulsoil");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_soul_soil");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BASALT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_basalt");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_basalt");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:basaltgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:basaltgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:basaltbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_INK.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_ink");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ink");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_PAPER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_obsidian");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_obsidian");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CLAY.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_clay");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_clay");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:claygoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:claygoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:claybadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_QUARTZ.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_netherquartz");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_quartz");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_AMETHYST_SHARD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_amethystshard");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_amethyst_shard");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_EMERALD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_emerald");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_emerald");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 15);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TNT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_tnt");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tnt");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_DIORITE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_diorite");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_diorite");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_STONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_stone");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_stone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_STAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherstar");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_star");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_WART.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherwart");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_wart");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 16);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ENDER_EYE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_endereye");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ender_eye");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 16);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GLOWSTONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_glowstone");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_glowstone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BLAZE_ROD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_blazerod");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blaze_rod");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:blazegoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:blazegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:blazebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 14);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SUGAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sugar");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sugar");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BONE_MEAL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_bonemeal");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bone_meal");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:bonegoodbreed");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:bonebadbreed");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:bonebadbreed");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ENDER_PEARL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_enderpearl");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ender_pearl");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:enderpearlgoodbreed");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:enderpearlbadbreed");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:enderpearlbadbreed");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 15);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_bone");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:bonegoodbreed");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:bonebadbreed");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:bonebadbreed");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_DARK_OAK.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_darkoak");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_dark_oak");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ACACIAWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_acacia");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_acacia_wood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_JUNGLEWOOD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_junglewood");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_jungle_wood");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 14);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NAUTILUS_SHELL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_nautilusshell");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nautilus_shell");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_HONEYCOMB.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_honeycomb");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_honeycomb");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 15);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_RABBIT_HIDE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_rabbithide");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_rabbit_hide");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_PRISMARINE_SHARD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_prismarineshard");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_prismarine_shard");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_BRICK.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherbrick");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_brick");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CHORUS_FRUIT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_chorusfruit");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_chorus_fruit");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 16);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_COAL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_coal");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_coal");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:coalgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:coalgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:coalbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CHAR_COAL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_charcoal");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_char_coal");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.CHICKENCHICKEN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_neweggtag");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "minecraft:chicken");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:chickengoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:chickengoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:chickenbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 16);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_LEATHER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roost_getitem_leather");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_leather");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_STRING.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetstring");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_string");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENFEATHER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetfeather");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_feather");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 17);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENSNOW.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsnow");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensnow");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENAPPLE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetapple");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenapple");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 14);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENSPONGE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsponge");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensponge");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MELON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetmelon");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenmelon");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 15);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_MAGMACREAM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetmagmacream");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenmagmacream");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:magmagoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:magmagoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:magmabadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 17);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKENBLAZEPOWDER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetblazepowder");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenblazepowder");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:blazegoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:blazegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:blazebadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 17);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKENGLOWBERRIES.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetglowberries");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenglowberries");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 16);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SWEETBERRIES.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsweetberries");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensweetberries");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 17);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TINTEDGLASS.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgettintedglass");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickentintedglass");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NETHERITE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetnetherite");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickennetherite");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKENBEETROOT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetbeetroot");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenbeetroot");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 18);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SPIDEREYE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetspidereye");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenspidereye");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKENCARROT.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetcarrot");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickencarrot");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 19);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ROTTEN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetrotten");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenrotten");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 18);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_GHASTTEAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetghasttear");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenghasttear");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 17);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ZINC.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemzinc");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_zinc");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 19);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ALUMINIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemaluminium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_aluminium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:aluminumgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:aluminumgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:aluminumbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 20);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SILVER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemsilver");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_silver");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 18);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_NICKEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemnickel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nickel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ADAMANTIUM.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemadamantium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_adamantium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:adamantiumgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:adamantiumgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:adamantiumbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BRASS.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitembrass");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_brass");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 18);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_CHROME.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemchrome");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_chrome");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 19);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ELECTRUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemelectrum");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_electrum");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 9);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_INVAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetiteminvar");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_invar");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 10);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_IRIDIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemiridium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_iridium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_PLATINUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemplatinum");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_platinum");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_REFINED_IRON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemrefinediron");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_refinediron");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:refinedirongoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:refinedirongoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:refinedironbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 20);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TITANIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemtitanium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_titanium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TUNGSTEN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemtungsten");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tungsten");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:tungstengoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:tungstengoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:tungstenbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 19);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TUNGSTENSTEEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemtungstensteel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tungstensteel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 11);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_YELLORIUM.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemyellorium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_yellorium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:yelloriumgoodtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:yelloriumgoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:yelloriumbadtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 20);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_BLUTONIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemblutonium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blutonium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 12);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ALLTHEMODIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemallthemodium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_allthemodium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 13);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_VIBRANIUM.get()) {
        outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemvibranium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_vibranium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_UNOBTAINIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemunobtainium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_unobtainium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_ENDSTONE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetitemendstone");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_endstone");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:endstonegoodbreed");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:endstonebadbreed");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:endstonebadbreed");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 21);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENAMETHYSTBRONZE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetamethystbronze");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_amethyst_bronze");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENSLIMESTEEL.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetslimesteel");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_slimesteel");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENROSEGOLD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetrosegold");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_rose_gold");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENCOBALD.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetcobald");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cobald");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENHEPATIZON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgethepatizon");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_hepatizon");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENKNIGHTSLIME.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetknightslime");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_knight_slime");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENMANYULLYN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetmanyullyn");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_manyullyn");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENPIGIRON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetpigiron");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_pig_iron");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENQUEENSLIME.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetqueenslime");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_queen_slime");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 0);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENQUARTZENRICHEDIRON.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetquartzenrichediron");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_quartz_enriched_iron");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_TAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgettar");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tar");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 8);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SULFUR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsulfur");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sulfur");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.E_CHICKEN_SIGNALUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsignalum");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_signalum");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 7);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENAPATITE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetapatite");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_apatite");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENBASALZ.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetbasalz");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_basalz");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENBITUMEN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetbitumen");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bitumen");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENBLITZ.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetblitz");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blitz");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENBLIZZ.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetblizz");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blizz");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 3);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENCINNABAR.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetcinnabar");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cinnabar");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENCOKE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetcoke");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_coke");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENRUBY.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetruby");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ruby");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 2);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENSAPPHIRE.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetsapphire");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sapphire");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 1);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENNITER.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetniter");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_niter");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENLUMIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetlumium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_lumium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 6);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENCONSTANTAN.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetconstantan");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_constantan");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 4);
}if (outputchicken.getItem() == ChickenRoostModItems.ECHICKENENDERIUM.get()) {
		outputchicken.getOrCreateTag().putString("outputtag", "forge:roostgetenderium");
		outputchicken.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_enderium");
		outputchicken.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		outputchicken.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		outputchicken.getOrCreateTag().putDouble("mynewstate", 5);
}
	}
}
