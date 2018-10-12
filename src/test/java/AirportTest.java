import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {
    Airport airport;

    @Before
    public void before(){
        airport = new Airport("FOFO");
    }

    @Test
    public void hasCode(){
        assertEquals("FOFO", airport.getCode());
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(0, airport.countPlanes());
    }


}
