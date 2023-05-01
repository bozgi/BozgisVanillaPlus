package bozgi.bozgis_vanilla_plus.data;

import bozgi.bozgis_vanilla_plus.blocks.ModBlocks;
import bozgi.bozgis_vanilla_plus.BozgisVanillaPlus;
import bozgi.bozgis_vanilla_plus.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_METAZITE, ModBlocks.METAZITE_ORE), RecipeCategory.MISC, ModItems.METAZITE, 3.5f, 400, "metazite");

        offerPlanksRecipe(exporter, ModBlocks.ENCHANTED_PLANKS, TagKey.of(RegistryKey.ofRegistry(Identifier.of(BozgisVanillaPlus.MOD_ID, "enchanted_log")), Identifier.of(BozgisVanillaPlus.MOD_ID, "enchanted_log")), 4);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.METAZITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.METAZITE_BLOCK);
    }
}
