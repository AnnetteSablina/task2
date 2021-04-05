package com.annette.task2.utility;

import java.util.Scanner;

public class EnterString {
    public static String enterString(String message)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while(!scanner.hasNextLine()){
            System.out.println("Try again." + message);
            scanner.next();
        }
        return scanner.next();
    }
}
