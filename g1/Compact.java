//Shitry for compact cars, range of 200KM (WTF IS A KILOMETER RAHHHH)
//since every thing was made in the default class, I just need to call the constructor and pass the values. GG EZY
//Gonna make the charging time to every car, cuz is gonna be better to have different variables to work with
public class Compact extends Default_car_specs{
    protected String chargin_time_compact = "4 hours";
    public Compact(String car_brand, String car_model, String car_fabrication_year, String car_battery_capacity, String chargin_time_compact){
        super(car_brand, car_model, car_fabrication_year, car_battery_capacity, "200");
        this.chargin_time_compact = chargin_time_compact;
    }
}
