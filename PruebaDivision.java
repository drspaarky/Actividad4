import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.divide(12, 3));
    }
}