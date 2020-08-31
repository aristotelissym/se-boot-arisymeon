package gr.codehub.exone.algorithms;

import java.util.Scanner;

public class Prime {

    int isItPrime = 0;
    public boolean checkPrime(int isItPrime) {

            this.isItPrime = isItPrime;
            boolean flag = true;

            if (isItPrime == 0 || isItPrime == 1) {
                flag = false;
                //System.out.println(flag);
            } else if (isItPrime % 2 == 0) {
                flag = false;
                //System.out.println(flag);
            } else if (isItPrime % 2 != 0) {
                //System.out.println(flag);
            }

            return flag;
    }


}
