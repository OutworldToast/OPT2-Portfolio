package org.example.gebruiker;

import org.example.berekening.Berekening;
import org.example.berekening.Geschiedenis;
import org.example.rekenmachine.Rekenmachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Klant implements Gebruiker {

    private final Scanner scanner = Rekenmachine.scanner;
    private Geschiedenis geschiedenis = new Geschiedenis();
    private String gebruikersNaam;

    public Klant(){
        invoerLoop();
    }

    @Override
    public boolean isKlant() {
        return true;
    }

    @Override
    public void addBerekening(Berekening berekening) {
        geschiedenis.addBerekening(berekening);
    }

    private void invoerLoop(){
        boolean b = true;
        while (b) {
            System.out.println("Wat is uw naam?");
            String input = scanner.nextLine();
            if (input == null) {
                System.out.println("Voer een naam in");
            } else {b = false;}
        }
    }

    @Override
    public void bekijkGeschiedenis(){
        geschiedenis.invoerLoop();
    }

    @Override
    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    @Override
    public void updateGebruikersNaam(){
        invoerLoop();
    }

    @Override
    public void saveGebruiker(){
        //valt nog buiten scope
        //voeg toe met databasefunctionaliteit
    }

}
