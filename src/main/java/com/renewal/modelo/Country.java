package com.renewal.modelo;

/**
 * 
 */
public class Country {
    
    private String countryName;
    private int countryCode;
    private long population;
    private double requieredEnergy;
    private double coverageLevel;
    
    public Country() {
    }
    
    public Country ( String countryName,
                     int countryCode, long population,
                     double requieredEnergy, double coverageLevel ) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
        this.requieredEnergy = requieredEnergy;
        this.coverageLevel = coverageLevel;
    }
    
    
    
}