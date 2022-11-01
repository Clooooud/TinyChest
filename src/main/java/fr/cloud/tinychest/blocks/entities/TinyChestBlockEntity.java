package fr.cloud.tinychest.blocks.entities;

import fr.cloud.tinychest.screenhandlers.TinyChestScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class TinyChestBlockEntity extends ChestBlockEntity {

    public TinyChestBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntities.TINY_CHEST_BLOCK_ENTITY, pos, state);
        this.setInvStackList(DefaultedList.ofSize(4, ItemStack.EMPTY));
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new TinyChestScreenHandler(i, playerInventory, this);
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new TinyChestScreenHandler(syncId, playerInventory);
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    @Override
    protected Text getContainerName() {
        return MutableText.of(new TranslatableTextContent("container.tiny_chest"));
    }

    @Override
    public int size() {
        return 4;
    }
}
