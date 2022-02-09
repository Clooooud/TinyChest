package fr.cloud.tinychest.items;

import fr.cloud.tinychest.TinyChest;
import fr.cloud.tinychest.blocks.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class Items {

    public static BlockItem TINY_CHEST = new BlockItem(Blocks.TINY_CHEST_BLOCK, new Item.Settings().group(TinyChest.TAB));

    public static void initialize(){
        Registry.register(Registry.ITEM, "tinychest:tiny_chest", TINY_CHEST);
    }
}
