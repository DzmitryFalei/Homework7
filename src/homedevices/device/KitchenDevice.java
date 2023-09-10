package homedevices.device;

public class KitchenDevice extends ElectricalDevice{

    private int timeBeforeStart;

    public KitchenDevice(String name, double electricityCurrent, int weight) {
        super(name, electricityCurrent, weight);
    }

    public void turningOnTheDevice() {
        if (!this.isInThePowerGrid()) {
            System.out.println(getName() + ": Готовится пища");
            this.setInThePowerGrid(true);
        }
    }

    public void turningOffTheDevice() {
        if (this.isInThePowerGrid()) {
            System.out.println(getName() + ": Выключение прибора");
            this.setInThePowerGrid(false);
        }
    }

    public void delayedStart(int timeBeforeStart) {
        this.timeBeforeStart = timeBeforeStart * 1000;
        System.out.println(getName() + ": Прибор включится через: " + timeBeforeStart + " секунд");
        try {
            Thread.sleep(this.timeBeforeStart);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.turningOnTheDevice();
    }

    public int getTimeBeforeStart() {
        return timeBeforeStart;
    }

    public void setTimeBeforeStart(int timeBeforeStart) {
        this.timeBeforeStart = timeBeforeStart;
    }

}
