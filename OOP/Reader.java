package OOP;

public class Reader {
    private String FIO;
    private String facultet;
    private String nomerBileta;
    private String mobileNumber;

    Reader(String FIO,String facultet,String nomerBileta,String mobileNumber){
        this.FIO = FIO;
        this.facultet = facultet;
        this.nomerBileta = nomerBileta;
        this.mobileNumber = mobileNumber;
        System.out.println("FIO: " + FIO + '\n' + "facultet: " + facultet + " nomer bileta: " + nomerBileta + '\n' + "Mobile number: "+ mobileNumber );
    }


    public void takeBook(int intBooks){
        System.out.println(FIO + " take " + intBooks + " books");
    }
    public void takeBook(String books){
        System.out.println(books);
    }
    public void takeBook(String bookName, String authorName){
        System.out.println("author Name:" + authorName  +
                "Book name: " + bookName);
    }
    public void returnBook(int intBooks){
        System.out.println(FIO + " return " + intBooks + " books");
    }

    public void returnBook(String books){
        System.out.println(books);
    }
    public void returnBook(String bookName, String authorName){
        System.out.println(FIO + " return " +"author Name:" + authorName  + "\n" +
                "Book name: " + bookName);
    }


    public String getInfoStudent() {
        return "Reader{" +
                "FIO='" + FIO + '\'' +
                ", facultet='" + facultet + '\'' +
                ", nomerBileta='" + nomerBileta + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
