package net.tarantel.chickenroost.network;

import net.tarantel.chickenroost.ChickenRoostMod;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

import java.io.File;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChickenRoostModVariables {
	public static File roostconfig = new File("");
	public static double roost_speed_tick = 200.0;
	public static File newchickens = new File("");
	public static boolean Chicken_Mekanism_Support = false;
	public static boolean Chicken_Applied_Energistics_2_Support = false;
	public static double chicken_rate_slime = 1.0;
	public static double chicken_rate_sand = 1.0;
	public static double chicken_rate_redstone = 1.0;
	public static double chicken_rate_osmium = 1.0;
	public static double chicken_rate_obsidian = 1.0;
	public static double chicken_rate_oakwood = 1.0;
	public static double chicken_rate_lapis = 1.0;
	public static double chicken_rate_iron = 1.0;
	public static double chicken_rate_gravel = 1.0;
	public static double chicken_rate_granit = 1.0;
	public static double chicken_rate_gold = 1.0;
	public static double chicken_rate_flint = 1.0;
	public static double chicken_rate_diamond = 1.0;
	public static double chicken_rate_copper = 1.0;
	public static double chicken_rate_cobble = 1.0;
	public static double chicken_rate_birchwood = 1.0;
	public static double chicken_rate_andesite = 1.0;
	public static boolean Chicken_Botania_Support = false;
	public static boolean Chicken_Chicken_Acacia = false;
	public static boolean Chicken_Chicken_Charcoal = false;
	public static boolean Chicken_Coal = false;
	public static boolean Chicken_Chorus_Fruit = false;
	public static boolean Chicken_Nether_Brick = false;
	public static boolean Chicken_Prismarine_Shard = false;
	public static boolean Chicken_Rabbit_Hide = false;
	public static boolean Chicken_Honeycomb = false;
	public static boolean Chicken_Nautilus_Shell = false;
	public static boolean Chicken_Jungle = false;
	public static boolean Chicken_Dark_Oak = false;
	public static boolean Chicken_Bone = false;
	public static boolean Chicken_Ender_Pearl = false;
	public static boolean Chicken_Bone_Meal = false;
	public static boolean Chicken_Sugar = false;
	public static boolean Chicken_Blaze_Rod = false;
	public static boolean Chicken_Glowstone = false;
	public static boolean Chicken_Eye_of_Ender = false;
	public static boolean Chicken_Nether_Wart = false;
	public static boolean Chicken_Nether_Star = false;
	public static boolean Chicken_Stone = false;
	public static boolean Chicken_Diorite = false;
	public static boolean Chicken_TNT = false;
	public static boolean Chicken_Emerald = false;
	public static boolean Chicken_Amethyst_Shard = false;
	public static boolean Chicken_Netherquarz = false;
	public static boolean Chicken_Clay = false;
	public static boolean Chicken_Paper = false;
	public static boolean Chicken_Ink = false;
	public static boolean Chicken_Basalt = false;
	public static boolean Chicken_Soul_Soil = false;
	public static boolean Chicken_Netherrack = false;
	public static boolean Chicken_Soul_Sand = false;
	public static boolean Chicken_Wool = false;
	public static boolean Chicken_Glass = false;
	public static boolean Chicken_Spruce = false;
	public static boolean Chicken_Warped_Stem = false;
	public static boolean Chicken_Crimston_Stem = false;
	public static boolean Chicken_Oak = false;
	public static boolean Chicken_Birch = false;
	public static boolean Chicken_Slime = false;
	public static boolean Chicken_Gold = false;
	public static boolean Chicken_Obsidian = false;
	public static boolean Chicken_Diamond = false;
	public static boolean Chicken_Lapis = false;
	public static boolean Chicken_Redstone = false;
	public static boolean Chicken_Flint = false;
	public static boolean Chicken_Sand = false;
	public static boolean Chicken_Gravel = false;
	public static boolean Chicken_Granit = false;
	public static boolean Chicken_Andesite = false;
	public static boolean Chicken_Copper = false;
	public static boolean Chicken_Iron = false;
	public static boolean Chicken_Cobble = false;
	public static boolean Chicken_Mekanism_Osmium = false;
	public static boolean Chicken_Mekanism_Steel = false;
	public static boolean Chicken_Mekanism_Uranium = false;
	public static boolean Chicken_Mekanism_Lead = false;
	public static boolean Chicken_Mekanism_Bio_Fuel = false;
	public static boolean Chicken_Mekanism_Tin = false;
	public static boolean Chicken_Mekanism_Refined_Obsidian = false;
	public static boolean Chicken_Mekanism_Bronze = false;
	public static boolean Chicken_Mekanism_Refined_Glowstone = false;
	public static boolean Chicken_AE2_Silicon = false;
	public static boolean Chicken_AE2_Certus_Quartz = false;
	public static boolean Chicken_AE2_Fluix_Crystal = false;
	public static boolean Chicken_AE2_Charged_Certus = false;
	public static boolean Chicken_Botania_Manasteel = false;
	public static boolean Chicken_Botania_Terrasteel = false;
	public static boolean Chicken_Botania_Elementium = false;
	public static boolean Chicken_Botania_Livingrock = false;
	public static boolean Chicken_Botania_Livingwood = false;
	public static double chicken_rate_acacia = 0;
	public static double chicken_rate_charcoal = 0;
	public static double chicken_rate_coal = 0;
	public static double chicken_rate_chorus_fruit = 0;
	public static double chicken_rate_nether_brick = 0;
	public static double chicken_rate_prismarine_shard = 0;
	public static double chicken_rate_rabbit_hide = 0;
	public static double chicken_rate_honeycomb = 0;
	public static double chicken_rate_nautilus_shell = 0;
	public static double chicken_rate_jungle_wood = 0;
	public static double chicken_rate_dark_oak_wood = 0;
	public static double chicken_rate_bone = 0;
	public static double chicken_rate_bonemeal = 0;
	public static double chicken_rate_emerald = 0;
	public static double chicken_rate_diorite = 0;
	public static double chicken_rate_glass = 0;
	public static double chicken_rate_netherquartz = 0;
	public static double chicken_rate_ae_certusquartz = 0;
	public static double chicken_rate_ae_fluix_crystal = 0;
	public static double chicken_rate_ae_silicon = 0;
	public static double chicken_rate_ae_charged_certus_quartz = 0;
	public static double chicken_rate_botania_manasteel = 0;
	public static double chicken_rate_botania_terrasteel = 0;
	public static double chicken_rate_botania_elementium = 0;
	public static double chicken_rate_botania_livingrock = 0;
	public static double chicken_rate_botania_livingwood = 0;
	public static double chicken_rate_clay = 0;
	public static double chicken_rate_soul_sand = 0;
	public static double chicken_rate_soul_soil = 0;
	public static double chicken_rate_ink = 0;
	public static double chicken_rate_crimston_stem = 0;
	public static double chicken_rate_warped_stem = 0;
	public static double chicken_rate_glowstone = 0;
	public static double chicken_rate_stone = 0;
	public static double chicken_rate_spruce_wood = 0;
	public static double chicken_rate_paper = 0;
	public static double chicken_rate_ender_pearl = 0;
	public static double chicken_rate_eye_of_ender = 0;
	public static double chicken_rate_mekanism_osmium = 0;
	public static double chicken_rate_mekanism_steel = 0;
	public static double chicken_rate_mekanism_uranium = 0;
	public static double chicken_rate_mekanism_lead = 0;
	public static double chicken_rate_mekanism_bio_fuel = 0;
	public static double chicken_rate_mekanism_tin = 0;
	public static double chicken_rate_mekanism_refined_obsidian = 0;
	public static double chicken_rate_mekanism_bronze = 0;
	public static double chicken_rate_mekanism_refined_glowstone = 0;
	public static double chicken_rate_wool = 0;
	public static double chicken_rate_basalt = 0;
	public static double chicken_rate_netherrack = 0;
	public static double chicken_rate_tnt = 0;
	public static double chicken_rate_nether_star = 0;
	public static double chicken_rate_nether_wart = 0;
	public static double chicken_rate_blaze_rod = 0;
	public static double chicken_rate_amethyst_shard = 0;
	public static double Chicken_Rate_Sugar = 0;
	public static double chicken_rate_leather = 0;
	public static boolean Chicken_Leather = false;
	public static double chicken_rate = 1.0;
	public static double breed_speed_tick = 0.0;
	public static double xp_tier_1 = 0;
	public static double xp_tier_2 = 0;
	public static double xp_tier_3 = 0;
	public static double xp_tier_4 = 0;
	public static double xp_tier_5 = 0;
	public static double xp_tier_6 = 0;
	public static double xp_tier_7 = 0.0;
	public static double training_speed_tick = 200.0;
	public static double maxlevel_tier_1 = 60.0;
	public static double maxlevel_tier_2 = 60.0;
	public static double maxlevel_tier_3 = 60.0;
	public static double maxlevel_tier_4 = 60.0;
	public static double maxlevel_tier_5 = 60.0;
	public static double maxlevel_tier_6 = 60.0;
	public static double maxlevel_tier_7 = 60.0;
	public static double trainingxp_perfood = 20.0;
	public static double maxlevel_tier_8 = 0;
	public static double maxlevel_tier_9 = 0;
	public static double xp_tier_8 = 0;
	public static double xp_tier_9 = 0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		ChickenRoostMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		ChickenRoostMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.regcooldown = original.regcooldown;
			clone.mana = original.mana;
			if (!event.isWasDeath()) {
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "chicken_roost_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "chicken_roost_mapvars";
		public ItemStack testttt = ItemStack.EMPTY;
		public String asecondstring = "\"\"";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			testttt = ItemStack.of(nbt.getCompound("testttt"));
			asecondstring = nbt.getString("asecondstring");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.put("testttt", testttt.save(new CompoundTag()));
			nbt.putString("asecondstring", asecondstring);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("chicken_roost", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double regcooldown = 0;
		public double mana = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				ChickenRoostMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("regcooldown", regcooldown);
			nbt.putDouble("mana", mana);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			regcooldown = nbt.getDouble("regcooldown");
			mana = nbt.getDouble("mana");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.regcooldown = message.data.regcooldown;
					variables.mana = message.data.mana;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
