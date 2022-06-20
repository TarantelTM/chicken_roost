
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ChickenRoostModTabs {
	public static CreativeModeTab TAB_CHICKEN_ROOST;
	public static CreativeModeTab TAB_ROOST_NUGGETS;
	public static CreativeModeTab TAB_ROOST_CHICKENS;
	public static CreativeModeTab TAB_ROOST_SHARDS;
	public static CreativeModeTab TAB_ROOST_EGGS;

	public static void load() {
		TAB_CHICKEN_ROOST = new CreativeModeTab("tabchicken_roost") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChickenRoostModBlocks.ROOST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ROOST_NUGGETS = new CreativeModeTab("tabroost_nuggets") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChickenRoostModItems.EMERALD_NUGGET.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ROOST_CHICKENS = new CreativeModeTab("tabroost_chickens") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChickenRoostModItems.E_CHICKEN_OBSIDIAN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ROOST_SHARDS = new CreativeModeTab("tabroost_shards") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ChickenRoostModItems.NETHERSTARSHARD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ROOST_EGGS = new CreativeModeTab("tabroost_eggs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.EGG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
