//here is the class for the driver, name, id, license and experience are the attributes
//experience gonna be a b*tch do make, cuz is three possible outcomes: starter, mid and advanced
//shit's gonna be a bunch of if else statements lol, gotta do what gotta do some times 

public class Driver{
    protected String driver_name;
    protected int driver_id;
    protected String driver_license;
    protected String driver_experience; //pay attention to this one

    public Driver(String driver_experience, int driver_id, String driver_license, String driver_name) {
        this.driver_experience = driver_experience;
        this.driver_id = driver_id;
        this.driver_license = driver_license;
        this.driver_name = driver_name;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public String getDriver_experience() {
        return driver_experience;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public void setDriver_experience(String driver_experience) {
        this.driver_experience = driver_experience;
    }

    @Override   
    public String toString(){
        return "Driver name: " + driver_name + "\nDriver ID: " + driver_id + "\nDriver license: " + driver_license + "\nDriver experience: " + driver_experience;
    }
}
