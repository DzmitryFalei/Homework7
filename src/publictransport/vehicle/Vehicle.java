package publictransport.vehicle;

import java.util.Random;

public abstract class Vehicle {

    private final int id = new Random().nextInt(10000);
    private final String name;
    private int price;
    private final int capacity;

    abstract void departureToTheNextStop(String stoppingPoint);

    public Vehicle(String name, int price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", name=" + name +
                ", price='" + price +
                ", capacity=" + capacity +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }
}
