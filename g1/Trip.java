
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Trip {

    private int tripId;
    private Driver driver;
    private Default_car_specs car;
    private String destination;
    private double distance;
    private List<Charging_station> chargingStops;
    private LocalDateTime date;

    public Trip(int tripId, Driver driver, Default_car_specs car, String destination, double distance) {
        this.tripId = tripId;
        this.driver = driver;
        this.car = car;
        this.destination = destination;
        this.distance = distance;
        this.date = LocalDateTime.now();
        this.chargingStops = new ArrayList<>();
    }

    public void addChargingStop(Charging_station station) {
        chargingStops.add(station);
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Default_car_specs getCar() {
        return car;
    }

    public void setCar(Default_car_specs car) {
        this.car = car;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public List<Charging_station> getChargingStops() {
        return chargingStops;
    }

    public void setChargingStops() {
        this.chargingStops = new ArrayList<>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDateTime.now();
    }
}
