package company.details;

public class SportCar extends Car{
    private String maxSpeed;

    public SportCar(String markCar, String classCar, String ves, Driver driver, Engine engine,String maxSpeed) {
        super(markCar, classCar, ves, driver, engine);
        this.maxSpeed = maxSpeed;

    }


    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed='" + maxSpeed + '\'' +
                 '}'+ super.toString();
    }
}
