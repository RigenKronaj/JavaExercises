import java.util.Scanner;

public class Exercise18_19 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number you wish to convert to octal");
        int octal = in.nextInt();
        System.out.println("The number " + octal + " in octal is " + Integer.toOctalString(octal));

        System.out.println("Enter the first number you wish to compare");
        int first = in.nextInt();
        System.out.println("Enter the second number you wish to compare");
        int second = in.nextInt();

        if(first == second)
            System.out.println("The numbers have equal values");
        else
            System.out.println("The numbers have different values");
    }
}
