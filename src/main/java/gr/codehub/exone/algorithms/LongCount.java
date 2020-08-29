package gr.codehub.exone.algorithms;

import java.util.Scanner;

public class LongCount {

    public int countDigits (Scanner sc) {
        int count = 0;
        int longNum = sc.nextInt();

        while(longNum != 0) {
            longNum /= 10;
            count++;
        }
        return count;
    }
}
