public class Exercise29_30 {
    public static void main(String[] args) throws Exception {
        int[] array= {34, 5, 245, 63, 6, 345, 6};

        if(array[0] == array.length - 1)
            System.out.println("The first and last elements of the area are equal");
        else
            System.out.println("The first and last elements of the area are not equal");

        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        int[] array3 = {array1[0], array2[array2.length-1]};

        System.out.printf("Array 1 contains " + array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.printf("\nArray 2 contains " + array2[0] + ", " + array2[1] + ", " + array2[2]);
        System.out.printf("\nArray 3 contains " + array3[0] + ", " + array3[1]);
    }
}
