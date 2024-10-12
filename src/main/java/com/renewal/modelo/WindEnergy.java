package com.renewal.modelo;

public class WindEnergy extends RenewbableEnergies {
    
    private double rotorCapacity;
    private int rotorQuantity;
    private double windSpeed;

    public WindEnergy() {
    }
    
    public WindEnergy(double rotorCapacity, int rotorQuantity, double windSpeed) {
        this.rotorCapacity = rotorCapacity;
        this.rotorQuantity = rotorQuantity;
        this.windSpeed = windSpeed;
    }
    
    public double getRotorCapacity () {
        return rotorCapacity;
    }
    
    public void setRotorCapacity ( double rotorCapacity ) {
        this.rotorCapacity = rotorCapacity;
    }
    
    public int getRotorQuantity () {
        return rotorQuantity;
    }
    
    public void setRotorQuantity ( int rotorQuantity ) {
        this.rotorQuantity = rotorQuantity;
    }
    
    public double getWindSpeed () {
        return windSpeed;
    }
    
    public void setWindSpeed ( double windSpeed ) {
        this.windSpeed = windSpeed;
    }
}