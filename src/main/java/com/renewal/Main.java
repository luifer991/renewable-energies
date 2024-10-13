package com.renewal;

import com.renewal.modelo.*;

public class Main {
    public static void main ( String[] args ) {
        
        BioMassEnergy bioMassEnergy = new BioMassEnergy( "Residual", 3000, "Biodiesel" );
        System.out.println( bioMassEnergy.getSourceName() + " "
                + bioMassEnergy.getMassType()
                + " " + bioMassEnergy.getEnergyFactor() );
        
        GeothermalEnergy geothermalEnergy = new GeothermalEnergy( "Profunda", 5000 );
        System.out.println( geothermalEnergy.getSourceName() + " "
                + geothermalEnergy.getGeothermalFactor() );
        
        HydroEnergy hydroEnergy = new HydroEnergy( "Hidroeléctrica",
                2000, 1000, 50 );
        System.out.println( hydroEnergy.getSourceName() + " "
                + hydroEnergy.getTurbineCapacity()
                + " " + hydroEnergy.getEnergyFactor() + " " +
                hydroEnergy.getNumberOfTurbines() );
        
        SolarEnergy solarEnergy = new SolarEnergy( "Paneles Solares", 10000 );
        System.out.println( solarEnergy.getSourceName() + " "
                + solarEnergy.getLuminescenceFactor() );
        
        ThermicEnergy thermicEnergy = new ThermicEnergy( "Termal", "Carbón" );
        System.out.println( thermicEnergy.getSourceName() + " " +
                thermicEnergy.getEnergySource() );
        
        WindEnergy windEnergy = new WindEnergy( "Viento", 2500.52, 20, 70 );
        System.out.println( windEnergy.getSourceName() + " " +
                windEnergy.getRotorCapacity() + " " +
                windEnergy.getRotorQuantity() + " " +
                windEnergy.getWindSpeed() + " km/h" );
        
        Country country = new Country( "Colombia", 57,
                50000000, 100000, 0.5 );
        System.out.println( country.getCountryName() + " " +
                country.getCountryCode() + " " +
                country.getPopulation() + " " +
                country.getRequiredEnergy() + " " +
                country.getCoverageLevel() );
        
        User user = new User( "UID01", "Juan Perez", "usuario" );
        System.out.println( user.getUserId() + " " +
                user.getName() + " " +
                user.getProfile() );
    }
}