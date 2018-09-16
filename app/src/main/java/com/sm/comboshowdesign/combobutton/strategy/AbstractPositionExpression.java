package com.sm.comboshowdesign.combobutton.strategy;

import android.animation.Animator;
import android.widget.Button;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午10:39
 */
public abstract class AbstractPositionExpression {

    protected Button button;
    protected TranslationValue.Point defaultPoint = new TranslationValue.Point();

    public AbstractPositionExpression(Button button) {
        this.button = button;
        defaultPoint = new TranslationValue.Point(button.getTranslationX(),button.getTranslationY());
    }

    public abstract Animator getAnimator(ComboButtonPositionContext context);

    abstract int getSpacing();
}
