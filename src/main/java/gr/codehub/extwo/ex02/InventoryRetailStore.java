package gr.codehub.extwo.ex02;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {
    List<Product> inventory = new ArrayList<>();
    protected int revenue;

    public List<Product> getInventory() {
        return inventory;
    }

    public void reset() {
        revenue = 0;
        inventory.clear();
    }

    @Override
    public void buy(Product product) {
        inventory.add(product);
        revenue += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        inventory.remove(product);
        revenue += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return revenue;
    }
}
