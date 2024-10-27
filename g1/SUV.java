//you've got the drill on this one lil bro
public class SUV extends Default_car_specs{
    protected String chargin_time_suv = "8 hours";
    public SUV(String car_brand, String car_model, String car_fabrication_year, String car_battery_capacity, String chargin_time_suv){
        super(car_brand, car_model, car_fabrication_year, car_battery_capacity, "400");
        this.chargin_time_suv = chargin_time_suv;
    }
}
