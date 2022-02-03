public class AuthorTest {
    public static void main(String[] args) throws Exception {
        try {

            // Creating two new objects of type Author
            Author a = new Author("test", "test@gmail.com", 'm');
            Author b = new Author("test2", "test2@gmail.com", 'f');
    
            // Printing out the description of each object
            System.out.println(a.toString());
            System.out.println(b.toString());
    
            // Creating two new objects of type Books
            Books book1 = new Books("testbook", a, 50);
            Books book2 = new Books("testbook2", b, 40, 3);
    
            // Printing out the description of each object
            System.out.println(book1.toString());
            System.out.println(book2.toString());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}
