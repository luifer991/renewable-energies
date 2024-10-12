package com.renewal;

import com.renewal.modelo.BioMassEnergy;

public class Main {
    public static void main ( String[] args ) {
        
        BioMassEnergy bioMassEnergy = new BioMassEnergy( "mass" , 1, "almond" );
        System.out.println( bioMassEnergy.getEnergyFactor() + " "
                        + bioMassEnergy.getMassType()
                + " " + bioMassEnergy.getSourceName() );
    }
}