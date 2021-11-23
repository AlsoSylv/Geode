package com.alsosylv.geode;

import com.alsosylv.geode.registry.GeodeConfig;
import com.alsosylv.geode.registry.StoneLootCall;
import com.alsosylv.geode.registry.StoneXpCall;

import net.fabricmc.api.ModInitializer;

public class Geode implements ModInitializer {
    public static final String MOD_ID = "stn";

    @Override
    public void onInitialize() {
        GeodeConfig.main ();
        StoneLootCall.modifyLootTables ();
        StoneXpCall.XpLootCall ();
    }
}
