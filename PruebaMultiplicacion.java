import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaMultiplicacion {

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
    }
}