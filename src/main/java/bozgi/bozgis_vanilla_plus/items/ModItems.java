package bozgi.bozgis_vanilla_plus.items;

import bozgi.bozgis_vanilla_plus.BozgisVanillaPlus;
import bozgi.bozgis_vanilla_plus.materials.GodMaterial;
import bozgi.bozgis_vanilla_plus.materials.MetaziteMaterial;
import bozgi.bozgis_vanilla_plus.tools.CustomPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static bozgi.bozgis_vanilla_plus.BozgisVanillaPlus.MOD_ID;
import static java.lang.Float.POSITIVE_INFINITY;

public class ModItems extends Item {
    public ModItems(Settings settings) {
        super(settings);
    }

    public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()), ItemGroups.TOOLS);
    public static final Item GOD_TOOL = registerItem("god_tool", new CustomPickaxeItem(GodMaterial.INSTANCE, 200, POSITIVE_INFINITY, new FabricItemSettings()), ItemGroups.TOOLS);
    public static final Item METAZITE_PICKAXE = registerItem("metazite_pickaxe", new CustomPickaxeItem(MetaziteMaterial.INSTANCE, 2, 0, new FabricItemSettings()), ItemGroups.TOOLS);
    public static final Item RAW_METAZITE = registerItem("raw_metazite", new Item(new FabricItemSettings()), ItemGroups.INGREDIENTS);
    public static final Item METAZITE = registerItem("metazite", new Item(new FabricItemSettings()), ItemGroups.INGREDIENTS);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        addToGroup(group, item);
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void addToGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerItems(){
        BozgisVanillaPlus.LOGGER.info("zaladowanie");
    }

}
