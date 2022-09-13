package tw.org.anikaba.windliongod;

import org.bukkit.Material;

import java.util.Arrays;

/**
 * @author anikaba
 */

public enum ItemType {
    // 中文道具類型
    相思木船(Material.ACACIA_BOAT),
    相思木按鈕(Material.ACACIA_BUTTON),
    儲物箱相思木船(Material.ACACIA_CHEST_BOAT),
    相思木門(Material.ACACIA_DOOR),
    相思木柵欄(Material.ACACIA_FENCE),
    相思木柵欄門(Material.ACACIA_FENCE_GATE),
    相思木樹葉(Material.ACACIA_LEAVES),
    相思木原木(Material.ACACIA_LOG),
    相思木材(Material.ACACIA_PLANKS),
    相思木壓力板(Material.ACACIA_PRESSURE_PLATE),
    相思木樹苗(Material.ACACIA_SAPLING),
    相思木告示牌(Material.ACACIA_SIGN),
    相思木半磚(Material.ACACIA_SLAB),
    相思木階梯(Material.ACACIA_STAIRS),
    相思木地板門(Material.ACACIA_TRAPDOOR),
    相思木塊(Material.ACACIA_WOOD),
    觸發鐵軌(Material.ACTIVATOR_RAIL),
    悅靈生怪蛋(Material.ALLAY_SPAWN_EGG),
    紫紅球花(Material.ALLIUM),
    紫水晶方塊(Material.AMETHYST_BLOCK),
    紫水晶晶簇(Material.AMETHYST_CLUSTER),
    紫水晶碎片(Material.AMETHYST_SHARD),
    遠古遺骸(Material.ANCIENT_DEBRIS),
    安山岩(Material.ANDESITE),
    安山岩半磚(Material.ANDESITE_SLAB),
    安山岩階梯(Material.ANDESITE_STAIRS),
    安山岩牆(Material.ANDESITE_WALL),
    鐵砧(Material.ANVIL),
    蘋果(Material.APPLE),
    盔甲座(Material.ARMOR_STAND),
    箭矢(Material.ARROW),
    六角恐龍桶(Material.AXOLOTL_BUCKET),
    六角恐龍生怪蛋(Material.AXOLOTL_SPAWN_EGG),
    杜鵑叢(Material.AZALEA),
    杜鵑葉(Material.AZALEA_LEAVES),
    雛草(Material.AZURE_BLUET),
    烤馬鈴薯(Material.BAKED_POTATO),
    竹子(Material.BAMBOO),
    木桶(Material.BARREL),
    屏障(Material.BARRIER),
    玄武岩(Material.BASALT),
    蝙蝠生怪蛋(Material.BAT_SPAWN_EGG),
    烽火台(Material.BEACON),
    基岩(Material.BEDROCK),
    蜂窩(Material.BEE_NEST),
    蜜蜂生怪蛋(Material.BEE_SPAWN_EGG),
    生牛肉(Material.BEEF),
    蜂箱(Material.BEEHIVE),
    甜菜根(Material.BEETROOT),
    甜菜種子(Material.BEETROOT_SEEDS),
    甜菜湯(Material.BEETROOT_SOUP),
    鐘(Material.BELL),
    大懸葉草(Material.BIG_DRIPLEAF),
    樺木船(Material.BIRCH_BOAT),
    樺木按鈕(Material.BIRCH_BUTTON),
    儲物箱樺木船(Material.BIRCH_CHEST_BOAT),
    樺木門(Material.BIRCH_DOOR),
    樺木柵欄(Material.BIRCH_FENCE),
    樺木柵欄門(Material.BIRCH_FENCE_GATE),
    樺木樹葉(Material.BIRCH_LEAVES),
    樺木原木(Material.BIRCH_LOG),
    樺木材(Material.BIRCH_PLANKS),
    樺木壓力板(Material.BIRCH_PRESSURE_PLATE),
    樺木樹苗(Material.BIRCH_SAPLING),
    樺木告示牌(Material.BIRCH_SIGN),
    樺木半磚(Material.BIRCH_SLAB),
    樺木階梯(Material.BIRCH_STAIRS),
    樺木地板門(Material.BIRCH_TRAPDOOR),
    樺木塊(Material.BIRCH_WOOD),
    黑色旗幟(Material.BLACK_BANNER),
    黑色床(Material.BLACK_BED),
    黑色蠟燭(Material.BLACK_CANDLE),
    黑色地毯(Material.BLACK_CARPET),
    黑色混凝土(Material.BLACK_CONCRETE),
    黑色混凝土粉末(Material.BLACK_CONCRETE_POWDER),
    黑色染料(Material.BLACK_DYE),
    黑色釉陶(Material.BLACK_GLAZED_TERRACOTTA),
    黑色界伏盒(Material.BLACK_SHULKER_BOX),
    黑色玻璃(Material.BLACK_STAINED_GLASS),
    黑色玻璃片(Material.BLACK_STAINED_GLASS_PANE),
    黑色陶土(Material.BLACK_TERRACOTTA),
    黑色羊毛(Material.BLACK_WOOL),
    黑石(Material.BLACKSTONE),
    黑石半磚(Material.BLACKSTONE_SLAB),
    黑石階梯(Material.BLACKSTONE_STAIRS),
    黑石牆(Material.BLACKSTONE_WALL),
    高爐(Material.BLAST_FURNACE),
    烈焰粉(Material.BLAZE_POWDER),
    烈焰桿(Material.BLAZE_ROD),
    烈焰使者生怪蛋(Material.BLAZE_SPAWN_EGG),
    藍色旗幟(Material.BLUE_BANNER),
    藍色床(Material.BLUE_BED),
    藍色蠟燭(Material.BLUE_CANDLE),
    藍色地毯(Material.BLUE_CARPET),
    藍色混凝土(Material.BLUE_CONCRETE),
    藍色混凝土粉末(Material.BLUE_CONCRETE_POWDER),
    藍色染料(Material.BLUE_DYE),
    藍色釉陶(Material.BLUE_GLAZED_TERRACOTTA),
    藍冰(Material.BLUE_ICE),
    藍色蝴蝶蘭(Material.BLUE_ORCHID),
    藍色界伏盒(Material.BLUE_SHULKER_BOX),
    藍色玻璃(Material.BLUE_STAINED_GLASS),
    藍色玻璃片(Material.BLUE_STAINED_GLASS_PANE),
    藍色陶土(Material.BLUE_TERRACOTTA),
    藍色羊毛(Material.BLUE_WOOL),
    骨頭(Material.BONE),
    骨塊(Material.BONE_BLOCK),
    骨粉(Material.BONE_MEAL),
    書(Material.BOOK),
    書櫃(Material.BOOKSHELF),
    弓(Material.BOW),
    碗(Material.BOWL),
    腦珊瑚(Material.BRAIN_CORAL),
    腦珊瑚方塊(Material.BRAIN_CORAL_BLOCK),
    扇狀腦珊瑚(Material.BRAIN_CORAL_FAN),
    麵包(Material.BREAD),
    釀造台(Material.BREWING_STAND),
    紅磚頭(Material.BRICK),
    紅磚半磚(Material.BRICK_SLAB),
    紅磚階梯(Material.BRICK_STAIRS),
    紅磚牆(Material.BRICK_WALL),
    紅磚(Material.BRICKS),
    棕色旗幟(Material.BROWN_BANNER),
    棕色床(Material.BROWN_BED),
    棕色蠟燭(Material.BROWN_CANDLE),
    棕色地毯(Material.BROWN_CARPET),
    棕色混凝土(Material.BROWN_CONCRETE),
    棕色混凝土粉末(Material.BROWN_CONCRETE_POWDER),
    棕色染料(Material.BROWN_DYE),
    棕色釉陶(Material.BROWN_GLAZED_TERRACOTTA),
    棕色蘑菇(Material.BROWN_MUSHROOM),
    棕色蘑菇方塊(Material.BROWN_MUSHROOM_BLOCK),
    棕色界伏盒(Material.BROWN_SHULKER_BOX),
    棕色玻璃(Material.BROWN_STAINED_GLASS),
    棕色玻璃片(Material.BROWN_STAINED_GLASS_PANE),
    棕色陶土(Material.BROWN_TERRACOTTA),
    棕色羊毛(Material.BROWN_WOOL),
    氣泡珊瑚(Material.BUBBLE_CORAL),
    氣泡珊瑚方塊(Material.BUBBLE_CORAL_BLOCK),
    扇狀氣泡珊瑚(Material.BUBBLE_CORAL_FAN),
    鐵桶(Material.BUCKET),
    紫水晶芽床(Material.BUDDING_AMETHYST),
    束口袋(Material.BUNDLE),
    仙人掌(Material.CACTUS),
    蛋糕(Material.CAKE),
    方解石(Material.CALCITE),
    營火(Material.CAMPFIRE),
    蠟燭(Material.CANDLE),
    胡蘿蔔(Material.CARROT),
    胡蘿蔔釣竿(Material.CARROT_ON_A_STICK),
    製圖台(Material.CARTOGRAPHY_TABLE),
    雕刻過的南瓜(Material.CARVED_PUMPKIN),
    貓生怪蛋(Material.CAT_SPAWN_EGG),
    鍋釜(Material.CAULDRON),
    洞穴蜘蛛生怪蛋(Material.CAVE_SPIDER_SPAWN_EGG),
    鎖鏈(Material.CHAIN),
    連鎖式指令方塊(Material.CHAIN_COMMAND_BLOCK),
    鎖鏈靴子(Material.CHAINMAIL_BOOTS),
    鎖鏈胸甲(Material.CHAINMAIL_CHESTPLATE),
    鎖鏈頭盔(Material.CHAINMAIL_HELMET),
    鎖鏈護腿(Material.CHAINMAIL_LEGGINGS),
    木炭(Material.CHARCOAL),
    儲物箱(Material.CHEST),
    儲物箱礦車(Material.CHEST_MINECART),
    生雞肉(Material.CHICKEN),
    雞生怪蛋(Material.CHICKEN_SPAWN_EGG),
    微損的鐵砧(Material.CHIPPED_ANVIL),
    浮雕深板岩(Material.CHISELED_DEEPSLATE),
    浮雕地獄磚(Material.CHISELED_NETHER_BRICKS),
    浮雕拋光黑石(Material.CHISELED_POLISHED_BLACKSTONE),
    浮雕石英方塊(Material.CHISELED_QUARTZ_BLOCK),
    浮雕紅砂岩(Material.CHISELED_RED_SANDSTONE),
    浮雕砂岩(Material.CHISELED_SANDSTONE),
    浮雕石磚(Material.CHISELED_STONE_BRICKS),
    歌萊花(Material.CHORUS_FLOWER),
    歌萊果(Material.CHORUS_FRUIT),
    歌萊枝(Material.CHORUS_PLANT),
    黏土(Material.CLAY),
    黏土球(Material.CLAY_BALL),
    時鐘(Material.CLOCK),
    煤炭(Material.COAL),
    煤炭方塊(Material.COAL_BLOCK),
    煤礦(Material.COAL_ORE),
    粗泥(Material.COARSE_DIRT),
    深板岩碎石(Material.COBBLED_DEEPSLATE),
    碎深板岩半磚(Material.COBBLED_DEEPSLATE_SLAB),
    碎深板岩階梯(Material.COBBLED_DEEPSLATE_STAIRS),
    碎深板岩牆(Material.COBBLED_DEEPSLATE_WALL),
    鵝卵石(Material.COBBLESTONE),
    鵝卵石半磚(Material.COBBLESTONE_SLAB),
    鵝卵石階梯(Material.COBBLESTONE_STAIRS),
    鵝卵石牆(Material.COBBLESTONE_WALL),
    蜘蛛網(Material.COBWEB),
    可可豆(Material.COCOA_BEANS),
    生鱈魚(Material.COD),
    鱈魚桶(Material.COD_BUCKET),
    鱈魚生怪蛋(Material.COD_SPAWN_EGG),
    指令方塊(Material.COMMAND_BLOCK),
    指令方塊礦車(Material.COMMAND_BLOCK_MINECART),
    紅石比較器(Material.COMPARATOR),
    羅盤(Material.COMPASS),
    堆肥箱(Material.COMPOSTER),
    海靈核心(Material.CONDUIT),
    牛排(Material.COOKED_BEEF),
    烤雞(Material.COOKED_CHICKEN),
    烤鱈魚(Material.COOKED_COD),
    烤羊肉(Material.COOKED_MUTTON),
    烤豬肉(Material.COOKED_PORKCHOP),
    烤兔肉(Material.COOKED_RABBIT),
    烤鮭魚(Material.COOKED_SALMON),
    餅乾(Material.COOKIE),
    銅方塊(Material.COPPER_BLOCK),
    銅錠(Material.COPPER_INGOT),
    銅礦(Material.COPPER_ORE),
    矢車菊(Material.CORNFLOWER),
    牛生怪蛋(Material.COW_SPAWN_EGG),
    裂紋深板岩磚(Material.CRACKED_DEEPSLATE_BRICKS),
    裂紋深板岩磚瓦(Material.CRACKED_DEEPSLATE_TILES),
    裂紋地獄磚(Material.CRACKED_NETHER_BRICKS),
    裂紋拋光黑石磚(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS),
    裂紋石磚(Material.CRACKED_STONE_BRICKS),
    工作台(Material.CRAFTING_TABLE),
    苦力怕圖紋(Material.CREEPER_BANNER_PATTERN),
    苦力怕頭顱(Material.CREEPER_HEAD),
    苦力怕生怪蛋(Material.CREEPER_SPAWN_EGG),
    緋紅蕈木按鈕(Material.CRIMSON_BUTTON),
    緋紅蕈木門(Material.CRIMSON_DOOR),
    緋紅蕈木柵欄(Material.CRIMSON_FENCE),
    緋紅蕈木柵欄門(Material.CRIMSON_FENCE_GATE),
    緋紅蕈菇(Material.CRIMSON_FUNGUS),
    緋紅菌絲體(Material.CRIMSON_HYPHAE),
    緋紅菌絲石(Material.CRIMSON_NYLIUM),
    緋紅蕈木材(Material.CRIMSON_PLANKS),
    緋紅蕈木壓力板(Material.CRIMSON_PRESSURE_PLATE),
    緋紅蕈根(Material.CRIMSON_ROOTS),
    緋紅蕈木告示牌(Material.CRIMSON_SIGN),
    緋紅蕈木半磚(Material.CRIMSON_SLAB),
    緋紅蕈木階梯(Material.CRIMSON_STAIRS),
    緋紅蕈柄(Material.CRIMSON_STEM),
    緋紅蕈木地板門(Material.CRIMSON_TRAPDOOR),
    弩(Material.CROSSBOW),
    哭泣的黑曜石(Material.CRYING_OBSIDIAN),
    切製銅方塊(Material.CUT_COPPER),
    切製銅半磚(Material.CUT_COPPER_SLAB),
    切製銅階梯(Material.CUT_COPPER_STAIRS),
    切製紅砂岩(Material.CUT_RED_SANDSTONE),
    切製紅砂岩半磚(Material.CUT_RED_SANDSTONE_SLAB),
    切製砂岩(Material.CUT_SANDSTONE),
    切製砂岩半磚(Material.CUT_SANDSTONE_SLAB),
    青色旗幟(Material.CYAN_BANNER),
    青色床(Material.CYAN_BED),
    青色蠟燭(Material.CYAN_CANDLE),
    青色地毯(Material.CYAN_CARPET),
    青色混凝土(Material.CYAN_CONCRETE),
    青色混凝土粉末(Material.CYAN_CONCRETE_POWDER),
    青色染料(Material.CYAN_DYE),
    青色釉陶(Material.CYAN_GLAZED_TERRACOTTA),
    青色界伏盒(Material.CYAN_SHULKER_BOX),
    青色玻璃(Material.CYAN_STAINED_GLASS),
    青色玻璃片(Material.CYAN_STAINED_GLASS_PANE),
    青色陶土(Material.CYAN_TERRACOTTA),
    青色羊毛(Material.CYAN_WOOL),
    耗損的鐵砧(Material.DAMAGED_ANVIL),
    蒲公英(Material.DANDELION),
    黑橡木船(Material.DARK_OAK_BOAT),
    黑橡木按鈕(Material.DARK_OAK_BUTTON),
    儲物箱黑橡木船(Material.DARK_OAK_CHEST_BOAT),
    黑橡木門(Material.DARK_OAK_DOOR),
    黑橡木柵欄(Material.DARK_OAK_FENCE),
    黑橡木柵欄門(Material.DARK_OAK_FENCE_GATE),
    黑橡木樹葉(Material.DARK_OAK_LEAVES),
    黑橡木原木(Material.DARK_OAK_LOG),
    黑橡木材(Material.DARK_OAK_PLANKS),
    黑橡木壓力板(Material.DARK_OAK_PRESSURE_PLATE),
    黑橡木樹苗(Material.DARK_OAK_SAPLING),
    黑橡木告示牌(Material.DARK_OAK_SIGN),
    黑橡木半磚(Material.DARK_OAK_SLAB),
    黑橡木階梯(Material.DARK_OAK_STAIRS),
    黑橡木地板門(Material.DARK_OAK_TRAPDOOR),
    黑橡木塊(Material.DARK_OAK_WOOD),
    暗海磷石(Material.DARK_PRISMARINE),
    暗海磷石半磚(Material.DARK_PRISMARINE_SLAB),
    暗海磷石階梯(Material.DARK_PRISMARINE_STAIRS),
    日光感測器(Material.DAYLIGHT_DETECTOR),
    死亡的腦珊瑚(Material.DEAD_BRAIN_CORAL),
    死亡的腦珊瑚方塊(Material.DEAD_BRAIN_CORAL_BLOCK),
    死亡的扇狀腦珊瑚(Material.DEAD_BRAIN_CORAL_FAN),
    死亡的氣泡珊瑚(Material.DEAD_BUBBLE_CORAL),
    死亡的氣泡珊瑚方塊(Material.DEAD_BUBBLE_CORAL_BLOCK),
    死亡的扇狀氣泡珊瑚(Material.DEAD_BUBBLE_CORAL_FAN),
    枯灌木(Material.DEAD_BUSH),
    死亡的火珊瑚(Material.DEAD_FIRE_CORAL),
    死亡的火珊瑚方塊(Material.DEAD_FIRE_CORAL_BLOCK),
    死亡的扇狀火珊瑚(Material.DEAD_FIRE_CORAL_FAN),
    死亡的角珊瑚(Material.DEAD_HORN_CORAL),
    死亡的角珊瑚方塊(Material.DEAD_HORN_CORAL_BLOCK),
    死亡的扇狀角珊瑚(Material.DEAD_HORN_CORAL_FAN),
    死亡的管珊瑚(Material.DEAD_TUBE_CORAL),
    死亡的管珊瑚方塊(Material.DEAD_TUBE_CORAL_BLOCK),
    死亡的扇狀管珊瑚(Material.DEAD_TUBE_CORAL_FAN),
    除錯棒(Material.DEBUG_STICK),
    深板岩(Material.DEEPSLATE),
    深板岩磚半磚(Material.DEEPSLATE_BRICK_SLAB),
    深板岩磚階梯(Material.DEEPSLATE_BRICK_STAIRS),
    深板岩磚牆(Material.DEEPSLATE_BRICK_WALL),
    深板岩磚(Material.DEEPSLATE_BRICKS),
    深板岩煤礦(Material.DEEPSLATE_COAL_ORE),
    深板岩銅礦(Material.DEEPSLATE_COPPER_ORE),
    深板岩鑽石礦(Material.DEEPSLATE_DIAMOND_ORE),
    深板岩綠寶石礦(Material.DEEPSLATE_EMERALD_ORE),
    深板岩金礦(Material.DEEPSLATE_GOLD_ORE),
    深板岩鐵礦(Material.DEEPSLATE_IRON_ORE),
    深板岩青金石礦(Material.DEEPSLATE_LAPIS_ORE),
    深板岩紅石礦(Material.DEEPSLATE_REDSTONE_ORE),
    深板岩磚瓦半磚(Material.DEEPSLATE_TILE_SLAB),
    深板岩磚瓦階梯(Material.DEEPSLATE_TILE_STAIRS),
    深板岩磚瓦牆(Material.DEEPSLATE_TILE_WALL),
    深板岩磚瓦(Material.DEEPSLATE_TILES),
    感測鐵軌(Material.DETECTOR_RAIL),
    鑽石(Material.DIAMOND),
    鑽石斧(Material.DIAMOND_AXE),
    鑽石方塊(Material.DIAMOND_BLOCK),
    鑽石靴子(Material.DIAMOND_BOOTS),
    鑽石胸甲(Material.DIAMOND_CHESTPLATE),
    鑽石頭盔(Material.DIAMOND_HELMET),
    鑽石鋤(Material.DIAMOND_HOE),
    鑽石製馬鎧(Material.DIAMOND_HORSE_ARMOR),
    鑽石護腿(Material.DIAMOND_LEGGINGS),
    鑽石礦(Material.DIAMOND_ORE),
    鑽石鎬(Material.DIAMOND_PICKAXE),
    鑽石鏟(Material.DIAMOND_SHOVEL),
    鑽石劍(Material.DIAMOND_SWORD),
    閃長岩(Material.DIORITE),
    閃長岩半磚(Material.DIORITE_SLAB),
    閃長岩階梯(Material.DIORITE_STAIRS),
    閃長岩牆(Material.DIORITE_WALL),
    泥土(Material.DIRT),
    土徑(Material.DIRT_PATH),
    唱片碎片(Material.DISC_FRAGMENT_5),
    發射器(Material.DISPENSER),
    海豚生怪蛋(Material.DOLPHIN_SPAWN_EGG),
    驢子生怪蛋(Material.DONKEY_SPAWN_EGG),
    龍之吐息(Material.DRAGON_BREATH),
    龍蛋(Material.DRAGON_EGG),
    龍首(Material.DRAGON_HEAD),
    海帶乾(Material.DRIED_KELP),
    海帶乾塊(Material.DRIED_KELP_BLOCK),
    鐘乳石方塊(Material.DRIPSTONE_BLOCK),
    投擲器(Material.DROPPER),
    沉屍生怪蛋(Material.DROWNED_SPAWN_EGG),
    回聲碎片(Material.ECHO_SHARD),
    雞蛋(Material.EGG),
    遠古深海守衛生怪蛋(Material.ELDER_GUARDIAN_SPAWN_EGG),
    鞘翅(Material.ELYTRA),
    綠寶石(Material.EMERALD),
    綠寶石方塊(Material.EMERALD_BLOCK),
    綠寶石礦(Material.EMERALD_ORE),
    附魔書(Material.ENCHANTED_BOOK),
    附魔金蘋果(Material.ENCHANTED_GOLDEN_APPLE),
    附魔台(Material.ENCHANTING_TABLE),
    終界水晶(Material.END_CRYSTAL),
    終界傳送門框架(Material.END_PORTAL_FRAME),
    終界燭(Material.END_ROD),
    終界石(Material.END_STONE),
    終界石磚半磚(Material.END_STONE_BRICK_SLAB),
    終界石磚階梯(Material.END_STONE_BRICK_STAIRS),
    終界石磚牆(Material.END_STONE_BRICK_WALL),
    終界石磚(Material.END_STONE_BRICKS),
    終界箱(Material.ENDER_CHEST),
    終界之眼(Material.ENDER_EYE),
    終界珍珠(Material.ENDER_PEARL),
    終界使者生怪蛋(Material.ENDERMAN_SPAWN_EGG),
    終界蟎生怪蛋(Material.ENDERMITE_SPAWN_EGG),
    喚魔者生怪蛋(Material.EVOKER_SPAWN_EGG),
    經驗瓶(Material.EXPERIENCE_BOTTLE),
    斑駁的銅方塊(Material.EXPOSED_COPPER),
    斑駁的切製銅方塊(Material.EXPOSED_CUT_COPPER),
    斑駁的切製銅半磚(Material.EXPOSED_CUT_COPPER_SLAB),
    斑駁的切製銅階梯(Material.EXPOSED_CUT_COPPER_STAIRS),
    耕地(Material.FARMLAND),
    羽毛(Material.FEATHER),
    發酵蜘蛛眼(Material.FERMENTED_SPIDER_EYE),
    蕨(Material.FERN),
    地圖(Material.FILLED_MAP),
    火焰彈(Material.FIRE_CHARGE),
    火珊瑚(Material.FIRE_CORAL),
    火珊瑚方塊(Material.FIRE_CORAL_BLOCK),
    扇狀火珊瑚(Material.FIRE_CORAL_FAN),
    煙火(Material.FIREWORK_ROCKET),
    火藥球(Material.FIREWORK_STAR),
    釣竿(Material.FISHING_ROD),
    製箭台(Material.FLETCHING_TABLE),
    燧石(Material.FLINT),
    打火石(Material.FLINT_AND_STEEL),
    花朵圖紋(Material.FLOWER_BANNER_PATTERN),
    花盆(Material.FLOWER_POT),
    開花的杜鵑叢(Material.FLOWERING_AZALEA),
    開花的杜鵑葉(Material.FLOWERING_AZALEA_LEAVES),
    狐狸生怪蛋(Material.FOX_SPAWN_EGG),
    青蛙生怪蛋(Material.FROG_SPAWN_EGG),
    青蛙卵(Material.FROGSPAWN),
    熔爐(Material.FURNACE),
    熔爐礦車(Material.FURNACE_MINECART),
    地獄幽靈生怪蛋(Material.GHAST_SPAWN_EGG),
    幽靈之淚(Material.GHAST_TEAR),
    鑲金黑石(Material.GILDED_BLACKSTONE),
    玻璃(Material.GLASS),
    玻璃瓶(Material.GLASS_BOTTLE),
    玻璃片(Material.GLASS_PANE),
    鑲金西瓜片(Material.GLISTERING_MELON_SLICE),
    地球(Material.GLOBE_BANNER_PATTERN),
    螢光莓(Material.GLOW_BERRIES),
    螢光墨囊(Material.GLOW_INK_SAC),
    螢光物品展示框(Material.GLOW_ITEM_FRAME),
    發光地衣(Material.GLOW_LICHEN),
    螢光魷魚生怪蛋(Material.GLOW_SQUID_SPAWN_EGG),
    螢光石(Material.GLOWSTONE),
    螢石粉(Material.GLOWSTONE_DUST),
    山羊角(Material.GOAT_HORN),
    山羊生怪蛋(Material.GOAT_SPAWN_EGG),
    黃金方塊(Material.GOLD_BLOCK),
    金錠(Material.GOLD_INGOT),
    金粒(Material.GOLD_NUGGET),
    金礦(Material.GOLD_ORE),
    金蘋果(Material.GOLDEN_APPLE),
    金斧(Material.GOLDEN_AXE),
    黃金靴子(Material.GOLDEN_BOOTS),
    金胡蘿蔔(Material.GOLDEN_CARROT),
    黃金胸甲(Material.GOLDEN_CHESTPLATE),
    黃金頭盔(Material.GOLDEN_HELMET),
    金鋤(Material.GOLDEN_HOE),
    黃金製馬鎧(Material.GOLDEN_HORSE_ARMOR),
    黃金護腿(Material.GOLDEN_LEGGINGS),
    金鎬(Material.GOLDEN_PICKAXE),
    金鏟(Material.GOLDEN_SHOVEL),
    金劍(Material.GOLDEN_SWORD),
    花崗岩(Material.GRANITE),
    花崗岩半磚(Material.GRANITE_SLAB),
    花崗岩階梯(Material.GRANITE_STAIRS),
    花崗岩牆(Material.GRANITE_WALL),
    草(Material.GRASS),
    草地(Material.GRASS_BLOCK),
    礫石(Material.GRAVEL),
    灰色旗幟(Material.GRAY_BANNER),
    灰色床(Material.GRAY_BED),
    灰色蠟燭(Material.GRAY_CANDLE),
    灰色地毯(Material.GRAY_CARPET),
    灰色混凝土(Material.GRAY_CONCRETE),
    灰色混凝土粉末(Material.GRAY_CONCRETE_POWDER),
    灰色染料(Material.GRAY_DYE),
    灰色釉陶(Material.GRAY_GLAZED_TERRACOTTA),
    灰色界伏盒(Material.GRAY_SHULKER_BOX),
    灰色玻璃(Material.GRAY_STAINED_GLASS),
    灰色玻璃片(Material.GRAY_STAINED_GLASS_PANE),
    灰色陶土(Material.GRAY_TERRACOTTA),
    灰色羊毛(Material.GRAY_WOOL),
    綠色旗幟(Material.GREEN_BANNER),
    綠色床(Material.GREEN_BED),
    綠色蠟燭(Material.GREEN_CANDLE),
    綠色地毯(Material.GREEN_CARPET),
    綠色混凝土(Material.GREEN_CONCRETE),
    綠色混凝土粉末(Material.GREEN_CONCRETE_POWDER),
    綠色染料(Material.GREEN_DYE),
    綠色釉陶(Material.GREEN_GLAZED_TERRACOTTA),
    綠色界伏盒(Material.GREEN_SHULKER_BOX),
    綠色玻璃(Material.GREEN_STAINED_GLASS),
    綠色玻璃片(Material.GREEN_STAINED_GLASS_PANE),
    綠色陶土(Material.GREEN_TERRACOTTA),
    綠色羊毛(Material.GREEN_WOOL),
    砂輪(Material.GRINDSTONE),
    深海守衛生怪蛋(Material.GUARDIAN_SPAWN_EGG),
    火藥(Material.GUNPOWDER),
    懸根(Material.HANGING_ROOTS),
    乾草捆(Material.HAY_BLOCK),
    海洋之心(Material.HEART_OF_THE_SEA),
    重質測重壓力板(Material.HEAVY_WEIGHTED_PRESSURE_PLATE),
    豬布獸生怪蛋(Material.HOGLIN_SPAWN_EGG),
    蜂蜜塊(Material.HONEY_BLOCK),
    蜂蜜瓶(Material.HONEY_BOTTLE),
    蜂巢(Material.HONEYCOMB),
    蜂巢塊(Material.HONEYCOMB_BLOCK),
    漏斗(Material.HOPPER),
    漏斗礦車(Material.HOPPER_MINECART),
    角珊瑚(Material.HORN_CORAL),
    角珊瑚方塊(Material.HORN_CORAL_BLOCK),
    扇狀角珊瑚(Material.HORN_CORAL_FAN),
    馬生怪蛋(Material.HORSE_SPAWN_EGG),
    屍殼生怪蛋(Material.HUSK_SPAWN_EGG),
    冰(Material.ICE),
    蛀蝕的浮雕石磚(Material.INFESTED_CHISELED_STONE_BRICKS),
    蛀蝕的鵝卵石(Material.INFESTED_COBBLESTONE),
    蛀蝕的裂紋石磚(Material.INFESTED_CRACKED_STONE_BRICKS),
    蛀蝕的深板岩(Material.INFESTED_DEEPSLATE),
    蛀蝕的青苔石磚(Material.INFESTED_MOSSY_STONE_BRICKS),
    蛀蝕的石頭(Material.INFESTED_STONE),
    蛀蝕的石磚(Material.INFESTED_STONE_BRICKS),
    墨囊(Material.INK_SAC),
    鐵斧(Material.IRON_AXE),
    鐵柵欄(Material.IRON_BARS),
    鐵方塊(Material.IRON_BLOCK),
    鐵製靴子(Material.IRON_BOOTS),
    鐵製胸甲(Material.IRON_CHESTPLATE),
    鐵門(Material.IRON_DOOR),
    鐵製頭盔(Material.IRON_HELMET),
    鐵鋤(Material.IRON_HOE),
    鐵製馬鎧(Material.IRON_HORSE_ARMOR),
    鐵錠(Material.IRON_INGOT),
    鐵製護腿(Material.IRON_LEGGINGS),
    鐵粒(Material.IRON_NUGGET),
    鐵礦(Material.IRON_ORE),
    鐵鎬(Material.IRON_PICKAXE),
    鐵鏟(Material.IRON_SHOVEL),
    鐵劍(Material.IRON_SWORD),
    鐵製地板門(Material.IRON_TRAPDOOR),
    物品展示框(Material.ITEM_FRAME),
    南瓜燈(Material.JACK_O_LANTERN),
    拼圖方塊(Material.JIGSAW),
    唱片機(Material.JUKEBOX),
    叢林木船(Material.JUNGLE_BOAT),
    叢林木按鈕(Material.JUNGLE_BUTTON),
    儲物箱叢林木船(Material.JUNGLE_CHEST_BOAT),
    叢林木門(Material.JUNGLE_DOOR),
    叢林木柵欄(Material.JUNGLE_FENCE),
    叢林木柵欄門(Material.JUNGLE_FENCE_GATE),
    叢林木樹葉(Material.JUNGLE_LEAVES),
    叢林木原木(Material.JUNGLE_LOG),
    叢林木材(Material.JUNGLE_PLANKS),
    叢林木壓力板(Material.JUNGLE_PRESSURE_PLATE),
    叢林木樹苗(Material.JUNGLE_SAPLING),
    叢林木告示牌(Material.JUNGLE_SIGN),
    叢林木半磚(Material.JUNGLE_SLAB),
    叢林木階梯(Material.JUNGLE_STAIRS),
    叢林木地板門(Material.JUNGLE_TRAPDOOR),
    叢林木塊(Material.JUNGLE_WOOD),
    海帶(Material.KELP),
    知識之書(Material.KNOWLEDGE_BOOK),
    梯子(Material.LADDER),
    燈籠(Material.LANTERN),
    青金石方塊(Material.LAPIS_BLOCK),
    青金石(Material.LAPIS_LAZULI),
    青金石礦(Material.LAPIS_ORE),
    大型紫水晶芽(Material.LARGE_AMETHYST_BUD),
    大型蕨類(Material.LARGE_FERN),
    熔岩桶(Material.LAVA_BUCKET),
    拴繩(Material.LEAD),
    皮革(Material.LEATHER),
    皮革靴子(Material.LEATHER_BOOTS),
    皮革上衣(Material.LEATHER_CHESTPLATE),
    皮革帽子(Material.LEATHER_HELMET),
    皮革製馬鎧(Material.LEATHER_HORSE_ARMOR),
    皮革褲子(Material.LEATHER_LEGGINGS),
    講台(Material.LECTERN),
    控制桿(Material.LEVER),
    光源(Material.LIGHT),
    淺藍色旗幟(Material.LIGHT_BLUE_BANNER),
    淺藍色床(Material.LIGHT_BLUE_BED),
    淺藍色蠟燭(Material.LIGHT_BLUE_CANDLE),
    淺藍色地毯(Material.LIGHT_BLUE_CARPET),
    淺藍色混凝土(Material.LIGHT_BLUE_CONCRETE),
    淺藍色混凝土粉末(Material.LIGHT_BLUE_CONCRETE_POWDER),
    淺藍色染料(Material.LIGHT_BLUE_DYE),
    淺藍色釉陶(Material.LIGHT_GRAY_GLAZED_TERRACOTTA),
    淺藍色界伏盒(Material.LIGHT_BLUE_SHULKER_BOX),
    淺藍色玻璃(Material.LIGHT_BLUE_STAINED_GLASS),
    淺藍色玻璃片(Material.LIGHT_BLUE_STAINED_GLASS_PANE),
    淺藍色陶土(Material.LIGHT_BLUE_TERRACOTTA),
    淺藍色羊毛(Material.LIGHT_BLUE_WOOL),
    淺灰色旗幟(Material.LIGHT_GRAY_BANNER),
    淺灰色床(Material.LIGHT_GRAY_BED),
    淺灰色蠟燭(Material.LIGHT_GRAY_CANDLE),
    淺灰色地毯(Material.LIGHT_GRAY_CARPET),
    淺灰色混凝土(Material.LIGHT_GRAY_CONCRETE),
    淺灰色混凝土粉末(Material.LIGHT_GRAY_CONCRETE_POWDER),
    淺灰色染料(Material.LIGHT_GRAY_DYE),
    淺灰色釉陶(Material.LIGHT_BLUE_GLAZED_TERRACOTTA),
    淺灰色界伏盒(Material.LIGHT_GRAY_SHULKER_BOX),
    淺灰色玻璃(Material.LIGHT_GRAY_STAINED_GLASS),
    淺灰色玻璃片(Material.LIGHT_GRAY_STAINED_GLASS_PANE),
    淺灰色陶土(Material.LIGHT_GRAY_TERRACOTTA),
    淺灰色羊毛(Material.LIGHT_GRAY_WOOL),
    輕質測重壓力板(Material.LIGHT_WEIGHTED_PRESSURE_PLATE),
    避雷針(Material.LIGHTNING_ROD),
    紫丁香(Material.LILAC),
    鈴蘭(Material.LILY_OF_THE_VALLEY),
    荷葉(Material.LILY_PAD),
    淺綠色旗幟(Material.LIME_BANNER),
    淺綠色床(Material.LIME_BED),
    淺綠色蠟燭(Material.LIME_CANDLE),
    淺綠色地毯(Material.LIME_CARPET),
    淺綠色混凝土(Material.LIME_CONCRETE),
    淺綠色混凝土粉末(Material.LIME_CONCRETE_POWDER),
    淺綠色染料(Material.LIME_DYE),
    淺綠色釉陶(Material.LIME_GLAZED_TERRACOTTA),
    淺綠色界伏盒(Material.LIME_SHULKER_BOX),
    淺綠色玻璃(Material.LIME_STAINED_GLASS),
    淺綠色玻璃片(Material.LIME_STAINED_GLASS_PANE),
    淺綠色陶土(Material.LIME_TERRACOTTA),
    淺綠色羊毛(Material.LIME_WOOL),
    滯留藥水(Material.LINGERING_POTION),
    駱馬生怪蛋(Material.LLAMA_SPAWN_EGG),
    磁石(Material.LODESTONE),
    紡織機(Material.LOOM),
    洋紅色旗幟(Material.MAGENTA_BANNER),
    洋紅色床(Material.MAGENTA_BED),
    洋紅色蠟燭(Material.MAGENTA_CANDLE),
    洋紅色地毯(Material.MAGENTA_CARPET),
    洋紅色混凝土(Material.MAGENTA_CONCRETE),
    洋紅色混凝土粉末(Material.MAGENTA_CONCRETE_POWDER),
    洋紅色染料(Material.MAGENTA_DYE),
    洋紅色釉陶(Material.MAGENTA_GLAZED_TERRACOTTA),
    洋紅色界伏盒(Material.MAGENTA_SHULKER_BOX),
    洋紅色玻璃(Material.MAGENTA_STAINED_GLASS),
    洋紅色玻璃片(Material.MAGENTA_STAINED_GLASS_PANE),
    洋紅色陶土(Material.MAGENTA_TERRACOTTA),
    洋紅色羊毛(Material.MAGENTA_WOOL),
    岩漿塊(Material.MAGMA_BLOCK),
    岩漿球(Material.MAGMA_CREAM),
    岩漿立方怪生怪蛋(Material.MAGMA_CUBE_SPAWN_EGG),
    紅樹林木船(Material.MANGROVE_BOAT),
    紅樹林木按鈕(Material.MANGROVE_BUTTON),
    儲物箱紅樹林木船(Material.MANGROVE_CHEST_BOAT),
    紅樹林木門(Material.MANGROVE_DOOR),
    紅樹林木柵欄(Material.MANGROVE_FENCE),
    紅樹林木柵欄門(Material.MANGROVE_FENCE_GATE),
    紅樹林木樹葉(Material.MANGROVE_LEAVES),
    紅樹林木原木(Material.MANGROVE_LOG),
    紅樹林木材(Material.MANGROVE_PLANKS),
    紅樹林木壓力板(Material.MANGROVE_PRESSURE_PLATE),
    紅樹林木胎生苗(Material.MANGROVE_PROPAGULE),
    紅樹林木根(Material.MANGROVE_ROOTS),
    紅樹林木告示牌(Material.MANGROVE_SIGN),
    紅樹林木半磚(Material.MANGROVE_SLAB),
    紅樹林木階梯(Material.MANGROVE_STAIRS),
    紅樹林木地板門(Material.MANGROVE_TRAPDOOR),
    紅樹林木塊(Material.MANGROVE_WOOD),
    空白地圖(Material.MAP),
    中型紫水晶芽(Material.MEDIUM_AMETHYST_BUD),
    西瓜(Material.MELON),
    西瓜種子(Material.MELON_SEEDS),
    西瓜片(Material.MELON_SLICE),
    鮮奶桶(Material.MILK_BUCKET),
    礦車(Material.MINECART),
    Mojang圖紋(Material.MOJANG_BANNER_PATTERN),
    哞菇生怪蛋(Material.MOOSHROOM_SPAWN_EGG),
    苔蘚方塊(Material.MOSS_BLOCK),
    覆地苔蘚(Material.MOSS_CARPET),
    青苔鵝卵石(Material.MOSSY_COBBLESTONE),
    青苔鵝卵石半磚(Material.MOSSY_COBBLESTONE_SLAB),
    青苔鵝卵石階梯(Material.MOSSY_COBBLESTONE_STAIRS),
    青苔鵝卵石牆(Material.MOSSY_COBBLESTONE_WALL),
    青苔石磚半磚(Material.MOSSY_STONE_BRICK_SLAB),
    青苔石磚階梯(Material.MOSSY_STONE_BRICK_STAIRS),
    青苔石磚牆(Material.MOSSY_STONE_BRICK_WALL),
    青苔石磚(Material.MOSSY_STONE_BRICKS),
    泥巴(Material.MUD),
    泥磚半磚(Material.MUD_BRICK_SLAB),
    泥磚階梯(Material.MUD_BRICK_STAIRS),
    泥磚牆(Material.MUD_BRICK_WALL),
    泥磚(Material.MUD_BRICKS),
    淤泥紅樹林木根(Material.MUDDY_MANGROVE_ROOTS),
    騾子生怪蛋(Material.MULE_SPAWN_EGG),
    蘑菇柄(Material.MUSHROOM_STEM),
    蘑菇湯(Material.MUSHROOM_STEW),
    唱片11(Material.MUSIC_DISC_11),
    唱片13(Material.MUSIC_DISC_13),
    唱片5(Material.MUSIC_DISC_5),
    唱片blocks(Material.MUSIC_DISC_BLOCKS),
    唱片cat(Material.MUSIC_DISC_CAT),
    唱片chirp(Material.MUSIC_DISC_CHIRP),
    唱片far(Material.MUSIC_DISC_FAR),
    唱片mall(Material.MUSIC_DISC_MALL),
    唱片mellohi(Material.MUSIC_DISC_MELLOHI),
    唱片otherside(Material.MUSIC_DISC_OTHERSIDE),
    唱片Pigstep(Material.MUSIC_DISC_PIGSTEP),
    唱片stal(Material.MUSIC_DISC_STAL),
    唱片strad(Material.MUSIC_DISC_STRAD),
    唱片wait(Material.MUSIC_DISC_WAIT),
    唱片ward(Material.MUSIC_DISC_WARD),
    生羊肉(Material.MUTTON),
    菌絲土(Material.MYCELIUM),
    命名牌(Material.NAME_TAG),
    鸚鵡螺殼(Material.NAUTILUS_SHELL),
    地獄磚頭(Material.NETHER_BRICK),
    地獄磚柵欄(Material.NETHER_BRICK_FENCE),
    地獄磚半磚(Material.NETHER_BRICK_SLAB),
    地獄磚階梯(Material.NETHER_BRICK_STAIRS),
    地獄磚牆(Material.NETHER_BRICK_WALL),
    地獄磚(Material.NETHER_BRICKS),
    地獄金礦(Material.NETHER_GOLD_ORE),
    地獄石英礦(Material.NETHER_QUARTZ_ORE),
    地獄芽(Material.NETHER_SPROUTS),
    地獄之星(Material.NETHER_STAR),
    地獄疙瘩(Material.NETHER_WART),
    地獄疙瘩塊(Material.NETHER_WART_BLOCK),
    獄髓斧(Material.NETHERITE_AXE),
    獄髓方塊(Material.NETHERITE_BLOCK),
    獄髓靴子(Material.NETHERITE_BOOTS),
    獄髓胸甲(Material.NETHERITE_CHESTPLATE),
    獄髓頭盔(Material.NETHERITE_HELMET),
    獄髓鋤(Material.NETHERITE_HOE),
    獄髓錠(Material.NETHERITE_INGOT),
    獄髓護腿(Material.NETHERITE_LEGGINGS),
    獄髓鎬(Material.NETHERITE_PICKAXE),
    獄髓碎片(Material.NETHERITE_SCRAP),
    獄髓鏟(Material.NETHERITE_SHOVEL),
    獄髓劍(Material.NETHERITE_SWORD),
    地獄石(Material.NETHERRACK),
    音階盒(Material.NOTE_BLOCK),
    橡木船(Material.OAK_BOAT),
    橡木按鈕(Material.OAK_BUTTON),
    儲物箱橡木船(Material.OAK_CHEST_BOAT),
    橡木門(Material.OAK_DOOR),
    橡木柵欄(Material.OAK_FENCE),
    橡木柵欄門(Material.OAK_FENCE_GATE),
    橡木樹葉(Material.OAK_LEAVES),
    橡木原木(Material.OAK_LOG),
    橡木材(Material.OAK_PLANKS),
    橡木壓力板(Material.OAK_PRESSURE_PLATE),
    橡木樹苗(Material.OAK_SAPLING),
    橡木告示牌(Material.OAK_SIGN),
    橡木半磚(Material.OAK_SLAB),
    橡木階梯(Material.OAK_STAIRS),
    橡木地板門(Material.OAK_TRAPDOOR),
    橡木塊(Material.OAK_WOOD),
    偵測器(Material.OBSERVER),
    黑曜石(Material.OBSIDIAN),
    山貓生怪蛋(Material.OCELOT_SPAWN_EGG),
    赭黃蛙光體(Material.OCHRE_FROGLIGHT),
    橙色旗幟(Material.ORANGE_BANNER),
    橙色床(Material.ORANGE_BED),
    橙色蠟燭(Material.ORANGE_CANDLE),
    橙色地毯(Material.ORANGE_CARPET),
    橙色混凝土(Material.ORANGE_CONCRETE),
    橙色混凝土粉末(Material.ORANGE_CONCRETE_POWDER),
    橙色染料(Material.ORANGE_DYE),
    橙色釉陶(Material.ORANGE_GLAZED_TERRACOTTA),
    橙色界伏盒(Material.ORANGE_SHULKER_BOX),
    橙色玻璃(Material.ORANGE_STAINED_GLASS),
    橙色玻璃片(Material.ORANGE_STAINED_GLASS_PANE),
    橙色陶土(Material.ORANGE_TERRACOTTA),
    橙色鬱金香(Material.ORANGE_TULIP),
    橙色羊毛(Material.ORANGE_WOOL),
    雛菊(Material.OXEYE_DAISY),
    氧化的銅方塊(Material.OXIDIZED_COPPER),
    氧化的切製銅方塊(Material.OXIDIZED_CUT_COPPER),
    氧化的切製銅半磚(Material.OXIDIZED_CUT_COPPER_SLAB),
    氧化的切製銅階梯(Material.OXIDIZED_CUT_COPPER_STAIRS),
    冰磚(Material.PACKED_ICE),
    泥坯(Material.PACKED_MUD),
    繪畫(Material.PAINTING),
    貓熊生怪蛋(Material.PANDA_SPAWN_EGG),
    紙(Material.PAPER),
    鸚鵡生怪蛋(Material.PARROT_SPAWN_EGG),
    珠紫蛙光體(Material.PEARLESCENT_FROGLIGHT),
    牡丹花(Material.PEONY),
    石化橡木半磚(Material.PETRIFIED_OAK_SLAB),
    夜魅皮膜(Material.PHANTOM_MEMBRANE),
    夜魅生怪蛋(Material.PHANTOM_SPAWN_EGG),
    豬生怪蛋(Material.PIG_SPAWN_EGG),
    豬鼻(Material.PIGLIN_BANNER_PATTERN),
    豬布林蠻兵生怪蛋(Material.PIGLIN_BRUTE_SPAWN_EGG),
    豬布林生怪蛋(Material.PIGLIN_SPAWN_EGG),
    掠奪者生怪蛋(Material.PILLAGER_SPAWN_EGG),
    粉紅色旗幟(Material.PINK_BANNER),
    粉紅色床(Material.PINK_BED),
    粉紅色蠟燭(Material.PINK_CANDLE),
    粉紅色地毯(Material.PINK_CARPET),
    粉紅色混凝土(Material.PINK_CONCRETE),
    粉紅色混凝土粉末(Material.PINK_CONCRETE_POWDER),
    粉紅色染料(Material.PINK_DYE),
    粉紅色釉陶(Material.PINK_GLAZED_TERRACOTTA),
    粉紅色界伏盒(Material.PINK_SHULKER_BOX),
    粉紅色玻璃(Material.PINK_STAINED_GLASS),
    粉紅色玻璃片(Material.PINK_STAINED_GLASS_PANE),
    粉紅色陶土(Material.PINK_TERRACOTTA),
    粉紅色鬱金香(Material.PINK_TULIP),
    粉紅色羊毛(Material.PINK_WOOL),
    活塞(Material.PISTON),
    玩家頭顱(Material.PLAYER_HEAD),
    灰壤(Material.PODZOL),
    鐘乳石(Material.POINTED_DRIPSTONE),
    毒馬鈴薯(Material.POISONOUS_POTATO),
    北極熊生怪蛋(Material.POLAR_BEAR_SPAWN_EGG),
    拋光安山岩(Material.POLISHED_ANDESITE),
    拋光安山岩半磚(Material.POLISHED_ANDESITE_SLAB),
    拋光安山岩階梯(Material.POLISHED_ANDESITE_STAIRS),
    拋光玄武岩(Material.POLISHED_BASALT),
    拋光黑石(Material.POLISHED_BLACKSTONE),
    拋光黑石磚半磚(Material.POLISHED_BLACKSTONE_BRICK_SLAB),
    拋光黑石磚階梯(Material.POLISHED_BLACKSTONE_BRICK_STAIRS),
    拋光黑石磚牆(Material.POLISHED_BLACKSTONE_BRICK_WALL),
    拋光黑石磚(Material.POLISHED_BLACKSTONE_BRICKS),
    拋光黑石按鈕(Material.POLISHED_BLACKSTONE_BUTTON),
    拋光黑石壓力板(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE),
    拋光黑石半磚(Material.POLISHED_BLACKSTONE_SLAB),
    拋光黑石階梯(Material.POLISHED_BLACKSTONE_STAIRS),
    拋光黑石牆(Material.POLISHED_BLACKSTONE_WALL),
    拋光深板岩(Material.POLISHED_DEEPSLATE),
    拋光深板岩半磚(Material.POLISHED_DEEPSLATE_SLAB),
    拋光深板岩階梯(Material.POLISHED_DEEPSLATE_STAIRS),
    拋光深板岩牆(Material.POLISHED_DEEPSLATE_WALL),
    拋光閃長岩(Material.POLISHED_DIORITE),
    拋光閃長岩半磚(Material.POLISHED_DIORITE_SLAB),
    拋光閃長岩階梯(Material.POLISHED_DIORITE_STAIRS),
    拋光花崗岩(Material.POLISHED_GRANITE),
    拋光花崗岩半磚(Material.POLISHED_GRANITE_SLAB),
    拋光花崗岩階梯(Material.POLISHED_GRANITE_STAIRS),
    爆開的歌萊果(Material.POPPED_CHORUS_FRUIT),
    罌粟(Material.POPPY),
    生豬肉(Material.PORKCHOP),
    馬鈴薯(Material.POTATO),
    藥水(Material.POTION),
    粉雪桶(Material.POWDER_SNOW_BUCKET),
    動力鐵軌(Material.POWERED_RAIL),
    海磷石(Material.PRISMARINE),
    海磷石磚半磚(Material.PRISMARINE_BRICK_SLAB),
    海磷石磚階梯(Material.PRISMARINE_BRICK_STAIRS),
    海磷石磚(Material.PRISMARINE_BRICKS),
    海磷晶體(Material.PRISMARINE_CRYSTALS),
    海磷碎片(Material.PRISMARINE_SHARD),
    海磷石半磚(Material.PRISMARINE_SLAB),
    海磷石階梯(Material.PRISMARINE_STAIRS),
    海磷石牆(Material.PRISMARINE_WALL),
    河豚(Material.PUFFERFISH),
    河豚桶(Material.PUFFERFISH_BUCKET),
    河豚生怪蛋(Material.PUFFERFISH_SPAWN_EGG),
    南瓜(Material.PUMPKIN),
    南瓜派(Material.PUMPKIN_PIE),
    南瓜種子(Material.PUMPKIN_SEEDS),
    紫色旗幟(Material.PURPLE_BANNER),
    紫色床(Material.PURPLE_BED),
    紫色蠟燭(Material.PURPLE_CANDLE),
    紫色地毯(Material.PURPLE_CARPET),
    紫色混凝土(Material.PURPLE_CONCRETE),
    紫色混凝土粉末(Material.PURPLE_CONCRETE_POWDER),
    紫色染料(Material.PURPLE_DYE),
    紫色釉陶(Material.PURPLE_GLAZED_TERRACOTTA),
    紫色界伏盒(Material.PURPLE_SHULKER_BOX),
    紫色玻璃(Material.PURPLE_STAINED_GLASS),
    紫色玻璃片(Material.PURPLE_STAINED_GLASS_PANE),
    紫色陶土(Material.PURPLE_TERRACOTTA),
    紫色羊毛(Material.PURPLE_WOOL),
    紫珀方塊(Material.PURPUR_BLOCK),
    紫珀柱(Material.PURPUR_PILLAR),
    紫珀半磚(Material.PURPUR_SLAB),
    紫珀階梯(Material.PURPUR_STAIRS),
    地獄石英(Material.QUARTZ),
    石英方塊(Material.QUARTZ_BLOCK),
    石英磚(Material.QUARTZ_BRICKS),
    石英柱(Material.QUARTZ_PILLAR),
    石英半磚(Material.QUARTZ_SLAB),
    石英階梯(Material.QUARTZ_STAIRS),
    生兔肉(Material.RABBIT),
    兔子腳(Material.RABBIT_FOOT),
    兔子皮(Material.RABBIT_HIDE),
    兔子生怪蛋(Material.RABBIT_SPAWN_EGG),
    兔肉湯(Material.RABBIT_STEW),
    鐵軌(Material.RAIL),
    劫毀獸生怪蛋(Material.RAVAGER_SPAWN_EGG),
    銅原礦(Material.RAW_COPPER),
    銅原礦方塊(Material.RAW_COPPER_BLOCK),
    金原礦(Material.RAW_GOLD),
    金原礦方塊(Material.RAW_GOLD_BLOCK),
    鐵原礦(Material.RAW_IRON),
    鐵原礦方塊(Material.RAW_IRON_BLOCK),
    回生羅盤(Material.RECOVERY_COMPASS),
    紅色旗幟(Material.RED_BANNER),
    紅色床(Material.RED_BED),
    紅色蠟燭(Material.RED_CANDLE),
    紅色地毯(Material.RED_CARPET),
    紅色混凝土(Material.RED_CONCRETE),
    紅色混凝土粉末(Material.RED_CONCRETE_POWDER),
    紅色染料(Material.RED_DYE),
    紅色釉陶(Material.RED_GLAZED_TERRACOTTA),
    紅色蘑菇(Material.RED_MUSHROOM),
    紅色蘑菇方塊(Material.RED_MUSHROOM_BLOCK),
    紅地獄磚半磚(Material.RED_NETHER_BRICK_SLAB),
    紅地獄磚階梯(Material.RED_NETHER_BRICK_STAIRS),
    紅地獄磚牆(Material.RED_NETHER_BRICK_WALL),
    紅地獄磚(Material.RED_NETHER_BRICKS),
    紅沙(Material.RED_SAND),
    紅砂岩(Material.RED_SANDSTONE),
    紅砂岩半磚(Material.RED_SANDSTONE_SLAB),
    紅砂岩階梯(Material.RED_SANDSTONE_STAIRS),
    紅砂岩牆(Material.RED_SANDSTONE_WALL),
    紅色界伏盒(Material.RED_SHULKER_BOX),
    紅色玻璃(Material.RED_STAINED_GLASS),
    紅色玻璃片(Material.RED_STAINED_GLASS_PANE),
    紅色陶土(Material.RED_TERRACOTTA),
    紅色鬱金香(Material.RED_TULIP),
    紅色羊毛(Material.RED_WOOL),
    紅石粉(Material.REDSTONE),
    紅石方塊(Material.REDSTONE_BLOCK),
    紅石燈(Material.REDSTONE_LAMP),
    紅石礦(Material.REDSTONE_ORE),
    紅石火把(Material.REDSTONE_TORCH),
    強化深板岩(Material.REINFORCED_DEEPSLATE),
    紅石中繼器(Material.REPEATER),
    重複型指令方塊(Material.REPEATING_COMMAND_BLOCK),
    重生錨(Material.RESPAWN_ANCHOR),
    扎根土(Material.ROOTED_DIRT),
    玫瑰叢(Material.ROSE_BUSH),
    腐肉(Material.ROTTEN_FLESH),
    鞍(Material.SADDLE),
    生鮭魚(Material.SALMON),
    鮭魚桶(Material.SALMON_BUCKET),
    鮭魚生怪蛋(Material.SALMON_SPAWN_EGG),
    沙(Material.SAND),
    砂岩(Material.SANDSTONE),
    砂岩半磚(Material.SANDSTONE_SLAB),
    砂岩階梯(Material.SANDSTONE_STAIRS),
    砂岩牆(Material.SANDSTONE_WALL),
    鷹架(Material.SCAFFOLDING),
    伏聆(Material.SCULK),
    伏聆觸媒(Material.SCULK_CATALYST),
    伏聆振測器(Material.SCULK_SENSOR),
    伏聆嘯口(Material.SCULK_SHRIEKER),
    伏聆脈絡(Material.SCULK_VEIN),
    鱗甲(Material.SCUTE),
    海燈籠(Material.SEA_LANTERN),
    海鞘(Material.SEA_PICKLE),
    海草(Material.SEAGRASS),
    剪刀(Material.SHEARS),
    綿羊生怪蛋(Material.SHEEP_SPAWN_EGG),
    盾牌(Material.SHIELD),
    蕈光體(Material.SHROOMLIGHT),
    界伏盒(Material.SHULKER_BOX),
    界伏殼(Material.SHULKER_SHELL),
    界伏蚌生怪蛋(Material.SHULKER_SPAWN_EGG),
    蠹魚生怪蛋(Material.SILVERFISH_SPAWN_EGG),
    骷髏馬生怪蛋(Material.SKELETON_HORSE_SPAWN_EGG),
    骷髏頭顱(Material.SKELETON_SKULL),
    骷髏生怪蛋(Material.SKELETON_SPAWN_EGG),
    骷髏圖紋(Material.SKULL_BANNER_PATTERN),
    史萊姆球(Material.SLIME_BALL),
    史萊姆方塊(Material.SLIME_BLOCK),
    史萊姆生怪蛋(Material.SLIME_SPAWN_EGG),
    小型紫水晶芽(Material.SMALL_AMETHYST_BUD),
    小懸葉草(Material.SMALL_DRIPLEAF),
    鍛造台(Material.SMITHING_TABLE),
    煙燻爐(Material.SMOKER),
    平滑玄武岩(Material.SMOOTH_BASALT),
    平滑石英方塊(Material.SMOOTH_QUARTZ),
    平滑石英半磚(Material.SMOOTH_QUARTZ_SLAB),
    平滑石英階梯(Material.SMOOTH_QUARTZ_STAIRS),
    平滑紅砂岩(Material.SMOOTH_RED_SANDSTONE),
    平滑紅砂岩半磚(Material.SMOOTH_RED_SANDSTONE_SLAB),
    平滑紅砂岩階梯(Material.SMOOTH_RED_SANDSTONE_STAIRS),
    平滑砂岩(Material.SMOOTH_SANDSTONE),
    平滑砂岩半磚(Material.SMOOTH_SANDSTONE_SLAB),
    平滑砂岩階梯(Material.SMOOTH_SANDSTONE_STAIRS),
    平滑石頭(Material.SMOOTH_STONE),
    平滑石半磚(Material.SMOOTH_STONE_SLAB),
    雪(Material.SNOW),
    雪塊(Material.SNOW_BLOCK),
    雪球(Material.SNOWBALL),
    靈魂營火(Material.SOUL_CAMPFIRE),
    靈魂燈籠(Material.SOUL_LANTERN),
    靈魂砂(Material.SOUL_SAND),
    靈魂土(Material.SOUL_SOIL),
    靈魂火把(Material.SOUL_TORCH),
    生怪磚(Material.SPAWNER),
    追跡之箭(Material.SPECTRAL_ARROW),
    蜘蛛眼(Material.SPIDER_EYE),
    蜘蛛生怪蛋(Material.SPIDER_SPAWN_EGG),
    飛濺藥水(Material.SPLASH_POTION),
    海綿(Material.SPONGE),
    孢子花(Material.SPORE_BLOSSOM),
    杉木船(Material.SPRUCE_BOAT),
    杉木按鈕(Material.SPRUCE_BUTTON),
    儲物箱杉木船(Material.SPRUCE_CHEST_BOAT),
    杉木門(Material.SPRUCE_DOOR),
    杉木柵欄(Material.SPRUCE_FENCE),
    杉木柵欄門(Material.SPRUCE_FENCE_GATE),
    杉木樹葉(Material.SPRUCE_LEAVES),
    杉木原木(Material.SPRUCE_LOG),
    杉木材(Material.SPRUCE_PLANKS),
    杉木壓力板(Material.SPRUCE_PRESSURE_PLATE),
    杉木樹苗(Material.SPRUCE_SAPLING),
    杉木告示牌(Material.SPRUCE_SIGN),
    杉木半磚(Material.SPRUCE_SLAB),
    杉木階梯(Material.SPRUCE_STAIRS),
    杉木地板門(Material.SPRUCE_TRAPDOOR),
    杉木塊(Material.SPRUCE_WOOD),
    望遠鏡(Material.SPYGLASS),
    魷魚生怪蛋(Material.SQUID_SPAWN_EGG),
    木棒(Material.STICK),
    黏性活塞(Material.STICKY_PISTON),
    石頭(Material.STONE),
    石斧(Material.STONE_AXE),
    石磚半磚(Material.STONE_BRICK_SLAB),
    石磚階梯(Material.STONE_BRICK_STAIRS),
    石磚牆(Material.STONE_BRICK_WALL),
    石磚(Material.STONE_BRICKS),
    石製按鈕(Material.STONE_BUTTON),
    石鋤(Material.STONE_HOE),
    石鎬(Material.STONE_PICKAXE),
    石製壓力板(Material.STONE_PRESSURE_PLATE),
    石鏟(Material.STONE_SHOVEL),
    石半磚(Material.STONE_SLAB),
    石頭階梯(Material.STONE_STAIRS),
    石劍(Material.STONE_SWORD),
    切石機(Material.STONECUTTER),
    流髑生怪蛋(Material.STRAY_SPAWN_EGG),
    熾足獸生怪蛋(Material.STRIDER_SPAWN_EGG),
    線(Material.STRING),
    剝皮相思木原木(Material.STRIPPED_ACACIA_LOG),
    剝皮相思木塊(Material.STRIPPED_ACACIA_WOOD),
    剝皮樺木原木(Material.STRIPPED_BIRCH_LOG),
    剝皮樺木塊(Material.STRIPPED_BIRCH_WOOD),
    剝皮緋紅菌絲體(Material.STRIPPED_CRIMSON_HYPHAE),
    剝皮緋紅蕈柄(Material.STRIPPED_CRIMSON_STEM),
    剝皮黑橡木原木(Material.STRIPPED_DARK_OAK_LOG),
    剝皮黑橡木塊(Material.STRIPPED_DARK_OAK_WOOD),
    剝皮叢林木原木(Material.STRIPPED_JUNGLE_LOG),
    剝皮叢林木塊(Material.STRIPPED_JUNGLE_WOOD),
    剝皮紅樹林木原木(Material.STRIPPED_MANGROVE_LOG),
    剝皮紅樹林木塊(Material.STRIPPED_MANGROVE_WOOD),
    剝皮橡木原木(Material.STRIPPED_OAK_LOG),
    剝皮橡木塊(Material.STRIPPED_OAK_WOOD),
    剝皮杉木原木(Material.STRIPPED_SPRUCE_LOG),
    剝皮杉木塊(Material.STRIPPED_SPRUCE_WOOD),
    剝皮扭曲菌絲體(Material.STRIPPED_WARPED_HYPHAE),
    剝皮扭曲蕈柄(Material.STRIPPED_WARPED_STEM),
    結構方塊(Material.STRUCTURE_BLOCK),
    結構空位(Material.STRUCTURE_VOID),
    糖(Material.SUGAR),
    甘蔗(Material.SUGAR_CANE),
    向日葵(Material.SUNFLOWER),
    可疑的燉湯(Material.SUSPICIOUS_STEW),
    甜莓(Material.SWEET_BERRIES),
    蝌蚪桶(Material.TADPOLE_BUCKET),
    蝌蚪生怪蛋(Material.TADPOLE_SPAWN_EGG),
    芒草(Material.TALL_GRASS),
    標靶(Material.TARGET),
    陶土(Material.TERRACOTTA),
    遮光玻璃(Material.TINTED_GLASS),
    藥水箭(Material.TIPPED_ARROW),
    TNT(Material.TNT),
    TNT礦車(Material.TNT_MINECART),
    火把(Material.TORCH),
    不死圖騰(Material.TOTEM_OF_UNDYING),
    商駝生怪蛋(Material.TRADER_LLAMA_SPAWN_EGG),
    陷阱儲物箱(Material.TRAPPED_CHEST),
    三叉戟(Material.TRIDENT),
    絆線鉤(Material.TRIPWIRE_HOOK),
    熱帶魚(Material.TROPICAL_FISH),
    熱帶魚桶(Material.TROPICAL_FISH_BUCKET),
    熱帶魚生怪蛋(Material.TROPICAL_FISH_SPAWN_EGG),
    管珊瑚(Material.TUBE_CORAL),
    管珊瑚方塊(Material.TUBE_CORAL_BLOCK),
    扇狀管珊瑚(Material.TUBE_CORAL_FAN),
    凝灰岩(Material.TUFF),
    海龜蛋(Material.TURTLE_EGG),
    海龜殼(Material.TURTLE_HELMET),
    海龜生怪蛋(Material.TURTLE_SPAWN_EGG),
    扭曲藤(Material.TWISTING_VINES),
    蒼翠蛙光體(Material.VERDANT_FROGLIGHT),
    惱鬼生怪蛋(Material.VEX_SPAWN_EGG),
    村民生怪蛋(Material.VILLAGER_SPAWN_EGG),
    衛道士生怪蛋(Material.VINDICATOR_SPAWN_EGG),
    藤蔓(Material.VINE),
    流浪商人生怪蛋(Material.WANDERING_TRADER_SPAWN_EGG),
    伏守者生怪蛋(Material.WARDEN_SPAWN_EGG),
    扭曲蕈木按鈕(Material.WARPED_BUTTON),
    扭曲蕈木門(Material.WARPED_DOOR),
    扭曲蕈木柵欄(Material.WARPED_FENCE),
    扭曲蕈木柵欄門(Material.WARPED_FENCE_GATE),
    扭曲蕈菇(Material.WARPED_FUNGUS),
    扭曲蕈菇釣竿(Material.WARPED_FUNGUS_ON_A_STICK),
    扭曲菌絲體(Material.WARPED_HYPHAE),
    扭曲菌絲石(Material.WARPED_NYLIUM),
    扭曲蕈木材(Material.WARPED_PLANKS),
    扭曲蕈木壓力板(Material.WARPED_PRESSURE_PLATE),
    扭曲蕈根(Material.WARPED_ROOTS),
    扭曲蕈木告示牌(Material.WARPED_SIGN),
    扭曲蕈木半磚(Material.WARPED_SLAB),
    扭曲蕈木階梯(Material.WARPED_STAIRS),
    扭曲蕈柄(Material.WARPED_STEM),
    扭曲蕈木地板門(Material.WARPED_TRAPDOOR),
    扭曲疙瘩塊(Material.WARPED_WART_BLOCK),
    水桶(Material.WATER_BUCKET),
    上蠟的銅方塊(Material.WAXED_COPPER_BLOCK),
    上蠟的切製銅方塊(Material.WAXED_CUT_COPPER),
    上蠟的切製銅半磚(Material.WAXED_CUT_COPPER_SLAB),
    上蠟的切製銅階梯(Material.WAXED_CUT_COPPER_STAIRS),
    上蠟的斑駁銅方塊(Material.WAXED_EXPOSED_COPPER),
    上蠟的斑駁切製銅方塊(Material.WAXED_EXPOSED_CUT_COPPER),
    上蠟的斑駁切製銅半磚(Material.WAXED_EXPOSED_CUT_COPPER_SLAB),
    上蠟的斑駁切製銅階梯(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS),
    上蠟的氧化銅方塊(Material.WAXED_OXIDIZED_COPPER),
    上蠟的氧化切製銅方塊(Material.WAXED_OXIDIZED_CUT_COPPER),
    上蠟的氧化切製銅半磚(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB),
    上蠟的氧化切製銅階梯(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS),
    上蠟的風化銅方塊(Material.WAXED_WEATHERED_COPPER),
    上蠟的風化切製銅方塊(Material.WAXED_WEATHERED_CUT_COPPER),
    上蠟的風化切製銅半磚(Material.WAXED_WEATHERED_CUT_COPPER_SLAB),
    上蠟的風化切製銅階梯(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS),
    風化的銅方塊(Material.WEATHERED_COPPER),
    風化的切製銅方塊(Material.WEATHERED_CUT_COPPER),
    風化的切製銅半磚(Material.WEATHERED_CUT_COPPER_SLAB),
    風化的切製銅階梯(Material.WEATHERED_CUT_COPPER_STAIRS),
    垂泣藤(Material.WEEPING_VINES),
    濕海綿(Material.WET_SPONGE),
    小麥(Material.WHEAT),
    小麥種子(Material.WHEAT_SEEDS),
    白色旗幟(Material.WHITE_BANNER),
    白色床(Material.WHITE_BED),
    白色蠟燭(Material.WHITE_CANDLE),
    白色地毯(Material.WHITE_CARPET),
    白色混凝土(Material.WHITE_CONCRETE),
    白色混凝土粉末(Material.WHITE_CONCRETE_POWDER),
    白色染料(Material.WHITE_DYE),
    白色釉陶(Material.WHITE_GLAZED_TERRACOTTA),
    白色界伏盒(Material.WHITE_SHULKER_BOX),
    白色玻璃(Material.WHITE_STAINED_GLASS),
    白色玻璃片(Material.WHITE_STAINED_GLASS_PANE),
    白色陶土(Material.WHITE_TERRACOTTA),
    白色鬱金香(Material.WHITE_TULIP),
    白色羊毛(Material.WHITE_WOOL),
    女巫生怪蛋(Material.WITCH_SPAWN_EGG),
    凋零玫瑰(Material.WITHER_ROSE),
    凋零骷髏頭顱(Material.WITHER_SKELETON_SKULL),
    凋零骷髏生怪蛋(Material.WITHER_SKELETON_SPAWN_EGG),
    狼生怪蛋(Material.WOLF_SPAWN_EGG),
    木斧(Material.WOODEN_AXE),
    木鋤(Material.WOODEN_HOE),
    木鎬(Material.WOODEN_PICKAXE),
    木鏟(Material.WOODEN_SHOVEL),
    木劍(Material.WOODEN_SWORD),
    書和羽毛筆(Material.WRITABLE_BOOK),
    完成的書(Material.WRITTEN_BOOK),
    黃色旗幟(Material.YELLOW_BANNER),
    黃色床(Material.YELLOW_BED),
    黃色蠟燭(Material.YELLOW_CANDLE),
    黃色地毯(Material.YELLOW_CARPET),
    黃色混凝土(Material.YELLOW_CONCRETE),
    黃色混凝土粉末(Material.YELLOW_CONCRETE_POWDER),
    黃色染料(Material.YELLOW_DYE),
    黃色釉陶(Material.YELLOW_GLAZED_TERRACOTTA),
    黃色界伏盒(Material.YELLOW_SHULKER_BOX),
    黃色玻璃(Material.YELLOW_STAINED_GLASS),
    黃色玻璃片(Material.YELLOW_STAINED_GLASS_PANE),
    黃色陶土(Material.YELLOW_TERRACOTTA),
    黃色羊毛(Material.YELLOW_WOOL),
    豬屍獸生怪蛋(Material.ZOGLIN_SPAWN_EGG),
    殭屍頭顱(Material.ZOMBIE_HEAD),
    殭屍馬生怪蛋(Material.ZOMBIE_HORSE_SPAWN_EGG),
    殭屍生怪蛋(Material.ZOMBIE_SPAWN_EGG),
    殭屍村民生怪蛋(Material.ZOMBIE_VILLAGER_SPAWN_EGG),
    殭屍化豬布林生怪蛋(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);

    private final Material material;

    ItemType(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public ItemType getByMaterial(Material material) {
        ItemType[] type = new ItemType[0];
        Arrays.stream(ItemType.values()).forEach(itemType ->{
            if(itemType.material == material){
                type[0] = itemType;
            }
                });
        /*
        switch (material) {
            case ACACIA_BOAT:return 相思木船;
            case ACACIA_BUTTON:return 相思木按鈕;
            case ACACIA_CHEST_BOAT:return 儲物箱相思木船;
            case ACACIA_DOOR:return 相思木門;
            case ACACIA_FENCE:return 相思木柵欄;
            case ACACIA_FENCE_GATE:return 相思木柵欄門;
            case ACACIA_LEAVES:return 相思木樹葉;
            case ACACIA_LOG:return 相思木原木;
            case ACACIA_PLANKS:return 相思木材;
            case ACACIA_PRESSURE_PLATE:return 相思木壓力板;
            case ACACIA_SAPLING:return 相思木樹苗;
            case ACACIA_SIGN:return 相思木告示牌;
            case ACACIA_SLAB:return 相思木半磚;
            case ACACIA_STAIRS:return 相思木階梯;
            case ACACIA_TRAPDOOR:return 相思木地板門;
            case ACACIA_WOOD:return 相思木塊;
            case ACTIVATOR_RAIL:return 觸發鐵軌;
            case ALLAY_SPAWN_EGG:return 悅靈生怪蛋;
            case ALLIUM:return 紫紅球花;
            case AMETHYST_BLOCK:return 紫水晶方塊;
            case AMETHYST_CLUSTER:return 紫水晶晶簇;
            case AMETHYST_SHARD:return 紫水晶碎片;
            case ANCIENT_DEBRIS:return 遠古遺骸;
            case ANDESITE:return 安山岩;
            case ANDESITE_SLAB:return 安山岩半磚;
            case ANDESITE_STAIRS:return 安山岩階梯;
            case ANDESITE_WALL:return 安山岩牆;
            case ANVIL:return 鐵砧;
            case APPLE:return 蘋果;
            case ARMOR_STAND:return 盔甲座;
            case ARROW:return 箭矢;
            case AXOLOTL_BUCKET:return 六角恐龍桶;
            case AXOLOTL_SPAWN_EGG:return 六角恐龍生怪蛋;
            case AZALEA:return 杜鵑叢;
            case AZALEA_LEAVES:return 杜鵑葉;
            case AZURE_BLUET:return 雛草;
            case BAKED_POTATO:return 烤馬鈴薯;
            case BAMBOO:return 竹子;
            case BARREL:return 木桶;
            case BARRIER:return 屏障;
            case BASALT:return 玄武岩;
            case BAT_SPAWN_EGG:return 蝙蝠生怪蛋;
            case BEACON:return 烽火台;
            case BEDROCK:return 基岩;
            case BEE_NEST:return 蜂窩;
            case BEE_SPAWN_EGG:return 蜜蜂生怪蛋;
            case BEEF:return 生牛肉;
            case BEEHIVE:return 蜂箱;
            case BEETROOT:return 甜菜根;
            case BEETROOT_SEEDS:return 甜菜種子;
            case BEETROOT_SOUP:return 甜菜湯;
            case BELL:return 鐘;
            case BIG_DRIPLEAF:return 大懸葉草;
            case BIRCH_BOAT:return 樺木船;
            case BIRCH_BUTTON:return 樺木按鈕;
            case BIRCH_CHEST_BOAT:return 儲物箱樺木船;
            case BIRCH_DOOR:return 樺木門;
            case BIRCH_FENCE:return 樺木柵欄;
            case BIRCH_FENCE_GATE:return 樺木柵欄門;
            case BIRCH_LEAVES:return 樺木樹葉;
            case BIRCH_LOG:return 樺木原木;
            case BIRCH_PLANKS:return 樺木材;
            case BIRCH_PRESSURE_PLATE:return 樺木壓力板;
            case BIRCH_SAPLING:return 樺木樹苗;
            case BIRCH_SIGN:return 樺木告示牌;
            case BIRCH_SLAB:return 樺木半磚;
            case BIRCH_STAIRS:return 樺木階梯;
            case BIRCH_TRAPDOOR:return 樺木地板門;
            case BIRCH_WOOD:return 樺木塊;
            case BLACK_BANNER:return 黑色旗幟;
            case BLACK_BED:return 黑色床;
            case BLACK_CANDLE:return 黑色蠟燭;
            case BLACK_CARPET:return 黑色地毯;
            case BLACK_CONCRETE:return 黑色混凝土;
            case BLACK_CONCRETE_POWDER:return 黑色混凝土粉末;
            case BLACK_DYE:return 黑色染料;
            case BLACK_GLAZED_TERRACOTTA:return 黑色釉陶;
            case BLACK_SHULKER_BOX:return 黑色界伏盒;
            case BLACK_STAINED_GLASS:return 黑色玻璃;
            case BLACK_STAINED_GLASS_PANE:return 黑色玻璃片;
            case BLACK_TERRACOTTA:return 黑色陶土;
            case BLACK_WOOL:return 黑色羊毛;
            case BLACKSTONE:return 黑石;
            case BLACKSTONE_SLAB:return 黑石半磚;
            case BLACKSTONE_STAIRS:return 黑石階梯;
            case BLACKSTONE_WALL:return 黑石牆;
            case BLAST_FURNACE:return 高爐;
            case BLAZE_POWDER:return 烈焰粉;
            case BLAZE_ROD:return 烈焰桿;
            case BLAZE_SPAWN_EGG:return 烈焰使者生怪蛋;
            case BLUE_BANNER:return 藍色旗幟;
            case BLUE_BED:return 藍色床;
            case BLUE_CANDLE:return 藍色蠟燭;
            case BLUE_CARPET:return 藍色地毯;
            case BLUE_CONCRETE:return 藍色混凝土;
            case BLUE_CONCRETE_POWDER:return 藍色混凝土粉末;
            case BLUE_DYE:return 藍色染料;
            case BLUE_GLAZED_TERRACOTTA:return 藍色釉陶;
            case BLUE_ICE:return 藍冰;
            case BLUE_ORCHID:return 藍色蝴蝶蘭;
            case BLUE_SHULKER_BOX:return 藍色界伏盒;
            case BLUE_STAINED_GLASS:return 藍色玻璃;
            case BLUE_STAINED_GLASS_PANE:return 藍色玻璃片;
            case BLUE_TERRACOTTA:return 藍色陶土;
            case BLUE_WOOL:return 藍色羊毛;
            case BONE:return 骨頭;
            case BONE_BLOCK:return 骨塊;
            case BONE_MEAL:return 骨粉;
            case BOOK:return 書;
            case BOOKSHELF:return 書櫃;
            case BOW:return 弓;
            case BOWL:return 碗;
            case BRAIN_CORAL:return 腦珊瑚;
            case BRAIN_CORAL_BLOCK:return 腦珊瑚方塊;
            case BRAIN_CORAL_FAN:return 扇狀腦珊瑚;
            case BREAD:return 麵包;
            case BREWING_STAND:return 釀造台;
            case BRICK:return 紅磚頭;
            case BRICK_SLAB:return 紅磚半磚;
            case BRICK_STAIRS:return 紅磚階梯;
            case BRICK_WALL:return 紅磚牆;
            case BRICKS:return 紅磚;
            case BROWN_BANNER:return 棕色旗幟;
            case BROWN_BED:return 棕色床;
            case BROWN_CANDLE:return 棕色蠟燭;
            case BROWN_CARPET:return 棕色地毯;
            case BROWN_CONCRETE:return 棕色混凝土;
            case BROWN_CONCRETE_POWDER:return 棕色混凝土粉末;
            case BROWN_DYE:return 棕色染料;
            case BROWN_GLAZED_TERRACOTTA:return 棕色釉陶;
            case BROWN_MUSHROOM:return 棕色蘑菇;
            case BROWN_MUSHROOM_BLOCK:return 棕色蘑菇方塊;
            case BROWN_SHULKER_BOX:return 棕色界伏盒;
            case BROWN_STAINED_GLASS:return 棕色玻璃;
            case BROWN_STAINED_GLASS_PANE:return 棕色玻璃片;
            case BROWN_TERRACOTTA:return 棕色陶土;
            case BROWN_WOOL:return 棕色羊毛;
            case BUBBLE_CORAL:return 氣泡珊瑚;
            case BUBBLE_CORAL_BLOCK:return 氣泡珊瑚方塊;
            case BUBBLE_CORAL_FAN:return 扇狀氣泡珊瑚;
            case BUCKET:return 鐵桶;
            case BUDDING_AMETHYST:return 紫水晶芽床;
            case BUNDLE:return 束口袋;
            case CACTUS:return 仙人掌;
            case CAKE:return 蛋糕;
            case CALCITE:return 方解石;
            case CAMPFIRE:return 營火;
            case CANDLE:return 蠟燭;
            case CARROT:return 胡蘿蔔;
            case CARROT_ON_A_STICK:return 胡蘿蔔釣竿;
            case CARTOGRAPHY_TABLE:return 製圖台;
            case CARVED_PUMPKIN:return 雕刻過的南瓜;
            case CAT_SPAWN_EGG:return 貓生怪蛋;
            case CAULDRON:return 鍋釜;
            case CAVE_SPIDER_SPAWN_EGG:return 洞穴蜘蛛生怪蛋;
            case CHAIN:return 鎖鏈;
            case CHAIN_COMMAND_BLOCK:return 連鎖式指令方塊;
            case CHAINMAIL_BOOTS:return 鎖鏈靴子;
            case CHAINMAIL_CHESTPLATE:return 鎖鏈胸甲;
            case CHAINMAIL_HELMET:return 鎖鏈頭盔;
            case CHAINMAIL_LEGGINGS:return 鎖鏈護腿;
            case CHARCOAL:return 木炭;
            case CHEST:return 儲物箱;
            case CHEST_MINECART:return 儲物箱礦車;
            case CHICKEN:return 生雞肉;
            case CHICKEN_SPAWN_EGG:return 雞生怪蛋;
            case CHIPPED_ANVIL:return 微損的鐵砧;
            case CHISELED_DEEPSLATE:return 浮雕深板岩;
            case CHISELED_NETHER_BRICKS:return 浮雕地獄磚;
            case CHISELED_POLISHED_BLACKSTONE:return 浮雕拋光黑石;
            case CHISELED_QUARTZ_BLOCK:return 浮雕石英方塊;
            case CHISELED_RED_SANDSTONE:return 浮雕紅砂岩;
            case CHISELED_SANDSTONE:return 浮雕砂岩;
            case CHISELED_STONE_BRICKS:return 浮雕石磚;
            case CHORUS_FLOWER:return 歌萊花;
            case CHORUS_FRUIT:return 歌萊果;
            case CHORUS_PLANT:return 歌萊枝;
            case CLAY:return 黏土;
            case CLAY_BALL:return 黏土球;
            case CLOCK:return 時鐘;
            case COAL:return 煤炭;
            case COAL_BLOCK:return 煤炭方塊;
            case COAL_ORE:return 煤礦;
            case COARSE_DIRT:return 粗泥;
            case COBBLED_DEEPSLATE:return 深板岩碎石;
            case COBBLED_DEEPSLATE_SLAB:return 碎深板岩半磚;
            case COBBLED_DEEPSLATE_STAIRS:return 碎深板岩階梯;
            case COBBLED_DEEPSLATE_WALL:return 碎深板岩牆;
            case COBBLESTONE:return 鵝卵石;
            case COBBLESTONE_SLAB:return 鵝卵石半磚;
            case COBBLESTONE_STAIRS:return 鵝卵石階梯;
            case COBBLESTONE_WALL:return 鵝卵石牆;
            case COBWEB:return 蜘蛛網;
            case COCOA_BEANS:return 可可豆;
            case COD:return 生鱈魚;
            case COD_BUCKET:return 鱈魚桶;
            case COD_SPAWN_EGG:return 鱈魚生怪蛋;
            case COMMAND_BLOCK:return 指令方塊;
            case COMMAND_BLOCK_MINECART:return 指令方塊礦車;
            case COMPARATOR:return 紅石比較器;
            case COMPASS:return 羅盤;
            case COMPOSTER:return 堆肥箱;
            case CONDUIT:return 海靈核心;
            case COOKED_BEEF:return 牛排;
            case COOKED_CHICKEN:return 烤雞;
            case COOKED_COD:return 烤鱈魚;
            case COOKED_MUTTON:return 烤羊肉;
            case COOKED_PORKCHOP:return 烤豬肉;
            case COOKED_RABBIT:return 烤兔肉;
            case COOKED_SALMON:return 烤鮭魚;
            case COOKIE:return 餅乾;
            case COPPER_BLOCK:return 銅方塊;
            case COPPER_INGOT:return 銅錠;
            case COPPER_ORE:return 銅礦;
            case CORNFLOWER:return 矢車菊;
            case COW_SPAWN_EGG:return 牛生怪蛋;
            case CRACKED_DEEPSLATE_BRICKS:return 裂紋深板岩磚;
            case CRACKED_DEEPSLATE_TILES:return 裂紋深板岩磚瓦;
            case CRACKED_NETHER_BRICKS:return 裂紋地獄磚;
            case CRACKED_POLISHED_BLACKSTONE_BRICKS:return 裂紋拋光黑石磚;
            case CRACKED_STONE_BRICKS:return 裂紋石磚;
            case CRAFTING_TABLE:return 工作台;
            case CREEPER_BANNER_PATTERN:return 苦力怕圖紋;
            case CREEPER_HEAD:return 苦力怕頭顱;
            case CREEPER_SPAWN_EGG:return 苦力怕生怪蛋;
            case CRIMSON_BUTTON:return 緋紅蕈木按鈕;
            case CRIMSON_DOOR:return 緋紅蕈木門;
            case CRIMSON_FENCE:return 緋紅蕈木柵欄;
            case CRIMSON_FENCE_GATE:return 緋紅蕈木柵欄門;
            case CRIMSON_FUNGUS:return 緋紅蕈菇;
            case CRIMSON_HYPHAE:return 緋紅菌絲體;
            case CRIMSON_NYLIUM:return 緋紅菌絲石;
            case CRIMSON_PLANKS:return 緋紅蕈木材;
            case CRIMSON_PRESSURE_PLATE:return 緋紅蕈木壓力板;
            case CRIMSON_ROOTS:return 緋紅蕈根;
            case CRIMSON_SIGN:return 緋紅蕈木告示牌;
            case CRIMSON_SLAB:return 緋紅蕈木半磚;
            case CRIMSON_STAIRS:return 緋紅蕈木階梯;
            case CRIMSON_STEM:return 緋紅蕈柄;
            case CRIMSON_TRAPDOOR:return 緋紅蕈木地板門;
            case CROSSBOW:return 弩;
            case CRYING_OBSIDIAN:return 哭泣的黑曜石;
            case CUT_COPPER:return 切製銅方塊;
            case CUT_COPPER_SLAB:return 切製銅半磚;
            case CUT_COPPER_STAIRS:return 切製銅階梯;
            case CUT_RED_SANDSTONE:return 切製紅砂岩;
            case CUT_RED_SANDSTONE_SLAB:return 切製紅砂岩半磚;
            case CUT_SANDSTONE:return 切製砂岩;
            case CUT_SANDSTONE_SLAB:return 切製砂岩半磚;
            case CYAN_BANNER:return 青色旗幟;
            case CYAN_BED:return 青色床;
            case CYAN_CANDLE:return 青色蠟燭;
            case CYAN_CARPET:return 青色地毯;
            case CYAN_CONCRETE:return 青色混凝土;
            case CYAN_CONCRETE_POWDER:return 青色混凝土粉末;
            case CYAN_DYE:return 青色染料;
            case CYAN_GLAZED_TERRACOTTA:return 青色釉陶;
            case CYAN_SHULKER_BOX:return 青色界伏盒;
            case CYAN_STAINED_GLASS:return 青色玻璃;
            case CYAN_STAINED_GLASS_PANE:return 青色玻璃片;
            case CYAN_TERRACOTTA:return 青色陶土;
            case CYAN_WOOL:return 青色羊毛;
            case DAMAGED_ANVIL:return 耗損的鐵砧;
            case DANDELION:return 蒲公英;
            case DARK_OAK_BOAT:return 黑橡木船;
            case DARK_OAK_BUTTON:return 黑橡木按鈕;
            case DARK_OAK_CHEST_BOAT:return 儲物箱黑橡木船;
            case DARK_OAK_DOOR:return 黑橡木門;
            case DARK_OAK_FENCE:return 黑橡木柵欄;
            case DARK_OAK_FENCE_GATE:return 黑橡木柵欄門;
            case DARK_OAK_LEAVES:return 黑橡木樹葉;
            case DARK_OAK_LOG:return 黑橡木原木;
            case DARK_OAK_PLANKS:return 黑橡木材;
            case DARK_OAK_PRESSURE_PLATE:return 黑橡木壓力板;
            case DARK_OAK_SAPLING:return 黑橡木樹苗;
            case DARK_OAK_SIGN:return 黑橡木告示牌;
            case DARK_OAK_SLAB:return 黑橡木半磚;
            case DARK_OAK_STAIRS:return 黑橡木階梯;
            case DARK_OAK_TRAPDOOR:return 黑橡木地板門;
            case DARK_OAK_WOOD:return 黑橡木塊;
            case DARK_PRISMARINE:return 暗海磷石;
            case DARK_PRISMARINE_SLAB:return 暗海磷石半磚;
            case DARK_PRISMARINE_STAIRS:return 暗海磷石階梯;
            case DAYLIGHT_DETECTOR:return 日光感測器;
            case DEAD_BRAIN_CORAL:return 死亡的腦珊瑚;
            case DEAD_BRAIN_CORAL_BLOCK:return 死亡的腦珊瑚方塊;
            case DEAD_BRAIN_CORAL_FAN:return 死亡的扇狀腦珊瑚;
            case DEAD_BUBBLE_CORAL:return 死亡的氣泡珊瑚;
            case DEAD_BUBBLE_CORAL_BLOCK:return 死亡的氣泡珊瑚方塊;
            case DEAD_BUBBLE_CORAL_FAN:return 死亡的扇狀氣泡珊瑚;
            case DEAD_BUSH:return 枯灌木;
            case DEAD_FIRE_CORAL:return 死亡的火珊瑚;
            case DEAD_FIRE_CORAL_BLOCK:return 死亡的火珊瑚方塊;
            case DEAD_FIRE_CORAL_FAN:return 死亡的扇狀火珊瑚;
            case DEAD_HORN_CORAL:return 死亡的角珊瑚;
            case DEAD_HORN_CORAL_BLOCK:return 死亡的角珊瑚方塊;
            case DEAD_HORN_CORAL_FAN:return 死亡的扇狀角珊瑚;
            case DEAD_TUBE_CORAL:return 死亡的管珊瑚;
            case DEAD_TUBE_CORAL_BLOCK:return 死亡的管珊瑚方塊;
            case DEAD_TUBE_CORAL_FAN:return 死亡的扇狀管珊瑚;
            case DEBUG_STICK:return 除錯棒;
            case DEEPSLATE:return 深板岩;
            case DEEPSLATE_BRICK_SLAB:return 深板岩磚半磚;
            case DEEPSLATE_BRICK_STAIRS:return 深板岩磚階梯;
            case DEEPSLATE_BRICK_WALL:return 深板岩磚牆;
            case DEEPSLATE_BRICKS:return 深板岩磚;
            case DEEPSLATE_COAL_ORE:return 深板岩煤礦;
            case DEEPSLATE_COPPER_ORE:return 深板岩銅礦;
            case DEEPSLATE_DIAMOND_ORE:return 深板岩鑽石礦;
            case DEEPSLATE_EMERALD_ORE:return 深板岩綠寶石礦;
            case DEEPSLATE_GOLD_ORE:return 深板岩金礦;
            case DEEPSLATE_IRON_ORE:return 深板岩鐵礦;
            case DEEPSLATE_LAPIS_ORE:return 深板岩青金石礦;
            case DEEPSLATE_REDSTONE_ORE:return 深板岩紅石礦;
            case DEEPSLATE_TILE_SLAB:return 深板岩磚瓦半磚;
            case DEEPSLATE_TILE_STAIRS:return 深板岩磚瓦階梯;
            case DEEPSLATE_TILE_WALL:return 深板岩磚瓦牆;
            case DEEPSLATE_TILES:return 深板岩磚瓦;
            case DETECTOR_RAIL:return 感測鐵軌;
            case DIAMOND:return 鑽石;
            case DIAMOND_AXE:return 鑽石斧;
            case DIAMOND_BLOCK:return 鑽石方塊;
            case DIAMOND_BOOTS:return 鑽石靴子;
            case DIAMOND_CHESTPLATE:return 鑽石胸甲;
            case DIAMOND_HELMET:return 鑽石頭盔;
            case DIAMOND_HOE:return 鑽石鋤;
            case DIAMOND_HORSE_ARMOR:return 鑽石製馬鎧;
            case DIAMOND_LEGGINGS:return 鑽石護腿;
            case DIAMOND_ORE:return 鑽石礦;
            case DIAMOND_PICKAXE:return 鑽石鎬;
            case DIAMOND_SHOVEL:return 鑽石鏟;
            case DIAMOND_SWORD:return 鑽石劍;
            case DIORITE:return 閃長岩;
            case DIORITE_SLAB:return 閃長岩半磚;
            case DIORITE_STAIRS:return 閃長岩階梯;
            case DIORITE_WALL:return 閃長岩牆;
            case DIRT:return 泥土;
            case DIRT_PATH:return 土徑;
            case DISC_FRAGMENT_5:return 唱片碎片;
            case DISPENSER:return 發射器;
            case DOLPHIN_SPAWN_EGG:return 海豚生怪蛋;
            case DONKEY_SPAWN_EGG:return 驢子生怪蛋;
            case DRAGON_BREATH:return 龍之吐息;
            case DRAGON_EGG:return 龍蛋;
            case DRAGON_HEAD:return 龍首;
            case DRIED_KELP:return 海帶乾;
            case DRIED_KELP_BLOCK:return 海帶乾塊;
            case DRIPSTONE_BLOCK:return 鐘乳石方塊;
            case DROPPER:return 投擲器;
            case DROWNED_SPAWN_EGG:return 沉屍生怪蛋;
            case ECHO_SHARD:return 回聲碎片;
            case EGG:return 雞蛋;
            case ELDER_GUARDIAN_SPAWN_EGG:return 遠古深海守衛生怪蛋;
            case ELYTRA:return 鞘翅;
            case EMERALD:return 綠寶石;
            case EMERALD_BLOCK:return 綠寶石方塊;
            case EMERALD_ORE:return 綠寶石礦;
            case ENCHANTED_BOOK:return 附魔書;
            case ENCHANTED_GOLDEN_APPLE:return 附魔金蘋果;
            case ENCHANTING_TABLE:return 附魔台;
            case END_CRYSTAL:return 終界水晶;
            case END_PORTAL_FRAME:return 終界傳送門框架;
            case END_ROD:return 終界燭;
            case END_STONE:return 終界石;
            case END_STONE_BRICK_SLAB:return 終界石磚半磚;
            case END_STONE_BRICK_STAIRS:return 終界石磚階梯;
            case END_STONE_BRICK_WALL:return 終界石磚牆;
            case END_STONE_BRICKS:return 終界石磚;
            case ENDER_CHEST:return 終界箱;
            case ENDER_EYE:return 終界之眼;
            case ENDER_PEARL:return 終界珍珠;
            case ENDERMAN_SPAWN_EGG:return 終界使者生怪蛋;
            case ENDERMITE_SPAWN_EGG:return 終界蟎生怪蛋;
            case EVOKER_SPAWN_EGG:return 喚魔者生怪蛋;
            case EXPERIENCE_BOTTLE:return 經驗瓶;
            case EXPOSED_COPPER:return 斑駁的銅方塊;
            case EXPOSED_CUT_COPPER:return 斑駁的切製銅方塊;
            case EXPOSED_CUT_COPPER_SLAB:return 斑駁的切製銅半磚;
            case EXPOSED_CUT_COPPER_STAIRS:return 斑駁的切製銅階梯;
            case FARMLAND:return 耕地;
            case FEATHER:return 羽毛;
            case FERMENTED_SPIDER_EYE:return 發酵蜘蛛眼;
            case FERN:return 蕨;
            case FILLED_MAP:return 地圖;
            case FIRE_CHARGE:return 火焰彈;
            case FIRE_CORAL:return 火珊瑚;
            case FIRE_CORAL_BLOCK:return 火珊瑚方塊;
            case FIRE_CORAL_FAN:return 扇狀火珊瑚;
            case FIREWORK_ROCKET:return 煙火;
            case FIREWORK_STAR:return 火藥球;
            case FISHING_ROD:return 釣竿;
            case FLETCHING_TABLE:return 製箭台;
            case FLINT:return 燧石;
            case FLINT_AND_STEEL:return 打火石;
            case FLOWER_BANNER_PATTERN:return 花朵圖紋;
            case FLOWER_POT:return 花盆;
            case FLOWERING_AZALEA:return 開花的杜鵑叢;
            case FLOWERING_AZALEA_LEAVES:return 開花的杜鵑葉;
            case FOX_SPAWN_EGG:return 狐狸生怪蛋;
            case FROG_SPAWN_EGG:return 青蛙生怪蛋;
            case FROGSPAWN:return 青蛙卵;
            case FURNACE:return 熔爐;
            case FURNACE_MINECART:return 熔爐礦車;
            case GHAST_SPAWN_EGG:return 地獄幽靈生怪蛋;
            case GHAST_TEAR:return 幽靈之淚;
            case GILDED_BLACKSTONE:return 鑲金黑石;
            case GLASS:return 玻璃;
            case GLASS_BOTTLE:return 玻璃瓶;
            case GLASS_PANE:return 玻璃片;
            case GLISTERING_MELON_SLICE:return 鑲金西瓜片;
            case GLOBE_BANNER_PATTERN:return 地球;
            case GLOW_BERRIES:return 螢光莓;
            case GLOW_INK_SAC:return 螢光墨囊;
            case GLOW_ITEM_FRAME:return 螢光物品展示框;
            case GLOW_LICHEN:return 發光地衣;
            case GLOW_SQUID_SPAWN_EGG:return 螢光魷魚生怪蛋;
            case GLOWSTONE:return 螢光石;
            case GLOWSTONE_DUST:return 螢石粉;
            case GOAT_HORN:return 山羊角;
            case GOAT_SPAWN_EGG:return 山羊生怪蛋;
            case GOLD_BLOCK:return 黃金方塊;
            case GOLD_INGOT:return 金錠;
            case GOLD_NUGGET:return 金粒;
            case GOLD_ORE:return 金礦;
            case GOLDEN_APPLE:return 金蘋果;
            case GOLDEN_AXE:return 金斧;
            case GOLDEN_BOOTS:return 黃金靴子;
            case GOLDEN_CARROT:return 金胡蘿蔔;
            case GOLDEN_CHESTPLATE:return 黃金胸甲;
            case GOLDEN_HELMET:return 黃金頭盔;
            case GOLDEN_HOE:return 金鋤;
            case GOLDEN_HORSE_ARMOR:return 黃金製馬鎧;
            case GOLDEN_LEGGINGS:return 黃金護腿;
            case GOLDEN_PICKAXE:return 金鎬;
            case GOLDEN_SHOVEL:return 金鏟;
            case GOLDEN_SWORD:return 金劍;
            case GRANITE:return 花崗岩;
            case GRANITE_SLAB:return 花崗岩半磚;
            case GRANITE_STAIRS:return 花崗岩階梯;
            case GRANITE_WALL:return 花崗岩牆;
            case GRASS:return 草;
            case GRASS_BLOCK:return 草地;
            case GRAVEL:return 礫石;
            case GRAY_BANNER:return 灰色旗幟;
            case GRAY_BED:return 灰色床;
            case GRAY_CANDLE:return 灰色蠟燭;
            case GRAY_CARPET:return 灰色地毯;
            case GRAY_CONCRETE:return 灰色混凝土;
            case GRAY_CONCRETE_POWDER:return 灰色混凝土粉末;
            case GRAY_DYE:return 灰色染料;
            case GRAY_GLAZED_TERRACOTTA:return 灰色釉陶;
            case GRAY_SHULKER_BOX:return 灰色界伏盒;
            case GRAY_STAINED_GLASS:return 灰色玻璃;
            case GRAY_STAINED_GLASS_PANE:return 灰色玻璃片;
            case GRAY_TERRACOTTA:return 灰色陶土;
            case GRAY_WOOL:return 灰色羊毛;
            case GREEN_BANNER:return 綠色旗幟;
            case GREEN_BED:return 綠色床;
            case GREEN_CANDLE:return 綠色蠟燭;
            case GREEN_CARPET:return 綠色地毯;
            case GREEN_CONCRETE:return 綠色混凝土;
            case GREEN_CONCRETE_POWDER:return 綠色混凝土粉末;
            case GREEN_DYE:return 綠色染料;
            case GREEN_GLAZED_TERRACOTTA:return 綠色釉陶;
            case GREEN_SHULKER_BOX:return 綠色界伏盒;
            case GREEN_STAINED_GLASS:return 綠色玻璃;
            case GREEN_STAINED_GLASS_PANE:return 綠色玻璃片;
            case GREEN_TERRACOTTA:return 綠色陶土;
            case GREEN_WOOL:return 綠色羊毛;
            case GRINDSTONE:return 砂輪;
            case GUARDIAN_SPAWN_EGG:return 深海守衛生怪蛋;
            case GUNPOWDER:return 火藥;
            case HANGING_ROOTS:return 懸根;
            case HAY_BLOCK:return 乾草捆;
            case HEART_OF_THE_SEA:return 海洋之心;
            case HEAVY_WEIGHTED_PRESSURE_PLATE:return 重質測重壓力板;
            case HOGLIN_SPAWN_EGG:return 豬布獸生怪蛋;
            case HONEY_BLOCK:return 蜂蜜塊;
            case HONEY_BOTTLE:return 蜂蜜瓶;
            case HONEYCOMB:return 蜂巢;
            case HONEYCOMB_BLOCK:return 蜂巢塊;
            case HOPPER:return 漏斗;
            case HOPPER_MINECART:return 漏斗礦車;
            case HORN_CORAL:return 角珊瑚;
            case HORN_CORAL_BLOCK:return 角珊瑚方塊;
            case HORN_CORAL_FAN:return 扇狀角珊瑚;
            case HORSE_SPAWN_EGG:return 馬生怪蛋;
            case HUSK_SPAWN_EGG:return 屍殼生怪蛋;
            case ICE:return 冰;
            case INFESTED_CHISELED_STONE_BRICKS:return 蛀蝕的浮雕石磚;
            case INFESTED_COBBLESTONE:return 蛀蝕的鵝卵石;
            case INFESTED_CRACKED_STONE_BRICKS:return 蛀蝕的裂紋石磚;
            case INFESTED_DEEPSLATE:return 蛀蝕的深板岩;
            case INFESTED_MOSSY_STONE_BRICKS:return 蛀蝕的青苔石磚;
            case INFESTED_STONE:return 蛀蝕的石頭;
            case INFESTED_STONE_BRICKS:return 蛀蝕的石磚;
            case INK_SAC:return 墨囊;
            case IRON_AXE:return 鐵斧;
            case IRON_BARS:return 鐵柵欄;
            case IRON_BLOCK:return 鐵方塊;
            case IRON_BOOTS:return 鐵製靴子;
            case IRON_CHESTPLATE:return 鐵製胸甲;
            case IRON_DOOR:return 鐵門;
            case IRON_HELMET:return 鐵製頭盔;
            case IRON_HOE:return 鐵鋤;
            case IRON_HORSE_ARMOR:return 鐵製馬鎧;
            case IRON_INGOT:return 鐵錠;
            case IRON_LEGGINGS:return 鐵製護腿;
            case IRON_NUGGET:return 鐵粒;
            case IRON_ORE:return 鐵礦;
            case IRON_PICKAXE:return 鐵鎬;
            case IRON_SHOVEL:return 鐵鏟;
            case IRON_SWORD:return 鐵劍;
            case IRON_TRAPDOOR:return 鐵製地板門;
            case ITEM_FRAME:return 物品展示框;
            case JACK_O_LANTERN:return 南瓜燈;
            case JIGSAW:return 拼圖方塊;
            case JUKEBOX:return 唱片機;
            case JUNGLE_BOAT:return 叢林木船;
            case JUNGLE_BUTTON:return 叢林木按鈕;
            case JUNGLE_CHEST_BOAT:return 儲物箱叢林木船;
            case JUNGLE_DOOR:return 叢林木門;
            case JUNGLE_FENCE:return 叢林木柵欄;
            case JUNGLE_FENCE_GATE:return 叢林木柵欄門;
            case JUNGLE_LEAVES:return 叢林木樹葉;
            case JUNGLE_LOG:return 叢林木原木;
            case JUNGLE_PLANKS:return 叢林木材;
            case JUNGLE_PRESSURE_PLATE:return 叢林木壓力板;
            case JUNGLE_SAPLING:return 叢林木樹苗;
            case JUNGLE_SIGN:return 叢林木告示牌;
            case JUNGLE_SLAB:return 叢林木半磚;
            case JUNGLE_STAIRS:return 叢林木階梯;
            case JUNGLE_TRAPDOOR:return 叢林木地板門;
            case JUNGLE_WOOD:return 叢林木塊;
            case KELP:return 海帶;
            case KNOWLEDGE_BOOK:return 知識之書;
            case LADDER:return 梯子;
            case LANTERN:return 燈籠;
            case LAPIS_BLOCK:return 青金石方塊;
            case LAPIS_LAZULI:return 青金石;
            case LAPIS_ORE:return 青金石礦;
            case LARGE_AMETHYST_BUD:return 大型紫水晶芽;
            case LARGE_FERN:return 大型蕨類;
            case LAVA_BUCKET:return 熔岩桶;
            case LEAD:return 拴繩;
            case LEATHER:return 皮革;
            case LEATHER_BOOTS:return 皮革靴子;
            case LEATHER_CHESTPLATE:return 皮革上衣;
            case LEATHER_HELMET:return 皮革帽子;
            case LEATHER_HORSE_ARMOR:return 皮革製馬鎧;
            case LEATHER_LEGGINGS:return 皮革褲子;
            case LECTERN:return 講台;
            case LEVER:return 控制桿;
            case LIGHT:return 光源;
            case LIGHT_BLUE_BANNER:return 淺藍色旗幟;
            case LIGHT_BLUE_BED:return 淺藍色床;
            case LIGHT_BLUE_CANDLE:return 淺藍色蠟燭;
            case LIGHT_BLUE_CARPET:return 淺藍色地毯;
            case LIGHT_BLUE_CONCRETE:return 淺藍色混凝土;
            case LIGHT_BLUE_CONCRETE_POWDER:return 淺藍色混凝土粉末;
            case LIGHT_BLUE_DYE:return 淺藍色染料;
            case LIGHT_BLUE_GLAZED_TERRACOTTA:return 淺藍色釉陶;
            case LIGHT_BLUE_SHULKER_BOX:return 淺藍色界伏盒;
            case LIGHT_BLUE_STAINED_GLASS:return 淺藍色玻璃;
            case LIGHT_BLUE_STAINED_GLASS_PANE:return 淺藍色玻璃片;
            case LIGHT_BLUE_TERRACOTTA:return 淺藍色陶土;
            case LIGHT_BLUE_WOOL:return 淺藍色羊毛;
            case LIGHT_GRAY_BANNER:return 淺灰色旗幟;
            case LIGHT_GRAY_BED:return 淺灰色床;
            case LIGHT_GRAY_CANDLE:return 淺灰色蠟燭;
            case LIGHT_GRAY_CARPET:return 淺灰色地毯;
            case LIGHT_GRAY_CONCRETE:return 淺灰色混凝土;
            case LIGHT_GRAY_CONCRETE_POWDER:return 淺灰色混凝土粉末;
            case LIGHT_GRAY_DYE:return 淺灰色染料;
            case LIGHT_GRAY_GLAZED_TERRACOTTA:return 淺灰色釉陶;
            case LIGHT_GRAY_SHULKER_BOX:return 淺灰色界伏盒;
            case LIGHT_GRAY_STAINED_GLASS:return 淺灰色玻璃;
            case LIGHT_GRAY_STAINED_GLASS_PANE:return 淺灰色玻璃片;
            case LIGHT_GRAY_TERRACOTTA:return 淺灰色陶土;
            case LIGHT_GRAY_WOOL:return 淺灰色羊毛;
            case LIGHT_WEIGHTED_PRESSURE_PLATE:return 輕質測重壓力板;
            case LIGHTNING_ROD:return 避雷針;
            case LILAC:return 紫丁香;
            case LILY_OF_THE_VALLEY:return 鈴蘭;
            case LILY_PAD:return 荷葉;
            case LIME_BANNER:return 淺綠色旗幟;
            case LIME_BED:return 淺綠色床;
            case LIME_CANDLE:return 淺綠色蠟燭;
            case LIME_CARPET:return 淺綠色地毯;
            case LIME_CONCRETE:return 淺綠色混凝土;
            case LIME_CONCRETE_POWDER:return 淺綠色混凝土粉末;
            case LIME_DYE:return 淺綠色染料;
            case LIME_GLAZED_TERRACOTTA:return 淺綠色釉陶;
            case LIME_SHULKER_BOX:return 淺綠色界伏盒;
            case LIME_STAINED_GLASS:return 淺綠色玻璃;
            case LIME_STAINED_GLASS_PANE:return 淺綠色玻璃片;
            case LIME_TERRACOTTA:return 淺綠色陶土;
            case LIME_WOOL:return 淺綠色羊毛;
            case LINGERING_POTION:return 滯留藥水;
            case LLAMA_SPAWN_EGG:return 駱馬生怪蛋;
            case LODESTONE:return 磁石;
            case LOOM:return 紡織機;
            case MAGENTA_BANNER:return 洋紅色旗幟;
            case MAGENTA_BED:return 洋紅色床;
            case MAGENTA_CANDLE:return 洋紅色蠟燭;
            case MAGENTA_CARPET:return 洋紅色地毯;
            case MAGENTA_CONCRETE:return 洋紅色混凝土;
            case MAGENTA_CONCRETE_POWDER:return 洋紅色混凝土粉末;
            case MAGENTA_DYE:return 洋紅色染料;
            case MAGENTA_GLAZED_TERRACOTTA:return 洋紅色釉陶;
            case MAGENTA_SHULKER_BOX:return 洋紅色界伏盒;
            case MAGENTA_STAINED_GLASS:return 洋紅色玻璃;
            case MAGENTA_STAINED_GLASS_PANE:return 洋紅色玻璃片;
            case MAGENTA_TERRACOTTA:return 洋紅色陶土;
            case MAGENTA_WOOL:return 洋紅色羊毛;
            case MAGMA_BLOCK:return 岩漿塊;
            case MAGMA_CREAM:return 岩漿球;
            case MAGMA_CUBE_SPAWN_EGG:return 岩漿立方怪生怪蛋;
            case MANGROVE_BOAT:return 紅樹林木船;
            case MANGROVE_BUTTON:return 紅樹林木按鈕;
            case MANGROVE_CHEST_BOAT:return 儲物箱紅樹林木船;
            case MANGROVE_DOOR:return 紅樹林木門;
            case MANGROVE_FENCE:return 紅樹林木柵欄;
            case MANGROVE_FENCE_GATE:return 紅樹林木柵欄門;
            case MANGROVE_LEAVES:return 紅樹林木樹葉;
            case MANGROVE_LOG:return 紅樹林木原木;
            case MANGROVE_PLANKS:return 紅樹林木材;
            case MANGROVE_PRESSURE_PLATE:return 紅樹林木壓力板;
            case MANGROVE_PROPAGULE:return 紅樹林木胎生苗;
            case MANGROVE_ROOTS:return 紅樹林木根;
            case MANGROVE_SIGN:return 紅樹林木告示牌;
            case MANGROVE_SLAB:return 紅樹林木半磚;
            case MANGROVE_STAIRS:return 紅樹林木階梯;
            case MANGROVE_TRAPDOOR:return 紅樹林木地板門;
            case MANGROVE_WOOD:return 紅樹林木塊;
            case MAP:return 空白地圖;
            case MEDIUM_AMETHYST_BUD:return 中型紫水晶芽;
            case MELON:return 西瓜;
            case MELON_SEEDS:return 西瓜種子;
            case MELON_SLICE:return 西瓜片;
            case MILK_BUCKET:return 鮮奶桶;
            case MINECART:return 礦車;
            case MOJANG_BANNER_PATTERN:return Mojang圖紋;
            case MOOSHROOM_SPAWN_EGG:return 哞菇生怪蛋;
            case MOSS_BLOCK:return 苔蘚方塊;
            case MOSS_CARPET:return 覆地苔蘚;
            case MOSSY_COBBLESTONE:return 青苔鵝卵石;
            case MOSSY_COBBLESTONE_SLAB:return 青苔鵝卵石半磚;
            case MOSSY_COBBLESTONE_STAIRS:return 青苔鵝卵石階梯;
            case MOSSY_COBBLESTONE_WALL:return 青苔鵝卵石牆;
            case MOSSY_STONE_BRICK_SLAB:return 青苔石磚半磚;
            case MOSSY_STONE_BRICK_STAIRS:return 青苔石磚階梯;
            case MOSSY_STONE_BRICK_WALL:return 青苔石磚牆;
            case MOSSY_STONE_BRICKS:return 青苔石磚;
            case MUD:return 泥巴;
            case MUD_BRICK_SLAB:return 泥磚半磚;
            case MUD_BRICK_STAIRS:return 泥磚階梯;
            case MUD_BRICK_WALL:return 泥磚牆;
            case MUD_BRICKS:return 泥磚;
            case MUDDY_MANGROVE_ROOTS:return 淤泥紅樹林木根;
            case MULE_SPAWN_EGG:return 騾子生怪蛋;
            case MUSHROOM_STEM:return 蘑菇柄;
            case MUSHROOM_STEW:return 蘑菇湯;
            case MUSIC_DISC_11:return 唱片11;
            case MUSIC_DISC_13:return 唱片13;
            case MUSIC_DISC_5:return 唱片5;
            case MUSIC_DISC_BLOCKS:return 唱片blocks;
            case MUSIC_DISC_CAT:return 唱片cat;
            case MUSIC_DISC_CHIRP:return 唱片chirp;
            case MUSIC_DISC_FAR:return 唱片far;
            case MUSIC_DISC_MALL:return 唱片mall;
            case MUSIC_DISC_MELLOHI:return 唱片mellohi;
            case MUSIC_DISC_OTHERSIDE:return 唱片otherside;
            case MUSIC_DISC_PIGSTEP:return 唱片Pigstep;
            case MUSIC_DISC_STAL:return 唱片stal;
            case MUSIC_DISC_STRAD:return 唱片strad;
            case MUSIC_DISC_WAIT:return 唱片wait;
            case MUSIC_DISC_WARD:return 唱片ward;
            case MUTTON:return 生羊肉;
            case MYCELIUM:return 菌絲土;
            case NAME_TAG:return 命名牌;
            case NAUTILUS_SHELL:return 鸚鵡螺殼;
            case NETHER_BRICK:return 地獄磚頭;
            case NETHER_BRICK_FENCE:return 地獄磚柵欄;
            case NETHER_BRICK_SLAB:return 地獄磚半磚;
            case NETHER_BRICK_STAIRS:return 地獄磚階梯;
            case NETHER_BRICK_WALL:return 地獄磚牆;
            case NETHER_BRICKS:return 地獄磚;
            case NETHER_GOLD_ORE:return 地獄金礦;
            case NETHER_QUARTZ_ORE:return 地獄石英礦;
            case NETHER_SPROUTS:return 地獄芽;
            case NETHER_STAR:return 地獄之星;
            case NETHER_WART:return 地獄疙瘩;
            case NETHER_WART_BLOCK:return 地獄疙瘩塊;
            case NETHERITE_AXE:return 獄髓斧;
            case NETHERITE_BLOCK:return 獄髓方塊;
            case NETHERITE_BOOTS:return 獄髓靴子;
            case NETHERITE_CHESTPLATE:return 獄髓胸甲;
            case NETHERITE_HELMET:return 獄髓頭盔;
            case NETHERITE_HOE:return 獄髓鋤;
            case NETHERITE_INGOT:return 獄髓錠;
            case NETHERITE_LEGGINGS:return 獄髓護腿;
            case NETHERITE_PICKAXE:return 獄髓鎬;
            case NETHERITE_SCRAP:return 獄髓碎片;
            case NETHERITE_SHOVEL:return 獄髓鏟;
            case NETHERITE_SWORD:return 獄髓劍;
            case NETHERRACK:return 地獄石;
            case NOTE_BLOCK:return 音階盒;
            case OAK_BOAT:return 橡木船;
            case OAK_BUTTON:return 橡木按鈕;
            case OAK_CHEST_BOAT:return 儲物箱橡木船;
            case OAK_DOOR:return 橡木門;
            case OAK_FENCE:return 橡木柵欄;
            case OAK_FENCE_GATE:return 橡木柵欄門;
            case OAK_LEAVES:return 橡木樹葉;
            case OAK_LOG:return 橡木原木;
            case OAK_PLANKS:return 橡木材;
            case OAK_PRESSURE_PLATE:return 橡木壓力板;
            case OAK_SAPLING:return 橡木樹苗;
            case OAK_SIGN:return 橡木告示牌;
            case OAK_SLAB:return 橡木半磚;
            case OAK_STAIRS:return 橡木階梯;
            case OAK_TRAPDOOR:return 橡木地板門;
            case OAK_WOOD:return 橡木塊;
            case OBSERVER:return 偵測器;
            case OBSIDIAN:return 黑曜石;
            case OCELOT_SPAWN_EGG:return 山貓生怪蛋;
            case OCHRE_FROGLIGHT:return 赭黃蛙光體;
            case ORANGE_BANNER:return 橙色旗幟;
            case ORANGE_BED:return 橙色床;
            case ORANGE_CANDLE:return 橙色蠟燭;
            case ORANGE_CARPET:return 橙色地毯;
            case ORANGE_CONCRETE:return 橙色混凝土;
            case ORANGE_CONCRETE_POWDER:return 橙色混凝土粉末;
            case ORANGE_DYE:return 橙色染料;
            case ORANGE_GLAZED_TERRACOTTA:return 橙色釉陶;
            case ORANGE_SHULKER_BOX:return 橙色界伏盒;
            case ORANGE_STAINED_GLASS:return 橙色玻璃;
            case ORANGE_STAINED_GLASS_PANE:return 橙色玻璃片;
            case ORANGE_TERRACOTTA:return 橙色陶土;
            case ORANGE_TULIP:return 橙色鬱金香;
            case ORANGE_WOOL:return 橙色羊毛;
            case OXEYE_DAISY:return 雛菊;
            case OXIDIZED_COPPER:return 氧化的銅方塊;
            case OXIDIZED_CUT_COPPER:return 氧化的切製銅方塊;
            case OXIDIZED_CUT_COPPER_SLAB:return 氧化的切製銅半磚;
            case OXIDIZED_CUT_COPPER_STAIRS:return 氧化的切製銅階梯;
            case PACKED_ICE:return 冰磚;
            case PACKED_MUD:return 泥坯;
            case PAINTING:return 繪畫;
            case PANDA_SPAWN_EGG:return 貓熊生怪蛋;
            case PAPER:return 紙;
            case PARROT_SPAWN_EGG:return 鸚鵡生怪蛋;
            case PEARLESCENT_FROGLIGHT:return 珠紫蛙光體;
            case PEONY:return 牡丹花;
            case PETRIFIED_OAK_SLAB:return 石化橡木半磚;
            case PHANTOM_MEMBRANE:return 夜魅皮膜;
            case PHANTOM_SPAWN_EGG:return 夜魅生怪蛋;
            case PIG_SPAWN_EGG:return 豬生怪蛋;
            case PIGLIN_BANNER_PATTERN:return 豬鼻;
            case PIGLIN_BRUTE_SPAWN_EGG:return 豬布林蠻兵生怪蛋;
            case PIGLIN_SPAWN_EGG:return 豬布林生怪蛋;
            case PILLAGER_SPAWN_EGG:return 掠奪者生怪蛋;
            case PINK_BANNER:return 粉紅色旗幟;
            case PINK_BED:return 粉紅色床;
            case PINK_CANDLE:return 粉紅色蠟燭;
            case PINK_CARPET:return 粉紅色地毯;
            case PINK_CONCRETE:return 粉紅色混凝土;
            case PINK_CONCRETE_POWDER:return 粉紅色混凝土粉末;
            case PINK_DYE:return 粉紅色染料;
            case PINK_GLAZED_TERRACOTTA:return 粉紅色釉陶;
            case PINK_SHULKER_BOX:return 粉紅色界伏盒;
            case PINK_STAINED_GLASS:return 粉紅色玻璃;
            case PINK_STAINED_GLASS_PANE:return 粉紅色玻璃片;
            case PINK_TERRACOTTA:return 粉紅色陶土;
            case PINK_TULIP:return 粉紅色鬱金香;
            case PINK_WOOL:return 粉紅色羊毛;
            case PISTON:return 活塞;
            case PLAYER_HEAD:return 玩家頭顱;
            case PODZOL:return 灰壤;
            case POINTED_DRIPSTONE:return 鐘乳石;
            case POISONOUS_POTATO:return 毒馬鈴薯;
            case POLAR_BEAR_SPAWN_EGG:return 北極熊生怪蛋;
            case POLISHED_ANDESITE:return 拋光安山岩;
            case POLISHED_ANDESITE_SLAB:return 拋光安山岩半磚;
            case POLISHED_ANDESITE_STAIRS:return 拋光安山岩階梯;
            case POLISHED_BASALT:return 拋光玄武岩;
            case POLISHED_BLACKSTONE:return 拋光黑石;
            case POLISHED_BLACKSTONE_BRICK_SLAB:return 拋光黑石磚半磚;
            case POLISHED_BLACKSTONE_BRICK_STAIRS:return 拋光黑石磚階梯;
            case POLISHED_BLACKSTONE_BRICK_WALL:return 拋光黑石磚牆;
            case POLISHED_BLACKSTONE_BRICKS:return 拋光黑石磚;
            case POLISHED_BLACKSTONE_BUTTON:return 拋光黑石按鈕;
            case POLISHED_BLACKSTONE_PRESSURE_PLATE:return 拋光黑石壓力板;
            case POLISHED_BLACKSTONE_SLAB:return 拋光黑石半磚;
            case POLISHED_BLACKSTONE_STAIRS:return 拋光黑石階梯;
            case POLISHED_BLACKSTONE_WALL:return 拋光黑石牆;
            case POLISHED_DEEPSLATE:return 拋光深板岩;
            case POLISHED_DEEPSLATE_SLAB:return 拋光深板岩半磚;
            case POLISHED_DEEPSLATE_STAIRS:return 拋光深板岩階梯;
            case POLISHED_DEEPSLATE_WALL:return 拋光深板岩牆;
            case POLISHED_DIORITE:return 拋光閃長岩;
            case POLISHED_DIORITE_SLAB:return 拋光閃長岩半磚;
            case POLISHED_DIORITE_STAIRS:return 拋光閃長岩階梯;
            case POLISHED_GRANITE:return 拋光花崗岩;
            case POLISHED_GRANITE_SLAB:return 拋光花崗岩半磚;
            case POLISHED_GRANITE_STAIRS:return 拋光花崗岩階梯;
            case POPPED_CHORUS_FRUIT:return 爆開的歌萊果;
            case POPPY:return 罌粟;
            case PORKCHOP:return 生豬肉;
            case POTATO:return 馬鈴薯;
            case POTION:return 藥水;
            case POWDER_SNOW_BUCKET:return 粉雪桶;
            case POWERED_RAIL:return 動力鐵軌;
            case PRISMARINE:return 海磷石;
            case PRISMARINE_BRICK_SLAB:return 海磷石磚半磚;
            case PRISMARINE_BRICK_STAIRS:return 海磷石磚階梯;
            case PRISMARINE_BRICKS:return 海磷石磚;
            case PRISMARINE_CRYSTALS:return 海磷晶體;
            case PRISMARINE_SHARD:return 海磷碎片;
            case PRISMARINE_SLAB:return 海磷石半磚;
            case PRISMARINE_STAIRS:return 海磷石階梯;
            case PRISMARINE_WALL:return 海磷石牆;
            case PUFFERFISH:return 河豚;
            case PUFFERFISH_BUCKET:return 河豚桶;
            case PUFFERFISH_SPAWN_EGG:return 河豚生怪蛋;
            case PUMPKIN:return 南瓜;
            case PUMPKIN_PIE:return 南瓜派;
            case PUMPKIN_SEEDS:return 南瓜種子;
            case PURPLE_BANNER:return 紫色旗幟;
            case PURPLE_BED:return 紫色床;
            case PURPLE_CANDLE:return 紫色蠟燭;
            case PURPLE_CARPET:return 紫色地毯;
            case PURPLE_CONCRETE:return 紫色混凝土;
            case PURPLE_CONCRETE_POWDER:return 紫色混凝土粉末;
            case PURPLE_DYE:return 紫色染料;
            case PURPLE_GLAZED_TERRACOTTA:return 紫色釉陶;
            case PURPLE_SHULKER_BOX:return 紫色界伏盒;
            case PURPLE_STAINED_GLASS:return 紫色玻璃;
            case PURPLE_STAINED_GLASS_PANE:return 紫色玻璃片;
            case PURPLE_TERRACOTTA:return 紫色陶土;
            case PURPLE_WOOL:return 紫色羊毛;
            case PURPUR_BLOCK:return 紫珀方塊;
            case PURPUR_PILLAR:return 紫珀柱;
            case PURPUR_SLAB:return 紫珀半磚;
            case PURPUR_STAIRS:return 紫珀階梯;
            case QUARTZ:return 地獄石英;
            case QUARTZ_BLOCK:return 石英方塊;
            case QUARTZ_BRICKS:return 石英磚;
            case QUARTZ_PILLAR:return 石英柱;
            case QUARTZ_SLAB:return 石英半磚;
            case QUARTZ_STAIRS:return 石英階梯;
            case RABBIT:return 生兔肉;
            case RABBIT_FOOT:return 兔子腳;
            case RABBIT_HIDE:return 兔子皮;
            case RABBIT_SPAWN_EGG:return 兔子生怪蛋;
            case RABBIT_STEW:return 兔肉湯;
            case RAIL:return 鐵軌;
            case RAVAGER_SPAWN_EGG:return 劫毀獸生怪蛋;
            case RAW_COPPER:return 銅原礦;
            case RAW_COPPER_BLOCK:return 銅原礦方塊;
            case RAW_GOLD:return 金原礦;
            case RAW_GOLD_BLOCK:return 金原礦方塊;
            case RAW_IRON:return 鐵原礦;
            case RAW_IRON_BLOCK:return 鐵原礦方塊;
            case RECOVERY_COMPASS:return 回生羅盤;
            case RED_BANNER:return 紅色旗幟;
            case RED_BED:return 紅色床;
            case RED_CANDLE:return 紅色蠟燭;
            case RED_CARPET:return 紅色地毯;
            case RED_CONCRETE:return 紅色混凝土;
            case RED_CONCRETE_POWDER:return 紅色混凝土粉末;
            case RED_DYE:return 紅色染料;
            case RED_GLAZED_TERRACOTTA:return 紅色釉陶;
            case RED_MUSHROOM:return 紅色蘑菇;
            case RED_MUSHROOM_BLOCK:return 紅色蘑菇方塊;
            case RED_NETHER_BRICK_SLAB:return 紅地獄磚半磚;
            case RED_NETHER_BRICK_STAIRS:return 紅地獄磚階梯;
            case RED_NETHER_BRICK_WALL:return 紅地獄磚牆;
            case RED_NETHER_BRICKS:return 紅地獄磚;
            case RED_SAND:return 紅沙;
            case RED_SANDSTONE:return 紅砂岩;
            case RED_SANDSTONE_SLAB:return 紅砂岩半磚;
            case RED_SANDSTONE_STAIRS:return 紅砂岩階梯;
            case RED_SANDSTONE_WALL:return 紅砂岩牆;
            case RED_SHULKER_BOX:return 紅色界伏盒;
            case RED_STAINED_GLASS:return 紅色玻璃;
            case RED_STAINED_GLASS_PANE:return 紅色玻璃片;
            case RED_TERRACOTTA:return 紅色陶土;
            case RED_TULIP:return 紅色鬱金香;
            case RED_WOOL:return 紅色羊毛;
            case REDSTONE:return 紅石粉;
            case REDSTONE_BLOCK:return 紅石方塊;
            case REDSTONE_LAMP:return 紅石燈;
            case REDSTONE_ORE:return 紅石礦;
            case REDSTONE_TORCH:return 紅石火把;
            case REINFORCED_DEEPSLATE:return 強化深板岩;
            case REPEATER:return 紅石中繼器;
            case REPEATING_COMMAND_BLOCK:return 重複型指令方塊;
            case RESPAWN_ANCHOR:return 重生錨;
            case ROOTED_DIRT:return 扎根土;
            case ROSE_BUSH:return 玫瑰叢;
            case ROTTEN_FLESH:return 腐肉;
            case SADDLE:return 鞍;
            case SALMON:return 生鮭魚;
            case SALMON_BUCKET:return 鮭魚桶;
            case SALMON_SPAWN_EGG:return 鮭魚生怪蛋;
            case SAND:return 沙;
            case SANDSTONE:return 砂岩;
            case SANDSTONE_SLAB:return 砂岩半磚;
            case SANDSTONE_STAIRS:return 砂岩階梯;
            case SANDSTONE_WALL:return 砂岩牆;
            case SCAFFOLDING:return 鷹架;
            case SCULK:return 伏聆;
            case SCULK_CATALYST:return 伏聆觸媒;
            case SCULK_SENSOR:return 伏聆振測器;
            case SCULK_SHRIEKER:return 伏聆嘯口;
            case SCULK_VEIN:return 伏聆脈絡;
            case SCUTE:return 鱗甲;
            case SEA_LANTERN:return 海燈籠;
            case SEA_PICKLE:return 海鞘;
            case SEAGRASS:return 海草;
            case SHEARS:return 剪刀;
            case SHEEP_SPAWN_EGG:return 綿羊生怪蛋;
            case SHIELD:return 盾牌;
            case SHROOMLIGHT:return 蕈光體;
            case SHULKER_BOX:return 界伏盒;
            case SHULKER_SHELL:return 界伏殼;
            case SHULKER_SPAWN_EGG:return 界伏蚌生怪蛋;
            case SILVERFISH_SPAWN_EGG:return 蠹魚生怪蛋;
            case SKELETON_HORSE_SPAWN_EGG:return 骷髏馬生怪蛋;
            case SKELETON_SKULL:return 骷髏頭顱;
            case SKELETON_SPAWN_EGG:return 骷髏生怪蛋;
            case SKULL_BANNER_PATTERN:return 骷髏圖紋;
            case SLIME_BALL:return 史萊姆球;
            case SLIME_BLOCK:return 史萊姆方塊;
            case SLIME_SPAWN_EGG:return 史萊姆生怪蛋;
            case SMALL_AMETHYST_BUD:return 小型紫水晶芽;
            case SMALL_DRIPLEAF:return 小懸葉草;
            case SMITHING_TABLE:return 鍛造台;
            case SMOKER:return 煙燻爐;
            case SMOOTH_BASALT:return 平滑玄武岩;
            case SMOOTH_QUARTZ:return 平滑石英方塊;
            case SMOOTH_QUARTZ_SLAB:return 平滑石英半磚;
            case SMOOTH_QUARTZ_STAIRS:return 平滑石英階梯;
            case SMOOTH_RED_SANDSTONE:return 平滑紅砂岩;
            case SMOOTH_RED_SANDSTONE_SLAB:return 平滑紅砂岩半磚;
            case SMOOTH_RED_SANDSTONE_STAIRS:return 平滑紅砂岩階梯;
            case SMOOTH_SANDSTONE:return 平滑砂岩;
            case SMOOTH_SANDSTONE_SLAB:return 平滑砂岩半磚;
            case SMOOTH_SANDSTONE_STAIRS:return 平滑砂岩階梯;
            case SMOOTH_STONE:return 平滑石頭;
            case SMOOTH_STONE_SLAB:return 平滑石半磚;
            case SNOW:return 雪;
            case SNOW_BLOCK:return 雪塊;
            case SNOWBALL:return 雪球;
            case SOUL_CAMPFIRE:return 靈魂營火;
            case SOUL_LANTERN:return 靈魂燈籠;
            case SOUL_SAND:return 靈魂砂;
            case SOUL_SOIL:return 靈魂土;
            case SOUL_TORCH:return 靈魂火把;
            case SPAWNER:return 生怪磚;
            case SPECTRAL_ARROW:return 追跡之箭;
            case SPIDER_EYE:return 蜘蛛眼;
            case SPIDER_SPAWN_EGG:return 蜘蛛生怪蛋;
            case SPLASH_POTION:return 飛濺藥水;
            case SPONGE:return 海綿;
            case SPORE_BLOSSOM:return 孢子花;
            case SPRUCE_BOAT:return 杉木船;
            case SPRUCE_BUTTON:return 杉木按鈕;
            case SPRUCE_CHEST_BOAT:return 儲物箱杉木船;
            case SPRUCE_DOOR:return 杉木門;
            case SPRUCE_FENCE:return 杉木柵欄;
            case SPRUCE_FENCE_GATE:return 杉木柵欄門;
            case SPRUCE_LEAVES:return 杉木樹葉;
            case SPRUCE_LOG:return 杉木原木;
            case SPRUCE_PLANKS:return 杉木材;
            case SPRUCE_PRESSURE_PLATE:return 杉木壓力板;
            case SPRUCE_SAPLING:return 杉木樹苗;
            case SPRUCE_SIGN:return 杉木告示牌;
            case SPRUCE_SLAB:return 杉木半磚;
            case SPRUCE_STAIRS:return 杉木階梯;
            case SPRUCE_TRAPDOOR:return 杉木地板門;
            case SPRUCE_WOOD:return 杉木塊;
            case SPYGLASS:return 望遠鏡;
            case SQUID_SPAWN_EGG:return 魷魚生怪蛋;
            case STICK:return 木棒;
            case STICKY_PISTON:return 黏性活塞;
            case STONE:return 石頭;
            case STONE_AXE:return 石斧;
            case STONE_BRICK_SLAB:return 石磚半磚;
            case STONE_BRICK_STAIRS:return 石磚階梯;
            case STONE_BRICK_WALL:return 石磚牆;
            case STONE_BRICKS:return 石磚;
            case STONE_BUTTON:return 石製按鈕;
            case STONE_HOE:return 石鋤;
            case STONE_PICKAXE:return 石鎬;
            case STONE_PRESSURE_PLATE:return 石製壓力板;
            case STONE_SHOVEL:return 石鏟;
            case STONE_SLAB:return 石半磚;
            case STONE_STAIRS:return 石頭階梯;
            case STONE_SWORD:return 石劍;
            case STONECUTTER:return 切石機;
            case STRAY_SPAWN_EGG:return 流髑生怪蛋;
            case STRIDER_SPAWN_EGG:return 熾足獸生怪蛋;
            case STRING:return 線;
            case STRIPPED_ACACIA_LOG:return 剝皮相思木原木;
            case STRIPPED_ACACIA_WOOD:return 剝皮相思木塊;
            case STRIPPED_BIRCH_LOG:return 剝皮樺木原木;
            case STRIPPED_BIRCH_WOOD:return 剝皮樺木塊;
            case STRIPPED_CRIMSON_HYPHAE:return 剝皮緋紅菌絲體;
            case STRIPPED_CRIMSON_STEM:return 剝皮緋紅蕈柄;
            case STRIPPED_DARK_OAK_LOG:return 剝皮黑橡木原木;
            case STRIPPED_DARK_OAK_WOOD:return 剝皮黑橡木塊;
            case STRIPPED_JUNGLE_LOG:return 剝皮叢林木原木;
            case STRIPPED_JUNGLE_WOOD:return 剝皮叢林木塊;
            case STRIPPED_MANGROVE_LOG:return 剝皮紅樹林木原木;
            case STRIPPED_MANGROVE_WOOD:return 剝皮紅樹林木塊;
            case STRIPPED_OAK_LOG:return 剝皮橡木原木;
            case STRIPPED_OAK_WOOD:return 剝皮橡木塊;
            case STRIPPED_SPRUCE_LOG:return 剝皮杉木原木;
            case STRIPPED_SPRUCE_WOOD:return 剝皮杉木塊;
            case STRIPPED_WARPED_HYPHAE:return 剝皮扭曲菌絲體;
            case STRIPPED_WARPED_STEM:return 剝皮扭曲蕈柄;
            case STRUCTURE_BLOCK:return 結構方塊;
            case STRUCTURE_VOID:return 結構空位;
            case SUGAR:return 糖;
            case SUGAR_CANE:return 甘蔗;
            case SUNFLOWER:return 向日葵;
            case SUSPICIOUS_STEW:return 可疑的燉湯;
            case SWEET_BERRIES:return 甜莓;
            case TADPOLE_BUCKET:return 蝌蚪桶;
            case TADPOLE_SPAWN_EGG:return 蝌蚪生怪蛋;
            case TALL_GRASS:return 芒草;
            case TARGET:return 標靶;
            case TERRACOTTA:return 陶土;
            case TINTED_GLASS:return 遮光玻璃;
            case TIPPED_ARROW:return 藥水箭;
            case TNT:return TNT;
            case TNT_MINECART:return TNT礦車;
            case TORCH:return 火把;
            case TOTEM_OF_UNDYING:return 不死圖騰;
            case TRADER_LLAMA_SPAWN_EGG:return 商駝生怪蛋;
            case TRAPPED_CHEST:return 陷阱儲物箱;
            case TRIDENT:return 三叉戟;
            case TRIPWIRE_HOOK:return 絆線鉤;
            case TROPICAL_FISH:return 熱帶魚;
            case TROPICAL_FISH_BUCKET:return 熱帶魚桶;
            case TROPICAL_FISH_SPAWN_EGG:return 熱帶魚生怪蛋;
            case TUBE_CORAL:return 管珊瑚;
            case TUBE_CORAL_BLOCK:return 管珊瑚方塊;
            case TUBE_CORAL_FAN:return 扇狀管珊瑚;
            case TUFF:return 凝灰岩;
            case TURTLE_EGG:return 海龜蛋;
            case TURTLE_HELMET:return 海龜殼;
            case TURTLE_SPAWN_EGG:return 海龜生怪蛋;
            case TWISTING_VINES:return 扭曲藤;
            case VERDANT_FROGLIGHT:return 蒼翠蛙光體;
            case VEX_SPAWN_EGG:return 惱鬼生怪蛋;
            case VILLAGER_SPAWN_EGG:return 村民生怪蛋;
            case VINDICATOR_SPAWN_EGG:return 衛道士生怪蛋;
            case VINE:return 藤蔓;
            case WANDERING_TRADER_SPAWN_EGG:return 流浪商人生怪蛋;
            case WARDEN_SPAWN_EGG:return 伏守者生怪蛋;
            case WARPED_BUTTON:return 扭曲蕈木按鈕;
            case WARPED_DOOR:return 扭曲蕈木門;
            case WARPED_FENCE:return 扭曲蕈木柵欄;
            case WARPED_FENCE_GATE:return 扭曲蕈木柵欄門;
            case WARPED_FUNGUS:return 扭曲蕈菇;
            case WARPED_FUNGUS_ON_A_STICK:return 扭曲蕈菇釣竿;
            case WARPED_HYPHAE:return 扭曲菌絲體;
            case WARPED_NYLIUM:return 扭曲菌絲石;
            case WARPED_PLANKS:return 扭曲蕈木材;
            case WARPED_PRESSURE_PLATE:return 扭曲蕈木壓力板;
            case WARPED_ROOTS:return 扭曲蕈根;
            case WARPED_SIGN:return 扭曲蕈木告示牌;
            case WARPED_SLAB:return 扭曲蕈木半磚;
            case WARPED_STAIRS:return 扭曲蕈木階梯;
            case WARPED_STEM:return 扭曲蕈柄;
            case WARPED_TRAPDOOR:return 扭曲蕈木地板門;
            case WARPED_WART_BLOCK:return 扭曲疙瘩塊;
            case WATER_BUCKET:return 水桶;
            case WAXED_COPPER_BLOCK:return 上蠟的銅方塊;
            case WAXED_CUT_COPPER:return 上蠟的切製銅方塊;
            case WAXED_CUT_COPPER_SLAB:return 上蠟的切製銅半磚;
            case WAXED_CUT_COPPER_STAIRS:return 上蠟的切製銅階梯;
            case WAXED_EXPOSED_COPPER:return 上蠟的斑駁銅方塊;
            case WAXED_EXPOSED_CUT_COPPER:return 上蠟的斑駁切製銅方塊;
            case WAXED_EXPOSED_CUT_COPPER_SLAB:return 上蠟的斑駁切製銅半磚;
            case WAXED_EXPOSED_CUT_COPPER_STAIRS:return 上蠟的斑駁切製銅階梯;
            case WAXED_OXIDIZED_COPPER:return 上蠟的氧化銅方塊;
            case WAXED_OXIDIZED_CUT_COPPER:return 上蠟的氧化切製銅方塊;
            case WAXED_OXIDIZED_CUT_COPPER_SLAB:return 上蠟的氧化切製銅半磚;
            case WAXED_OXIDIZED_CUT_COPPER_STAIRS:return 上蠟的氧化切製銅階梯;
            case WAXED_WEATHERED_COPPER:return 上蠟的風化銅方塊;
            case WAXED_WEATHERED_CUT_COPPER:return 上蠟的風化切製銅方塊;
            case WAXED_WEATHERED_CUT_COPPER_SLAB:return 上蠟的風化切製銅半磚;
            case WAXED_WEATHERED_CUT_COPPER_STAIRS:return 上蠟的風化切製銅階梯;
            case WEATHERED_COPPER:return 風化的銅方塊;
            case WEATHERED_CUT_COPPER:return 風化的切製銅方塊;
            case WEATHERED_CUT_COPPER_SLAB:return 風化的切製銅半磚;
            case WEATHERED_CUT_COPPER_STAIRS:return 風化的切製銅階梯;
            case WEEPING_VINES:return 垂泣藤;
            case WET_SPONGE:return 濕海綿;
            case WHEAT:return 小麥;
            case WHEAT_SEEDS:return 小麥種子;
            case WHITE_BANNER:return 白色旗幟;
            case WHITE_BED:return 白色床;
            case WHITE_CANDLE:return 白色蠟燭;
            case WHITE_CARPET:return 白色地毯;
            case WHITE_CONCRETE:return 白色混凝土;
            case WHITE_CONCRETE_POWDER:return 白色混凝土粉末;
            case WHITE_DYE:return 白色染料;
            case WHITE_GLAZED_TERRACOTTA:return 白色釉陶;
            case WHITE_SHULKER_BOX:return 白色界伏盒;
            case WHITE_STAINED_GLASS:return 白色玻璃;
            case WHITE_STAINED_GLASS_PANE:return 白色玻璃片;
            case WHITE_TERRACOTTA:return 白色陶土;
            case WHITE_TULIP:return 白色鬱金香;
            case WHITE_WOOL:return 白色羊毛;
            case WITCH_SPAWN_EGG:return 女巫生怪蛋;
            case WITHER_ROSE:return 凋零玫瑰;
            case WITHER_SKELETON_SKULL:return 凋零骷髏頭顱;
            case WITHER_SKELETON_SPAWN_EGG:return 凋零骷髏生怪蛋;
            case WOLF_SPAWN_EGG:return 狼生怪蛋;
            case WOODEN_AXE:return 木斧;
            case WOODEN_HOE:return 木鋤;
            case WOODEN_PICKAXE:return 木鎬;
            case WOODEN_SHOVEL:return 木鏟;
            case WOODEN_SWORD:return 木劍;
            case WRITABLE_BOOK:return 書和羽毛筆;
            case WRITTEN_BOOK:return 完成的書;
            case YELLOW_BANNER:return 黃色旗幟;
            case YELLOW_BED:return 黃色床;
            case YELLOW_CANDLE:return 黃色蠟燭;
            case YELLOW_CARPET:return 黃色地毯;
            case YELLOW_CONCRETE:return 黃色混凝土;
            case YELLOW_CONCRETE_POWDER:return 黃色混凝土粉末;
            case YELLOW_DYE:return 黃色染料;
            case YELLOW_GLAZED_TERRACOTTA:return 黃色釉陶;
            case YELLOW_SHULKER_BOX:return 黃色界伏盒;
            case YELLOW_STAINED_GLASS:return 黃色玻璃;
            case YELLOW_STAINED_GLASS_PANE:return 黃色玻璃片;
            case YELLOW_TERRACOTTA:return 黃色陶土;
            case YELLOW_WOOL:return 黃色羊毛;
            case ZOGLIN_SPAWN_EGG:return 豬屍獸生怪蛋;
            case ZOMBIE_HEAD:return 殭屍頭顱;
            case ZOMBIE_HORSE_SPAWN_EGG:return 殭屍馬生怪蛋;
            case ZOMBIE_SPAWN_EGG:return 殭屍生怪蛋;
            case ZOMBIE_VILLAGER_SPAWN_EGG:return 殭屍村民生怪蛋;
            case ZOMBIFIED_PIGLIN_SPAWN_EGG:return 殭屍化豬布林生怪蛋;
        }
        */
        return type[0];
    }
}