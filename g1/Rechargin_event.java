
import java.time.LocalDateTime;

public class Recharging_event {

    private LocalDateTime date;
    private Charging_station station;
    private double energyCharged;
    private Default_car_specs car;

    public Recharging_event(Charging_station station, Default_car_specs car) {
        this.date = LocalDateTime.now();
        this.station = station;
        this.energyCharged = car.getCar_max_capacity() - car.getCar_battery_capacity();
        car.recharge();
        this.car = car;
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
        this.energyCharged = car.getCar_max_capacity() - car.getCar_battery_capacity();
        car.recharge();
    }

    public Default_car_specs getCar() {
        return car;
    }

    public void setCar(Default_car_specs car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "RechargeEvent{"
                + "date=" + date
                + ", station=" + station.getStation_location()
                + ", energyCharged=" + energyCharged + " kWh"
                + '}';
    }

}
