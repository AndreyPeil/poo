import java.util.Scanner;

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
                scanner.nextLine(); // Skip next line.

                switch (choice) {
                    case 1 ->
                        addCar(fleet, scanner);
                    case 2 ->
                        removeCar(fleet, scanner);
                    case 3 ->
                        fleet.printFleet();
                    case 4 ->
                        addDriver(fleet, scanner);
                    case 5 ->
                        removeDriver(fleet, scanner);
                    case 6 ->
                        fleet.printDrivers();
                    case 7 ->
                        addChargingStation(fleet, scanner);
                    case 8 ->
                        removeChargingStation(fleet, scanner);
                    case 9 ->
                        fleet.printChargingStations();
                    case 10 ->
                        startTrip(fleet, scanner);
                    case 11 -> {
                        running = false;
                        System.out.println("Exiting system...");
                    }
                    default ->
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }

    private static void addCar(Fleet fleet, Scanner scanner) {
        System.out.print("Enter car ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter car brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter fabrication year: ");
        int year = scanner.nextInt();
        System.out.print("Enter battery capacity: ");
        double battery = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose car type:");
        System.out.println("1. Compact");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");
        int type = scanner.nextInt();
        scanner.nextLine();

        Default_car_specs car;
        switch (type) {
            case 1 ->
                car = new Compact(id, brand, model, year, battery);
            case 2 ->
                car = new Sedan(id, brand, model, year, battery);
            case 3 ->
                car = new SUV(id, brand, model, year, battery);
            default -> {
                System.out.println("Invalid car type.");
                return;
            }
        }
        fleet.addCar(car);
        System.out.println("Car added successfully.");
    }

    private static void removeCar(Fleet fleet, Scanner scanner) {
        System.out.print("Enter car model to remove: ");
        String model = scanner.nextLine();
        boolean pass = true;
        //boolean removed = fleet.getCars().removeIf(car -> car.getCar_model().equalsIgnoreCase(model));

        if (pass) {
            System.out.println("Car removed successfully.");
        } else {
            System.out.println("Car not found.");
        }
    }

    private static void addDriver(Fleet fleet, Scanner scanner) {
        System.out.print("Enter driver name: ");
        String name = scanner.nextLine();
        System.out.print("Enter driver ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter driver license: ");
        String license = scanner.nextLine();
        System.out.print("Enter driver experience (1 = Beginner / 2 = Intermediate / 3 = Expert): ");
        int experience = scanner.nextInt();

        Driver driver = new Driver(name, id, license, experience);
        fleet.addDriver(driver);
        System.out.println("Driver added successfully.");
    }

    private static void removeDriver(Fleet fleet, Scanner scanner) {
        System.out.print("Enter driver ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean pass = true;
        //boolean removed = fleet.getDrivers().removeIf(driver -> driver.getDriver_id() == id);

        if (pass) {
            System.out.println("Driver removed successfully.");
        } else {
            System.out.println("Driver not found.");
        }
    }

    private static void addChargingStation(Fleet fleet, Scanner scanner) {
        System.out.print("Enter station ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter station location: ");
        String location = scanner.nextLine();
        System.out.print("Enter station capacity: ");
        int capacity = scanner.nextInt();
        System.out.print("Enter charging time: ");
        double time = scanner.nextDouble();
        scanner.nextLine();

        Chargin_station station = new Chargin_station(id, location, capacity, time);
        fleet.addChargingStation(station);
        System.out.println("Charging station added successfully.");
    }

    private static void removeChargingStation(Fleet fleet, Scanner scanner) {
        System.out.print("Enter station ID to remove: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        boolean pass = true;
        //boolean removed = fleet.getStations().removeIf(station -> station.getStation_id() == id);

        if (pass) {
            System.out.println("Charging station removed successfully.");
        } else {
            System.out.println("Charging station not found.");
        }
    }

    private static void startTrip(Fleet fleet, Scanner scanner) {
        System.out.print("Enter driver ID for the trip: ");
        int driverId = scanner.nextInt();
        scanner.nextLine();

        Driver driver = fleet.getDrivers().stream()
                .filter(d -> d.getDriver_id() == driverId)
                .findFirst()
                .orElse(null);
        if (driver == null) {
            System.out.println("Driver not found.");
            return;
        }

        System.out.print("Enter car model for the trip: ");
        String carModel = scanner.nextLine();
        Default_car_specs car = fleet.getCars().stream()
                .filter(c -> c.getCar_model().equalsIgnoreCase(carModel))
                .findFirst()
                .orElse(null);
        if (car == null) {
            System.out.println("Car not found.");
            return;
        }

        System.out.print("Enter trip distance (km): ");
        double distance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        Trip trip = new Trip(driver, car, distance, destination);
        trip.verifyTrip(fleet.getStations());
        trip.startTrip();
    }
}
