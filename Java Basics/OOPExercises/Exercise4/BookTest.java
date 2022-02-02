import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("test", 236742536, "test", "test"));
        books.add(new Book("test2", 264372372, "test2", "test2"));

        System.out.println(books.get(0).getBookInfo());
        System.out.println(books.get(1).getBookInfo());
    }
}
