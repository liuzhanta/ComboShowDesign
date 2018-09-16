package com.sm.comboshowdesign.combobutton.strategy;

import android.animation.Animator;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午10:43
 */
public class ComboButtonPositionContext {

    public PositionType positionType;
    public Button button;

    List<AbstractPositionExpression> list = new ArrayList<>();

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void add(AbstractPositionExpression strategy){
        list.add(strategy);
    }
    public List<Animator> getResult(){
        List<Animator> result = new ArrayList<>();
        for (AbstractPositionExpression expression : list) {
            result.add(expression.getAnimator(this));
        }
        return result;
    }


}
