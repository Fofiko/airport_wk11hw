import java.util.ArrayList;

public class Airport {
    private String code;
    ArrayList<Plane> hangar;

    public Airport(String code){
        this.code = code;
        this.hangar = new ArrayList<>();
    }


    public String getCode() {
        return this.code;
    }

    public int countPlanes() {
        return hangar.size();
    }

    public void addPlane(Plane plane) {
        this.hangar.add(plane);
    }

    public void removePlane(Plane plane) {
        this.hangar.remove(plane);
    }

    public Flight createFlight(Plane plane, FlightNumber flightNumber) {
        Flight flight = new Flight(plane, flightNumber);
        return flight;
    }

    public boolean checkHangar(Plane plane) {
        return hangar.contains(plane);
    }

    public void assignPlaneToFlight(Plane plane, Flight flight) {
        removePlane(plane);
        addPlane(flight.getPlane());
        flight.switchPlane(plane);
    }


}
