package com.AlsoNiko.stonedrops;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.util.Identifier;

public class stonedrops implements ModInitializer {
    public static final String MOD_ID = "stn";

    private static final Identifier Stone_Loot_Table_ID = new Identifier("minecraft", "blocks/stone");
    private static final Identifier Die_Loot_Table_ID = new Identifier("minecraft", "blocks/diorite");
    private static final Identifier And_Loot_Table_ID = new Identifier("minecraft", "blocks/andesite");
    private static final Identifier Gran_Loot_Table_ID = new Identifier("minecraft", "blocks/granite");
    private static final Identifier rum_loot_table_ID = new Identifier(MOD_ID, "blocks/rum");
    private static final Identifier Rack_Loot_Table_ID = new Identifier("minecraft", "blocks/netherrack");
    private static final Identifier Gin_Loot_Table_ID = new Identifier(MOD_ID, "blocks/gin");

    @Override

    public void onInitialize() {
        modifyLootTables();
    }

    private void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, lootmanager, id, supplier, setter) -> {

            if (Gran_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder4 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder4.build());
            }

            if (And_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder3 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder3.build());
            }

            if (Die_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder2 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder2.build());
            }

            if (Stone_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(rum_loot_table_ID));
                supplier.withPool(poolBuilder.build());

            }

            if (Rack_Loot_Table_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder5 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .with(LootTableEntry.builder(Gin_Loot_Table_ID));
                supplier.withPool((poolBuilder5.build()));
            }
        }));

        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            if (state.getBlock() == Blocks.STONE) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
            if (state.getBlock() == Blocks.DIORITE) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
            if (state.getBlock() == Blocks.ANDESITE) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
            if (state.getBlock() == Blocks.GRANITE) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
        });
    }
}
