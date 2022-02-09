package fr.cloud.tinychest;

import fr.cloud.tinychest.block.Blocks;
import fr.cloud.tinychest.block.entity.BlockEntities;
import fr.cloud.tinychest.item.Items;
import fr.cloud.tinychest.screenhandlers.ScreenHandlers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyChest implements ModInitializer {

    public static final String MOD_ID = "tinychest";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(Blocks.TINY_CHEST_BLOCK));

    @Override
    public void onInitialize() {
        Blocks.initialize();
        BlockEntities.initialize();
        Items.initialize();
        ScreenHandlers.initialize();
    }
}
