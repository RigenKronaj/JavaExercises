import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args){

        // Creating an array list of type Book
        ArrayList<Book> books = new ArrayList<Book>();

        // Creating a for loop to populate the array list and then use the getBookInfo method 
        //to print out a short description of each member of the array
        for(int i = 0; i < 30; i++){
            books.add(new Book(("test" + i), 236742536, ("test" + i), ("test" + i)));
            System.out.println(books.get(i).getBookInfo());
        }

    }
}
