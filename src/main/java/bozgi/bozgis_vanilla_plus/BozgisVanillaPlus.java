package bozgi.bozgis_vanilla_plus;

import bozgi.bozgis_vanilla_plus.blocks.FlammableBlocks;
import bozgi.bozgis_vanilla_plus.blocks.ModBlocks;
import bozgi.bozgis_vanilla_plus.items.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BozgisVanillaPlus implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("bozgis_vanilla_plus");

    public static final String MOD_ID = "bozgis_vanilla_plus";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        FlammableBlocks.registerFlammableBlocks();
        StrippableBlockRegistry.register(ModBlocks.ENCHANTED_WOOD, ModBlocks.STRIPPED_ENCHANTED_WOOD);
        StrippableBlockRegistry.register(ModBlocks.ENCHANTED_LOG, ModBlocks.STRIPPED_ENCHANTED_LOG);

        LOGGER.info("Hello Fabric world!");
    }
}