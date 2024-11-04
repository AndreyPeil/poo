//The Fleet class uses 3 arraylists for all the classes.
//You can Add, Remove and List the content of all the classes.

import java.util.*;

public class Fleet {

    private List<Default_car_specs> cars;
    private List<Driver> drivers;
    private List<Charging_station> stations;

    public Fleet() {
        this.cars = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.stations = new ArrayList<>();
    }

    public List getCars() {
        return cars;
    }

    public void setCars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Default_car_specs car) {
        cars.add(car);
        System.out.println("Car added to the fleet.");
    }

    public void removeCar(int carId) {
        cars.removeIf(car -> car.getIdentifier() == carId);
    }

    public void printFleet() {
        System.out.println("Fleet of Cars:");
        for (Default_car_specs car : cars) {
            System.out.println(car);
        }
    }

    public List getDrivers() {
        return drivers;
    }

    public void setDrivers() {
        this.drivers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver registered.");
    }

    public void removeDriver(int driverId) {
        drivers.removeIf(driver -> driver.getDriver_id() == driverId);
    }

    public void printDrivers() {
        System.out.println("Drivers:");
        for (Driver driver : drivers) {
            System.out.println(driver);
        }
    }

    public List getStations() {
        return stations;
    }

    public void setStations() {
        this.stations = new ArrayList<>();
    }

    public void addChargingStation(Charging_station station) {
        stations.add(station);
        System.out.println("Charging station registered.");
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
