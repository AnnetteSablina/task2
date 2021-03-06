package com.annette.task2.utility;

import java.util.Scanner;


public class EnterValue {
    public static int enterValue(String message, Mode mode) throws NegativeException, ZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while(!scanner.hasNextInt()){
            System.out.println("Try again." + message);
            scanner.next();
        }
        int value = scanner.nextInt();
        if (mode == Mode.POSITIVE && value < 0)  throw new NegativeException("You entered negative value");
        if (mode == Mode.POSITIVE_NOT_ZERO && value <= 0) throw new ZeroException("Value must be positive and not zero");
        return value;
    }
}
