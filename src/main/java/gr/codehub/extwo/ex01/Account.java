package gr.codehub.extwo.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    protected String owner;
    protected double balance;
    protected int numberOfTransactions;

    public static void tester() {

        Account account001 = new Account();//NoArgs Constructor

        account001.setOwner("John");
        account001.setBalance(1250.75);
        account001.setNumberOfTransactions(5);
        Reporter.accountReporter("account001", account001.getOwner(),
                account001.getBalance(), account001.getNumberOfTransactions());

        //Account001 with valid and invalid movements.
        account001.deposit("John", 100);
        account001.deposit("Peter", 40);
        account001.withdraw("Aristotle", 1000);
        account001.withdraw("John", 123.47);

        Account account002 = new Account("Doe", 25000, 10);//AllArgs. Constructor
        Reporter.accountReporter("account002", account001.getOwner(),
                account001.getBalance(), account001.getNumberOfTransactions());

        //Account002 with valid movements only.
        account002.deposit("doe", 300);
        account002.withdraw("Doe", 130);
    }

    protected void withdraw(String withdrawer, double amount) {
        System.out.println("\n- Withdraw -");
        if (withdrawer.equals(owner))
                if (amount <= balance) {
                    System.out.println("The withdrawal amount is: " + amount);
                    balance -= amount;
                    System.out.println("Updated balance is: " + balance +"\n");
                    numberOfTransactions++;
                } else {
                    System.out.println("You cannot perform the request");
                    System.out.println("Your balance is: " + balance);
                    System.out.println("Your legitimate withdrawal amount is: " + amount +"\n");
                }
        else {
            System.out.println("Name: " +withdrawer + " has no rights onto this account!\n");
        }
    }

    protected void deposit(String depositor, double amount) {
        System.out.println("\n- Deposit -");
        if (depositor.equals(owner)) {
            System.out.println("The deposit amount is: " + amount);
            balance += amount;
            numberOfTransactions++;
        }
        System.out.println("Your new balance amount is: " + balance +"\n");

        //return balance;
    }
}
