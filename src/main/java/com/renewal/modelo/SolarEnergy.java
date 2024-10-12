package com.renewal.modelo;

/**
 *
 */
public class SolarEnergy extends RenewableEnergies {
    
    private double luminescenceFactor;
    
    public SolarEnergy () {
    }
    
    public SolarEnergy ( String sourceName, double luminescenceFactor ) {
        super(sourceName);
        this.luminescenceFactor = luminescenceFactor;
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
    
    public double getLuminescenceFactor () {
        return luminescenceFactor;
    }
    
    public void setLuminescenceFactor ( double luminescenceFactor ) {
        this.luminescenceFactor = luminescenceFactor;
    }
}