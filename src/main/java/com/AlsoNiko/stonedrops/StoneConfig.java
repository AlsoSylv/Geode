package com.AlsoNiko.stonedrops;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class StoneConfig {

    @me.shedaniel.autoconfig.annotation.Config(name = "stn")
    class ModConfig implements ConfigData {
        boolean toggleA = true;
        boolean toggleB = false;

        @ConfigEntry.Gui.CollapsibleObject
        InnerStuff stuff = new InnerStuff();

        @ConfigEntry.Gui.Excluded
        InnerStuff invisibleStuff = new InnerStuff();

        class InnerStuff {
            int a = 0;
            int b = 1;
        }
    }
}