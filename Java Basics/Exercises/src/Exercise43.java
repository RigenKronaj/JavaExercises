public class Exercise43 {
    public static void main(String[] args) throws Exception {
        int[] array = {6, 3, 7, 5 , 9, 2, 1, 4};
        int target = 7;

        if(Pair(array, target))
            System.out.println("Two of the array elements sum to the target value");
        else
            System.out.println("The target is not reached");

    }

    public static boolean Pair(int[] array, int target)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 1; j < array.length; j++)
            {
                if(array[i + j] == target)
                    return true;
            }
        }
        return false;
    }
}
