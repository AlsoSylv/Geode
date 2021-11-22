package com.alsosylv.geode.registry;

import com.electronwill.nightconfig.core.file.FileConfig;
import it.unimi.dsi.fastutil.Arrays;

import java.io.File;

public class GeodeConfig {
    public static void main() {
        File configFile = new File("config/Geode.toml");
        FileConfig config = FileConfig.of (configFile);
        config.load ();

        System.out.println ("Config:" + config);

        config.add ("dropXP", true);
        config.add ("max XP", 10);

        System.out.println ("Config:" + config);

        boolean dropXP = config.get ("dropXP");

        System.out.println (dropXP);

        config.save();
        config.close();
    }
}