package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.init.ChickenRoostModEntities;
import net.tarantel.chickenroost.entity.AChickenSoulSoilEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class AChickenSoulSoilNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new AChickenSoulSoilEntity(ChickenRoostModEntities.A_CHICKEN_SOUL_SOIL.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			return true;
		}
		return false;
	}
}
