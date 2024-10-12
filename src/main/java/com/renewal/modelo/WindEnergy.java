package com.renewal.modelo;

public class WindEnergy extends RenewbableEnergies {
    
    private double rotorCapacity;
    private int rotorQuantity;
    private double windSpeed;
    
    public WindEnergy () {
    }
    
    public WindEnergy (
            String sourceName, double rotorCapacity,
            int rotorQuantity, double windSpeed ) {
        super( sourceName );
        this.rotorCapacity = rotorCapacity;
        this.rotorQuantity = rotorQuantity;
        this.windSpeed = windSpeed;
    }
    
    @Override
    public double capacityNominalProduction () {
        return 0.0d;
    }
    
    @Override
    public String getSourceName () {
        return super.getSourceName();
    }
    
    @Override
    public void setSourceName ( String sourceName ) {
        super.setSourceName( sourceName );
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