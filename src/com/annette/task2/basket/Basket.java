package com.annette.task2.basket;


import com.annette.task2.ball.Ball;
import com.annette.task2.ball.BallLogic;
import com.annette.task2.ball.Color;

import java.util.ArrayList;
import java.util.Arrays;


public class Basket implements BasketLogic, BallLogic {
    private ArrayList<Ball> basket;

    public Basket() {
        this.basket = new ArrayList<Ball>();
    }

    public Basket(Ball... balls) {
        this.basket = new ArrayList<Ball>(Arrays.asList(balls));
    }

    public ArrayList<Ball> getBasket() {
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

    @Override
    public void addBallIntoBasket(Ball ball) {
        basket.add(ball);
    }

    @Override
    public void removeLastBall() {
        basket.remove(basket.size() - 1);
    }

    @Override
    public void removeBall(Ball ball) {
        basket.remove(ball);
    }

    @Override
    public int countCurrentBallColor(Color color) {
        int count = 0;
        for (var ball : basket) {
            if (ball.getColor() == color) count++;

        }
        return count;
    }

    @Override
    public int countBasketWeight() {
        int sumBallWeight = 0;
        for (var ball : basket) sumBallWeight = sumBallWeight + ball.getWeight();
        return sumBallWeight;
    }
}
