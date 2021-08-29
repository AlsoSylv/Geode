package com.AlsoNiko.geode;

import com.AlsoNiko.geode.registry.StoneLootCall;
import com.AlsoNiko.geode.registry.StoneXpCall;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Geode implements ModInitializer {
    private final StoneXpCall stoneXpCall = new StoneXpCall();
    private final StoneLootCall stoneLootCall = new StoneLootCall();


    @Override

    public void onInitialize() {
//        setupEventListeners();
        stoneLootCall.modifyLootTables();
        stoneXpCall.XpLootCall();
//        PlayerBlockBreakEvents.AFTER.register((world, player, pos, direction, entity) -> {
//            if (FabricToolTags.PICKAXES.contains(player.getMainHandStack().getItem())) {
//
//                if (equals(Enchantments.SILK_TOUCH)) {
//                    System.out.println("working");
//                }
//            } else {
//                return;
//            }
//        });
    }
}

//    private void setupEventListeners() {
//        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, entity) -> {
//            if (FabricToolTags.PICKAXES.contains(player.getMainHandStack().getItem())) {
//                if (EnchantmentHelper.getLevel());
//            }
//        });
//    }
