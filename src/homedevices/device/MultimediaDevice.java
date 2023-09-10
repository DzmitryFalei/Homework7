package homedevices.device;

public class MultimediaDevice extends ElectricalDevice{

    private final int bitDepthDAC;

    public MultimediaDevice(String name, double electricityCurrent, int weight, int bitDepthDAC) {
        super(name, electricityCurrent, weight);
        this.bitDepthDAC = bitDepthDAC;
    }

    public void turningOnTheDevice() {
        if (!this.isInThePowerGrid()) {
            System.out.println(getName() + ": Играет музыка");
            this.setInThePowerGrid(true);
        }
    }

    public void turningOffTheDevice() {
        if (this.isInThePowerGrid()) {
            System.out.println(getName() + ": Наступила тишина");
            this.setInThePowerGrid(false);
        }
    }

    @Override
    public String toString() {
        return "ElectricalDevice{" +
                "name=" + getName() +
                ", electricityCurrent='" + getElectricityCurrent() +
                ", weight=" + getWeight() +
                ", bitDepthDAC=" + bitDepthDAC +
                '}';
    }

    public int getBitDepthDAC() {
        return bitDepthDAC;
    }

}
