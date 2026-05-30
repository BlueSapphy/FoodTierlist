package net.bluesapphy.foodtierlist.mixin;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.villager.VillagerProfession;
import net.minecraft.world.entity.npc.villager.VillagerTrades;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(VillagerTrades.class)
public class VillagerTradesMixin {

    @Shadow
    @Final
    @Mutable
    public static Map<ResourceKey<VillagerProfession>, Int2ObjectMap<VillagerTrades.ItemListing[]>> TRADES;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void modifyCookieTrade(CallbackInfo ci) {

        Int2ObjectMap<VillagerTrades.ItemListing[]> farmerTrades =
                TRADES.get(VillagerProfession.FARMER);

        if (farmerTrades == null) {
            return;
        }

        farmerTrades.put(
                3,
                new VillagerTrades.ItemListing[] {
                        new VillagerTrades.ItemsForEmeralds(
                                net.minecraft.world.item.Items.COOKIE,
                                3,
                                3, // Changed from 18 -> 3
                                10
                        )
                }
        );
    }
}
