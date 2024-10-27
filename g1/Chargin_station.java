//this one is a MUST
//here is the class for our MVP, the charging station
//This dude os OP, he can charge any car, but he has a limit of cars to charge at the same time
//kinda like a playstation, but for charging your car

public class Charging_station{
   protected int station_id;
    protected String station_location;
    protected int station_capacity;
    protected double station_charging_time;

    public Charging_station(int station_id, String station_location, int station_capacity, double station_charging_time){
        this.station_id = station_id;
        this.station_location = station_location;
        this.station_capacity = station_capacity;
        this.station_charging_time = station_charging_time;
    }

    public int getStation_id(){
        return station_id;
    }

    public String getStation_location(){
        return station_location;
    }

    public int getStation_capacity(){
        return station_capacity;
    }

    public double getStation_charging_time(){
        return station_charging_time;
    }

    public void setStation_id(int station_id){
        this.station_id = station_id;
    }

    public void setStation_location(String station_location){
        this.station_location = station_location;
    }

    public void setStation_capacity(int station_capacity){
        this.station_capacity = station_capacity;
    }

    public void setStation_charging_time(double station_charging_time){
        this.station_charging_time = station_charging_time;
    }

    @Override
    public String toString(){
        return "Station ID: " + station_id + "\nStation location: " + station_location + "\nStation capacity: " + station_capacity + "\nStation charging time: " + station_charging_time;
    }
}
