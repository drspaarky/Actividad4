import org.junit.Test;
import static org.junit.Assert.*;

public class PruebaResta {

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(7, 3));
    }
}