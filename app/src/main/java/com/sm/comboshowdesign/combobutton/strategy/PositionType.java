package com.sm.comboshowdesign.combobutton.strategy;



/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午10:51
 */
public  enum PositionType {
    POS_1 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            switch (comboButtonType) {
                case LEVEL_ONE:
                    return new TranslationValue.Point(startPoint.x+comboButtonType.distance, startPoint.y);
                case LEVEL_TWO:
                    return new TranslationValue.Point(startPoint.x+comboButtonType.distance, startPoint.y+comboButtonType.distance);
                case LEVEL_THREE:
                    return new TranslationValue.Point(startPoint.x+comboButtonType.distance, startPoint.y+comboButtonType.distance);
            }
            return null;
        }
    },
    POS_2 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_3 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_4 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_5 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_6 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_7 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    },
    POS_8 {
        @Override
        TranslationValue.Point getEndPoint(TranslationValue.Point startPoint) {
            return null;
        }
    };

    public int distance;
    ComboButtonType comboButtonType;


    abstract TranslationValue.Point getEndPoint(
            TranslationValue.Point startPoint);

}
