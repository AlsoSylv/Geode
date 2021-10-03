package com.AlsoNiko.geode;

import com.AlsoNiko.geode.registry.StoneLootCall;
import com.AlsoNiko.geode.registry.StoneXpCall;

import net.fabricmc.api.ModInitializer;

public class Geode implements ModInitializer {
    public static final String MOD_ID = "stn";

    @Override
    public void onInitialize() {
        StoneLootCall.modifyLootTables();
        StoneXpCall.XpLootCall();
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
