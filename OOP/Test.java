package OOP;

public class Test {
    public static void main(String[] args) {

        Book book = new Book("Adventure, History, Ensiclopedia","Agata Kristi,Remark M., Nezn");

        Reader reader1 = new Reader("Saparkhan A. A.","It in Bussines,","Adilet1123","8777-777-111-111");
        reader1.takeBook(3);
        reader1.takeBook(book.getBookNamee());
        reader1.takeBook(book.getBookNamee(), book.getAuthorName());

        System.out.println();


        reader1.returnBook(3);
        reader1.returnBook(book.getBookNamee());
        reader1.returnBook(book.getBookNamee(), book.getAuthorName());




    }
}
