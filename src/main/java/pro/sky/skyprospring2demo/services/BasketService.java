package pro.sky.skyprospring2demo.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprospring2demo.models.Basket;

import java.util.List;
import java.util.Map;
@Service
@SessionScope

public class BasketService {

    private final Basket basket = new Basket();

    public Map<Integer, Integer> add(List<Integer> ids) {
        return basket.add(ids);

    }
    public Map<Integer, Integer> get() {
        return basket.get();
    }
}
