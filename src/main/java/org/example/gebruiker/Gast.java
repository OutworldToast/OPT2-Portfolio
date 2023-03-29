package org.example.gebruiker;

public class Gast implements Gebruiker{

    @Override
    public void bekijkGeschiedenis() {
        printMessage();
    }

    private void printMessage(){
        System.out.println("Maak eerst een account aan");
    }

    @Override
    public String getGebruikersNaam() {
        return null;
    }

    @Override
    public void updateGebruikersNaam() {
        printMessage();
    }

    @Override
    public void saveGebruiker() {
        //buiten scope
    }

    @Override
    public boolean isKlant() {
        return false;
    }

    @Override
    public void addBerekening() {
        printMessage();
    }
}
