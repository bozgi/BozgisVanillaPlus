package bozgi.bozgis_vanilla_plus.blocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class FlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.STRIPPED_ENCHANTED_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_ENCHANTED_WOOD, 5, 5);
        registry.add(ModBlocks.ENCHANTED_TREE_LEAVES, 30, 60);
        registry.add(ModBlocks.ENCHANTED_LOG, 5, 5);
        registry.add(ModBlocks.ENCHANTED_WOOD, 5, 5);
        registry.add(ModBlocks.ENCHANTED_PLANKS, 5, 20);
    }
}
