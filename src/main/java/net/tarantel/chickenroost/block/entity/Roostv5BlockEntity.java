package net.tarantel.chickenroost.block.entity;

import net.tarantel.chickenroost.world.inventory.Roostguiv5Menu;
import net.tarantel.chickenroost.init.ChickenRoostModBlockEntities;

import net.minecraftforge.items.wrapper.SidedInvWrapper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.stream.IntStream;

import io.netty.buffer.Unpooled;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.Level;
import net.minecraft.world.SimpleContainer;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class Roostv5BlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
	private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(3, ItemStack.EMPTY);
	private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());
	//public static final IntegerProperty TEST_MYNEWSTATE = IntegerProperty.create("mynewstate", 0, 138);
	private final ItemStackHandler itemHandler = new ItemStackHandler(6){
		@Override
		protected void onContentsChanged(int slot) { setChanged(); }
	};

    /*protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 72;
    */
	public Roostv5BlockEntity(BlockPos position, BlockState state) {
		super(ChickenRoostModBlockEntities.ROOSTV_5.get(), position, state);
	}

	@Override
	public void load(CompoundTag compound) {
		super.load(compound);
		if (!this.tryLoadLootTable(compound))
			this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(compound, this.stacks);
		//progress = compound.getInt("roost_chicken_breed_station.progress");
	}

	@Override
	public void saveAdditional(CompoundTag compound) {
	    //compound.putInt("roost_chicken_breed_station.progress", progress);
		super.saveAdditional(compound);
		if (!this.trySaveLootTable(compound)) {
			ContainerHelper.saveAllItems(compound, this.stacks);
		}
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}

	@Override
	public int getContainerSize() {
		return stacks.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.stacks)
			if (!itemstack.isEmpty())
				return false;
		return true;
	}

	@Override
	public Component getDefaultName() {
		return new TextComponent("roostv_5");
	}

	@Override
	public int getMaxStackSize() {
		return 64;
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return new Roostguiv5Menu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.worldPosition));
	}

	@Override
	public Component getDisplayName() {
		return new TextComponent("Roost V5");
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.stacks;
	}

    /*public static void tick(Level pLevel, BlockPos pPos, BlockState pState, Roostv5BlockEntity pBlockentity) {

    	if(hasRecipe(pBlockentity)){
    		pBlockentity.progress++;
    		setChanged(pLevel, pPos, pState);
    		if(pBlockentity.progress > pBlockentity.maxProgress){
    			//craftItem(pBlockentity);
    		}
    	} else {
    		pBlockentity.resetProgress();
    		setChanged(pLevel, pPos, pState);
    	}
    }
*/
   /* private static boolean hasRecipe(Roostv5BlockEntity entity){
    	//Level level = entity.level;
    	//SimpleContainer inventory = new SimpleContainer(entity.itemHandler
    }*/
	@Override
	protected void setItems(NonNullList<ItemStack> stacks) {
		this.stacks = stacks;
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		if (index == 1){
			return false;}
		if (index == 0)
{
			if (stack.is(ItemTags.create(new ResourceLocation("forge:roost/tier5")))){
				return true;
			}
			else
			{
				return false;
			}
		}
		if (index == 2)
{
			if (stack.is(ItemTags.create(new ResourceLocation("forge:seeds")))){
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return IntStream.range(0, this.getContainerSize()).toArray();
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
		return this.canPlaceItem(index, stack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
		if (index == 0)
			return false;
		if (index == 2)
			return false;
		return true;
	}

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
		if (!this.remove && facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
			return handlers[facing.ordinal()].cast();
		return super.getCapability(capability, facing);
	}

	@Override
	public void setRemoved() {
		super.setRemoved();
		for (LazyOptional<? extends IItemHandler> handler : handlers)
			handler.invalidate();
	}

	//private void resetProgress() { this.progress = 0; }
}
