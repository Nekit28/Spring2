package pro.sky.skyprospring2demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospring2demo.services.BasketService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class BasketController {
    private final BasketService basketService;

    public BasketController() {
        this(null);
    }

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids) {
        return basketService.add(ids);

    }

    @GetMapping("/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}

