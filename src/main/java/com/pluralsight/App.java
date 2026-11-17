package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My House", "2026-08-20", new BigDecimal("250000.00"), "123 Super Street", 2, 1800, 6000));
        assets.add(new House("Vacation House", "2026-05-15", new BigDecimal("180000.00"), "456 Variable Lane", 1, 1500, 4000));

        assets.add(new Vehicle("My Car", "2024-03-10", new BigDecimal("20000.00"), "Toyota Camry", 2024, 45000));
        assets.add(new Vehicle("Hunter's car", "2023-06-12", new BigDecimal("35000.00"), "Dodge Challenger", 2023, 120000));

        for (int index = 0; index < assets.size(); index++) {

            Asset asset = assets.get(index);

            System.out.println("------------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (assets.get(index) instanceof House) {
                House house = (House) assets.get(index);
                System.out.println("Address: " + house.getAddress());
            } else if (assets.get(index) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) assets.get(index);
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }
        }

    }
}
