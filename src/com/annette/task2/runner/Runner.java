package com.annette.task2.runner;

import com.annette.task2.ball.Ball;
import com.annette.task2.basket.Basket;
import com.annette.task2.logic.ColorLogic;

public class Runner {
    public static void main (String ... args){
        Ball ball = Ball.enterBallFiends();
        Ball ball2 = Ball.enterBallFiends();
        Ball ball3 = Ball.enterBallFiends();
        Basket basket = new Basket();
        basket.addBallIntoBasket(ball);
        basket.addBallIntoBasket(ball2);
        basket.addBallIntoBasket(ball3);
        System.out.println(basket.countCurrentBallColor(ColorLogic.fillColor()) + " " + basket.countBasketWeight());
        basket.removeBall(Ball.enterBallFiends());
        System.out.println(basket.toString());
    }
}
