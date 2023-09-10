package homedevices.device;

public abstract class ElectricalDevice {

    private String name;
    private double electricityCurrent;
    private int weight;
    private final static int MAINS_VOLTAGE = 220;
    private boolean isInThePowerGrid;

    abstract void turningOnTheDevice();
    abstract void turningOffTheDevice();

    public ElectricalDevice(String name, double electricityCurrent, int weight) {
        this.name = name;
        this.electricityCurrent = electricityCurrent;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "name=" + name +
                ", electricityCurrent='" + electricityCurrent +
                ", weight=" + weight +
                '}';
    }

    public double getPower() {
        return MAINS_VOLTAGE * electricityCurrent;
    }

    public boolean isInThePowerGrid() {
        return isInThePowerGrid;
    }

    public void setInThePowerGrid(boolean inThePowerGrid) {
        isInThePowerGrid = inThePowerGrid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getElectricityCurrent() {
        return electricityCurrent;
    }

    public void setElectricityCurrent(double electricityCurrent) {
        this.electricityCurrent = electricityCurrent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
