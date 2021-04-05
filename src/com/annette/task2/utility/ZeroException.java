package com.annette.task2.utility;

import java.io.IOException;

public class ZeroException extends IOException {
    public ZeroException(String message) {
        super(message);
    }
}