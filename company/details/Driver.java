package company.details;

import company.professions.Person;

public class Driver extends Person {
    private String FIO;
    private int experience;

    public Driver(String name, int age,String FIO,int experience) {
        super(name, age);
        this.FIO = FIO;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "FIO='" + FIO + '\'' +
                ", experience=" + experience +
                '}' + super.toString();
    }
}
