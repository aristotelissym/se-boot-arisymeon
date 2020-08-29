package gr.codehub.exone.structures;

import java.util.ArrayList;
import java.util.Arrays;
import gr.codehub.exone.algorithms.Prime;

public class List {

    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
    ArrayList<Integer> primeList = new ArrayList<Integer>();
    Prime prime = new Prime();

    public void getPrimeList () {
        System.out.println("===Ex201===");

        for (int i=0;i<list.size();i++) {
            if(prime.checkPrime(list.get(i)))
                primeList.add(list.get(i));
        }

        System.out.println("Initial List is : " +list);
        System.out.println("SubList with Prime numbers only is : " +primeList);
    }
}
