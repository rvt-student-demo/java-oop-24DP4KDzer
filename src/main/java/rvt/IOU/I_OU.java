package rvt.IOU;

import java.util.HashMap;

public class I_OU {
    private HashMap<String, Double> debts = new HashMap<>();

    public void setSum(String name, double amount) {
        debts.put(name, amount);
    }

    public double getSum(String name) {
        return debts.getOrDefault(name, 0.0);
    }
}

