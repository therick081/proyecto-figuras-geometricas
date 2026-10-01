import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumeroPrimoTest {

    @Test
    public void primosConocidosDebenSerPrimos() {
        assertTrue(NumeroPrimo.esPrimo(2));
        assertTrue(NumeroPrimo.esPrimo(3));
        assertTrue(NumeroPrimo.esPrimo(17));
        assertTrue(NumeroPrimo.esPrimo(97));
    }

    @Test
    public void compuestosConocidosNoDebenSerPrimos() {
        assertFalse(NumeroPrimo.esPrimo(4));
        assertFalse(NumeroPrimo.esPrimo(9));
        assertFalse(NumeroPrimo.esPrimo(100));
    }

    @Test
    public void casosLimiteNoSonPrimos() {
        assertFalse(NumeroPrimo.esPrimo(0));
        assertFalse(NumeroPrimo.esPrimo(1));
        assertFalse(NumeroPrimo.esPrimo(-5));
    }
}
