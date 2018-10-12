import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Niko", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Niko", passenger.getName());
    }

    @Test
    public void hasId(){
        assertEquals(1, passenger.getId());
    }
}
