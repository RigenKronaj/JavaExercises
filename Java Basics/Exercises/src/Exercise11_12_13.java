import java.util.Scanner;

public class Exercise11_12_13 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //First part
        System.out.println("Enter the first number");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("Enter the second number");
        int b = Integer.parseInt(in.nextLine());
        System.out.println("Enter the third number");
        int c = Integer.parseInt(in.nextLine());
        float average = (a + b + c) / 2;

        System.out.println("The average of the numbers is " + average);

        //Second part
        System.out.println("Enter the width of the rectangle");
        float width = Float.parseFloat(in.nextLine());
        System.out.println("Enter the height of the rectangle");
        float height = Float.parseFloat(in.nextLine());
        float area = width * height;
        System.out.println("The area of the rectangle is " + area);

        //Third part
        System.out.println("Enter the first number you wish to swap");
        float first = Float.parseFloat(in.nextLine());
        System.out.println("Enter the second number you wish to swap");
        float second = Float.parseFloat(in.nextLine());
        float tmp = first;
        first = second;
        second = tmp;
        System.out.println("The numbers have swapped their values, now first is " + first + " and second is " + second);
    }
}
