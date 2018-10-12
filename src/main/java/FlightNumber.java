public enum FlightNumber {
    AEE344("Chania"),
    AEE146("Alexandroupolis"),
    OAL2("Rhodes"),
    OAL20("Milos"),
    BEE111("Tiree"),
    BEE115("Islay");

    private final String destination;

    FlightNumber(String destination){
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }


}
