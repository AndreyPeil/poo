//Here is the class for the Drivers, name, id, license and experience are the attributes.
//Experience has three possible levels: Beginner, Intermediate and Expert.
//All 3 are defined by switch case usage, 1 = Beginner; 2 = Intermediate; 3 = Expert.

public class Driver {

    protected String driver_name;
    protected int driver_id;
    protected String driver_license;
    protected String driver_experience; //Experience is defined as a String.

    public Driver(String driver_name, int driver_id, String driver_license, int exp) {
        this.driver_name = driver_name;
        this.driver_id = driver_id;
        this.driver_license = driver_license;
        //But the constructor receives an integer to define the experience level of the driver.
        switch (exp) {
            case 1 ->
                this.driver_experience = "Beginner";
            case 2 ->
                this.driver_experience = "Intermediate";
            case 3 ->
                this.driver_experience = "Expert";
        }
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public String getDriver_experience() {
        return driver_experience;
    }

    public void setDriver_experience(int exp) {
        switch (exp) {
            case 1 ->
                this.driver_experience = "Beginner";
            case 2 ->
                this.driver_experience = "Intermediate";
            case 3 ->
                this.driver_experience = "Expert";
        }
    }

    @Override
    public String toString() {
        return "Driver name: " + driver_name + "\nDriver ID: " + driver_id + "\nDriver license: " + driver_license + "\nDriver experience: " + driver_experience;
    }

}
