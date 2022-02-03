import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = in.nextLine();
        System.out.print("Enter the third string: ");
        String s3 = in.nextLine();

        System.out.print("The concatenated string is : " + concatenate(s1, s2, s3));
    }

    public static String concatenate(String s1, String s2, String s3)
    {
        return (s1 + "*" + s2 + "*" + s3);
    }
}
