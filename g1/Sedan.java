//Works the same as the Compact class, extending from the Default car specs class.

public class Sedan extends Default_car_specs {

    protected double chargin_time_sedan;

    public Sedan(int identifier, String car_brand, String car_model, int car_fabrication_year, double car_battery_capacity) {
        super(identifier, car_brand, car_model, car_fabrication_year, car_battery_capacity, 400);
        this.chargin_time_sedan = 6;
    }

    public double getChargin_time_sedan() {
        return chargin_time_sedan;
    }

    public void setChargin_time_sedan(double chargin_time_sedan) {
        this.chargin_time_sedan = 6;
    }
}
