//Same as Compact and Sedan classes.
//Max range of above 400, uses 530 in this system.

public class SUV extends Default_car_specs {

    protected double chargin_time_suv;

    public SUV(int identifier, String car_brand, String car_model, int car_fabrication_year, double car_battery_capacity) {
        super(identifier, car_brand, car_model, car_fabrication_year, car_battery_capacity, 530);
        this.chargin_time_suv = 8;
    }

    public double getChargin_time_suv() {
        return chargin_time_suv;
    }

    public void setChargin_time_suv() {
        this.chargin_time_suv = 8;
    }

}
