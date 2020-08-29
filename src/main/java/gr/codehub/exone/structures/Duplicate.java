package gr.codehub.exone.structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {

    ArrayList<Integer> duplicates = new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,4,4,6,6,4,7,8,9,7));
    HashSet<Integer> eliminated = new HashSet<Integer>();
    public int listed = 0;

    public void findDuplicates () {
        System.out.println("===Ex202===");

        while (!duplicates.isEmpty()) {
            listed = duplicates.get(0);

            eliminated.add(listed);
            duplicates.remove(duplicates.get(0));
        }

        System.out.println("Non-Duplicate List: " +eliminated);
    }
}
