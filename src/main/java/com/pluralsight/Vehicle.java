package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired,
                   BigDecimal originalCost, String makeModel,
                   int year, int odometer) {
        super(description, dateAcquired, originalCost);

        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {

        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;

        BigDecimal vehicleValue;

        if (age > 10) {
            vehicleValue = new BigDecimal("1000.00");
        } else {

            BigDecimal depreciationRate;

            if (age <= 3) {
                depreciationRate = new BigDecimal("0.03");
            } else if (age <= 6) {
                depreciationRate = new BigDecimal("0.06");

                depreciationRate = new BigDecimal("0.08");
            } else {
                depreciationRate = new BigDecimal("0.08");
            }

            BigDecimal depreciation = getOriginalCost().multiply(depreciationRate).multiply(new BigDecimal(age));

            vehicleValue = getOriginalCost().subtract(depreciation);

        }


        if (odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")) {

            vehicleValue = vehicleValue.multiply(new BigDecimal("0.75"));
        }

        return vehicleValue.setScale(2);
    }
}


