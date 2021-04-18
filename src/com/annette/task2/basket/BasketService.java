package com.annette.task2.basket;

import com.annette.task2.ball.Color;

public class BasketService {
    public static int countCurrentBallColorInBasket(Color color, Basket basket) {
        int count = 0;
        for (var ball : basket.getBasketAsList()) {
            if (ball.getColor() == color) count++;
        }
        return count;
    }

    public static int countBasketWeight(Basket basket) {
        int sumBallWeight = 0;
        for (var ball : basket.getBasketAsList()) sumBallWeight = sumBallWeight + ball.getWeight();
        return sumBallWeight;
    }

}
