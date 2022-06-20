/*package net.tarantel.chickenroost;

import mezz.jei.api.*;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.runtime.*;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.core.Registry;
import mezz.jei.api.runtime.IIngredientManager;
import mezz.jei.api.ingredients.IIngredientType;
import net.minecraft.world.item.ItemStack;
import net.tarantel.chickenroost.item.ChickenStickItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ModIdArgument;
import java.util.*;
import java.util.stream.Collectors;
import net.minecraftforge.fml.loading.moddiscovery.ModInfo;

//import net.tarantel.chickenroost;

@JeiPlugin
public class JEIIntegrationextra implements IModPlugin{

   @Override
   public ResourceLocation getPluginUid(){
   	return new ResourceLocation("Roost Ultimate", "default");
   }

   @Override
   public void registerRecipes(IRecipeRegistration registry){
   	IIngredientManager ingredientManager = registry.getIngredientManager();
   	IIngredientType<ItemStack> itemType = ingredientManager.getIngredientType(ItemStack.class);

   	//registry.addIngredientInfo(new ItemStack(CHICKEN_STICK.item), itemType, "testttt");
   	registry.addIngredientInfo(new ItemStack(ChickenStickItem), itemType, "tetetata");
   }
	
}*/