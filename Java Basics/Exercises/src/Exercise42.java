public class Exercise42 {
    public static void main(String[] args) throws Exception {
        int p = 360;
        int q = 230;

        int result = GCD(p, q);
        System.out.println(result);
    }

    public static int GCD(int nr1, int nr2)
    {
        if(nr2 == 0)
            return nr1;
            
        return GCD(nr2, nr1 % nr2);
    }
}
