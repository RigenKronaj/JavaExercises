import java.util.Scanner;

public class Exercise16_17 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number you wish to convert to binary");
        int first = in.nextInt();
        System.out.println("The number " + first + " in binary is: " + Integer.toBinaryString(first));

        System.out.println("Enter the number you wish to convert to hexadecimal");
        int second = in.nextInt();
        System.out.println("The number " + second + " in hexadecimal is: " + Integer.toHexString(second));

    }
}
