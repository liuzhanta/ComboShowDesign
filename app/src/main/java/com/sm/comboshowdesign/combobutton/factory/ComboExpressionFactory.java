package com.sm.comboshowdesign.combobutton.factory;

import android.widget.Button;

import com.sm.comboshowdesign.combobutton.strategy.AbstractComboButtonShow;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelOneShow;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelThreeShow;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelTwoShow;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonType;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/16 上午12:33
 */
public class ComboExpressionFactory {

    public static AbstractComboButtonShow createExpression(Button button, ComboButtonType type) {
        switch (type) {
            case LEVEL_ONE:
                return new ComboButtonLevelOneShow(button);
            case LEVEL_TWO:
                return new ComboButtonLevelTwoShow(button);
            case LEVEL_THREE:
                return new ComboButtonLevelThreeShow(button);
        }
        return null;
    }
}
