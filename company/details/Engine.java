package company.details;

public class Engine {
    private int power;
    private String proizvoditel;

    public Engine(int power, String proizvoditel) {
        this.power = power;
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", proizvoditel='" + proizvoditel + '\'' +
                +'}';
    }
}
