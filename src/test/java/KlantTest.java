
import org.example.gebruiker.Gast;
import org.example.gebruiker.Klant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class KlantTest {

    @Test
    public void isKlantTest() {
        Klant klant = new Klant(true);
        Gast gast = new Gast();

        if (!klant.isKlant()){
            fail("False negative");
        } else if (gast.isKlant()) {
            fail("False positive");
        }

        assert true;
    }

}
