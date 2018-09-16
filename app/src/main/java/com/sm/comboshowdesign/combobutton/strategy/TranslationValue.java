package com.sm.comboshowdesign.combobutton.strategy;

/**
 * Description:  <br>
 * Author:Terry<br>
 * Date:2018/9/15 下午11:49
 */
public class TranslationValue {
   public Point startPoint;
   public Point endPoint;

   public static class Point{
      public float x;
      public float y;

       public Point() {
       }

       public Point(float x, float y) {
           this.x = x;
           this.y = y;
       }
   }

}
