package com.renewal.modelo;

/**
 *
 */
public class HydroEnergy extends RenewbableEnergies {
    
    private double energyFactor;
    private int numberOfTurbines;
    private double turbineCapacity;
    
    public HydroEnergy () {
    }
    
    public HydroEnergy ( double energyFactor, int numberOfTurbines, double turbineCapacity ) {
        this.energyFactor = energyFactor;
        this.numberOfTurbines = numberOfTurbines;
        this.turbineCapacity = turbineCapacity;
    }
    
    public double getEnergyFactor () {
        return energyFactor;
    }
    
    public void setEnergyFactor ( double energyFactor ) {
        this.energyFactor = energyFactor;
    }
    
    public int getNumberOfTurbines () {
        return numberOfTurbines;
    }
    
    public void setNumberOfTurbines ( int numberOfTurbines ) {
        this.numberOfTurbines = numberOfTurbines;
    }
    
    public double getTurbineCapacity () {
        return turbineCapacity;
    }
    
    public void setTurbineCapacity ( double turbineCapacity ) {
        this.turbineCapacity = turbineCapacity;
    }
}