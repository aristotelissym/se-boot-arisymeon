package gr.codehub.extwo.ex02;

import java.util.List;

public interface IStore {

    void buy(Product product);
    void sell(Product product);
    double getRevenue();

}
