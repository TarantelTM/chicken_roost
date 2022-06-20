
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.world.inventory.TrainerGUIMenu;
import net.tarantel.chickenroost.world.inventory.TestmyguinewMenu;
import net.tarantel.chickenroost.world.inventory.Roostguiv9Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv8Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv7Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv6Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv5Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv4Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv3Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv2Menu;
import net.tarantel.chickenroost.world.inventory.Roostguiv1Menu;
import net.tarantel.chickenroost.world.inventory.RoostguiMenu;
import net.tarantel.chickenroost.world.inventory.HdfhdfhMenu;
import net.tarantel.chickenroost.world.inventory.BreederguiMenu;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChickenRoostModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<RoostguiMenu> ROOSTGUI = register("roostgui", (id, inv, extraData) -> new RoostguiMenu(id, inv, extraData));
	public static final MenuType<HdfhdfhMenu> HDFHDFH = register("hdfhdfh", (id, inv, extraData) -> new HdfhdfhMenu(id, inv, extraData));
	public static final MenuType<BreederguiMenu> BREEDERGUI = register("breedergui", (id, inv, extraData) -> new BreederguiMenu(id, inv, extraData));
	public static final MenuType<TrainerGUIMenu> TRAINER_GUI = register("trainer_gui",
			(id, inv, extraData) -> new TrainerGUIMenu(id, inv, extraData));
	public static final MenuType<TestmyguinewMenu> TESTMYGUINEW = register("testmyguinew",
			(id, inv, extraData) -> new TestmyguinewMenu(id, inv, extraData));
	public static final MenuType<Roostguiv1Menu> ROOSTGUIV_1 = register("roostguiv_1",
			(id, inv, extraData) -> new Roostguiv1Menu(id, inv, extraData));
	public static final MenuType<Roostguiv2Menu> ROOSTGUIV_2 = register("roostguiv_2",
			(id, inv, extraData) -> new Roostguiv2Menu(id, inv, extraData));
	public static final MenuType<Roostguiv3Menu> ROOSTGUIV_3 = register("roostguiv_3",
			(id, inv, extraData) -> new Roostguiv3Menu(id, inv, extraData));
	public static final MenuType<Roostguiv4Menu> ROOSTGUIV_4 = register("roostguiv_4",
			(id, inv, extraData) -> new Roostguiv4Menu(id, inv, extraData));
	public static final MenuType<Roostguiv5Menu> ROOSTGUIV_5 = register("roostguiv_5",
			(id, inv, extraData) -> new Roostguiv5Menu(id, inv, extraData));
	public static final MenuType<Roostguiv6Menu> ROOSTGUIV_6 = register("roostguiv_6",
			(id, inv, extraData) -> new Roostguiv6Menu(id, inv, extraData));
	public static final MenuType<Roostguiv7Menu> ROOSTGUIV_7 = register("roostguiv_7",
			(id, inv, extraData) -> new Roostguiv7Menu(id, inv, extraData));
	public static final MenuType<Roostguiv8Menu> ROOSTGUIV_8 = register("roostguiv_8",
			(id, inv, extraData) -> new Roostguiv8Menu(id, inv, extraData));
	public static final MenuType<Roostguiv9Menu> ROOSTGUIV_9 = register("roostguiv_9",
			(id, inv, extraData) -> new Roostguiv9Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
