
import java.time.LocalDateTime;

public class Recharging_event {

    private LocalDateTime date;
    private Charging_station station;
    private double energyCharged;
    private Default_car_specs car;

    public Recharging_event(Charging_station station, Default_car_specs car) {
        this.date = LocalDateTime.now();
        this.station = station;
        this.car = car;

        // Capture the initial battery level
        double initialBatteryLevel = car.getCar_battery_capacity();

        // Perform the recharge (assuming this updates the car's battery capacity)
        car.recharge();

        // Calculate the energy charged based on the difference
        this.energyCharged = car.getCar_battery_capacity() - initialBatteryLevel;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDateTime.now();
    }

    public Charging_station getStation() {
        return station;
    }

    public void setStation(Charging_station station) {
        this.station = station;
    }

    public double getEnergyCharged() {
        return energyCharged;
    }

    public void setEnergyCharged(Default_car_specs car) {

        double initialBatteryLevel = car.getCar_battery_capacity();

        car.recharge();

        this.energyCharged = car.getCar_battery_capacity() - initialBatteryLevel;
    }

    public Default_car_specs getCar() {
        return car;
    }

    public void setCar(Default_car_specs car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Recharging Event - Date: " + date
                + ", Station: " + station.getStation_id()
                + ", Energy Charged: " + energyCharged + " kWh"
                + ", Car ID: " + car.getIdentifier();
    }

}
