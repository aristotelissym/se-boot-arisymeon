package gr.codehub.exone;

import gr.codehub.exone.algorithms.Algorithms;
import gr.codehub.exone.structures.Structures;
import gr.codehub.exone.password.Password;


public class Main {
    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        Structures structures = new Structures();
        Password password = new Password();


        //files Algorithms/Structures have all the Objects and Functions calls.

        System.out.println("=====Exercises on Simple Algorithms=====");
        algorithms.Algorithms();

        System.out.println("\n\n=====Exercises on arrays, collections=====");
        structures.Structures();

        System.out.println("\n\n=====String Class Exercise=====");
        password.Password();

    }
}
