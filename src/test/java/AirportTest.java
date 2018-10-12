import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AirportTest {
    Airport airport;
    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        airport = new Airport("FOFO");
        plane1 = new Plane(JetType.SMALLJET, AirlineName.AEGEAN);
        plane2 = new Plane(JetType.SMALLJET, AirlineName.FLYBE);
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
    public void canRemovePlaneFromHangar(){
        airport.addPlane(plane1);
        airport.addPlane(plane2);
        airport.removePlane(plane2);
        assertEquals(1, airport.countPlanes());
    }

}
