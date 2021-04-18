package com.annette.task2.runner;

import com.annette.task2.ball.Ball;
import com.annette.task2.basket.Basket;
import com.annette.task2.basket.BasketService;
import com.annette.task2.console.EnterFromConsole;
import com.annette.task2.logic.ColorLogic;
import com.annette.task2.utility.NullException;

public class Runner {
    public static void main (String ... args){
        Ball ball = EnterFromConsole.enterBallFiends();
        Ball ball2 = EnterFromConsole.enterBallFiends();
        Ball ball3 = EnterFromConsole.enterBallFiends();
        Basket basket = new Basket();
        basket.addBallIntoBasket(ball);
        basket.addBallIntoBasket(ball2);
        basket.addBallIntoBasket(ball3);
        try {
            System.out.println(BasketService.countCurrentBallColorInBasket(EnterFromConsole.fillColor(),basket
            ) + " " + BasketService.countBasketWeight(basket));
        } catch (NullException e) {
            e.printStackTrace();
        }
        basket.removeBall(ball);
        System.out.println(basket);
    }
}
