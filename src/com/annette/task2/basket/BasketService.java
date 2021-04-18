package com.annette.task2.basket;

import com.annette.task2.ball.Color;
import com.annette.task2.utility.NullException;

public class BasketService {
    public static int countCurrentBallColorInBasket(Color color, Basket basket) throws NullException {
        if (basket == null) throw new NullException("basket is null");
        int count = 0;
        for (var ball : basket.getBasketAsList()) {
            if (ball.getColor() == color) count++;
        }
        return count;
    }

    public static int countBasketWeight(Basket basket) throws NullException {
        if (basket == null) throw new NullException("basket is null");
        int sumBallWeight = 0;
        for (var ball : basket.getBasketAsList()) sumBallWeight = sumBallWeight + ball.getWeight();
        return sumBallWeight;
    }

}
