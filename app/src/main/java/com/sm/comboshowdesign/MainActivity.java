package com.sm.comboshowdesign;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sm.comboshowdesign.combobutton.factory.ComboExpressionFactory;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonPositionContext;
import com.sm.comboshowdesign.combobutton.strategy.ComboButtonType;
import com.sm.comboshowdesign.combobutton.strategy.PositionType;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button comboButton1;
    private Button comboButton2;
    private Button comboButton3;
    private Button timerButton;
    private Button closeButton;

    private View targetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComboButtonPositionContext context = new ComboButtonPositionContext();
        context.setPositionType(PositionType.POS_1);

        // measure Button
        measureButton();

        // startAnimation
        startAnimation();


    }

    private void measureButton() {

    }

    private List<Animator> getComobButtonAnimator() {
        ComboButtonPositionContext context = new ComboButtonPositionContext();
        context.add(ComboExpressionFactory.createExpression(comboButton1, ComboButtonType.LEVEL_ONE));
        context.add(ComboExpressionFactory.createExpression(comboButton2, ComboButtonType.LEVEL_TWO));
        context.add(ComboExpressionFactory.createExpression(comboButton3, ComboButtonType.LEVEL_THREE));
        context.add(ComboExpressionFactory.createExpression(closeButton, ComboButtonType.CLOSE));
        context.setPositionType(PositionType.POS_1);
        return context.getResult();
    }


    private void startAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();

        android.animation.Animator timerButtonANimat = null;
        android.animation.Animator comboButtonANimse = null;

        animatorSet.play(timerButtonANimat);
        animatorSet.playTogether(getComobButtonAnimator());
        animatorSet.start();

    }
}
