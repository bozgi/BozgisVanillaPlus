package bozgi.bozgis_vanilla_plus.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import static java.lang.Float.POSITIVE_INFINITY;

public class GodMaterial implements ToolMaterial {

    public static final GodMaterial INSTANCE = new GodMaterial();

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return POSITIVE_INFINITY;
    }

    @Override
    public float getAttackDamage() {
        return POSITIVE_INFINITY;
    }

    @Override
    public int getMiningLevel() {
        return (int) POSITIVE_INFINITY;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.BEDROCK);
    }
}
