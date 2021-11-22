package com.alsosylv.geode.registry;

import com.electronwill.nightconfig.core.file.FileConfig;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ExperienceOrbEntity;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.util.Random;

public class StoneXpCall {

    public static void XpLootCall() {

        File configFile = new File ("config/Geode.toml");
        FileConfig config = FileConfig.of(configFile);

        config.load();

        boolean dropXP = config.get ("dropXP");

        config.save();
        config.close();

        Random rand = new Random ();
        int min = 1;
        int max = 3;


        PlayerBlockBreakEvents.AFTER.register ((world, player, pos, state, blockEntity) -> {
            if (dropXP) {
                if (FabricToolTags.PICKAXES.contains (player.getMainHandStack ().getItem ())) {
                    if (EnchantmentHelper.getLevel (Enchantments.SILK_TOUCH, player.getMainHandStack ()) == 0) {
                        if (ArrayUtils.contains (StoneArray.STONES, state.getBlock ())) {
                            int rand_int1 = rand.nextInt (2);
                            if (rand_int1 == 0) {
                                int rand_int2 = (int) Math.floor (Math.random () * (max - min + 1) + min);
                                world.spawnEntity (new ExperienceOrbEntity (world, pos.getX () + 0.5, pos.getY () + 0.5, pos.getZ () + 0.5, rand_int2));
                            }
                        }
                    }
                }
            }
        });
    }
}
