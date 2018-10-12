public enum JetType {
    LARGEJET(20),
    MEDIUMJET(10),
    SMALLJET(5);

    private final int capacity;

    JetType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
