public class Exercise39 {
    public static void main(String[] args) throws Exception {
        int[] array = {6, 3, 7, 5, 8, 15, 35, 24};
        String result = FizzBuzz(array);
        System.out.println(result);
    }

    public static String FizzBuzz(int[] array) {
        String result = "";
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 3 == 0)
                result = "Fizz";
            else if(array[i] % 5 == 0)
                result = "Buzz";
            else if((array[i] % 3 == 0) && (array[i] % 5 == 0))
                result = "FizzBuzz";
            else
            {
                result = "" + array[i];
                result.toString();
            }

        }
        return result;
    }
}
