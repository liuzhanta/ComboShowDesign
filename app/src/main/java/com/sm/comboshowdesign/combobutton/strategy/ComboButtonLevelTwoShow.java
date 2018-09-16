package com.sm.comboshowdesign.combobutton.strategy;

import android.animation.Animator;
import android.widget.Button;

import com.sm.comboshowdesign.combobutton.factory.ComboButtonAnimatorFactory;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午10:42
 */
public class ComboButtonLevelTwoShow extends AbstractComboButtonShow {

    public ComboButtonLevelTwoShow(Button button) {
        super(button);
    }

    @Override
    public Animator getAnimator(ComboButtonPositionContext context) {
        final PositionType positionType = context.positionType;

        TranslationValue translationValue = new TranslationValue();
        translationValue.startPoint = defaultPoint;
        translationValue.endPoint = positionType.getEndPoint(defaultPoint);
        return ComboButtonAnimatorFactory.createTranslationAnimator(button, translationValue);
    }

    @Override
    int getSpacing() {
        return 10;
    }
}
