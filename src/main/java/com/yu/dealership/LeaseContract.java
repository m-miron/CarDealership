package com.yu.dealership;

public class LeaseContract extends Contract {

    public LeaseContract(String contractDate, String customerName, String customerEmail, Vehicle vehicle) {
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
