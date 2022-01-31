import java.util.Scanner;

public class Exercise22_23_24 {
    public static void main(String[] args) throws Exception {
        String str = "The quick brown fox";
        String nstr = "";
        char c;
        int count = 0;

        System.out.println("The string is " + str);

        for(int i = 0; i <str.length(); i++)
        {
            c = str.charAt(i);
            nstr = c + nstr;
            count++;
        }

        System.out.println("The reversed string is: \n" + nstr);
        System.out.println("The amount of characters in the string is " + count);
    }
}
