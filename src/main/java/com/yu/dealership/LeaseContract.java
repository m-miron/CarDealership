package com.yu.dealership;

public class LeaseContract extends Contract {

    public LeaseContract(String contractDate, String customerName, String customerEmail, Vehicle vehicle) {
        super(contractDate, customerName, customerEmail, vehicle);
    }

    @Override
    public double getTotalPrice() {
        double vehiclePrice = 0;
        double totalPrice = 0;
        vehiclePrice = getVehicle().getPrice();
        totalPrice = vehiclePrice + (vehiclePrice * 0.07);
        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

    @Override
    public String getPersistentString() {
        return null;
    }
}
