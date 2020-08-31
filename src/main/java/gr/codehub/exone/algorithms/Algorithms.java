package gr.codehub.exone.algorithms;
import java.util.Scanner;

public class Algorithms {

    Factorial factorial = new Factorial();
    Maximum maximum = new Maximum();
    Prime prime = new Prime();
    Division division = new Division();
    LongCount longCount = new LongCount();
    FloatDecimals floatDecimals = new FloatDecimals();

    public void Algorithms () {

        //Ex101
        Scanner factorials = new Scanner(System.in);
        System.out.println("Enter a valid integer number: ");
        factorial.getFactorial(factorials);

        //Ex102
        Scanner max_num = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        System.out.println(maximum.getMaximum(max_num));

        //Ex103
        Scanner primes = new Scanner(System.in);
        System.out.println("Check if a number is prime: ");
        int isItPrime = primes.nextInt();
        System.out.println(prime.checkPrime(isItPrime));

        //Ex104
        Scanner divided = new Scanner(System.in);
        System.out.println("Give a valid number ");
        division.getDivided(divided);

        //Ex105
        Scanner longCounter = new Scanner(System.in);
        System.out.println("Give a long number ");
        System.out.println("Number of Digits: " + longCount.countDigits(longCounter));

        //Ex106
       Scanner positiveDec = new Scanner(System.in);
       System.out.println("Give a float number: ");
       System.out.println("Float decimals: " + floatDecimals.decimalPart(positiveDec));
    }
}
