package com.AlsoNiko.geode.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class StoneLootCall {
    public static void modifyLootTables() {
            LootTableLoadingCallback.EVENT.register((resourceManager, lootmanager, id, supplier, setter) -> {
            if (LootTableRegistry.Die_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool(poolBuilder2.build());
            }

            if (LootTableRegistry.And_Loot_Table_ID.equals(id)) {
                    FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                    supplier.withPool(poolBuilder2.build());
            }
            
            if (LootTableRegistry.Gran_Loot_Table_ID.equals(id)) {
                    FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                            .rolls(ConstantLootNumberProvider.create(1))
                            .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                    supplier.withPool(poolBuilder2.build());
            }

            if (LootTableRegistry.Stone_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool(poolBuilder.build());

            }

            if (LootTableRegistry.Rack_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Gin_Loot_Table_ID));
                supplier.withPool((poolBuilder5.build()));
            }
            if (LootTableRegistry.Deep_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder6 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool((poolBuilder6.build()));
            }
            if (LootTableRegistry.Tuff_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder7 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool((poolBuilder7.build()));
            }
            if (LootTableRegistry.Drip_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder8 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool((poolBuilder8.build()));
            }
        });

    }
}