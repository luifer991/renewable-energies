package com.renewal.modelo;

public class BioMassEnergy extends RenewableEnergies {
    
    private double energyFactor;
    private String massType;
    
    public BioMassEnergy () {
    }
    
    public BioMassEnergy ( String sourceName, double energyFactor, String massType ) {
        super( sourceName );  // Llamada al constructor de la superclase
        this.energyFactor = energyFactor;
        this.massType = massType;
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