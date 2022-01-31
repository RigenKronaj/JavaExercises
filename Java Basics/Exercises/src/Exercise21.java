import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the X coordinate of point A");
        float pointAX = in.nextFloat();
        System.out.println("Enter the Y coordinate of point A");
        float pointAY = in.nextFloat();

        System.out.println("Enter the X coordinate of point B");
        float pointBX = in.nextFloat();
        System.out.println("Enter the Y coordinate of point B");
        float pointBY = in.nextFloat();

        float earthRadius = 6371.01f;
        double distance = earthRadius * Math.acos(Math.sin(pointAX) * Math.sin(pointBX) + Math.cos(pointAX) * Math.cos(pointAY) * Math.cos(pointAY - pointBY));
        System.out.println("The distance between the two points is " + distance + "kilometers");
    }
}
