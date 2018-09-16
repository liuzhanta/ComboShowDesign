package com.sm.comboshowdesign.combobutton.strategy;

import android.animation.Animator;
import android.widget.Button;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午10:42
 */
public class ComboCloseButtonExpression extends AbstractPositionExpression {


    public ComboCloseButtonExpression(Button button) {
        super(button);
    }

    @Override
    public Animator getAnimator(ComboButtonPositionContext context) {
        return null;
    }

    @Override
    int getSpacing() {
        return 0;
    }


}
