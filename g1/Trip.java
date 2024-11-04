import java.util.List;

public class Trip {
    private Driver driver;
    private Default_car_specs car;
    private List<Charging_station> availableStations;
    private double mileage;
    private String destination;
    private double remainingDistance;

    public Trip(Driver driver, Default_car_specs car, List<Charging_station> availableStations, double mileage, String destination) {
        this.car = car;
        this.driver = driver;
        this.availableStations = availableStations;
        this.mileage = mileage;
        this.destination = destination;
        this.remainingDistance = mileage;
        while (this.remainingDistance > 0 && car.getCar_battery_capacity() < mileage) {
            this.planRecharge(car, availableStations);
        }
        
    }

    public void planRecharge(Default_car_specs car, List<Charging_station> availableStations) {
        for (Charging_station station : availableStations) {
            if (station.getCapacity_usage() + 1 > station.getStation_capacity()) {}
            else {
                Recharging_event recharge;
                recharge = new Recharging_event(station, car);
            }
            }
        }
        
    }

/*

    public void verifyTrip(List<Charging_station> availableStations) {
        if (car.getCar_max_range() < mileage) {
            
            int numberOfStations = (int) Math.ceil(mileage / car.getCar_max_range());
            planChargingStations(availableStations, numberOfStations, remainingDistance);
        } else {
            System.out.println("The car has enough battery to make the trip without stopping to recharge.");
        }
    }
    private void planChargingStations(List<Charging_station> availableStations, int numberOfStations, double remainingDistance) {
        double requiredRange = car.getCar_max_range();

        for (Charging_station station : availableStations) {
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
            for (Charging_station station : plannedStations) {
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
*/
