package com.AlsoNiko.stonedrops.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class StoneLootCall {
    public static final String MOD_ID = "stn";

    public static final Identifier Stone_Loot_Table_ID = new Identifier("minecraft", "blocks/stone");
    private static final Identifier Die_Loot_Table_ID = new Identifier("minecraft", "blocks/diorite");
    private static final Identifier And_Loot_Table_ID = new Identifier("minecraft", "blocks/andesite");
    private static final Identifier Gran_Loot_Table_ID = new Identifier("minecraft", "blocks/granite");
    private static final Identifier rum_loot_table_ID = new Identifier(MOD_ID, "blocks/rum");
    private static final Identifier Rack_Loot_Table_ID = new Identifier("minecraft", "blocks/netherrack");
    private static final Identifier Gin_Loot_Table_ID = new Identifier(MOD_ID, "blocks/gin");
    private static final Identifier Deep_Loot_Table_ID = new Identifier("minecraft", "blocks/deepslate");
    private static final Identifier Tuff_Loot_Table_ID = new Identifier("minecraft", "blocks/tuff");
    private static final Identifier Drip_Loot_Table_ID = new Identifier("minecraft", "blocks/dripstone_block");

    public void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, lootmanager, id, supplier, setter) -> {

            if (Gran_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder4 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder4.build());
            }

            if (And_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder3 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder3.build());
            }

            if (Die_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder2.build());
            }

            if (Stone_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder.build());

            }

            if (Rack_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(Gin_Loot_Table_ID));
                supplier.withPool((poolBuilder5.build()));
            }
            if (Deep_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder6 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool((poolBuilder6.build()));
            }
            if (Tuff_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder7 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool((poolBuilder7.build()));
            }
            if (Drip_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder8 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool((poolBuilder8.build()));
            }
        }));

    }
}