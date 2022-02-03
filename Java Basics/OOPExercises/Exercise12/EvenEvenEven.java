public class EvenEvenEven {
    public static void main(String[] args) throws Exception {
        try {
            // Initializing variables, one array to store the numbers, and two integers to store the sum
            // of even and odd numbers separately
            int[] numbers = {7, 2, 8, 35, 45, 2, 6, 9, 32, 56};
            int sumEven = 0;
            int sumOdd = 0;

            // Traversing the array
            for(int i = 0; i < numbers.length; i++)
            {
                // Checking whether the current element is divisible by 2, making it even
                // or if it is not, making it odd
                if(numbers[i] % 2 == 0)
                    sumEven += numbers[i];
                else 
                    sumOdd += numbers[i];
            }

            // Checking if the sum of even and odd numbers is equal, and printing out a message
            // in accordance
            if(sumOdd == sumEven)
                System.out.println("Even and Odd equals");
            else
                System.out.println("Odd and Even");

        } catch (Exception e) {
            System.err.println("Exited with exception: " + e.getMessage());
        }
    }
    
}
