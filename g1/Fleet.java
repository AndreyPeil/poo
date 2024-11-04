//The Fleet class uses 3 arraylists for all the classes.
//You can Add, Remove and List the content of all the classes.

import java.util.*;

public class Fleet {

    private List<Default_car_specs> cars;
    private List<Driver> drivers;
    private List<Charging_station> stations;
    private List<Trip> trips;
    private List<Recharging_event> rechargeEvents;

    public Fleet() {
        this.cars = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.stations = new ArrayList<>();
        this.trips = new ArrayList<>();
        this.rechargeEvents = new ArrayList<>();
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

    public void registerTrip(Driver driver, Default_car_specs car, String destination, double distance) {
        // Use TripPlanner to calculate charging stops
        List<Charging_station> stops = Trip_planner.planChargingStops(car, distance, stations);

        // Check if any stops are available and the car has enough range for the trip
        if (stops.isEmpty() && car.getCar_battery_capacity() < distance) {
            System.out.println("Insufficient range for the trip.");
            return;
        }

        // Create a new Trip instance
        Trip trip = new Trip(trips.size(), driver, car, destination, distance);

        // Register each charging stop as a Recharging_event
        for (Charging_station stop : stops) {
            trip.addChargingStop(stop);

            // Create a recharging event for this stop and add it to the list
            Recharging_event rechargeEvent = new Recharging_event(stop, car);
            rechargeEvents.add(rechargeEvent);

            // Update car battery capacity after each stop
            car.recharge();
        }

        // Deduct battery capacity based on distance traveled
        car.updateBattery(distance);

        // Add trip to the trip history
        trips.add(trip);
    }

    public void reportLowBatteryCars() {
        System.out.println("Cars with less than 20% battery:");
        for (Default_car_specs car : cars) {
            if (car.getCar_battery_capacity() < 0.2 * car.getCar_max_capacity()) {
                System.out.println(car);
            }
        }
    }

    public void listDriverTrips(int driverId) {
        System.out.println("Trips for Driver ID: " + driverId);
        for (Trip trip : trips) {
            if (trip.getDriver().getDriver_id() == driverId) {
                System.out.println(trip);
            }
        }
    }

    public void rechargeHistory(Default_car_specs car) {
        System.out.println("Recharge history for Car ID: " + car.getIdentifier());
        for (Recharging_event event : rechargeEvents) {
            if (event.getCar().getIdentifier() == car.getIdentifier()) {
                System.out.println(event);
            }
        }
    }

    public void maintenanceReport() {
        System.out.println("Cars needing maintenance:");
        for (Default_car_specs car : cars) {
            if (car.getCar_battery_capacity() < 0.1 * car.getCar_max_capacity()
                    || car.getCar_fabrication_year() < 2018) {
                System.out.println(car);
            }
        }
    }

    public Driver getDriverById(int driverId) {
        for (Driver driver : drivers) {
            if (driver.getDriver_id() == driverId) {
                return driver;
            }
        }
        return null; // Return null if no driver is found with the given ID
    }

    public Default_car_specs getCarById(int carId) {
        for (Default_car_specs car : cars) {
            if (car.getIdentifier() == carId) { // Assuming getIdentifier() returns the car's ID
                return car;
            }
        }
        return null; // Return null if no car is found with the given ID
    }
}
