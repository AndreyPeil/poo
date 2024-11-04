
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        int car_ID = 0;
        int driver_ID = 0;
        int station_ID = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n===== Electric Car Fleet Management System =====");
                System.out.println("1. Add Car.");
                System.out.println("2. Remove Car.");
                System.out.println("3. List Cars.");
                System.out.println("4. Add Driver.");
                System.out.println("5. Remove Driver.");
                System.out.println("6. List Drivers.");
                System.out.println("7. Add Charging Station.");
                System.out.println("8. Remove Charging Station.");
                System.out.println("9. List Charging Stations.");
                System.out.println("10. Register Trip.");
                System.out.println("11. Report Low Battery Cars.");
                System.out.println("12. List Driver Trips.");
                System.out.println("13. View Recharge History.");
                System.out.println("14. Maintenance Report.");
                System.out.println("15. Exit.");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter car brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter car model: ");
                        String model = scanner.nextLine();
                        System.out.print("Enter car fabrication year: ");
                        int year = scanner.nextInt();
                        System.out.print("Enter car battery capacity: ");
                        double batteryCapacity = scanner.nextDouble();
                        System.out.print("Enter car type (Compact, Sedan, SUV): ");
                        scanner.nextLine();
                        String type = scanner.nextLine();
                        if (type.equalsIgnoreCase("Compact")) {
                            Default_car_specs car;
                            car = new Compact(car_ID, brand, model, year, batteryCapacity);
                            fleet.addCar(car);
                            car_ID++;
                        } else if (type.equalsIgnoreCase("Sedan")) {
                            Default_car_specs car;
                            car = new Sedan(car_ID, brand, model, year, batteryCapacity);
                            fleet.addCar(car);
                            car_ID++;
                        } else if (type.equalsIgnoreCase("SUV")) {
                            Default_car_specs car;
                            car = new SUV(car_ID, brand, model, year, batteryCapacity);
                            fleet.addCar(car);
                            car_ID++;
                        } else {
                            System.out.println("Invalid car type.");
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter ID of the car you want to remove: ");
                        int remove_carID = scanner.nextInt();
                        fleet.removeCar(remove_carID);
                    }
                    case 3 ->
                        fleet.printFleet();
                    case 4 -> {
                        System.out.print("Enter driver name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter driver license: ");
                        String license = scanner.nextLine();
                        System.out.print("Enter driver experience (1 = Beginner; 2 = Intermediate; 3 = Expert): ");
                        int exp = scanner.nextInt();
                        Driver driver = new Driver(name, driver_ID, license, exp);
                        fleet.addDriver(driver);
                        driver_ID++;
                    }
                    case 5 -> {
                        System.out.print("Enter ID of the driver you want to remove: ");
                        int remove_driverID = scanner.nextInt();
                        fleet.removeDriver(remove_driverID);
                    }
                    case 6 ->
                        fleet.printDrivers();
                    case 7 -> {
                        System.out.print("Enter station location: ");
                        String location = scanner.nextLine();
                        System.out.print("Enter station capacity: ");
                        int capacity = scanner.nextInt();
                        System.out.print("Enter station charging time: ");
                        double chargingTime = scanner.nextDouble();
                        Charging_station station = new Charging_station(station_ID, location, capacity, chargingTime);
                        fleet.addChargingStation(station);
                        station_ID++;
                    }
                    case 8 -> {
                        System.out.print("Enter ID of the station you want to remove: ");
                        int remove_stationID = scanner.nextInt();
                        fleet.removeStation(remove_stationID);
                    }
                    case 9 -> {
                        fleet.printChargingStations();
                    }
                    case 10 -> {
                        System.out.print("Enter driver ID: ");
                        int driverId = scanner.nextInt();
                        Driver driver = fleet.getDriverById(driverId);

                        if (driver == null) {
                            System.out.println("Driver not found.");
                            break;
                        }

                        System.out.print("Enter car ID: ");
                        int carId = scanner.nextInt();
                        Default_car_specs car = fleet.getCarById(carId);

                        if (car == null) {
                            System.out.println("Car not found.");
                            break;
                        }

                        System.out.print("Enter destination: ");
                        scanner.nextLine(); // Consume newline
                        String destination = scanner.nextLine();

                        System.out.print("Enter trip distance: ");
                        double distance = scanner.nextDouble();

                        fleet.registerTrip(driver, car, destination, distance);
                    }

                    case 11 ->
                        fleet.reportLowBatteryCars();

                    case 12 -> {
                        System.out.print("Enter driver ID to list trips: ");
                        int driverId = scanner.nextInt();
                        fleet.listDriverTrips(driverId);
                    }

                    case 13 -> {
                        System.out.print("Enter car ID to view recharge history: ");
                        int carId = scanner.nextInt();
                        Default_car_specs car = fleet.getCarById(carId);

                        if (car == null) {
                            System.out.println("Car not found.");
                            break;
                        }

                        fleet.rechargeHistory(car);
                    }

                    case 14 ->
                        fleet.maintenanceReport();

                    case 15 -> {
                        running = false;
                        break;
                    }
                    default ->
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.print("Press enter to proceed...");
                scanner.nextLine();
            }
        }
    }
}
