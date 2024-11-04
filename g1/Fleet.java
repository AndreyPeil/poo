//The Fleet class uses 3 arraylists for all the classes.
//You can Add, Remove and List the content of all the classes.

import java.util.*;

public class Fleet {

    private List<Default_car_specs> cars;
    private List<Driver> drivers;
    private List<Charging_station> stations;

    public Fleet() {
        cars = new ArrayList<>();
        drivers = new ArrayList<>();
        stations = new ArrayList<>();
    }

    public List getCars() {
        return cars;
    }

    public List getDrivers() {
        return drivers;
    }

    public List getCharginStations() {
        return stations;
    }

    public void addCar(Default_car_specs car) {

        cars.add(car);

        System.out.println("Car added to the fleet.");

    }

    public void removeCar(int carId) {
        cars.removeIf(car -> car.getIdentifier() == carId);
    }

    public void removeDriver(int driverId) {
        drivers.removeIf(driver -> driver.getDriver_id() == driverId);
    }

    public void printFleet() {
        System.out.println("Fleet of Cars:");
        for (Default_car_specs car : cars) {
            System.out.println(car);
        }
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    public void printDrivers() {
        System.out.println("Drivers:");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }

    public void addChargingStation(Charging_station station) {
        stations.add(station);
    }

    public void removeStation(int stationId) {
    stations.removeIf(station -> station.getStation_id() == stationId);
}

    public void printChargingStations() {
        System.out.println("Charging Stations:");
        for (Charging_station station : stations) {
            System.out.println(station);
        }
    }
}
