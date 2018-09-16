package com.sm.comboshowdesign.combobutton;

import android.animation.TypeEvaluator;
import android.graphics.Point;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/16 上午12:19
 */
public class PointEvaluatro implements TypeEvaluator<Point> {
    @Override
    public Point evaluate(float fraction, Point startValue, Point endValue) {

        int x = (int) (startValue.x + (endValue.x - startValue.x) * fraction);
        int y = (int) (startValue.y + (endValue.y - startValue.y) * fraction);
        return new Point(x, y);
    }


}
