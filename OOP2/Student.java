package OOP2;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    Student(String firstName,String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        getScholarship(averageMark);
        System.out.println("FIO: " + firstName + " "+ lastName + "\n"+
                "group: " + group + " AverageMark: " +
                averageMark
        );

    }



    public void getScholarship(double averageMark){
        this.averageMark = averageMark;
        if(averageMark == 5.0){
            System.out.println("Your scholarship 100grn");
        }else{
            System.out.println("Your scholarship 80grn");
        }
    }

}
