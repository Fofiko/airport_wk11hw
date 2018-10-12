public class Passenger {
    private String name;
    private int id;

    Passenger(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
