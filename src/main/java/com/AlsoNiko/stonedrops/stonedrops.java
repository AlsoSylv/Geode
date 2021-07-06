package com.AlsoNiko.stonedrops;

import com.AlsoNiko.stonedrops.registry.StoneLootCall;
import com.AlsoNiko.stonedrops.registry.StoneXpCall;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.enchantment.Enchantments;

public class stonedrops implements ModInitializer {
    private final StoneXpCall stoneXpCall = new StoneXpCall();
    private final StoneLootCall stoneLootCall = new StoneLootCall();
    private final StoneConfig stoneConfig = new StoneConfig();


    @Override

    public void onInitialize() {
//        setupEventListeners();
        stoneLootCall.modifyLootTables();
        stoneXpCall.XpLootCall();
        AutoConfig.register(StoneConfig.ModConfig.class, GsonConfigSerializer::new);
        StoneConfig.ModConfig config = AutoConfig.getConfigHolder(StoneConfig.ModConfig.class).getConfig();

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
