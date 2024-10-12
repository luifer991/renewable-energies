package com.renewal.modelo;

/**
 *
 */
public class ThermicEnergy extends RenewbableEnergies {
    
    private String energySource;
    
    public ThermicEnergy () {
    }
    
    public ThermicEnergy ( String energySource ) {
        this.energySource = energySource;
    }
    
    public String getEnergySource () {
        return energySource;
    }
    
    public void setEnergySource ( String energySource ) {
        this.energySource = energySource;
    }
    
}