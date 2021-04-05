package com.annette.task2.basket;

import com.annette.task2.ball.Ball;

public interface BasketLogic {
    public void addBallIntoBasket(Ball ball);
    public void removeLastBall();
    public void removeBall(Ball ball);
    public int countBasketWeight();
}
