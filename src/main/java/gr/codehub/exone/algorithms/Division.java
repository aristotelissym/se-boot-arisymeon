package gr.codehub.exone.algorithms;

import java.util.Scanner;

public class Division {

    private int dividend;
    float divisor = 0;

    public void getDivided(Scanner sc) {
        if(sc.hasNextInt()) {

            int dividend = sc.nextInt();

            for (int i=1; i<=dividend; i++) {
                divisor += (float) 1/i;
            }
            System.out.println(divisor);
        }

    }
}
