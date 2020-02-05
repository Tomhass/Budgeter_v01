package com.example.budgeter_v01;

public class CurrentUser extends setup_activity {
    private double monthlyPayment;
    private double savingAmount;
    private boolean carTravel;
    private boolean busTravel;

    // GETTERS AND SETTERS
    // Monthly Payment
    public double getMonthlyPayment() {
        return this.monthlyPayment;
    }
    public void setMonthlyPayment(double num) {
        this.monthlyPayment = num;
    }
    // Saving Amount
    public double getSavingAmount() {
        return this.savingAmount;
    }
    public void setSavingAmount(double sav) {
        this.savingAmount = sav;
    }
    // Travel
    public boolean getCarTravel() {
        return this.carTravel;
    }
    public void setCarTravel(boolean car) {
        this.carTravel = car;
    }
    public boolean getBusTravel() {
        return this.busTravel;
    }
    public void setBusTravel(boolean bus) {
        this.busTravel = bus;
    }
}
