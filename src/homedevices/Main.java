package homedevices;

import homedevices.device.MultimediaDevice;
import homedevices.device.KitchenDevice;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        KitchenDevice kitchenDevice1 = new KitchenDevice("Плита Miele", 14, 20);
        KitchenDevice kitchenDevice2 = new KitchenDevice("Микроволновка Panasonic", 5, 8);
        KitchenDevice kitchenDevice3 = new KitchenDevice("Кофеварка Philips", 4, 6);
        MultimediaDevice multimediaDevice1 = new MultimediaDevice("Стример Wiim", 0.3, 1, 16);
        MultimediaDevice multimediaDevice2 = new MultimediaDevice("Мультимедиа проигрователь SMSL", 0.5, 1, 24);

        apartment.addKitchenDevice(kitchenDevice1);
        apartment.addKitchenDevice(kitchenDevice2);
        apartment.addKitchenDevice(kitchenDevice3);
        apartment.addMultimediaDevice(multimediaDevice1);
        apartment.addMultimediaDevice(multimediaDevice2);

        multimediaDevice1.turningOnTheDevice();
        kitchenDevice3.turningOnTheDevice();
        kitchenDevice1.delayedStart(2);
        kitchenDevice3.turningOffTheDevice();
        kitchenDevice2.turningOnTheDevice();

        System.out.println("Текущая мощность включенных приборов = " + apartment.calculateTotalPower() + " Вт");

        apartment.printKitchenDeviceArray();
        apartment.sortDevicesByMaxPower();
        apartment.printKitchenDeviceArray();
        apartment.printMultimediaDevicesArray();
        apartment.sortDevicesByWeight(4, 7);
    }
}