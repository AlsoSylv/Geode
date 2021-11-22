package com.alsosylv.geode.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.alsosylv.geode.registry.LootTableRegistry.*;

public class StoneLootCall {
    public static void modifyLootTables() {
            LootTableLoadingCallback.EVENT.register((resourceManager, lootmanager, id, supplier, setter) -> {
                for (Identifier identifier : Arrays.asList(
                        Die_Loot_Table_ID,
                        And_Loot_Table_ID,
                        Gran_Loot_Table_ID,
                        Stone_Loot_Table_ID,
                        Deep_Loot_Table_ID,
                        Tuff_Loot_Table_ID,
                        Drip_Loot_Table_ID))
                    if (identifier.equals (id)) {
                        FabricLootPoolBuilder poolBuilder1 = FabricLootPoolBuilder.builder()
                                .rolls (ConstantLootNumberProvider.create(1))
                                .with (LootTableEntry.builder (Rum_loot_table_ID));
                        supplier.withPool(poolBuilder1.build ());
                    }

                if (id.equals(Rack_Loot_Table_ID)) {
                    FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(LootTableEntry.builder(Gin_Loot_Table_ID));
                supplier.withPool(poolBuilder2.build());
            }
        });
    }
}