package gr.codehub.extwo;

import gr.codehub.extwo.ex01.Account;
import gr.codehub.extwo.ex01.storeAccount;
import gr.codehub.extwo.ex02.IStore;
import gr.codehub.extwo.ex02.InventoryRetailStore;
import gr.codehub.extwo.ex02.Product;
import gr.codehub.extwo.ex02.SimpleRetailStore;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        Account.tester();
        storeAccount.tester();

        //Exercise 2
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. NaftisA", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        //Ex203
        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x2);
        simple.sell(x1);
        System.out.println("simple Revenue: " +simple.getRevenue());

        //Ex204
        InventoryRetailStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println("invStore Revenue: " +invStore.getRevenue());
        invStore.sell(x2);
        System.out.println("Inventory: " + invStore.getInventory());

    }


}
