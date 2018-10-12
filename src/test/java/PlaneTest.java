import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void before(){
        plane = new Plane(JetType.SMALLJET, AirlineName.AEGEAN);
    }

    @Test
    public void canGetJetType(){
        assertEquals(JetType.SMALLJET, plane.getJetType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void canGetAirline(){
        assertEquals(AirlineName.AEGEAN, plane.getAirlineName());
    }


}
