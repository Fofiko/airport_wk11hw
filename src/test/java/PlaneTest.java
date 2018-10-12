import org.junit.Before;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(JetType.SMALLJET, AirlineName.AEGEAN);
    }
}
