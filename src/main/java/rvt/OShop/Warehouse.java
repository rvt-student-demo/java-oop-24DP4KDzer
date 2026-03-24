package rvt.OShop;

import java.util.HashMap;
import java.util.Map;



public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stock.getOrDefault(product, 0) > 0) {
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }

    public Iterable<String> products() {
    return prices.keySet();
}
}