package com.sm.comboshowdesign.combobutton.strategy;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/16 上午12:34
 */
public enum  ComboButtonType {
    LEVEL_ONE(10),
    LEVEL_TWO(100),
    LEVEL_THREE(50),
    CLOSE(200);
    public int distance;

    ComboButtonType(int distance) {
        this.distance = distance;
    }
}
