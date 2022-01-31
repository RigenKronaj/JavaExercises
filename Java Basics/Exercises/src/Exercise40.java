import java.util.Scanner;

class Exercise40 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Which element of the fibonacci sequence should be displayed?");
        int nr = in.nextInt();

        System.out.println("The " + nr + " element of the fibonacci sequence is " + Fibonacci(nr) + ".");           
    }
    
    public static int Fibonacci(int nr)
    {
        if (nr == 0)
            return 0;
        else if (nr == 1)
            return 1;
        else
            return Fibonacci(nr - 1) + Fibonacci(nr - 2);
    }
}
