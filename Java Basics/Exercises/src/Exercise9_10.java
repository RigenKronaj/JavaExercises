import java.util.Scanner;

public class Exercise9_10 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = in.nextInt();

        for(int i = 1; i <=10; i++)
        {
            System.out.println(a + " x " + i + " = " + a * i);
        }

        System.out.println("Enter the radius of the circle");
        float b = in.nextFloat();

        System.out.println("The circumference of the circle is " + (3.14f * (b * b)));
        System.out.println("The surface of the circle is " + (2 * 3.14f * b));
    }
}
