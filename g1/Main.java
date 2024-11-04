
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
                System.out.println("10. Start Trip.");
                System.out.println("11. End Trip.");
                System.out.println("12. Recharge report.");
                System.out.println("13");
                System.out.println("14");
                System.out.println("15");
                System.out.println("16");
                System.out.println("17");
                System.out.println("18. Exit.");
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
                    case 9 ->
                        fleet.printChargingStations();
                    case 10 ->
                        running = false;
                    case 11 ->
                        running = false;
                    case 12 ->
                        running = false;
                    case 13 ->
                        running = false;
                    case 14 ->
                        running = false;
                    case 15 ->
                        running = false;
                    case 16 ->
                        running = false;
                    case 17 ->
                        running = false;
                    case 18 ->
                        running = false;
                    default ->
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.print("Press enter to proceed...");
                scanner.nextLine();
            }
        }
    }
}
/*
                     case 10:
                        System.out.print("Enter driver id: ");
                        int driverId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter car id: ");
                        int carid = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter mileage: ");
                        double mileage = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter destination: ");
                        String destination = scanner.nextLine();
                        Driver m_driver = null;
                        Default_car_specs cat = null;
                        for (Object obj : fleet.getDrivers()) {
                            Driver d = (Driver) obj;
                            if (d.getDriver_id() == driverId) {
                                driver = d;
                                break;
                            }
                        }
                        for (Object obj : fleet.getCars()) {
                            Default_car_specs c = (Default_car_specs) obj;
                            if (c.getIdentifier() == carid) {
                                car = c;
                                break;
                            }
                        }
                        Trip trip = new Trip(m_driver, cat, mileage, destination);
                        trip.verifyTrip(fleet.getCharginStations());
                        trip.startTrip();
                        break;
                }
            }
        }
    }
}
 */
