package com.sm.comboshowdesign.combobutton.factory;

import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;

import com.sm.comboshowdesign.combobutton.PointEvaluatro;
import com.sm.comboshowdesign.combobutton.strategy.TranslationValue;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/16 上午12:17
 */
public class ComboButtonAnimatorFactory {

    public static ValueAnimator createTranslationAnimator(final View button, TranslationValue value) {
        final ValueAnimator valueAnimator = ValueAnimator.ofObject(new PointEvaluatro(),
                value.startPoint, value.endPoint);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Point point = (Point) animation.getAnimatedValue();
                button.setTranslationX(point.x);
                button.setTranslationY(point.y);
            }
        });
        return valueAnimator;
    }
}
