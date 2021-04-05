package com.annette.task2.logic;

import com.annette.task2.utility.EnterValue;
import com.annette.task2.utility.Mode;
import com.annette.task2.utility.NegativeException;
import com.annette.task2.utility.ZeroException;

public class ValueLogic {
    public static int EnterPositiveNotZeroValue(String message){
        while (true){
            try {
                return EnterValue.enterValue(message, Mode.POSITIVE_NOT_ZERO);
            } catch (NegativeException | ZeroException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
