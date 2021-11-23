package com.alsosylv.geode.registry;

import com.electronwill.nightconfig.core.file.FileConfig;

import java.io.File;

public class GeodeConfig {
    public static void main() {
        File configFile = new File("config/Geode.toml");
        FileConfig config = FileConfig.of (configFile);
        config.load ();

        config.add ("dropXP", true);
        config.add ("minXP", 1);
        config.add ("maxXP", 3);
        config.add ("percentXP", 50);

        config.remove ("max XP");

        config.save();
        config.close();
    }
}