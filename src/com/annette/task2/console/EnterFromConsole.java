package com.annette.task2.console;

import com.annette.task2.ball.Ball;
import com.annette.task2.ball.Color;
import com.annette.task2.logic.ColorLogic;
import com.annette.task2.utility.*;

public class EnterFromConsole {
    public static Ball enterBallFiends() {
        Color color = EnterFromConsole.fillColor();
        int weight = 0;
        while (true) {
            try {
                weight = EnterValue.enterValue("Enter the weight", Mode.POSITIVE_NOT_ZERO);
                return new Ball(color, weight);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static Color fillColor() {
        while (true) {
            String color = EnterString.enterString("Enter the color");
            try {
                ColorLogic.isColorExist(color);
                return Color.valueOf(color.toUpperCase());
            } catch (ColorException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}