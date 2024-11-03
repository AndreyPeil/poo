//Compact cars, range of 200km.
//Since every base thing was made in the Default_car_specs class, We'll just need to use the super function and pass the values.
//Will make the specific charging time attribute in every car class, because it's going to be better to have different variables to work with in each of them.

public class Compact extends Default_car_specs {

    protected double chargin_time_compact;

    public Compact(int identifier, String car_brand, String car_model, int car_fabrication_year, double car_battery_capacity) {
        super(identifier, car_brand, car_model, car_fabrication_year, car_battery_capacity, 200);
        this.chargin_time_compact = 4;
    }

    public double getChargin_time_compact() {
        return chargin_time_compact;
    }

    public void setChargin_time_compact() {
        this.chargin_time_compact = 4;
    }
}
