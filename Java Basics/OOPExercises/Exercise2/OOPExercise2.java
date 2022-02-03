import java.util.ArrayList;
import java.util.Scanner;

public class OOPExercise2 {
    public static void main(String[] args) throws Exception{
        try {
            Scanner in = new Scanner(System.in);
    
            ArrayList<Integer> grades = new ArrayList<Integer>();
            for(int i = 0; i < 20; i++)
            {
                System.out.print("Enter the " + (i + 1) + " number : ");
                int number = in.nextInt();
                if(number == -1)
                    break;
                else
                    grades.add(number);    
                }
                System.out.print("The average grade is " + Average(grades));
                in.close();
       } catch (Exception e) {
           System.out.println("Exited with exception: " + e.getMessage());
       }
    }

    public static double Average(ArrayList<Integer> array)
    {
        // Declaring a temporary variable to store the sum of numbers
        double sum = 0.0;

        // Creating a for loop to traverse the array
        for(int j = 0; j < array.size(); j++);
        {
            int index = 0;
            sum += array.get(index);
            index++;
            // Unknown error; for loop does not iterate correctly, reason unknown
        }

        // Returning the average of the array
        return sum / array.size();
    }
}
