package company.details;

public class Car {
    private String markCar;
    private String classCar;
    private String ves;
    private Driver driver;
    private Engine engine;

    public Car(String markCar ,String classCar,String ves,Driver driver,Engine engine){
        this.markCar = markCar;
        this.classCar = classCar;
        this.ves = ves;
        this.driver = driver;
        this.engine = engine;
    }


    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("stop");
    }

    public void turnRight(){
        System.out.println("turnRight");
    }

    public void turnLeft(){
        System.out.println("turnLeft");
    }

    @Override
    public String toString() {
        return "Car{" +
                "markCar='" + markCar + '\'' +
                ", classCar='" + classCar + '\'' +
                ", ves='" + ves + '\'' +
                ", driverType='" + driver + '\'' +
                ", engineType='" + engine + '\'' +
                '}';
    }
}
