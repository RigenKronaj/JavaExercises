import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int personOneRisk = in.nextInt();
        if(personOneRisk > 3 || personOneRisk < 0)
        {
            System.out.println("The number must be in the range of 0 to 3");
            System.exit(0);
        }
        System.out.println("Enter the second number");
        int personTwoRisk = in.nextInt();
        if(personTwoRisk > 3 || personTwoRisk < 0)
        {
            System.out.println("The number must be in the range of 0 to 3");
            System.exit(0);
        }

        switch (personOneRisk){
            case 0: System.out.println("Person one does not wear a mask and has a 100% chance of infection."); break;
            case 1: System.out.println("Person one is wearing  a surgical mask and has an 80% chance of infection."); break;
            case 2: System.out.println("Person one is wearing an FPP2 mask and has a 18% chance of infection."); break;
            case 3: System.out.println("Person one is wearing an FPP3 mask and has a 0% chance of infection"); break;
            default: System.out.println("Person one does not wear a mask and has a 100% chance of infection.");
        }

        switch (personTwoRisk){
            case 0: System.out.println("Person one does not wear a mask and has a 100% chance of infection."); break;
            case 1: System.out.println("Person one is wearing  a surgical mask and has an 80% chance of infection."); break;
            case 2: System.out.println("Person one is wearing an FPP2 mask and has a 18% chance of infection."); break;
            case 3: System.out.println("Person one is wearing an FPP3 mask and has a 0% chance of infection"); break;
            default: System.out.println("Person one does not wear a mask and has a 100% chance of infection.");
        }
    }
}