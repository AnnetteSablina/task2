package com.annette.task2.ball;



public class Ball {
    private Color color;
    private int weight;
    public Ball (){};
    public Ball (Color color,int weight){
        this.color = color;
        this.weight = weight;
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
        return color.hashCode() + weight * 31 ;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
