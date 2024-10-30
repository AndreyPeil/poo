//same as the compact, just reference the UBERKLASS here lol

public class Sedan extends Default_car_specs{
    protected String chargin_time_sedan = "6 hours";
    public Sedan(String car_brand, String car_model, String car_fabrication_year, double car_battery_capacity, String chargin_time_sedan){
        super(car_brand, car_model, car_fabrication_year, car_battery_capacity, "300");
        this.chargin_time_sedan = chargin_time_sedan;
    }
}
