package com.renewal.modelo;

public class BioMassEnergy extends RenewbableEnergies {
    
    private double energyFactor;
    private String massType;
    
    public BioMassEnergy () {
    }
    
    public BioMassEnergy ( double energyFactor, String massType ) {
        this.energyFactor = energyFactor;
        this.massType = massType;
    }
    
    public double getEnergyFactor () {
        return energyFactor;
    }
    
    public void setEnergyFactor ( double energyFactor ) {
        this.energyFactor = energyFactor;
    }
    
    public String getMassType () {
        return massType;
    }
    
    public void setMassType ( String massType ) {
        this.massType = massType;
    }
}