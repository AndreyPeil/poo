//the fleet is just 3 arraylists for all the classes
//add, remove, print
//do whaterver

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

    public void addCar(Default_car_specs car) {
        cars.add(car);
    }

    public void removeCar(Default_car_specs car) {
        cars.remove(car);
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

    public void removeChargingStation(Charging_station station) {
        stations.remove(station);
    }

    public void printChargingStations() {
        System.out.println("Charging Stations:");
        for (Charging_station station : stations) {
            System.out.println(station);
        }
    }
}
