public class Exercise41 {
    public static void main(String[] args) throws Exception {
        String word = "hello";
        String word2 = "racecar";

        boolean result = Palindrome(word);
        if(result)
            System.out.println("The word " + word + " is a palindrome");
        else
            System.out.println("The word " + word + " is not a palindrome");

        result = Palindrome(word2);
        if(result)
            System.out.println("The word " + word2 + " is a palindrome");
        else
            System.out.println("The word " + word2 + " is not a palindrome");

    }

    public static boolean Palindrome(String word)
    {
        int fwd = 0;
        int bwd = word.length() - 1;

        while(bwd > fwd)
        {
            char fwdChar = word.charAt(fwd++);
            char bwdChar = word.charAt(bwd--);

            if(fwdChar != bwdChar)
                return false;
        }
        
        return true;
    }
}
