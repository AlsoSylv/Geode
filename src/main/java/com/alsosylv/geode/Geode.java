package com.alsosylv.geode;

import com.alsosylv.geode.registry.GeodeConfig;
import com.alsosylv.geode.registry.StoneLootCall;
import com.alsosylv.geode.registry.StoneXpCall;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Geode implements ModInitializer {
    public static final String MOD_ID = "stn";
    public static final Logger LOGGER = LogManager.getLogger ("Geode");


    @Override
    public void onInitialize() {
        GeodeConfig.main ();
        StoneLootCall.modifyLootTables ();
        StoneXpCall.XpLootCall ();
    }
}
