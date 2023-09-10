package publictransport.vehicle;

public class CityBus extends Vehicle{

    private int fuelConsumption;

    public CityBus(String name, int price, int capacity, int fuelConsumption) {
        super(name, price, capacity);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void departureToTheNextStop(String stoppingPoint) {
        System.out.printf("Автобус №%d %s отправляется до станции %s\n",
                getId(), getName(), stoppingPoint);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", price='" + getPrice() +
                ", capacity=" + getCapacity() +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
