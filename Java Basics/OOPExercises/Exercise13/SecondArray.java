import java.util.ArrayList;
import java.util.Scanner;

public class SecondArray {
    public static void main(String[] args) throws Exception {
        try {

            // Creating two new array lists of type Integer
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> positives = new ArrayList<Integer>();

            // Using a for loop to ask the user for input
            for(int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int number = in.nextInt();
                list.add(number);

                // Program checks whether the number is larger or equal to zero
                // and if it is, it adds the number to the second array list
                if(number >= 0)
                    positives.add(number);
            }

            int index = positives.size();

            // Using a while loop, we traverse the array backwards and print out its elements
            while(index + 1 > 0)
            {
                System.out.println(positives.get(index - 1));
                index--;
            }
            
            in.close();

        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
    
}
