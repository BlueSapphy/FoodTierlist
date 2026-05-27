package net.bluesapphy.foodtierlist.food;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModFoods {
    public static void register() {

        DefaultItemComponentEvents.MODIFY.register(context -> {

            // Tier 0
            changeFood(context, Items.APPLE, 1, 0.5f);
            changeFood(context, Items.BEETROOT, 1, 0.5f);
            changeFood(context, Items.CARROT, 1, 0.5f);
            changeFood(context, Items.MELON_SLICE, 1, 0.5f);
            changeFood(context, Items.POTATO, 1, 0.5f);
            changeFood(context, Items.SWEET_BERRIES, 1, 0.5f);
            changeFood(context, Items.GLOW_BERRIES, 1, 0.5f);
            changeFood(context, Items.CHORUS_FRUIT, 1, 0.5f);
            // Tier 1
            changeFood(context, Items.BREAD,2, 0.5f);
            changeFood(context, Items.DRIED_KELP,2, 0.5f);
            // Tier 2
            changeFood(context, Items.BEEF,3,0.5f);
            changeFood(context, Items.CHICKEN,3,0.5f);
            changeFood(context, Items.PORKCHOP,3,0.5f);
            changeFood(context, Items.MUTTON,3,0.5f);
            changeFood(context, Items.RABBIT,3,0.5f);
            changeFood(context, Items.COD,3,0.5f);
            changeFood(context, Items.SALMON,3,0.5f);
            changeFood(context, Items.TROPICAL_FISH,3,0.5f);
            changeFood(context, Items.PUFFERFISH,3,0.5f);
            // Tier 3
            changeFood(context, Items.HONEY_BOTTLE,4, 0.5f);
            changeFood(context, Items.BAKED_POTATO,4, 0.5f);
            changeFood(context, Items.MUSHROOM_STEW,4, 0.5f);
            changeFood(context, Items.SUSPICIOUS_STEW,4, 0.5f);
            // Tier 4
            changeFood(context, Items.COOKED_BEEF,6, 0.5f);
            changeFood(context, Items.COOKED_CHICKEN,6, 0.5f);
            changeFood(context, Items.COOKED_PORKCHOP,6, 0.5f);
            changeFood(context, Items.COOKED_MUTTON,6, 0.5f);
            changeFood(context, Items.COOKED_RABBIT,6, 0.5f);
            changeFood(context, Items.COOKED_COD,6, 0.5f);
            changeFood(context, Items.COOKED_SALMON,6, 0.5f);
            // Tier 5
            changeFood(context, Items.BEETROOT_SOUP,7,0.5f);
            changeFood(context, Items.COOKIE,7,0.5f);
            changeFood(context, Items.PUMPKIN_PIE,7,0.5f);
            // Tier 6
            changeFood(context, Items.CAKE,3,0.35f);
            changeFood(context, Items.RABBIT_STEW,16,0.5f);
            changeFood(context, Items.GOLDEN_CARROT,8,0.5f);
            changeFood(context, Items.GOLDEN_APPLE,8,0.5f);
            changeFood(context, Items.ENCHANTED_GOLDEN_APPLE,10,0.5f);
            // Tier -1
            changeFood(context, Items.ROTTEN_FLESH,1,0.1f);
            changeFood(context, Items.SPIDER_EYE,1,0.1f);
            changeFood(context, Items.POISONOUS_POTATO,1,0.1f);


        });
    }

    private static void changeFood(DefaultItemComponentEvents.ModifyContext context, Item item, int h, float s) {
        context.modify(item, builder -> builder.set(DataComponents.FOOD, new FoodProperties.Builder().nutrition(h).saturationModifier(s).build()));
    }

}
