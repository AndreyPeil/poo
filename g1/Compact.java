//Compact cars, range of 200km
//Since every thing was made in the default class, I just need to call the constructor and pass the values.
//Gonna make the charging time to every car, cuz is gonna be better to have different variables to work with
public class Compact extends Default_car_specs{
    protected double chargin_time_compact;

    public Compact(int identifier, String car_brand, String car_model, int car_fabrication_year, double car_battery_capacity){
        super(identifier, car_brand, car_model, car_fabrication_year, car_battery_capacity, 200);
        this.chargin_time_compact = 4;
    }

    public double getChargin_time_compact(){
        return chargin_time_compact;
    }

    public void setChargin_time_compact(double chargin_time_compact){
        this.chargin_time_compact = 4;
    }
}
