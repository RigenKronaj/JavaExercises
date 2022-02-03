import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) throws Exception{
        try {
            Scanner in = new Scanner(System.in);
    
            // Asking for user input
            System.out.print("Enter the string you want to be repeated: ");
            String string = in.nextLine();
            System.out.print("How many times should the string be repeated? : ");
            int number = in.nextInt();

            // Calling the repeat method
            repeat(string, number);
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }

    private static void repeat(String s, int n)
    {
        // The method checks whether this condition is met and halts the program if it is
        if(n <= 0)
            System.out.println("Please enter a number larger than zero");
        // Otherwise the method repeats the string input a certain number of times
        else
        {
            for(int i = 0; i < n; i++)
                System.out.println(s);
        }
    }
}
