package com.AlsoNiko.geode.registry;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.entity.ExperienceOrbEntity;
import org.apache.commons.lang3.ArrayUtils;

public class StoneXpCall {


    public static void XpLootCall() {
        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            if (FabricToolTags.PICKAXES.contains(player.getMainHandStack().getItem())) {
                    if (ArrayUtils.contains (StoneArray.STONES, state.getBlock ())) {
                        world.spawnEntity(new ExperienceOrbEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, 1));
                    }
                }
        });
    }
}
