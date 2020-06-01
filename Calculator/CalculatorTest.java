package Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    // use this annotation ( ) when your expecting a RuntimeException, not any kind of returned value
    @Test(expected = RuntimeException.class)
    public final void whenMoretThan2NumbersAreUsedThenAnExceptionIsThrown(){
        Calculator.add("1,2,3");
    }

    @Test
    public final void whenMoretThan2NumbersAreUsedThenNoExceptionIsThrown(){
        Calculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test
    public final void whenNonNumbersAreUsedThenAnExceptionIsThrown(){
        Calculator.add("1,R");

    }
    
}