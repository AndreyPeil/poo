
import java.time.LocalDateTime;

public class Recharge_event {

    private LocalDateTime date;
    private Charging_station station;
    private double energyCharged;

    public Recharge_event(LocalDateTime date, Charging_station station, double energyCharged) {
        this.date = date;
        this.station = station;
        this.energyCharged = energyCharged;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Charging_station getStation() {
        return station;
    }

    public double getEnergyCharged() {
        return energyCharged;
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
