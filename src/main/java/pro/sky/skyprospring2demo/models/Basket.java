package pro.sky.skyprospring2demo.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Basket {

    private final Map<Integer, Integer> countByOrderId  = new HashMap<>();
    public List<Integer> add(List<Integer> ids) {

        for (Integer i:ids) {
            if (countByOrderId.containsKey(i)) {
                countByOrderId.put(i, countByOrderId.get(i) + 1);
            } else {
                countByOrderId.put(i, 1);
            }
        }
        return ids;

    }

    public Map<Integer, Integer> get() {
        return countByOrderId;
    }
    }


