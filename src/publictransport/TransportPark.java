package publictransport;

import publictransport.vehicle.CityBus;
import publictransport.vehicle.Tram;

public class TransportPark {

    private String name;
    private static final int NUMBER_OF_VEHICLE = 8;

    private final CityBus[] cityBusesPark = new CityBus[NUMBER_OF_VEHICLE];
    private final Tram[] tramsPark = new Tram[NUMBER_OF_VEHICLE];

    private int cityBusesParkCurrentSize = 0;
    private int tramParkCurrentSize = 0;

    public TransportPark(String name) {
        this.name = name;
    }

    public void addCityBus(CityBus cityBus) {
        if (cityBusesParkCurrentSize <= cityBusesPark.length) {
            cityBusesPark[cityBusesParkCurrentSize] = cityBus;
            cityBusesParkCurrentSize++;
        }
    }

    public void addTram(Tram tram) {
        if (tramParkCurrentSize <= tramsPark.length) {
            tramsPark[tramParkCurrentSize] = tram;
            tramParkCurrentSize++;
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < NUMBER_OF_VEHICLE; i++) {
            CityBus cityBus = cityBusesPark[i];
            if (cityBus != null) {
                totalPrice += cityBus.getPrice();
            }
        }
        for (int i = 0; i < NUMBER_OF_VEHICLE; i++) {
            Tram tram = tramsPark[i];
            if (tram != null) {
                totalPrice += tram.getPrice();
            }
        }
        return totalPrice;
    }

    public void sortBusByFuelConsumption() {
        for (int i = 0; i < cityBusesParkCurrentSize; i++) {
            for (int j = 0; j < cityBusesParkCurrentSize - i - 1; j++) {
                if (cityBusesPark[j].getFuelConsumption() > cityBusesPark[j + 1].getFuelConsumption()) {
                    CityBus temp = cityBusesPark[j];
                    cityBusesPark[j] = cityBusesPark[j + 1];
                    cityBusesPark[j + 1] = temp;
                }
            }
        }
    }

    public void printCityBusesPark() {
        for (CityBus cityBus : cityBusesPark) {
            if (cityBus != null) {
                System.out.println(cityBus);
            }
        }
        System.out.println();
    }

    public void printTramsPark() {
        for (Tram tram : tramsPark) {
            if (tram != null) {
                System.out.println(tram);
            }
        }
        System.out.println();
    }

    public void sortBusByCapacity(int min, int max) {
        System.out.println("Автобусы вместимостью от " + min + " до " + max);
        for (int i = 0; i < cityBusesParkCurrentSize; i++) {
            if (cityBusesPark[i].getCapacity() > min && max > cityBusesPark[i].getCapacity()) {
                System.out.printf("№%d, %s: %d человек\n", cityBusesPark[i].getId(), cityBusesPark[i].getName(), cityBusesPark[i].getCapacity());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
