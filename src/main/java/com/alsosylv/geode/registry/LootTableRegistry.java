package com.alsosylv.geode.registry;

import com.alsosylv.geode.Geode;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class LootTableRegistry {
    public static final Identifier Stone_Loot_Table_ID = Blocks.STONE.getLootTableId ();
    public static final Identifier Die_Loot_Table_ID = Blocks.DIORITE.getLootTableId ();
    public static final Identifier And_Loot_Table_ID = Blocks.ANDESITE.getLootTableId ();
    public static final Identifier Gran_Loot_Table_ID = Blocks.GRANITE.getLootTableId ();
    public static final Identifier Rum_loot_table_ID = new Identifier(Geode.MOD_ID, "blocks/rum");
    public static final Identifier Rack_Loot_Table_ID = Blocks.NETHERRACK.getLootTableId ();
    public static final Identifier Gin_Loot_Table_ID = new Identifier(Geode.MOD_ID, "blocks/gin");
    public static final Identifier Deep_Loot_Table_ID = Blocks.DEEPSLATE.getLootTableId ();
    public static final Identifier Tuff_Loot_Table_ID = Blocks.TUFF.getLootTableId ();
    public static final Identifier Drip_Loot_Table_ID = Blocks.DRIPSTONE_BLOCK.getLootTableId ();
}
