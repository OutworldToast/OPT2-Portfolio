package org.example.gebruiker;

import org.example.berekening.Geschiedenis;
import org.example.rekenmachine.Rekenmachine;

import java.util.Scanner;

public class Klant implements Gebruiker {

    private final Scanner scanner = Rekenmachine.scanner;
    private Geschiedenis geschiedenis = new Geschiedenis();
    private String gebruikersNaam;

    public Klant(){

    }

    @Override
    public boolean isKlant() {
        return true;
    }

    private void invoerLoop(){

    }

    @Override
    public void bekijkGeschiedenis(){

    }

    @Override
    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    @Override
    public void updateGebruikersNaam(){

    }

    @Override
    public void saveGebruiker(){
        //valt nog buiten scope
        //voeg toe met databasefunctionaliteit
    }

}
