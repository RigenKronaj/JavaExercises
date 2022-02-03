import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string you want to be repeated: ");
        String string = in.nextLine();
        System.out.print("How many times should the string be repeated? : ");
        int number = in.nextInt();
        repeat(string, number);
    }

    private static void repeat(String s, int n)
    {
        if(n <= 0)
            System.out.println("Please enter a number larger than zero");
        else
        {
            for(int i = 0; i < n; i++)
                System.out.println(s);
        }
    }
}
