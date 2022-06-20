
package net.tarantel.chickenroost.item;

import net.tarantel.chickenroost.procedures.SetItemNBTProcedure;
import net.tarantel.chickenroost.init.ChickenRoostModTabs; 
import net.tarantel.chickenroost.network.ChickenRoostModVariables;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

import java.util.List;

public class EChickenGlowstoneItem extends Item {
 @Override
  public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
  super.onCraftedBy(itemstack, world, entity);
  SetItemNBTProcedure.execute(itemstack);
 }

	public EChickenGlowstoneItem() {
		super(new Item.Properties().tab(ChickenRoostModTabs.TAB_ROOST_CHICKENS).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
	int roost_chickenlevel = 0;
	int roost_chickenxp = 0;
		super.appendHoverText(itemstack, world, list, flag);
		roost_chickenlevel = (int) ((itemstack).getOrCreateTag().getInt("roost_lvl"));
		roost_chickenxp = (int) ((itemstack).getOrCreateTag().getInt("roost_xp"));
		list.add(new TextComponent("\u00A71" + "Tier: " + "\u00A79" + "5"));
		list.add(new TextComponent((("\u00A7e") + "Level: " + "\u00A79" + ((roost_chickenlevel)) + "/" + (((int) ChickenRoostModVariables.maxlevel_tier_5)))));
		list.add(new TextComponent((("\u00A7a") + "XP: " + "\u00A79" + ((roost_chickenxp)) + "/" + (((int) ChickenRoostModVariables.xp_tier_5)))));
		list.add(new TextComponent("\u00A71 Roost Ultimate"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SetItemNBTProcedure.execute(itemstack);
	}
}