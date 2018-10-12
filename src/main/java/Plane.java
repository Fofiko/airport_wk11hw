import java.util.ArrayList;

public class Plane {
    private JetType jetType;
    private AirlineName airlineName;
    ArrayList<Passenger> passengers;

    public Plane(JetType jetType, AirlineName airlineName){
        this.jetType = jetType;
        this.airlineName = airlineName;
        this.passengers = new ArrayList<>();
    }

}
