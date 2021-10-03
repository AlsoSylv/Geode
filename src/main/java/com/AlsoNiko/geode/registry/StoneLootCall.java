package com.AlsoNiko.geode.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Arrays;

public class StoneLootCall {
    public static void modifyLootTables() {
            LootTableLoadingCallback.EVENT.register((resourceManager, lootmanager, id, supplier, setter) -> {
                for (Identifier identifier : Arrays.asList (
                        LootTableRegistry.Die_Loot_Table_ID,
                        LootTableRegistry.And_Loot_Table_ID,
                        LootTableRegistry.Gran_Loot_Table_ID,
                        LootTableRegistry.Stone_Loot_Table_ID,
                        LootTableRegistry.Deep_Loot_Table_ID,
                        LootTableRegistry.Tuff_Loot_Table_ID,
                        LootTableRegistry.Drip_Loot_Table_ID))
                    if (identifier.equals (id)) {
                        FabricLootPoolBuilder poolBuilder1 = FabricLootPoolBuilder.builder ()
                                .rolls (ConstantLootNumberProvider.create (1))
                                .with (LootTableEntry.builder (LootTableRegistry.Rum_loot_table_ID));
                        supplier.withPool (poolBuilder1.build ());
                    }

                if (id.equals(LootTableRegistry.Rack_Loot_Table_ID)) {
                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(LootTableRegistry.Gin_Loot_Table_ID));
                supplier.withPool((poolBuilder5.build()));
            }
        });

    }
}