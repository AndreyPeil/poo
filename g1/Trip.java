
import java.util.ArrayList;
import java.util.List;

public class Trip {

    private Driver driver;
    private Default_car_specs car;
    private double mileage;
    private String destination;
    private List<Chargin_station> plannedStations;
    private double remainingDistance;

    public Trip(Driver driver, Default_car_specs car, double mileage, String destination) {
        this.driver = driver;
        this.car = car;
        this.mileage = mileage;
        this.destination = destination;
        this.plannedStations = new ArrayList<>();
        this.remainingDistance = mileage;
    }

    public void verifyTrip(List<Chargin_station> availableStations) {
        if (car.getCar_max_range() < mileage) {
            System.out.println("The car does not have enough battery to make the trip without stopping to recharge.");

            // Calculates the number of stops necessary.
            int numberOfStations = (int) Math.ceil(mileage / car.getCar_max_range());

            planChargingStations(availableStations, numberOfStations, remainingDistance);
        } else {
            System.out.println("The car has enough battery to make the trip without stopping to recharge.");
        }
    }

    private void planChargingStations(List<Chargin_station> availableStations, int numberOfStations, double remainingDistance) {
        double requiredRange = car.getCar_max_range();

        for (Chargin_station station : availableStations) {
            if (remainingDistance <= 0) {
                break;
            }

            if (remainingDistance > requiredRange) {
                plannedStations.add(station);
                remainingDistance -= requiredRange;
                System.out.println("Planned stop at " + station.getStation_location()
                        + " | Remaining distance: " + remainingDistance + " km");
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
        if (plannedStations.isEmpty() && car.getCar_battery_capacity() >= mileage) {
            System.out.println("Trip started without planned stops.");
            car.updateAutonomy(mileage);
            remainingDistance = 0;
        } else {
            for (Chargin_station station : plannedStations) {
                if (remainingDistance <= 0) {
                    break;
                }

                System.out.println("Stopping at " + station.getStation_location() + " to charge.");
                car.recharge(station.getStation_charging_time());
                remainingDistance -= car.getCar_max_range();
            }
            System.out.println("Trip complete. Final destination reached.");
        }
    }
}
