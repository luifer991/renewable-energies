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
    
    public HydroEnergy (
            String sourceName, double energyFactor, int numberOfTurbines, double turbineCapacity ) {
        super( sourceName );
        this.energyFactor = energyFactor;
        this.numberOfTurbines = numberOfTurbines;
        this.turbineCapacity = turbineCapacity;
    }
    
    @Override
    public double capacityNominalProduction () {
        return energyFactor * numberOfTurbines * turbineCapacity;
    }
    @Override
    public String getSourceName () {
        return super.getSourceName();
    }
    @Override
    public void setSourceName ( String sourceName ) {
        super.setSourceName( sourceName );
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