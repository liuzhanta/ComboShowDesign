package com.sm.comboshowdesign.combobutton.factory;

import android.widget.Button;

import com.sm.comboshowdesign.combobutton.strategy.AbstractPositionExpression;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelOneExpression;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelThreeExpression;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonLevelTwoExpression;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonType;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/16 上午12:33
 */
public class ComboExpressionFactory {

    public static AbstractPositionExpression createExpression(Button button, ComboButtonType type) {
        switch (type) {
            case LEVEL_ONE:
                return new ComboButtonLevelOneExpression(button);
            case LEVEL_TWO:
                return new ComboButtonLevelTwoExpression(button);
            case LEVEL_THREE:
                return new ComboButtonLevelThreeExpression(button);
        }
        return null;
    }
}
