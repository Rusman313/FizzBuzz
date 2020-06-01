import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void testGetMessage(){
        HelloWorld hw = new HelloWorld();
        //assertion  - making sure our expected behavior matches the actual behavior
        // First param - expected behavior, Second param  - actual behavior
        assertEquals("Hello, World!", hw.getMessage());
    }

    @Test
    public void testGetMessageWithName(){
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, Rafeena!", hw.getMessage("Rafeena"));
    }
}