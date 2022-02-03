import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) throws Exception{

        try {
            Scanner in = new Scanner(System.in);
    
            // Asking the user for input
            System.out.print("Enter the first string: ");
            String s1 = in.nextLine();
            System.out.print("Enter the second string: ");
            String s2 = in.nextLine();
            System.out.print("Enter the third string: ");
            String s3 = in.nextLine();
    
            // Calling the concatenate method
            System.out.print("The concatenated string is : " + concatenate(s1, s2, s3));
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }

    public static String concatenate(String s1, String s2, String s3)
    {
        // The method returns a string that concatenates the string parameters
        return (s1 + "*" + s2 + "*" + s3);
    }
}
