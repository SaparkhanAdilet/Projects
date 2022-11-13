package company.details;

public class Lorry extends Car{
    private String loadCapacity;

    public Lorry(String markCar, String classCar, String ves, Driver driver, Engine engine,String loadCapacity) {
        super(markCar, classCar, ves, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "loadCapacity='" + loadCapacity + '\'' +
                super.toString()+'}';
    }
}
