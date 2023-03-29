package org.example.berekening;

import org.example.rekenmachine.Rekenmachine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Berekening { //geen manier om berekeningloop te verlaten zonder een berekening uit te voeren: moet aangepast worden

    private final Scanner scanner = Rekenmachine.scanner;

    private final ArrayList<Integer> getallen = new ArrayList<>();
    private final ArrayList<String> operaties = new ArrayList<>();
    private int resultaat;

    public Berekening(){
        invoerLoop();
    }

    public void toonBerekening(){
        for (int i = 0; i < getallen.size() - 1; i++) {
            System.out.printf("%d ", getallen.get(i));
            System.out.printf("%s ", operaties.get(i));
        }
        System.out.printf("%d = %d%n", getallen.get(getallen.size() - 1), resultaat);
    }

    private void add(int getal1, int getal2) {//optimaliseer deze methodes
        String operatie = "+";
        getallen.add(getal2);
        operaties.add(operatie);
        resultaat = getal1 + getal2;
        toonBerekening();
    }

    private void subtract(int getal1, int aftrek) {
        String operatie = "-";
        getallen.add(aftrek);
        operaties.add(operatie);
        resultaat = getal1 - aftrek;
        toonBerekening();
    }

    private void divide(int getal1, int deler) {
        String operatie = "/";
        getallen.add(deler);
        operaties.add(operatie);
        resultaat = getal1 / deler;
        toonBerekening();
    }

    private void multiply(int getal1, int getal2) {
        String operatie = "*";
        getallen.add(getal2);
        operaties.add(operatie);
        resultaat = getal1 * getal2;
        toonBerekening();
    }

    private void invoerLoop(){ //methode is te groot: moet afgesplitst worden
        System.out.println("Tijd om te gaan rekenen");
        boolean b = true;
        while (b) {

            boolean c = true;

            while (c) { //splits naar aparte methode
                try {
                    System.out.println("Typ een getal");
                    resultaat = scanner.nextInt();
                    getallen.add(resultaat);
                    c = false;
                } catch (InputMismatchException ignored) {
                }
            }

            c = true;
            int getal = 0;

            while (c) { //splits naar aparte methode
                try {
                    System.out.println("Typ nog een getal");
                    getal = scanner.nextInt();
                    c = false;
                } catch (InputMismatchException e) {
                    System.out.println("Typ een getal");
                }
            }

            c = true;

            while (c) { //splits naar aparte methode
                try {
                    System.out.println("Welke operatie wilt u uitvoeren?");
                    System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                    System.out.println("[1] +");
                    System.out.println("[2] -");
                    System.out.println("[3] /");
                    System.out.println("[4] *");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1 -> {add(resultaat, getal); c = false;}
                        case 2 -> {subtract(resultaat, getal); c = false;}
                        case 3 -> {divide(resultaat, getal); c = false;}
                        case 4 -> {multiply(resultaat, getal); c = false;}
                        default -> System.out.println("Dat is geen optie");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Typ een getal");
                }
            }

            c = true;

            while (c) {
                try {
                    System.out.println("Wat wilt u doen?");
                    System.out.println("Typ het getal in blokhaken om de optie te kiezen");
                    System.out.println("[0] Terug");
                    System.out.println("[1] Door rekenen");
                    int input = scanner.nextInt();
                    switch (input) {
                        case 0 -> {b = false; c = false;}
                        case 1 -> {c = false;}
                        default -> System.out.println("Dat is geen optie");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Typ een getal");
                }
            }
        }
    }

}
