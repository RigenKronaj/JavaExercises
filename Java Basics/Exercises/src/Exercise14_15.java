public class Exercise14_15 {
    public static void main(String[] args) throws Exception {
        int b1 = 0b10;
        int b2 = 0b11;
        int sum = b1 + b2;
        int product = b1 * b2;

        System.out.println("The sum of the binary numbers " + Integer.toString(b1, 2) + " and " + Integer.toString(b2, 2) + " is " + Integer.toString(sum, 2));
        System.out.println("The product of the binary numbers " + Integer.toString(b1, 2) + " and " + Integer.toString(b2, 2) + " is " + Integer.toString(product, 2));
    }
}
