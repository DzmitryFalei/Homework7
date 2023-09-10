package publictransport.vehicle;

public class Tram extends Vehicle{

    private int electricityConsumption;

    public Tram(String name, int price, int capacity, int electricityConsumption) {
        super(name, price, capacity);
        this.electricityConsumption = electricityConsumption;
    }

    @Override
    public void departureToTheNextStop(String stoppingPoint) {
        System.out.printf("Трамвай №%d %s отправляется до станции %s\n",
                getId(), getName(), stoppingPoint);
    }

    @Override
    public String toString() {
        return "Tram{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", price='" + getPrice() +
                ", capacity=" + getCapacity() +
                ", electricityConsumption=" + electricityConsumption +
                '}';
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }

    public void setElectricityConsumption(int electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }
}
