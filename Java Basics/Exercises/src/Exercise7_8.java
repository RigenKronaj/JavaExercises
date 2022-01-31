import java.util.Scanner;

public class Exercise7_8 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Enter the first number: \n");
        in.nextInt(a);
        System.out.println("Enter the second number: \n");
        in.nextInt(b);
        System.out.println("The product of the two numbers is " + a * b);

        int c = 0;
        int d = 0;

        System.out.println("Enter the first number: \n");
        in.nextInt(c);
        System.out.println("Enter the second number: \n");
        in.nextInt(d);

        System.out.println("The sum of the two numbers is " + (c + d));
        System.out.println("The product of the two numbers is " + (c * d));
        System.out.println("The division of the two numbers is " + (c / d));
        System.out.println("The mode of the two numbers is " + (c % d));

    }
}
