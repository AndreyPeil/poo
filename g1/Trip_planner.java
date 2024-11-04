import java.util.ArrayList;
import java.util.List;

public class Trip_planner {

    public static List<Charging_station> planChargingStops(Default_car_specs car, double distance, List<Charging_station> stations) {
        List<Charging_station> stops = new ArrayList<>();
        double remainingRange = car.getCar_max_range();

        for (Charging_station station : stations) {
            if (remainingRange < distance) {
                if (station.getCapacity_usage() < station.getStation_capacity()) {
                    stops.add(station);
                    station.plusCapacity_usage(); // Mark station as used
                    distance -= remainingRange;  // Reduce remaining distance
                    car.recharge();  // Recharge car
                    remainingRange = car.getCar_max_range();  // Reset range
                }
            } else {
                break;
            }
        }
        return stops;
    }
}
