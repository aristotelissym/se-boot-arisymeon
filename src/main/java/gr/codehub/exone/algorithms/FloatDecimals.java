package gr.codehub.exone.algorithms;

import java.util.Scanner;

public class FloatDecimals {

    public float decimalPart (Scanner sc) {
        float floatNum = 0;
        float fraction = 0;


        if(sc.hasNextFloat() ) {
            floatNum = sc.nextFloat();
            fraction = floatNum%1;
        }

        return fraction;

    }
}
