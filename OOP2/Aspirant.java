package OOP2;

public class Aspirant extends Student {
    Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public void getScholarship(double averageMark) {
        if(averageMark == 5.0){
            System.out.println("Your scholarship 200grn");
        }else{
            System.out.println("Your scholarship 180grn");
        }
    }
}
