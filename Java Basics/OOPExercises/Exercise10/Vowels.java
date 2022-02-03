import java.util.Scanner;

class Vowels {
    public static void main(String[] args) throws Exception{
        try {
            Scanner in = new Scanner(System.in);
    
            // Requesting a string from the user
            System.out.print("Enter a string: ");
            String s = in.nextLine();
    
            // Using a for loop to traverse the string and check whether the character it is currently at
            // is a vowel, and if it is, prints out the vowel
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                    System.out.print(s.charAt(i));
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Exited with exception: " + e.getMessage());
        }
    }
}
