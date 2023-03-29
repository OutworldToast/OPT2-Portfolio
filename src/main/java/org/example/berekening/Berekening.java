package org.example.berekening;

import org.example.rekenmachine.Rekenmachine;

import java.util.ArrayList;
import java.util.Scanner;

public class Berekening {

    private final Scanner scanner = Rekenmachine.scanner;

    private final ArrayList<Integer> getallen = new ArrayList<>();
    private final ArrayList<String> operaties = new ArrayList<>();
    private int resultaat;

    public Berekening(){

    }

    public void toonBerekening(){

    }

    private int add(int getal1, int getal2) {
        return getal1 + getal2;
    }

    private int subtract(int getal1, int aftrek) {
        return getal1 - aftrek;
    }

    private int divide(int getal1, int deler) {
        return getal1/deler;
    }

    private int multiply(int getal1, int getal2) {
        return getal1*getal2;
    }

    private void invoerLoop(){

    }

}
