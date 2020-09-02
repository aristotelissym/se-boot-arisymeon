package gr.codehub.extwo.ex02;

public class SimpleRetailStore implements IStore {
    protected int revenue;

    @Override
    public void buy(Product product) {
        revenue += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        revenue += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return revenue;
    }
}
