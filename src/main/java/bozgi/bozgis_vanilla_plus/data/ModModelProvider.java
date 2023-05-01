package bozgi.bozgis_vanilla_plus.data;

import bozgi.bozgis_vanilla_plus.blocks.ModBlocks;
import bozgi.bozgis_vanilla_plus.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAZITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAZITE_ORE);
        blockStateModelGenerator.registerLog(ModBlocks.ENCHANTED_LOG).log(ModBlocks.ENCHANTED_LOG).wood(ModBlocks.ENCHANTED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ENCHANTED_LOG).log(ModBlocks.STRIPPED_ENCHANTED_LOG).wood(ModBlocks.STRIPPED_ENCHANTED_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENCHANTED_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENCHANTED_TREE_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.ENCHANTED_TREE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.METAZITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_METAZITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAZITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOD_TOOL, Models.GENERATED);
    }
}
