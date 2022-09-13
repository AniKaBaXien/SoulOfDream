package tw.org.anikaba.windliongod;

import org.bukkit.attribute.Attribute;

import java.util.Arrays;

/**
 * @author anikaba
 */

public enum AttributeType {

    盔甲(Attribute.GENERIC_ARMOR),
    盔甲強度(Attribute.GENERIC_ARMOR_TOUGHNESS),
    攻擊傷害(Attribute.GENERIC_ATTACK_DAMAGE),
    擊退(Attribute.GENERIC_ATTACK_KNOCKBACK),
    攻擊速度(Attribute.GENERIC_ATTACK_SPEED),
    飛行速度(Attribute.GENERIC_FLYING_SPEED),
    生物追蹤範圍(Attribute.GENERIC_FOLLOW_RANGE),
    抗擊退(Attribute.GENERIC_KNOCKBACK_RESISTANCE),
    幸運(Attribute.GENERIC_LUCK),
    最高生命值(Attribute.GENERIC_MAX_HEALTH),
    加速(Attribute.GENERIC_MOVEMENT_SPEED),
    馬跳躍力(Attribute.HORSE_JUMP_STRENGTH),
    殭屍增援隊(Attribute.ZOMBIE_SPAWN_REINFORCEMENTS);

    private final Attribute attribute;

    AttributeType(Attribute attribute) {
        this.attribute = attribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public AttributeType getByAttribute(Attribute attribute) {
        AttributeType[] type = new AttributeType[0];
        Arrays.stream(AttributeType.values()).forEach(attributeType ->{
            if(attributeType.attribute == attribute){
                type[0] = attributeType;
            }
        });
        return type[0];
    }
}
