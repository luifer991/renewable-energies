package com.renewal.modelo;

/**
 *
 */
public class SolarEnergy extends RenewbableEnergies {
    
    private double luminescenceFactor;
    
    public SolarEnergy () {
    }
    
    public SolarEnergy ( double luminescenceFactor ) {
        this.luminescenceFactor = luminescenceFactor;
    }
    
    public double getLuminescenceFactor () {
        return luminescenceFactor;
    }
    
    public void setLuminescenceFactor ( double luminescenceFactor ) {
        this.luminescenceFactor = luminescenceFactor;
    }
}