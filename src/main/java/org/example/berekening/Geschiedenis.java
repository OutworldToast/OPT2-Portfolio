package org.example.berekening;

import org.example.rekenmachine.Rekenmachine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Geschiedenis {

    private final Scanner scanner = Rekenmachine.scanner;
    private final ArrayList<Berekening> geschiedenis = new ArrayList<>();

    public void invoerLoop(){
        boolean b = true;
        while (b) {
            try {
                System.out.println("Welkom bij uw geschiedenis");
                System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                System.out.println("[0] Terug");
                System.out.println("[1] Bekijk berekeningen");
                System.out.println("[2] Verwijder berekening");
                int input = scanner.nextInt();
                switch (input) {
                    case 0 -> b = false;
                    case 1 -> toonBerekeningen();
                    case 2 -> verwijderBerekening();
                    default -> System.out.println("Dat is geen optie");
                }
            } catch (InputMismatchException e) {
                System.out.println("Dat is geen getal");
                scanner.next();
            }
        }
    }

    public void addBerekening(Berekening berekening){
        geschiedenis.add(berekening);
    }

    private void toonBerekeningen(){
        int i = 0;
        for (Berekening berekening : geschiedenis) {
            i++;
            System.out.printf("[%d] ", i);
            berekening.toonBerekening();
        }
    }

    private void verwijderBerekening(){

        boolean b = true;
        while (b) {
            try {
                System.out.println("Welkom bij uw geschiedenis");
                System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                System.out.println("[0] Terug");
                toonBerekeningen();
                int input = scanner.nextInt();
                if (input == 0) {
                    b = false;}
                else if (input > 0 && input <= geschiedenis.size()){
                    geschiedenis.remove(input - 1);}
                else {System.out.println("Dat is geen optie");}
                }
            catch (InputMismatchException e) {
                System.out.println("Dat is geen getal");
                scanner.next();
            }
        }
    }

}
