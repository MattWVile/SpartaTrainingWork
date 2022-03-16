package org.sparta.mv.week2.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {


    @Override
    public boolean isLoggable(LogRecord record) {
        //regardless of level, print
        return record.getMessage().contains("main");
    }
}
