public class Exercise31_32_33 {
    public static void main(String[] args) throws Exception {
        int[] array1 = {63, 26, 47};
        if(array1[0] > array1[array1.length - 1])
        {
            System.out.println(array1[0] + " is larger than " + array1[array1.length - 1]);
        }
        else
        {
            System.out.println(array1[0] + " is smaller than " + array1[array1.length - 1]);
        }

        int tmp = array1[0];
        int[] array2 = array1;
        array2[0] = array2[array2.length - 1];
        array2[array2.length - 1] = tmp;

        System.out.println("Array 1 elements: " + array1[0] + " " + array1[1] + " " + array1[2]);
        System.out.println("Array 2 elements: " + array2[0] + " " + array2[1] + " " + array2[2]);
    }
}
