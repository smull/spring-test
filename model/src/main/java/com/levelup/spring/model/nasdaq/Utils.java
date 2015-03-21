package com.levelup.spring.model.nasdaq;

import java.util.Random;

/**
 * Created by java on 21.03.2015.
 */
public class Utils{

    public static double getRandom(double min, double max) {
        Random random = new Random();
        double d = min + (max - min) * random.nextDouble();
        d = (double)Math.round(d * 100) / 100;
        return d;
    }
}
