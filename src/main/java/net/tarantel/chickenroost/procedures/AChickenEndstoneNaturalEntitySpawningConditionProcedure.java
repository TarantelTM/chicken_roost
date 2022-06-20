package net.tarantel.chickenroost.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AChickenEndstoneNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("end_barrens").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		if (new ResourceLocation("end_highlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		if (new ResourceLocation("end_midlands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		if (new ResourceLocation("small_end_islands").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		if (new ResourceLocation("the_end").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		return false;
	}
}
