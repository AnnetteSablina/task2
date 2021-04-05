package com.annette.task2.logic;

import com.annette.task2.ball.Color;
import com.annette.task2.utility.ColorException;
import com.annette.task2.utility.EnterString;


public class ColorLogic {

    public static Color fillColor(){
        while (true){
            String color = EnterString.enterString("Enter the color");
            try {
                isColorExist(color);
                return Color.valueOf(color.toUpperCase());
            } catch (ColorException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static void isColorExist(String color) throws ColorException {
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

    public static Color selectPinkColor() {
        return Color.PINK;
    }

    public static Color selectPurpleColor() {
        return Color.PURPLE;
    }

    public static Color selectGreenColor() {
        return Color.GREEN;
    }

    public static Color selectBlueColor() {
        return Color.BLUE;
    }

    public static Color selectRedColor() {
        return Color.RED;
    }

    public static Color selectYellowColor() {
        return Color.YELLOW;
    }

}
