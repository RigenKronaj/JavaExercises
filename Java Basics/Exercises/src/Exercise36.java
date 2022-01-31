import java.util.Scanner;

public class Exercise36
{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of numbers the array contains");
        int nr = in.nextInt();
        int[] integers = {};
        
        for(int i = 0; i < nr; i++)
        {
            System.out.println("Enter the " + (i + 1) + " number");
            integers[i] = in.nextInt();
        }

        System.out.println("Which number do you want to find?");
        int findNumbers = in.nextInt();

        System.out.println(index(findNumbers, integers));
    }

    public static int index(int number, int[] integers)
    {
        int found = -1;
        for(int i = 0; i < integers.length; i++)
        {
            if(number == integers[i])
            {
                found = i;
                break;
            }

        }
        return found;
    }
}