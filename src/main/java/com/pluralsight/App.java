package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2026-08-20", new BigDecimal("250000.00"), "123 Super Street", 2, 1800, 6000));
        assets.add(new House("Vacation House", "2026-05-15", new BigDecimal("180000.00"), "456 Variable Lane", 1, 1500, 4000));


    }
}
