package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.network.ChickenRoostModVariables;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class RoostboxwithchickenBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack food = ItemStack.EMPTY;
		ItemStack chicken = ItemStack.EMPTY;
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("Timer", ChickenRoostModVariables.roost_speed_tick);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}
