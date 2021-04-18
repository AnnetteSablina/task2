package com.annette.task2.logic;

import com.annette.task2.ball.Color;
import com.annette.task2.utility.ColorException;



public class ColorLogic {

    public static void isColorExist(String color) throws ColorException {
        boolean check = false;
        color = color.toLowerCase();
        for (Color colors : Color.values()) {
            if (color.equals(colors.name().toLowerCase())) {
                check = true;
                break;
            }
        }
        if (!check) throw new ColorException("Invalid color");
    }
}
