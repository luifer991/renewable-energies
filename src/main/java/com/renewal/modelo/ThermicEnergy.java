package com.renewal.modelo;

/**
 *
 */
public class ThermicEnergy extends RenewbableEnergies {
    
    private String energySource;
    
    public ThermicEnergy () {
    }
    
    public ThermicEnergy ( String souceName, String energySource ) {
        super(souceName);
        this.energySource = energySource;
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
    
    public String getEnergySource () {
        return energySource;
    }
    
    public void setEnergySource ( String energySource ) {
        this.energySource = energySource;
    }
    
}