package homedevices;

import homedevices.device.KitchenDevice;
import homedevices.device.MultimediaDevice;

public class Apartment {

    private static final int NUMBER_OF_DEVICES = 8;

    private final KitchenDevice[] kitchenDeviceArray = new KitchenDevice[NUMBER_OF_DEVICES];
    private final MultimediaDevice[] multimediaDevicesArray = new MultimediaDevice[NUMBER_OF_DEVICES];

    private int kitchenDeviceCurrentSize = 0;
    private int multimediaDeviceCurrentSize = 0;

    public Apartment() {
    }

    public void addKitchenDevice(KitchenDevice kitchenDevice) {
        if (kitchenDeviceCurrentSize <= kitchenDeviceArray.length) {
            kitchenDeviceArray[kitchenDeviceCurrentSize] = kitchenDevice;
            kitchenDeviceCurrentSize++;
        }
    }

    public void addMultimediaDevice(MultimediaDevice multimediaDevice) {
        if (multimediaDeviceCurrentSize <= multimediaDevicesArray.length) {
            multimediaDevicesArray[multimediaDeviceCurrentSize] = multimediaDevice;
            multimediaDeviceCurrentSize++;
        }
    }

    public double calculateTotalPower() {
        double totalPower = 0;
        for (int i = 0; i < NUMBER_OF_DEVICES; i++) {
            KitchenDevice kitchenDevice = kitchenDeviceArray[i];
            if (kitchenDevice != null && kitchenDevice.isInThePowerGrid()) {
                totalPower += kitchenDevice.getPower();
            }
        }
        for (int i = 0; i < NUMBER_OF_DEVICES; i++) {
            MultimediaDevice multimediaDevice = multimediaDevicesArray[i];
            if (multimediaDevice != null && multimediaDevice.isInThePowerGrid()) {
                totalPower += multimediaDevice.getPower();
            }
        }
        return totalPower;
    }

    public void sortDevicesByMaxPower() {
        for (int i = 0; i < kitchenDeviceCurrentSize; i++) {
            for (int j = 0; j < kitchenDeviceCurrentSize - i - 1; j++) {
                if (kitchenDeviceArray[j].getPower() > kitchenDeviceArray[j + 1].getPower()) {
                    KitchenDevice temp = kitchenDeviceArray[j];
                    kitchenDeviceArray[j] = kitchenDeviceArray[j + 1];
                    kitchenDeviceArray[j + 1] = temp;
                }
            }
        }
        System.out.println();
    }

    public void printKitchenDeviceArray() {
        for (KitchenDevice kitchenDevice : kitchenDeviceArray) {
            if (kitchenDevice != null) {
                System.out.println(kitchenDevice);
            }
        }
    }

    public void printMultimediaDevicesArray() {
        for (MultimediaDevice multimediaDevice : multimediaDevicesArray) {
            if (multimediaDevice != null) {
                System.out.println(multimediaDevice);
            }
        }
    }

    public void sortDevicesByWeight(int min, int max) {
        System.out.println("Техника весом от " + min + " до " + max);
        for (int i = 0; i < kitchenDeviceCurrentSize; i++) {
            if (kitchenDeviceArray[i].getWeight() > min && max > kitchenDeviceArray[i].getWeight()) {
                    System.out.printf("%s: %d кг", kitchenDeviceArray[i].getName(), kitchenDeviceArray[i].getWeight());
            }
        }
    }
}
