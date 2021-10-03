package com.AlsoNiko.geode.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class StoneLootCall {
    public static void modifyLootTables() {
            LootTableLoadingCallback.EVENT.register((resourceManager, lootmanager, id, supplier, setter) -> {

                LootTableRegistry.Stone_Loot_Table_ID.equals (id);
                LootTableRegistry.And_Loot_Table_ID.equals (id);
                LootTableRegistry.Die_Loot_Table_ID.equals (id);
                LootTableRegistry.Gran_Loot_Table_ID.equals (id);
                LootTableRegistry.Deep_Loot_Table_ID.equals (id);
                LootTableRegistry.Drip_Loot_Table_ID.equals (id);
                LootTableRegistry.Tuff_Loot_Table_ID.equals (id);
                FabricLootPoolBuilder poolBuilder4 = FabricLootPoolBuilder.builder ()
                        .rolls (ConstantLootNumberProvider.create (1))
                        .with (LootTableEntry.builder (LootTableRegistry.Rum_loot_table_ID));
                supplier.withPool (poolBuilder4.build ());

                LootTableRegistry.Rack_Loot_Table_ID.equals (id);
                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder ()
                        .rolls (ConstantLootNumberProvider.create (1))
                        .with (LootTableEntry.builder (LootTableRegistry.Gin_Loot_Table_ID));
                supplier.withPool (poolBuilder5.build ());
            });
    }
}