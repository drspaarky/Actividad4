import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionByZeroTest {

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}