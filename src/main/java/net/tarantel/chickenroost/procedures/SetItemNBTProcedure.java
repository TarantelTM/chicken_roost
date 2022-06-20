package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.init.ChickenRoostModItems;

import net.minecraft.world.item.ItemStack;

public class SetItemNBTProcedure {
public static void execute(
ItemStack itemstack
) {
ItemStack getitemstack = ItemStack.EMPTY;
getitemstack = itemstack;if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_COBBLE.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_cobble");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cobble");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_FLINT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_flint");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_flint");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SAND.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sand");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sand");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GRAVEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_gravel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_gravel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:gravelgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:gravelgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:gravelbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GRANIT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_granit");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_granit");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ANDESITE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_andesite");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_andersite");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_COPPER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_copper");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_copper");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:coppergoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:coppergoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:copperbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_IRON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_iron");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_iron");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:irongoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:irongoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:ironbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_REDSTONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_redstone");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_redstone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:redstonegoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:redstonegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:redstonebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_LAPIS.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_lapis");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_lapis");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:lapisgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:lapisgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:lapisbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_DIAMOND.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_diamond");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_diamond");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:diamondgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:diamondgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:diamondbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_OBSIDIAN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_obsidian");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_obsidian");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:obsidiangoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:obsidiangoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:obsidianbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GOLD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_gold");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_gold");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:goldgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:goldgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:goldbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SLIME.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_slime");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_slime");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:slimegoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:slimegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:slimebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BIRCHWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_birchwood");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_birchwood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_OAKWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_oakwood");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_oakwood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.E_OSMIUM_CHICKEN.get()) {
	    itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownosmium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_osmium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:osmiumgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:osmiumgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:osmiumbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CERTUSQ.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_certusq");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_certus_quartz");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_TIN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:owntin");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_tin");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 14);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_REFINED_OBSI.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownrefinedobsidiannugget");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_refined_obsi");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_BRONZE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownbronze");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_bronze");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_REFINED_GLOWSTONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownrefinedglowstonenugget");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_refined_glowstone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_STEEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownsteel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_steel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_URANIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownuranium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_uranium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:uraniumgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:uraniumgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:uraniumbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_LEAD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:ownlead");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_lead");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 15);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MEKANISM_BIO_FUEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_biofuel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_mekanism_bio_fuel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 14);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_AE_SILICON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_silicon");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_silicon");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_AE_FLUIX_CRYSTAL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_fluixcrystal");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_fluix_crystal");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_AE_CHARGED_CERTUS.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_chargedcertus");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ae_charged_certus");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_MANASTEEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:myownmanasteel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_manasteel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_TERRASTEEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:myownterrasteel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_terrasteel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_ELEMENTIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "chicken_roost:myownelementium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_elementium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_LIVINGROCK.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_livingrock");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_livingrock");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BOTANIA_LIVINGWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_livingwood");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_botania_livingwood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CRIMSTON_STEM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_crimstonstem");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_crimston_stem");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_WARPED_STEM.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_warpedstem");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_warped_stem");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SPRUCEWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sprucewood");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sprucewood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GLASS.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_glass");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_glass");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_WOOL.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_wool");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_wool");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SOUL_SAND.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_soulsand");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_soul_sand");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NETHERRACK.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherrack");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_netherrack");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:netherrackperfecttag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:netherrackgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:netherrackbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SOUL_SOIL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_soulsoil");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_soul_soil");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BASALT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_basalt");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_basalt");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:basaltgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:basaltgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:basaltbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_INK.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_ink");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ink");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_PAPER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_obsidian");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_obsidian");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CLAY.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_clay");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_clay");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:claygoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:claygoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:claybadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_QUARTZ.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_netherquartz");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_quartz");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_AMETHYST_SHARD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_amethystshard");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_amethyst_shard");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_EMERALD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_emerald");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_emerald");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 15);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TNT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_tnt");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tnt");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_DIORITE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_diorite");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_diorite");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_STONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_stone");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_stone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_STAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherstar");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_star");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_WART.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherwart");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_wart");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 16);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ENDER_EYE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_endereye");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ender_eye");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 16);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GLOWSTONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_glowstone");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_glowstone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BLAZE_ROD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_blazerod");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blaze_rod");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:blazegoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:blazegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:blazebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 14);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SUGAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_sugar");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sugar");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BONE_MEAL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_bonemeal");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bone_meal");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:bonegoodbreed");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:bonebadbreed");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:bonebadbreed");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ENDER_PEARL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_enderpearl");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ender_pearl");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:enderpearlgoodbreed");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:enderpearlbadbreed");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:enderpearlbadbreed");
		itemstack.getOrCreateTag().putDouble("mynewstate", 15);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_bone");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:bonegoodbreed");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:bonebadbreed");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:bonebadbreed");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_DARK_OAK.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_darkoak");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_dark_oak");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ACACIAWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_acacia");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_acacia_wood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_JUNGLEWOOD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_junglewood");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_jungle_wood");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 14);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NAUTILUS_SHELL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_nautilusshell");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nautilus_shell");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_HONEYCOMB.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_honeycomb");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_honeycomb");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 15);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_RABBIT_HIDE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_rabbithide");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_rabbit_hide");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_PRISMARINE_SHARD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_prismarineshard");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_prismarine_shard");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NETHER_BRICK.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitem_netherbrick");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nether_brick");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CHORUS_FRUIT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_chorusfruit");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_chorus_fruit");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 16);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_COAL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_coal");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_coal");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:coalgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:coalgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:coalbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CHAR_COAL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_charcoal");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_char_coal");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.CHICKENCHICKEN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_neweggtag");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "minecraft:chicken");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:chickengoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:chickengoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:chickenbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 16);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_LEATHER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roost_getitem_leather");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_leather");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_STRING.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetstring");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_string");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENFEATHER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetfeather");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_feather");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 17);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENSNOW.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsnow");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensnow");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENAPPLE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetapple");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenapple");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 14);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENSPONGE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsponge");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensponge");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MELON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetmelon");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenmelon");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 15);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_MAGMACREAM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetmagmacream");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenmagmacream");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:magmagoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:magmagoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:magmabadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 17);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKENBLAZEPOWDER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetblazepowder");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenblazepowder");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:blazegoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:blazegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:blazebadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 17);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKENGLOWBERRIES.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetglowberries");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenglowberries");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 16);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SWEETBERRIES.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsweetberries");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickensweetberries");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 17);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TINTEDGLASS.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgettintedglass");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickentintedglass");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NETHERITE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetnetherite");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickennetherite");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKENBEETROOT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetbeetroot");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenbeetroot");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 18);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SPIDEREYE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetspidereye");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenspidereye");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKENCARROT.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetcarrot");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickencarrot");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 19);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ROTTEN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetrotten");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenrotten");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 18);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_GHASTTEAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetghasttear");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chickenghasttear");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 17);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ZINC.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemzinc");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_zinc");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 19);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ALUMINIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemaluminium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_aluminium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:aluminumgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:aluminumgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:aluminumbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 20);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SILVER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemsilver");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_silver");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 18);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_NICKEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemnickel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_nickel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ADAMANTIUM.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemadamantium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_adamantium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:adamantiumgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:adamantiumgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:adamantiumbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BRASS.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitembrass");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_brass");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 18);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_CHROME.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemchrome");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_chrome");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 19);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ELECTRUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemelectrum");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_electrum");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 9);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_INVAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetiteminvar");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_invar");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 10);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_IRIDIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemiridium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_iridium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_PLATINUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemplatinum");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_platinum");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_REFINED_IRON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemrefinediron");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_refinediron");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:refinedirongoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:refinedirongoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:refinedironbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 20);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TITANIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemtitanium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_titanium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TUNGSTEN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemtungsten");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tungsten");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:tungstengoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:tungstengoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:tungstenbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 19);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TUNGSTENSTEEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemtungstensteel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tungstensteel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 11);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_YELLORIUM.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemyellorium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_yellorium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:yelloriumgoodtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:yelloriumgoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:yelloriumbadtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 20);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_BLUTONIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemblutonium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blutonium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 12);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ALLTHEMODIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemallthemodium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_allthemodium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 13);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_VIBRANIUM.get()) {
        itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemvibranium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_vibranium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_UNOBTAINIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemunobtainium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_unobtainium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:cobblebadtag");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:cobblegoodtag");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_ENDSTONE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetitemendstone");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_endstone");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:endstonegoodbreed");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:endstonebadbreed");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:endstonebadbreed");
		itemstack.getOrCreateTag().putDouble("mynewstate", 21);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENAMETHYSTBRONZE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetamethystbronze");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_amethyst_bronze");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENSLIMESTEEL.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetslimesteel");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_slimesteel");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENROSEGOLD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetrosegold");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_rose_gold");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENCOBALD.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetcobald");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cobald");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENHEPATIZON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgethepatizon");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_hepatizon");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENKNIGHTSLIME.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetknightslime");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_knight_slime");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENMANYULLYN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetmanyullyn");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_manyullyn");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENPIGIRON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetpigiron");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_pig_iron");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENQUEENSLIME.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetqueenslime");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_queen_slime");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 0);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENQUARTZENRICHEDIRON.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetquartzenrichediron");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_quartz_enriched_iron");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_TAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgettar");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_tar");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 8);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SULFUR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsulfur");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sulfur");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.E_CHICKEN_SIGNALUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsignalum");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_signalum");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 7);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENAPATITE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetapatite");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_apatite");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENBASALZ.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetbasalz");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_basalz");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENBITUMEN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetbitumen");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_bitumen");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENBLITZ.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetblitz");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blitz");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENBLIZZ.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetblizz");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_blizz");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 3);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENCINNABAR.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetcinnabar");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_cinnabar");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENCOKE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetcoke");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_coke");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENRUBY.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetruby");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_ruby");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 2);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENSAPPHIRE.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetsapphire");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_sapphire");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 1);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENNITER.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetniter");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_niter");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENLUMIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetlumium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_lumium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 6);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENCONSTANTAN.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetconstantan");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_constantan");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 4);
}if (getitemstack.getItem() == ChickenRoostModItems.ECHICKENENDERIUM.get()) {
		itemstack.getOrCreateTag().putString("outputtag", "forge:roostgetenderium");
		itemstack.getOrCreateTag().putString("entity_to_spawn_name", "chicken_roost:a_chicken_enderium");
		itemstack.getOrCreateTag().putString("perfectbreedtag", "forge:fffffffffffffffff");
		itemstack.getOrCreateTag().putString("goodbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putString("badbreedtag", "forge:fffffffffffffffffffffff");
		itemstack.getOrCreateTag().putDouble("mynewstate", 5);
}
}
}