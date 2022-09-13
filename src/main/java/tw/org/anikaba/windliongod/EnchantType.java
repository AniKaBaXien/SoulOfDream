package tw.org.anikaba.windliongod;

import org.bukkit.enchantments.Enchantment;

import java.util.Arrays;

/**
 * @author anikaba
 */

public enum EnchantType {

    強力(Enchantment.ARROW_DAMAGE),
    火焰(Enchantment.ARROW_FIRE),
    無限(Enchantment.ARROW_INFINITE),
    衝擊(Enchantment.ARROW_KNOCKBACK),
    綁定詛咒(Enchantment.BINDING_CURSE),
    喚雷(Enchantment.CHANNELING),
    鋒利(Enchantment.DAMAGE_ALL),
    節肢剋星(Enchantment.DAMAGE_ARTHROPODS),
    不死剋星(Enchantment.DAMAGE_UNDEAD),
    深海漫遊(Enchantment.DEPTH_STRIDER),
    效率(Enchantment.DIG_SPEED),
    耐久(Enchantment.DURABILITY),
    燃燒(Enchantment.FIRE_ASPECT),
    冰霜行者(Enchantment.FROST_WALKER),
    魚叉(Enchantment.IMPALING),
    擊退(Enchantment.KNOCKBACK),
    幸運(Enchantment.LOOT_BONUS_BLOCKS),
    掠奪(Enchantment.LOOT_BONUS_MOBS),
    忠誠(Enchantment.LOYALTY),
    海洋的祝福(Enchantment.LUCK),
    魚餌(Enchantment.LURE),
    修補(Enchantment.MENDING),
    分裂箭矢(Enchantment.MULTISHOT),
    水中呼吸(Enchantment.OXYGEN),
    貫穿(Enchantment.PIERCING),
    保護(Enchantment.PROTECTION_ENVIRONMENTAL),
    爆炸保護(Enchantment.PROTECTION_EXPLOSIONS),
    輕盈(Enchantment.PROTECTION_FALL),
    火焰保護(Enchantment.PROTECTION_FIRE),
    投射物保護(Enchantment.PROTECTION_PROJECTILE),
    快速上弦(Enchantment.QUICK_CHARGE),
    波濤(Enchantment.RIPTIDE),
    絲綢之觸(Enchantment.SILK_TOUCH),
    靈魂疾走(Enchantment.SOUL_SPEED),
    橫掃之刃(Enchantment.SWEEPING_EDGE),
    迅捷潛行(Enchantment.SWIFT_SNEAK),
    尖刺(Enchantment.THORNS),
    消失詛咒(Enchantment.VANISHING_CURSE),
    親水性(Enchantment.WATER_WORKER);

    private final Enchantment enchantment;
    EnchantType(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public EnchantType getByEnchantment(Enchantment enchantment) {
        EnchantType[] type = new EnchantType[0];
        Arrays.stream(EnchantType.values()).forEach(enchantType ->{
            if(enchantType.enchantment == enchantment){
                type[0] = enchantType;
            }
        });
        /*
        switch (enchantment.getName()) {
            case "ARROW_DAMAGE":
                return 強力;
            case "ARROW_FIRE":
                return 火焰;
            case "ARROW_INFINITE":
                return 無限;
            case "ARROW_KNOCKBACK":
                return 衝擊;
            case "BINDING_CURSE":
                return 綁定詛咒;
            case "CHANNELING":
                return 喚雷;
            case "DAMAGE_ALL":
                return 鋒利;
            case "DAMAGE_ARTHROPODS":
                return 節肢剋星;
            case "DAMAGE_UNDEAD":
                return 不死剋星;
            case "DEPTH_STRIDER":
                return 深海漫遊;
            case "DIG_SPEED":
                return 效率;
            case "DURABILITY":
                return 耐久;
            case "FIRE_ASPECT":
                return 燃燒;
            case "FROST_WALKER":
                return 冰霜行者;
            case "IMPALING":
                return 魚叉;
            case "KNOCKBACK":
                return 擊退;
            case "LOOT_BONUS_BLOCKS":
                return 幸運;
            case "LOOT_BONUS_MOBS":
                return 掠奪;
            case "LOYALTY":
                return 忠誠;
            case "LUCK":
                return 海洋的祝福;
            case "LURE":
                return 魚餌;
            case "MENDING":
                return 修補;
            case "MULTISHOT":
                return 分裂箭矢;
            case "OXYGEN":
                return 水中呼吸;
            case "PIERCING":
                return 貫穿;
            case "PROTECTION_ENVIRONMENTAL":
                return 保護;
            case "PROTECTION_EXPLOSIONS":
                return 爆炸保護;
            case "PROTECTION_FALL":
                return 輕盈;
            case "PROTECTION_FIRE":
                return 火焰保護;
            case "PROTECTION_PROJECTILE":
                return 投射物保護;
            case "QUICK_CHARGE":
                return 快速上弦;
            case "RIPTIDE":
                return 波濤;
            case "SILK_TOUCH":
                return 絲綢之觸;
            case "SOUL_SPEED":
                return 靈魂疾走;
            case "SWEEPING_EDGE":
                return 橫掃之刃;
            case "SWIFT_SNEAK":
                return 迅捷潛行;
            case "THORNS":
                return 尖刺;
            case "VANISHING_CURSE":
                return 消失詛咒;
            case "WATER_WORKER":
                return 親水性;
        }
        */
        return type[0];
    }
}