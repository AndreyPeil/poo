import java.util.ArrayList;
import java.util.List;

public class Trip {
    private Driver driver;
    private Default_car_specs car;
    private double distance;
    private String destination;
    private List<Charging_station> plannedStations;
    private double remainingDistance;

    public Trip(Driver driver, Default_car_specs car, double distance, String destination) {
        this.driver = driver;
        this.car = car;
        this.distance = distance;
        this.destination = destination;
        this.plannedStations = new ArrayList<>();
        this.remainingDistance = distance;
    }

    public void verifyTrip(List<Charging_station> availableStations) {
        if (car.getCar_max_range() < distance) {
            System.out.println("The car does not have enough battery to make the trip without stops.");
            
            // Calcula o número de paradas necessárias
            int numberOfStations = (int) Math.ceil(distance / Double.parseDouble(car.getCar_max_range()));
            
            planChargingStations(availableStations, numberOfStations);
        } else {
            System.out.println("The car has enough battery to make the trip without stops.");
        }
    }

    private void planChargingStations(List<Charging_station> availableStations, int numberOfStations) {
        double requiredRange = Double.parseDouble(car.getCar_max_range());
        remainingDistance = distance;
        
        for (Charging_station station : availableStations) {
            if (remainingDistance <= 0) break;

            if (remainingDistance > requiredRange) {
                plannedStations.add(station);
                remainingDistance -= requiredRange;
                System.out.println("Planned stop at " + station.getStation_location() + 
                                   " | Remaining distance: " + remainingDistance + " km");
            } else {
                System.out.println("Trip planning complete. Final destination can be reached.");
                break;
            }
        }
        
        if (remainingDistance > 0) {
            System.out.println("Warning: Not enough charging stations to complete the trip.");
        }
    }

    public void startTrip() {
        if (plannedStations.isEmpty() && car.getCar_battery_capacity() >= distance) {
            System.out.println("Trip started without planned stops.");
            car.updateAutonomy(distance);
            remainingDistance = 0;
        } else {
            for (Charging_station station : plannedStations) {
                if (remainingDistance <= 0) break;

                System.out.println("Stopping at " + station.getStation_location() + " to charge.");
                //car.recharge(station.getStation_charging_time());
                remainingDistance -= Double.parseDouble(car.getCar_max_range());
            }
            System.out.println("Trip complete. Final destination reached.");
        }
    }
}
