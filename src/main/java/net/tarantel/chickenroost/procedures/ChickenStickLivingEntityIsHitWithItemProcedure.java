package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.init.ChickenRoostModItems;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class ChickenStickLivingEntityIsHitWithItemProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getTarget(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity targetchicken = null;
		ItemStack chickenitem = ItemStack.EMPTY;
		ItemStack thevanilla = ItemStack.EMPTY;
		targetchicken = entity;
		chickenitem = new ItemStack((ForgeRegistries.ITEMS.tags()
				.getTag(ItemTags.create(new ResourceLocation(
						((targetchicken.getPersistentData().getString("convert_entity_to_item_tag"))).toLowerCase(java.util.Locale.ENGLISH))))
				.getRandomElement(new Random()).orElseGet(() -> Items.AIR)));
		thevanilla = new ItemStack(ChickenRoostModItems.CHICKENCHICKEN.get());
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ChickenRoostModItems.CHICKEN_STICK.get()) {
			chickenitem.getOrCreateTag().putDouble("roost_lvl", (targetchicken.getPersistentData().getDouble("roost_lvl")));
			thevanilla.getOrCreateTag().putDouble("roost_lvl", (targetchicken.getPersistentData().getDouble("roost_lvl")));
			chickenitem.getOrCreateTag().putDouble("roost_xp", (targetchicken.getPersistentData().getDouble("roost_xp")));
			thevanilla.getOrCreateTag().putDouble("roost_xp", (targetchicken.getPersistentData().getDouble("roost_xp")));
			if (targetchicken.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:roost/livingchicken")))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 50, 1, 1, 1, 1);
				{
					ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (targetchicken.getX()), (targetchicken.getY()), (targetchicken.getZ()),
							chickenitem);
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
				if (!targetchicken.level.isClientSide())
					targetchicken.discard();
			}
			if (targetchicken.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:vanillachicken")))) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.POOF, x, y, z, 50, 1, 1, 1, 1);
				{
					ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (targetchicken.getX()), (targetchicken.getY()), (targetchicken.getZ()),
							thevanilla);
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
				if (!targetchicken.level.isClientSide())
					targetchicken.discard();
			}
		}
	}
}
