import java.util.Scanner;

public class Exercise25_26_27_28 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String input = in.nextLine();
        System.out.println("The string converted to lowercase is " + input.toLowerCase());

        String[] words = input.split("[ ]+");
        System.out.println("The penultimate word is " + words[words.length - 2]);

        System.out.println("Enter the first number");
        int first = in.nextInt();
        System.out.println("Enter the second number");
        int second = in.nextInt();
        System.out.println("Enter the third number");
        int third = in.nextInt();

        if(first >= 20 && (first >= (second-third) || first >= (third-second))) 
        {
            System.out.println("The conditions were met");
        }
        else if(second >= 20 && (second >= (first-third) || second >= (third-first)))
        {
            System.out.println("The conditions were met");
        }
        else if(third >= 20 && (third >= (second-first) || third >= (first-second)))
        {
            System.out.println("The conditions were met");
        }
        else
        {
            System.out.println("The conditions were not met");
        }

        int[] array = {25, 52, 53, 53, 34, 64};

        if(array[0] == 10 || array[5] == 10)
        {
            System.out.println("10 is contained within the array as the first or last element");
        }
        else
        {
            System.out.println("10 is not within the array as the first or last element");
        }
    }

}
