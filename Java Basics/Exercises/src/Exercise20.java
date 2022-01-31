import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of sides the polygon has");
        int n = in.nextInt();
        System.out.println("Enter the length of the polygon's sides");
        int s = in.nextInt();

        double area = (n * (s * s)) / (4 * java.lang.Math.tan(3.14f/n));
        
        System.out.println("The area of the polygon with " + n + " sides and " + s + " length is "  + area);
    }
}
