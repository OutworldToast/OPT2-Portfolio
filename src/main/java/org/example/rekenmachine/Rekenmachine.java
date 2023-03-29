package org.example.rekenmachine;

import org.example.berekening.Berekening;
import org.example.gebruiker.Gast;
import org.example.gebruiker.Gebruiker;
import org.example.gebruiker.Klant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rekenmachine {

    public static final Scanner scanner = new Scanner(System.in);

    Gebruiker gebruiker;

    private boolean loop = true;

    public Rekenmachine(){
        //buiten scope: log-in mogelijkheid
        this.gebruiker = new Gast();
        toonIntroductie();
        invoerLoop();
    }

    private void invoerLoop(){
        while (loop) {
            try {
                boolean klant = gebruiker.isKlant();

                if (klant) {
                    System.out.printf("%s's rekenmachine%n", gebruiker.getGebruikersNaam());
                }
                System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                System.out.println("[0] Exit");
                System.out.println("[1] Nieuwe berekening");
                System.out.println("[2] Ga naar Geschiedenis");
                System.out.print("[3] ");
                if (klant) {System.out.println("Verander gebruikersnaam");}
                else {System.out.println("Maak account");}

                int input = scanner.nextInt();
                switch (input) {
                    case 0 -> loop = false;
                    case 1 -> bereken();
                    case 2 -> bekijkGeschiedenis();
                    case 3 -> {
                        if (klant) {updateGebruiker();}
                        else {maakAccount();}}
                    default -> System.out.println("Dat is geen optie");
                }

            } catch (InputMismatchException e) {
                System.out.println("Typ een getal");
            }
        }
    }

    private void bereken(){
        Berekening berekening = new Berekening();
        if (gebruiker.isKlant()) {
            addBerekening(berekening);
        }
    }

    private void addBerekening(Berekening berekening){
        gebruiker.addBerekening(berekening);
    }

    private void bekijkGeschiedenis(){
        gebruiker.bekijkGeschiedenis();
    }

    private void maakAccount(){
        this.gebruiker = new Klant();
    }

    private void updateGebruiker(){
        gebruiker.updateGebruikersNaam();
    }

    private void toonIntroductie(){
        boolean b = true;
        while (b) {
            try {
                System.out.println("Welkom!");
                System.out.println("Dit is een simpele rekenmachine");
                System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                System.out.println("[0] Exit");
                System.out.println("[1] Verder");
                int input = scanner.nextInt();
                switch (input) {
                    case 0 -> {loop = false; b = false;}
                    case 1 -> b = false;
                    default -> System.out.println("Dat is geen optie");
                }
            } catch (InputMismatchException e) {
                System.out.println("Typ een getal");
            }
        }
    }

}
