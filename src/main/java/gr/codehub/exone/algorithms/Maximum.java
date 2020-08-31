package gr.codehub.exone.algorithms;
import java.util.Scanner;

public class Maximum {

    public double maxNum = 0;

    public double getMaximum(Scanner sc) {

        if(sc.hasNextInt()) {
            double num = sc.nextInt();
            maxNum = Math.pow(num,31) - 1;
        }
        return maxNum;
    }
}
