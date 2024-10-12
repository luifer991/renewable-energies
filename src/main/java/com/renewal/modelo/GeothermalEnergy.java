package com.renewal.modelo;

/**
 *
 */
public class GeothermalEnergy extends RenewbableEnergies {
    
    private double geothermalFactor;
    
    public GeothermalEnergy () {
    }
    
    public GeothermalEnergy ( String sourceName, double geothermalFactor ) {
        super(sourceName);
        this.geothermalFactor = geothermalFactor;
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
    
    public double getGeothermalFactor () {
        return geothermalFactor;
    }
    
    public void setGeothermalFactor ( double geothermalFactor ) {
        this.geothermalFactor = geothermalFactor;
    }
}