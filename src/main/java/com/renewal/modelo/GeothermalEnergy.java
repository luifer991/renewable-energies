package com.renewal.modelo;

/**
 * 
 */
public class GeothermalEnergy extends RenewbableEnergies {
    
    private double geothermalFactor;
    
    public GeothermalEnergy() {
    }
    
    public GeothermalEnergy(double geothermalFactor) {
        this.geothermalFactor = geothermalFactor;
    }
    
    public double getGeothermalFactor () {
        return geothermalFactor;
    }
    
    public void setGeothermalFactor ( double geothermalFactor ) {
        this.geothermalFactor = geothermalFactor;
    }
}