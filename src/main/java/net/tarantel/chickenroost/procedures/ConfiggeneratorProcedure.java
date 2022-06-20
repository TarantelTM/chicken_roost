package net.tarantel.chickenroost.procedures;

import net.tarantel.chickenroost.network.ChickenRoostModVariables;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.api.distmarker.Dist;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ConfiggeneratorProcedure {
	@SubscribeEvent
	public static void init(FMLClientSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File modconfig = new File("");
		String producerate_cob = "";
		com.google.gson.JsonObject roost_speed_tick = new com.google.gson.JsonObject();
		modconfig = new File((FMLPaths.GAMEDIR.get().toString() + "/config/"), File.separator + "Chickenroost_v0.2.3.json");
		if (!modconfig.exists()) {
			try {
				modconfig.getParentFile().mkdirs();
				modconfig.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			roost_speed_tick.addProperty("info_tick", "Timer use TICK so 20 Ticks equal 1 Second");
			roost_speed_tick.addProperty("roost_speed_tick", 200);
			roost_speed_tick.addProperty("breed_speed_tick", 600);
			roost_speed_tick.addProperty("training_speed_tick", 200);
			roost_speed_tick.addProperty("info_trainingxp", "Set needed XP Amount for Level Tiered Chickens");
			roost_speed_tick.addProperty("trainingxp_perfood", 20);
			roost_speed_tick.addProperty("xp_tier_1", 500);
			roost_speed_tick.addProperty("xp_tier_2", 2500);
			roost_speed_tick.addProperty("xp_tier_3", 12500);
			roost_speed_tick.addProperty("xp_tier_4", 62500);
			roost_speed_tick.addProperty("xp_tier_5", 125000);
			roost_speed_tick.addProperty("xp_tier_6", 250000);
			roost_speed_tick.addProperty("xp_tier_7", 325000);
			roost_speed_tick.addProperty("xp_tier_8", 400000);
			roost_speed_tick.addProperty("xp_tier_9", 500000);
			roost_speed_tick.addProperty("info_training_maxlevel", "Set Maxlevel for each Tier");
			roost_speed_tick.addProperty("maxlevel_tier_1", 60);
			roost_speed_tick.addProperty("maxlevel_tier_2", 60);
			roost_speed_tick.addProperty("maxlevel_tier_3", 60);
			roost_speed_tick.addProperty("maxlevel_tier_4", 60);
			roost_speed_tick.addProperty("maxlevel_tier_5", 60);
			roost_speed_tick.addProperty("maxlevel_tier_6", 60);
			roost_speed_tick.addProperty("maxlevel_tier_7", 60);
			roost_speed_tick.addProperty("maxlevel_tier_8", 60);
			roost_speed_tick.addProperty("maxlevel_tier_9", 60);
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(modconfig);
					fileWriter.write(mainGSONBuilderVariable.toJson(roost_speed_tick));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		} else {
			if (modconfig.exists()) {
				{
					try {
						BufferedReader bufferedReader = new BufferedReader(new FileReader(modconfig));
						StringBuilder jsonstringbuilder = new StringBuilder();
						String line;
						while ((line = bufferedReader.readLine()) != null) {
							jsonstringbuilder.append(line);
						}
						bufferedReader.close();
						roost_speed_tick = new Gson().fromJson(jsonstringbuilder.toString(), com.google.gson.JsonObject.class);
						ChickenRoostModVariables.roost_speed_tick = roost_speed_tick.get("roost_speed_tick").getAsDouble();
						ChickenRoostModVariables.breed_speed_tick = roost_speed_tick.get("breed_speed_tick").getAsDouble();
						ChickenRoostModVariables.training_speed_tick = roost_speed_tick.get("training_speed_tick").getAsDouble();
						ChickenRoostModVariables.trainingxp_perfood = roost_speed_tick.get("trainingxp_perfood").getAsDouble();
						ChickenRoostModVariables.xp_tier_1 = roost_speed_tick.get("xp_tier_1").getAsDouble();
						ChickenRoostModVariables.xp_tier_2 = roost_speed_tick.get("xp_tier_2").getAsDouble();
						ChickenRoostModVariables.xp_tier_3 = roost_speed_tick.get("xp_tier_3").getAsDouble();
						ChickenRoostModVariables.xp_tier_4 = roost_speed_tick.get("xp_tier_4").getAsDouble();
						ChickenRoostModVariables.xp_tier_5 = roost_speed_tick.get("xp_tier_5").getAsDouble();
						ChickenRoostModVariables.xp_tier_6 = roost_speed_tick.get("xp_tier_6").getAsDouble();
						ChickenRoostModVariables.xp_tier_7 = roost_speed_tick.get("xp_tier_7").getAsDouble();
						ChickenRoostModVariables.xp_tier_8 = roost_speed_tick.get("xp_tier_8").getAsDouble();
						ChickenRoostModVariables.xp_tier_9 = roost_speed_tick.get("xp_tier_9").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_1 = roost_speed_tick.get("maxlevel_tier_1").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_2 = roost_speed_tick.get("maxlevel_tier_2").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_3 = roost_speed_tick.get("maxlevel_tier_3").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_4 = roost_speed_tick.get("maxlevel_tier_4").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_5 = roost_speed_tick.get("maxlevel_tier_5").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_6 = roost_speed_tick.get("maxlevel_tier_6").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_7 = roost_speed_tick.get("maxlevel_tier_7").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_8 = roost_speed_tick.get("maxlevel_tier_8").getAsDouble();
						ChickenRoostModVariables.maxlevel_tier_9 = roost_speed_tick.get("maxlevel_tier_9").getAsDouble();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
