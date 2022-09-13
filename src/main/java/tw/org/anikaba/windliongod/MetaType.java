package tw.org.anikaba.windliongod;

/**
 * @author anikaba
 */

public enum MetaType {

    蠑螈桶樣式("AxolotlBucketMeta"),
    旗幟樣式("BannerMeta"),
    方塊數據樣式("BlockDataMeta"),
    方塊樣式("BlockStateMeta"),
    書本樣式("BookMeta"),
    束口袋樣式("BundleMeta"),
    指南針樣式("CompassMeta"),
    弩弓樣式("CrossbowMeta"),
    耐久值樣式("Damageable"),
    附魔效果樣式("EnchantmentStorageMeta"),
    煙花效果樣式("FireworkEffectMeta"),
    煙花樣式("FireworkMeta"),
    道具樣式("ItemMeta"),
    知識書樣式("KnowledgeBookMeta"),
    皮甲樣式("LeatherArmorMeta"),
    地圖樣式("MapMeta"),
    藥劑樣式("PotionMeta"),
    可維修樣式("Repairable"),
    頭顱樣式("SkullMeta"),
    生怪蛋樣式("SpawnEggMeta"),
    可疑燉菜樣式("SuspiciousStewMeta"),
    熱帶魚桶樣式("TropicalFishBucketMeta");

    private final String meta;

    MetaType(String meta) {
        this.meta = meta;
    }

    public String getMeta() {
        return meta;
    }
}