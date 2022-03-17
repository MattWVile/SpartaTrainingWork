package org.sparta.mv.week2.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static Logger logger = Logger.getLogger("myLogger");
    public static void main(String[] args) {
        try {
            Handler fileHandler = new FileHandler("src/main/java/org/sparta/mv/week2/logging/myLog.log", true);
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.setLevel(Level.ALL); // if info warning is still shown - at level or higher
        logger.setFilter(new CustomFilter());
        logger.log(Level.INFO, "I am in the main method"); //information
        logger.log(Level.WARNING, "Waring this is"); //information

    }
}
