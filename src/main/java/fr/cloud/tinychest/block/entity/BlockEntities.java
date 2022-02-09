package fr.cloud.tinychest.block.entity;

import fr.cloud.tinychest.block.Blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class BlockEntities {

    public static BlockEntityType<TinyChestBlockEntity> TINY_CHEST_BLOCK_ENTITY;

    public static void initialize() {
        TINY_CHEST_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "tinychest:tiny_chest_be", FabricBlockEntityTypeBuilder.create(TinyChestBlockEntity::new, Blocks.TINY_CHEST_BLOCK).build(null));
    }
}
