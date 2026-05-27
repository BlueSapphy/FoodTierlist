package net.bluesapphy.foodtierlist;

import net.bluesapphy.foodtierlist.food.ModFoods;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodTierlist implements ModInitializer {
	public static final String MODID = "foodtierlist";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModFoods.register();
		LOGGER.info("Hello Fabric world!");
	}
}