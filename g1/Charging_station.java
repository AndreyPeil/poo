//This one is extremely important for the functioning of electrical cars, the Charging Station class.
//Every station can charge any car type from the system, but they all also have a limit of cars they can charge at the same time.

public class Charging_station {

    protected int station_id;
    protected String station_location;
    protected int station_capacity;
    protected double station_charging_time;
    protected int capacity_usage;

    public Charging_station(int station_id, String station_location, int station_capacity, double station_charging_time) {
        this.station_id = station_id;
        this.station_location = station_location;
        this.station_capacity = station_capacity;
        this.station_charging_time = station_charging_time;
        this.capacity_usage = 0;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_location() {
        return station_location;
    }

    public void setStation_location(String station_location) {
        this.station_location = station_location;
    }

    public int getStation_capacity() {
        return station_capacity;
    }

    public void setStation_capacity(int station_capacity) {
        this.station_capacity = station_capacity;
    }

    public double getStation_charging_time() {
        return station_charging_time;
    }

    public void setStation_charging_time(double station_charging_time) {
        this.station_charging_time = station_charging_time;
    }

    public int getCapacity_usage() {
        return capacity_usage;
    }

    public void setCapacity_usage() {
        this.capacity_usage = 0;
    }

    public void plusCapacity_usage() {
        this.capacity_usage++;
    }

    public void minusCapacity_usage() {
        this.capacity_usage--;
    }

    @Override
    public String toString() {
        return "Station ID: " + station_id + "\nStation location: " + station_location + "\nStation capacity: " + station_capacity + "\nStation charging time: " + station_charging_time;
    }

}
