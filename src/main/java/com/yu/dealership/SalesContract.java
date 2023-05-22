package com.yu.dealership;

public class SalesContract extends Contract {

    public SalesContract(String contractDate, String customerName, String customerEmail, Vehicle vehicle) {
        super(contractDate, customerName, customerEmail, vehicle);
    }
    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public String getSameString() {
        return null;
    }
}
