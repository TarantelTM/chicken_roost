package net.tarantel.chickenroost.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class AChickenCrimstonStemNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
			if (new ResourceLocation("crimson_forest").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
				return true;
			}
		}
		return false;
	}
}
