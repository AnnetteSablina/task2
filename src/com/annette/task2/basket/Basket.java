package com.annette.task2.basket;


import com.annette.task2.ball.Ball;

import java.util.ArrayList;
import java.util.Arrays;


public class Basket  {
    private ArrayList<Ball> basket;

    public Basket() {
        this.basket = new ArrayList<Ball>();
    }

    public Basket(Ball... balls) {
        this.basket = new ArrayList<Ball>(Arrays.asList(balls));
    }

    public ArrayList<Ball> getBasketAsList() {
        return new ArrayList<>(this.basket);
    }

    public void setBasket(ArrayList<Ball> basket) {
        this.basket = new ArrayList<>(basket);
    }

    @Override
    public String toString() {
        StringBuilder basketContent = new StringBuilder(0) ;
        for (var ball:basket){
            basketContent.append(ball.toString()).append("\n");
        }
        return basketContent.toString();
    }


    public void addBallIntoBasket(Ball ball) {
        basket.add(ball);
    }


    public void removeLastBall() {
        basket.remove(basket.size() - 1);
    }


    public void removeBall(Ball ball) {
        basket.remove(ball);
    }


}
