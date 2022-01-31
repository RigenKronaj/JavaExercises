public class Exercise45 {
    public static void main(String[] args) throws Exception {
        String firstString = "one small step for man";
        String secondString = "one giant leap for mankind";

        String result = Subsequence(firstString, secondString);
        System.out.println(result);
    }

    public static String Subsequence(String first, String second)
    {
        String result = "";
        for(int i = 0; i < first.length(); i++)
        {
            for(int j = 0; j < second.length(); j++)
            {
                if(first.charAt(i) == second.charAt(j))
                    result += first.charAt(i);
            }
        }
        return result;
    }
}
