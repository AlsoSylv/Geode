package com.AlsoNiko.geode.registry;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.entity.ExperienceOrbEntity;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Random;

public class StoneXpCall {

    public static void XpLootCall() {

        Random rand = new Random();
        int min = 1;
        int max = 3;

        PlayerBlockBreakEvents.AFTER.register((world, player, pos, state, blockEntity) -> {
            if (FabricToolTags.PICKAXES.contains(player.getMainHandStack().getItem())) {
                    if (ArrayUtils.contains (StoneArray.STONES, state.getBlock ())) {
                        int rand_int1 = rand.nextInt (2);
                        if (rand_int1 == 0)
                            return;
                        else {
                            int rand_int2 = (int)Math.floor(Math.random()*(max-min+1)+min);
                            world.spawnEntity (new ExperienceOrbEntity (world, pos.getX () + 0.5, pos.getY () + 0.5, pos.getZ () + 0.5, rand_int2));
                        }
                    }
                }
            }
        );
    }
}
