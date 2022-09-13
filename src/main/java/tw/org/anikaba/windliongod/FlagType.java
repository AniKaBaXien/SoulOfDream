package tw.org.anikaba.windliongod;

import org.bukkit.inventory.ItemFlag;

import java.util.Arrays;

/**
 * @author anikaba
 */

public enum FlagType {

    隱藏屬性(ItemFlag.HIDE_ATTRIBUTES),
    隱藏可破壞(ItemFlag.HIDE_DESTROYS),
    隱藏染色(ItemFlag.HIDE_DYE),
    隱藏附魔(ItemFlag.HIDE_ENCHANTS),
    隱藏建造(ItemFlag.HIDE_PLACED_ON),
    隱藏藥水效果(ItemFlag.HIDE_POTION_EFFECTS),
    隱藏牢不可破(ItemFlag.HIDE_UNBREAKABLE);

    private final ItemFlag itemFlag;

    FlagType(ItemFlag itemFlag) {
        this.itemFlag = itemFlag;
    }

    public ItemFlag getItemFlag() {
        return itemFlag;
    }

    public FlagType getByItemFlag(ItemFlag itemFlag) {
        FlagType[] type = new FlagType[0];
        Arrays.stream(FlagType.values()).forEach(flagType ->{
            if(flagType.itemFlag == itemFlag){
                type[0] = flagType;
            }
        });
        /*
        switch (itemFlag) {
            case HIDE_ATTRIBUTES:
                return 隱藏屬性;
            case HIDE_DESTROYS:
                return 隱藏可破壞;
            case HIDE_DYE:
                return 隱藏染色;
            case HIDE_ENCHANTS:
                return 隱藏附魔;
            case HIDE_PLACED_ON:
                return 隱藏建造;
            case HIDE_POTION_EFFECTS:
                return 隱藏藥水效果;
            case HIDE_UNBREAKABLE:
                return 隱藏牢不可破;
         */
        return type[0];
    }
}