public class Exercise4_5 {

    public static float sum(float a, float b)
    {
        float nr1 = a;
        float nr2 = b;
    
        return nr1 + nr2;
    }

    public static float divide(float a, float b)
    {
        float nr1 = a;
        float nr2 = b;

        return nr1 / nr2;
    }
    public static void main(String[] args) throws Exception {
        float nr1 = 14;
        float nr2 = 4;
        System.out.println("The sum of the numbers " + nr1 + " and " + nr2 + " is " + sum(nr1, nr2));
        System.out.println("The division of the numbers " + nr1 + " and " + nr2 + " is " + divide(nr1, nr2));
    }


}
