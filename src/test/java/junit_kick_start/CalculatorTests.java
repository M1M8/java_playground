package junit_kick_start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTests
{
    Calculator calculator = new Calculator();

    @Test
    public void additionTest()
    {
        assertEquals(4, calculator.addition(2,2));
    }
}
