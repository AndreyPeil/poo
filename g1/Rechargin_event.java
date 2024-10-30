
import java.time.LocalDateTime;

public class Rechargin_event {

    private LocalDateTime date;
    private Chargin_station station;
    private double energyCharged;

    public Rechargin_event(LocalDateTime date, Chargin_station station, double energyCharged) {
        this.date = date;
        this.station = station;
        this.energyCharged = energyCharged;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Chargin_station getStation() {
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
