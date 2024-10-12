package com.renewal.modelo;

public class RenewbableEnergies {
    
    public String sourceName;
    
    public RenewbableEnergies () {
    }
    
    public RenewbableEnergies ( String sourceName ) {
        this.sourceName = sourceName;
    }
    
    public double capacityNominalProduction () {
        // TODO implement here
        return 0.0d;
    }
    
    public String getSourceName () {
        return sourceName;
    }
    
    public void setSourceName ( String sourceName ) {
        this.sourceName = sourceName;
    }
}