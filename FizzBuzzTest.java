import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void test(){

    }

    @Test
    public void shouldProcessInput(){// important to be descriptive so that we know what is being tested
        FizzBuzz fizzBuzz =  new FizzBuzz();
        //String output =  fizzBuzz.processNumber(1);// if we pass this method integer will pass as a string
        assertEquals("1", fizzBuzz.processNumber(1));
        assertEquals("2", fizzBuzz.processNumber(2));
        assertEquals("Fizz", fizzBuzz.processNumber(3));
        assertEquals("Buzz", fizzBuzz.processNumber(5));
        assertEquals("Fizz", fizzBuzz.processNumber(6));

    }
}