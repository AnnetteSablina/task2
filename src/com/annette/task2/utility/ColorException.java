package com.annette.task2.utility;

import java.io.IOException;

public class ColorException extends IOException {
    public ColorException(String message) {
        super(message);
    }

    public ColorException() {
        super();
    }

    public ColorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColorException(Throwable cause) {
        super(cause);
    }
}
