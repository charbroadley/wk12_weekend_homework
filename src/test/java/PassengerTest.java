import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Char", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Char", passenger1.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(1, passenger1.getNumberOfBags());
    }
}
