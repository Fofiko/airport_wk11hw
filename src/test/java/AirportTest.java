import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AirportTest {
    Airport airport;
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Flight flight2;


    @Before
    public void before(){
        airport = new Airport("FOFO");
        plane1 = new Plane(JetType.SMALLJET, AirlineName.AEGEAN);
        plane2 = new Plane(JetType.SMALLJET, AirlineName.FLYBE);
        flight1 = new Flight(plane1, FlightNumber.AEE344);
        flight2 = new Flight(plane2, FlightNumber.BEE115);
    }

    @Test
    public void hasCode(){
        assertEquals("FOFO", airport.getCode());
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(0, airport.countPlanes());
    }

    @Test
    public void canAddPlaneToHangar(){
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        assertEquals(2, airport.countPlanes());
    }

    @Test
    public void confirmPlaneInHangar(){
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.removePlane(plane1);
        assertEquals(true, airport.checkHangar(plane2));
        assertEquals(false, airport.checkHangar(plane1));
    }

    @Test
    public void canRemovePlaneFromHangar(){
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.removePlane(plane2);
        assertEquals(1, airport.countPlanes());
    }

    @Test
    public void canCreateFlight() {
        Flight flight3 = airport.createFlight(plane1, FlightNumber.AEE146);
        assertEquals(JetType.SMALLJET, flight3.getPlane().getJetType());
        assertEquals(FlightNumber.AEE146, flight3.getFlightNumber());
        assertEquals("Alexandroupolis", flight3.getDestination());
    }

    @Test
    public void canAssignPlaneFromHangarToFlight() {
        airport.addPlane(plane2);
        assertEquals(true, airport.checkHangar(plane2));
        airport.assignPlaneToFlight(plane2, flight2);
        assertTrue(airport.checkHangar(plane2));
        //switch flight details
        assertEquals(AirlineName.AEGEAN, plane2.getAirlineName()
        assertEquals(FlightNumber.AEE146, flight2.getFlightNumber());
        assertEquals("Alexandroupolis", flight2.getDestination());
     }

}
