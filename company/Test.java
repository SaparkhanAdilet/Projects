package company;

import company.details.Car;
import company.details.Engine;
import company.details.Lorry;
import company.details.SportCar;
import company.details.Driver;



public class Test {
    public static void main(String[] args) {
        Driver mersDriver = new Driver("Adilet",19,"A.S.S",2);
        Engine mersEngine = new Engine(300,"Gernany");
        Car sportCar = new SportCar("tuyuts","car class", "4t",mersDriver,mersEngine,"300");

        System.out.println(sportCar);


    }
}
