package gr.codehub.extwo.ex01;

public class Reporter extends Account {


    public static void accountReporter(String accountName, String owner, double balance, int numberOfTransactions) {
        System.out.println("- Account: " +accountName);
        System.out.println("Its owner is: " +owner);
        System.out.println("It has a balance of: " +balance);
        System.out.println("And an overall transactions of: " +numberOfTransactions);
    }

    public static void storeReporter(String storeName, String accountCategory) {
        System.out.println("Store name: " +storeName);
        System.out.println("Category: \n" +accountCategory);
    }

}
