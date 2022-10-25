package org.example;
//control system at the dairy that makes ice cream
public class icecream {

    private int unitsSold;
    private boolean freezerPower;
    private double temperature;
    private String flavour;


    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setFreezerPower(boolean freezerPower) {
        this.freezerPower = freezerPower;
    }

    boolean getFreezerPower() {
        return freezerPower;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    double getTemperature(){
        return temperature;
    }

    public void setFlavour(String flavour) {
        this.flavour=flavour;
    }

    String getFlavour(){
        return flavour;
    }




}


