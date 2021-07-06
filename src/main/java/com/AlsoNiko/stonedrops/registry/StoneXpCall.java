package com.AlsoNiko.stonedrops.registry;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ExperienceOrbEntity;

public class StoneXpCall {
    public void XpLootCall() {
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
            if (state.getBlock() == Blocks.DEEPSLATE) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
            if (state.getBlock() == Blocks.DRIPSTONE_BLOCK) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
            if (state.getBlock() == Blocks.TUFF) {
                world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
            }
        });
    }
}

