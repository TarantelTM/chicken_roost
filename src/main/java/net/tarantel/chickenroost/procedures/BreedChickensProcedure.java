package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.init.ChickenRoostModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

public class BreedChickensProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (net.minecraftforge.fml.ModList.get().isLoaded("mekanism")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ChickenRoostModBlocks.ROOST.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
