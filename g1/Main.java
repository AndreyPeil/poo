
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("\n===== Fleet Management System =====");
                System.out.println("1. Add Car");
                System.out.println("2. Remove Car");
                System.out.println("3. List Cars");
                System.out.println("4. Add Driver");
                System.out.println("5. Remove Driver");
                System.out.println("6. List Drivers");
                System.out.println("7. Add Charging Station");
                System.out.println("8. Remove Charging Station");
                System.out.println("9. List Charging Stations");
                System.out.println("10. Start Trip");
                System.out.println("11. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter car brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter car model: ");
                        String model = scanner.nextLine();
                        System.out.print("Enter car battery capacity: ");
                        double batteryCapacity = scanner.nextDouble();
                        System.out.print("Enter car id: ");
                        int carId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter car type (Compact, Sedan, SUV): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter car fabrication year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();

                        Default_car_specs car;
                        if (type.equalsIgnoreCase("Compact")) {
                            car = new Compact(carId, brand, model, year, batteryCapacity);
                        } else if (type.equalsIgnoreCase("Sedan")) {
                            car = new Sedan(carId, brand, model, year, batteryCapacity);
                        } else if (type.equalsIgnoreCase("SUV")) {
                            car = new SUV(carId, brand, model, year, batteryCapacity);
                        } else {
                            System.out.println("Invalid car type.");
                            break;
                        }
                        fleet.addCar(car);
                        break;
                    case 2:
                        System.out.print("Enter car id: ");
                        carId = scanner.nextInt();
                        scanner.nextLine();
                        fleet.removeCar(carId);
                        break;
                    case 3:
                        fleet.printFleet();
                        break;
                    case 4:
                        System.out.print("Enter driver name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter driver id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter driver license: ");
                        String license = scanner.nextLine();
                        System.out.print("Enter driver experience (1 = Beginner; 2 = Intermediate; 3 = Expert): ");
                        int exp = scanner.nextInt();
                        scanner.nextLine();
                        Driver driver = new Driver(name, id, license, exp);
                        fleet.addDriver(driver);
                        break;
                    case 5:
                        System.out.print("Enter driver id: ");
                        id = scanner.nextInt();
                        fleet.removeDriver(id);
                        break;
                    case 6:
                        fleet.printDrivers();
                        break;
                    case 7:
                        System.out.print("Enter station id: ");
                        int stationId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter station location: ");
                        String location = scanner.nextLine();
                        System.out.print("Enter station capacity: ");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter station charging time: ");
                        double chargingTime = scanner.nextDouble();
                        scanner.nextLine();
                        Charging_station station = new Charging_station(stationId, location, capacity, chargingTime);
                        fleet.addChargingStation(station);
                        break;
                    case 8:
                        System.out.print("Enter station id: ");
                        stationId = scanner.nextInt();
                        fleet.removeStation(stationId);
                        break;

                    case 9:
                        fleet.printChargingStations();
                        break;

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
                    case 11:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }
}
