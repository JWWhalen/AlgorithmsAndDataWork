package Queues;

public class Animal {
    private String type; // "dog" or "cat"
    private int arrivalTime;

    public Animal(String type, int arrivalTime) {
        this.type = type;
        this.arrivalTime = arrivalTime;
    }

    public String getType() {
        return type;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
}
