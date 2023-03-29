package org.example.gebruiker;

import org.example.berekening.Berekening;

public interface Gebruiker {

    void bekijkGeschiedenis();

    String getGebruikersNaam();

    void updateGebruikersNaam();

    void saveGebruiker();

    boolean isKlant();

    void addBerekening(Berekening berekening);
}
