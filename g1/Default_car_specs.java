// Here is a bunch of information about the cars, We'll be using inheritance to pass these base specs down to the variations.

public class Default_car_specs {

    protected int identifier;
    protected String car_brand;
    protected String car_model;
    protected int car_fabrication_year;
    protected double car_battery_capacity;
    protected double car_max_range;
    protected double car_max_capacity; // Capacidade total da bateria

    public Default_car_specs(int identifier, String car_brand, String car_model, int car_fabrication_year, double car_battery_capacity, double car_max_range) {
        this.identifier = identifier;
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_fabrication_year = car_fabrication_year;
        this.car_battery_capacity = car_battery_capacity;
        this.car_max_capacity = car_battery_capacity; // Inicializa a capacidade máxima como o valor total da bateria
        this.car_max_range = car_max_range;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public int getCar_fabrication_year() {
        return car_fabrication_year;
    }

    public double getCar_battery_capacity() {
        return car_battery_capacity;
    }

    public double getCar_max_range() {
        return car_max_range;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_fabrication_year(int car_fabrication_year) {
        this.car_fabrication_year = car_fabrication_year;
    }

    public void setCar_battery_capacity(double car_battery_capacity) {
        this.car_battery_capacity = car_battery_capacity;
    }

    public void setCar_max_range(double car_max_range) {
        this.car_max_range = car_max_range;
    }

    public void updateAutonomy(double distance) {
        double newAutonomy = getCar_battery_capacity() - distance;
        setCar_battery_capacity(newAutonomy);
    }

   public void recharge(double energy) {
        this.car_battery_capacity = Math.min(this.car_battery_capacity + energy, car_max_capacity);
    }

    @Override
    public String toString() {
        return "Car ID: " + identifier + "\nCar brand: " + car_brand + "\nCar model: " + car_model + "\nCar fabrication year: " + car_fabrication_year + "\nCar battery capacity: " + car_battery_capacity + "\nCar max range: " + car_max_range;
    }

}
