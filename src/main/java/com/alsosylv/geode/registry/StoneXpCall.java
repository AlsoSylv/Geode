package com.alsosylv.geode.registry;

import com.electronwill.nightconfig.core.file.FileConfig;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.ExperienceOrbEntity;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public class StoneXpCall {

    public static void XpLootCall() {

        //I STG there has to be a better way that isn't reading the config here again
        File configFile = new File ("config/Geode.toml");
        FileConfig config = FileConfig.of(configFile);

        config.load();

        boolean dropXP = config.get ("dropXP");
        int min = config.get ("minXP");
        int max = config.get ("maxXP");
        int percent = config.get("percentXP");

        config.save();
        config.close();

        /*Check Order: Config set to false, Break block, Using Pickaxe, has Silk Touch, Breaking Stones.
        This should stop things from moving through the loop as early as possible.*/
        if (dropXP) {
            PlayerBlockBreakEvents.AFTER.register ((world, player, pos, state, blockEntity) -> {
                if (FabricToolTags.PICKAXES.contains (player.getMainHandStack ().getItem ())) {
                    if (EnchantmentHelper.getLevel (Enchantments.SILK_TOUCH, player.getMainHandStack ()) == 0) {
                        if (ArrayUtils.contains (StoneArray.STONES, state.getBlock ())) {
                            int rand_int = ThreadLocalRandom.current().nextInt(0, 101);
                            /*Use 100 - percent here in order to make it match the config number
                            As being over 100 - 51 (49) is a 51% chance.
                            There's probably a better way to do this*/
                            if (rand_int > 100 - percent) {
                                int rand_int2 = (int) Math.floor (Math.random () * (max - min + 1) + min);
                                world.spawnEntity (new ExperienceOrbEntity (world, pos.getX () + 0.5, pos.getY () + 0.5, pos.getZ () + 0.5, rand_int2));
                            }
                        }
                    }
                }
            });
        }
    }
}
