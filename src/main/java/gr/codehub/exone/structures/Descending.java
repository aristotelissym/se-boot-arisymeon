package gr.codehub.exone.structures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Descending {
    int descNum = 32497;
    ArrayList<Integer> descList = new ArrayList<Integer>();

    public void descDigit () {
        System.out.println("===Ex203===");
        int digit = descNum % 10;
        descList.add(digit);

        descNum /= 10;
        do {
            digit = descNum % 10;
            descList.add(digit);

            descNum /= 10;
        }while (descNum != 0);
        Collections.sort(descList, Collections.reverseOrder());
        System.out.println(descList);

    }
}
