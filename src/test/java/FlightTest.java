import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(JetType.SMALLJET, AirlineName.FLYBE);
        flight = new Flight(plane1, FlightNumber.BEE111);
    }

    @Test
    public void hasPlane(){
//        assertEquals(plane1, flight.getPlane());
        assertEquals(JetType.SMALLJET, flight.getPlane().getJetType());
        assertEquals(5, flight.getPlane().getCapacity());
        assertEquals(AirlineName.FLYBE, flight.getPlane().getAirlineName());
    }

    @Test
    public void hasNumber(){
        assertEquals(FlightNumber.BEE111, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Tiree", flight.getDestination());
    }
}