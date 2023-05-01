package bozgi.bozgis_vanilla_plus.data;

import bozgi.bozgis_vanilla_plus.blocks.ModBlocks;
import bozgi.bozgis_vanilla_plus.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.METAZITE_BLOCK);

        addDrop(ModBlocks.METAZITE_ORE, oreDrops(ModBlocks.METAZITE_ORE, ModItems.RAW_METAZITE));
    }
}
