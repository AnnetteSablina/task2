package com.annette.task2.ball;

import com.annette.task2.logic.ColorLogic;
import com.annette.task2.logic.ValueLogic;

import java.util.Objects;

public class Ball {
    private Color color;
    private int weight;
    public Ball (){};
    public Ball (Color color,int weight){
        this.color = color;
        this.weight = weight;
    }
    public static Ball enterBallFiends(){
       Color color = ColorLogic.fillColor();
       int weight = ValueLogic.EnterPositiveNotZeroValue("Enter the weight");
       return new Ball(color,weight);
    }

    @Override
    public String toString() {
        return "Ball " +
                "with color " + color +
                " with weight =" + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return weight == ball.weight && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
