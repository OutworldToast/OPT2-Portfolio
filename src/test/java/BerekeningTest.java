
import org.example.berekening.Berekening;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BerekeningTest {

    int getal1 = 10;
    int getal2 = 5;

    @Test
    public void addTest(){
        Berekening berekening = new Berekening(true);

        int resultaat = 10 + 5;
        berekening.add(getal1, getal2);

        Assertions.assertEquals(berekening.getResultaat(), resultaat);
    }

    @Test
    public void subtractTest(){
        Berekening berekening = new Berekening(true);

        int resultaat = 10 - 5;
        berekening.subtract(getal1, getal2);

        Assertions.assertEquals(berekening.getResultaat(), resultaat);
    }

    @Test
    public void divideTest(){
        Berekening berekening = new Berekening(true);

        int resultaat = 10 / 5;
        berekening.divide(getal1, getal2);

        Assertions.assertEquals(berekening.getResultaat(), resultaat);
    }

    @Test
    public void multiplyTest(){
        Berekening berekening = new Berekening(true);

        int resultaat = 10 * 5;
        berekening.multiply(getal1, getal2);

        Assertions.assertEquals(berekening.getResultaat(), resultaat);
    }

}
