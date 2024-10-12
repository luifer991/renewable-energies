package com.renewal.modelo;

public class Country {
    
    private String countryName;
    private int countryCode;
    private long population;
    private double requiredEnergy;
    private double coverageLevel;
    
    public Country() {
    }
    
    public Country (
            String countryName, int countryCode,
            long population, double requieredEnergy, double coverageLevel ) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
        this.requiredEnergy = requieredEnergy;
        this.coverageLevel = coverageLevel;
    }
    
    public String getCountryName () {
        return countryName;
    }
    
    public void setCountryName ( String countryName ) {
        this.countryName = countryName;
    }
    
    public int getCountryCode () {
        return countryCode;
    }
    
    public void setCountryCode ( int countryCode ) {
        this.countryCode = countryCode;
    }
    
    public long getPopulation () {
        return population;
    }
    
    public void setPopulation ( long population ) {
        this.population = population;
    }
    
    public double getRequiredEnergy () {
        return requiredEnergy;
    }
    
    public void setRequiredEnergy ( double requiredEnergy ) {
        this.requiredEnergy = requiredEnergy;
    }
    
    public double getCoverageLevel () {
        return coverageLevel;
    }
    
    public void setCoverageLevel ( double coverageLevel ) {
        this.coverageLevel = coverageLevel;
    }
}