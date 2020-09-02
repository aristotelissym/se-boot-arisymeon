package gr.codehub.extwo.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class storeAccount extends Account {
    public String storeName;
    public String accountCategory;

    public static void tester() {
        storeAccount storeAccount001 = new storeAccount(); //NoArgs Constructor

        storeAccount001.setStoreName("Baker Store");
        storeAccount001.setAccountCategory("basic");
        storeAccount001.setOwner("John Doe");
        storeAccount001.setBalance(50000);
        storeAccount001.setNumberOfTransactions(200);

        Reporter.accountReporter("storeAccount001", storeAccount001.getOwner(),
                storeAccount001.getBalance(), storeAccount001.getNumberOfTransactions());
        Reporter.storeReporter(storeAccount001.getStoreName(), storeAccount001.getAccountCategory());

        storeAccount001.withdraw("John Doe", 420);
        storeAccount001.deposit("John Doe", 1000.65);
        storeAccount001.withdraw("Not John", 40000);


        //AllArgs Con.
        storeAccount storeAccount002 = new storeAccount("Book Shop", "basic");

        storeAccount002.setOwner("George MacFurry");
        storeAccount002.setBalance(43000);
        storeAccount002.setNumberOfTransactions(150);

        Reporter.accountReporter("storeAccount002", storeAccount002.getOwner(),
                storeAccount002.getBalance(), storeAccount002.getNumberOfTransactions());
        Reporter.storeReporter(storeAccount002.getStoreName(), storeAccount002.getAccountCategory());

        storeAccount002.changeCategory("extra");
        Reporter.storeReporter(storeAccount002.getStoreName(),
                storeAccount002.getAccountCategory());

    }

    public void changeCategory(String category) {
        String[] categories = {"basic", "mid", "extra","premium"};

        System.out.println("\n- Category change -");
        if(Arrays.asList(categories).contains(category)) {
            this.accountCategory = category;
            System.out.println("New category: " + this.accountCategory);

        } else {
            System.out.println("Cannot change category");
            System.out.println("Accepted Categories are: " + Arrays.toString(categories));
        }
    }
}
