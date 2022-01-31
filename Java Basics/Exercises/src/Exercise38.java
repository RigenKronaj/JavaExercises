public class Exercise38 {
    public static void main(String[] args) throws Exception {

        int[] array = {4, 6, 3, 7, 6, 8};
        int secondBiggest = secondBiggest(array);

        System.out.println("The second largest number in the array is " + secondBiggest);
    }

    public static int secondBiggest(int[] array)
    {
        int biggest = 0;
        int secondBiggest = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > biggest)
                    biggest = array[i];
            if(array[i] > biggest)
                {
                    secondBiggest = biggest;
                    biggest = array[i];
                }
        }
        return secondBiggest;
    }
}
