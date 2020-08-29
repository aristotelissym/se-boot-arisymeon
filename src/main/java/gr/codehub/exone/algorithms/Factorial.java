package gr.codehub.exone.algorithms;

import java.util.Scanner;

public class Factorial {

    public int factNum;

    public void getFactorial(Scanner sc) {

        this.factNum = 1;

        if(sc.hasNextInt()) {
            int factNum = sc.nextInt();
            if(factNum == 0) {
                this.factNum = 1;
            } else {
                for (int i=1;i<=factNum;i++) {
                    this.factNum *= i;
                }
            }
            System.out.println(this.factNum);

        } else {
            System.out.println("Only valid integer numbers!");
        }
    }

}
