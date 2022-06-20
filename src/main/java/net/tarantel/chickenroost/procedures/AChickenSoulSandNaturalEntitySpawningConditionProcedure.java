package net.tarantel.chickenroost.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class AChickenSoulSandNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
			return true;
		}
		return false;
	}
}
