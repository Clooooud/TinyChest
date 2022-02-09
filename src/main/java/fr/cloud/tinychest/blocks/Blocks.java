package fr.cloud.tinychest.blocks;

import net.minecraft.util.registry.Registry;

public class Blocks {

    public static TinyChestBlock TINY_CHEST_BLOCK;

    public static void initialize() {
        TINY_CHEST_BLOCK = Registry.register(Registry.BLOCK, "tinychest:tiny_chest", new TinyChestBlock());
    }
}
