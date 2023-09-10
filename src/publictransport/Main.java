package publictransport;

import publictransport.vehicle.CityBus;
import publictransport.vehicle.Tram;

public class Main {
    public static void main(String[] args) {

        TransportPark transportPark = new TransportPark("Автобусный парк №4");
        CityBus cityBus1 = new CityBus("Ikarus 260", 80_000, 98, 28);
        CityBus cityBus2 = new CityBus("Ikarus 260", 80_000, 98, 28);
        CityBus cityBus3 = new CityBus("Ikarus 260", 80_000, 98, 28);
        CityBus cityBus4 = new CityBus("Ikarus 280", 120_000, 143, 40);
        CityBus cityBus5 = new CityBus("Ikarus 280", 120_000, 143, 40);
        CityBus cityBus6 = new CityBus("Ikarus 250", 100_000, 44, 30);
        Tram tram1 = new Tram("Tatra KT4D", 180_000, 168, 140);
        Tram tram2 = new Tram("Tatra KT4D", 180_000, 168, 140);

        transportPark.addCityBus(cityBus1);
        transportPark.addCityBus(cityBus2);
        transportPark.addCityBus(cityBus3);
        transportPark.addCityBus(cityBus4);
        transportPark.addCityBus(cityBus5);
        transportPark.addCityBus(cityBus6);
        transportPark.addTram(tram2);

        cityBus3.departureToTheNextStop("Вокзал");
        cityBus6.departureToTheNextStop("Плещеницы");
        tram2.departureToTheNextStop("Вокзал");

        transportPark.printCityBusesPark();
        transportPark.sortBusByFuelConsumption();
        transportPark.printCityBusesPark();
        transportPark.sortBusByCapacity(80, 100);
        System.out.println("Стоимость автопарка: " + transportPark.getName() + " = " + transportPark.calculateTotalPrice());
    }
}
