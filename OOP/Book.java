package OOP;

public class Book {
    private String bookName;
    private String authorName;


    Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;

    }

    public String getBookNamee() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }


    public String getInfo() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
