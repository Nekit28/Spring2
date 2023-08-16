package pro.sky.skyprospring2demo.services;

import pro.sky.skyprospring2demo.models.Basket;

import java.util.List;
import java.util.Map;

public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> add(List<Integer> ids) {
        return basket.add(ids);

    }
    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
