package bozgi.bozgis_vanilla_plus.blocks;

import bozgi.bozgis_vanilla_plus.BozgisVanillaPlus;
import bozgi.bozgis_vanilla_plus.world.tree.EnchantedTreeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.fabricmc.yarn.constants.MiningLevels.NETHERITE;

public class ModBlocks {

    public static final Block METAZITE_ORE = registerBlock("metazite_ore", new Block(FabricBlockSettings.of(Material.STONE).hardness(5.5f).resistance(10.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block METAZITE_BLOCK = registerBlock("metazite_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).resistance(12.0f)), ItemGroups.BUILDING_BLOCKS);
    public static final Block ENCHANTED_LOG = registerBlock("enchanted_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).hardness(6.0f).resistance(Blocks.OAK_LOG.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_ENCHANTED_LOG = registerBlock("stripped_enchanted_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).hardness(6.0f).resistance(Blocks.STRIPPED_OAK_LOG.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block ENCHANTED_WOOD = registerBlock("enchanted_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).hardness(6.0f).resistance(Blocks.OAK_WOOD.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_ENCHANTED_WOOD = registerBlock("stripped_enchanted_wood", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).hardness(6.0f).resistance(Blocks.STRIPPED_OAK_WOOD.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block ENCHANTED_PLANKS = registerBlock("enchanted_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).hardness(6.0f).resistance(Blocks.OAK_PLANKS.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block ENCHANTED_TREE_LEAVES = registerBlock("enchanted_tree_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).resistance(Blocks.OAK_LEAVES.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);
    public static final Block ENCHANTED_TREE_SAPLING = registerBlock("enchanted_tree_sapling", new SaplingBlock(new EnchantedTreeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).hardness(6.0f).resistance(Blocks.OAK_SAPLING.getBlastResistance())), ItemGroups.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(BozgisVanillaPlus.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BozgisVanillaPlus.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerBlocks(){
        BozgisVanillaPlus.LOGGER.info("Registering Blocks");
    }

}
