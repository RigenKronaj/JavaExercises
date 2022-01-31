import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number you wish to calculate the factor for");
        int num = in.nextInt();

        long factorial = factorial(num);
        System.out.println("The factorial of the number " + num + " is " + factorial);
    }

    public static long factorial(int num) 
    {
        long factorial = 1;
        for(int i = 1; i <= num; i++)
        {
            factorial *= i;
        }

        return factorial;
    }
}
