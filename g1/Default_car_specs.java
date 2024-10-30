//here is a bunch of information about the cars, I'll be using heritance cuz lazy LOL

public class Default_car_specs {

    protected String car_brand;
    protected String car_model;
    protected String car_fabrication_year;
    protected double car_battery_capacity;
    protected String car_max_range;

    public Default_car_specs(String car_brand, String car_model, String car_fabrication_year, double car_battery_capacity, String car_max_range) {
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.car_fabrication_year = car_fabrication_year;
        this.car_battery_capacity = car_battery_capacity;
        this.car_max_range = car_max_range;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public String getCar_fabrication_year() {
        return car_fabrication_year;
    }

    public double getCar_battery_capacity() {
        return car_battery_capacity;
    }

    public String getCar_max_range() {
        return car_max_range;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_fabrication_year(String car_fabrication_year) {
        this.car_fabrication_year = car_fabrication_year;
    }

    public void setCar_battery_capacity(double car_battery_capacity) {
        this.car_battery_capacity = car_battery_capacity;
    }

    public void setCar_max_range(String car_max_range) {
        this.car_max_range = car_max_range;
        }

        public void updateAutonomy(double distance) {
        double newAutonomy = getCar_battery_capacity() - distance;
        setCar_battery_capacity(newAutonomy);
        }

        public void recharge(double energy) {
        if (this.car_battery_capacity + energy <= getCar_battery_capacity()) {
            this.car_battery_capacity += energy;
        } else {
            this.car_battery_capacity = getCar_battery_capacity();
        }
        }

        @Override
        public String toString() {
        return "Car brand: " + car_brand + "\nCar model: " + car_model + "\nCar fabrication year: " + car_fabrication_year + "\nCar battery capacity: " + car_battery_capacity + "\nCar max range: " + car_max_range;
    }

}
