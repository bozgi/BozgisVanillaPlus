package bozgi.bozgis_vanilla_plus;

import bozgi.bozgis_vanilla_plus.data.ModLootTableGenerator;
import bozgi.bozgis_vanilla_plus.data.ModModelProvider;
import bozgi.bozgis_vanilla_plus.data.ModRecipeGenerator;
import bozgi.bozgis_vanilla_plus.data.ModWorldGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BozgisVanillaPlusDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
        System.out.println("test");

    }
}
