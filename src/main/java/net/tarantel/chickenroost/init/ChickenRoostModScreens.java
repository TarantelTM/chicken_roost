
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.tarantel.chickenroost.init;

import net.tarantel.chickenroost.client.gui.TrainerGUIScreen;
import net.tarantel.chickenroost.client.gui.TestmyguinewScreen;
import net.tarantel.chickenroost.client.gui.Roostguiv9Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv8Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv7Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv6Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv5Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv4Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv3Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv2Screen;
import net.tarantel.chickenroost.client.gui.Roostguiv1Screen;
import net.tarantel.chickenroost.client.gui.RoostguiScreen;
import net.tarantel.chickenroost.client.gui.HdfhdfhScreen;
import net.tarantel.chickenroost.client.gui.BreederguiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChickenRoostModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUI, RoostguiScreen::new);
			MenuScreens.register(ChickenRoostModMenus.HDFHDFH, HdfhdfhScreen::new);
			MenuScreens.register(ChickenRoostModMenus.BREEDERGUI, BreederguiScreen::new);
			MenuScreens.register(ChickenRoostModMenus.TRAINER_GUI, TrainerGUIScreen::new);
			MenuScreens.register(ChickenRoostModMenus.TESTMYGUINEW, TestmyguinewScreen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_1, Roostguiv1Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_2, Roostguiv2Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_3, Roostguiv3Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_4, Roostguiv4Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_5, Roostguiv5Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_6, Roostguiv6Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_7, Roostguiv7Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_8, Roostguiv8Screen::new);
			MenuScreens.register(ChickenRoostModMenus.ROOSTGUIV_9, Roostguiv9Screen::new);
		});
	}
}
