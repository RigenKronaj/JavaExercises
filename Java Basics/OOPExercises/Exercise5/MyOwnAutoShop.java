public class MyOwnAutoShop {
    public static void main(String[] args) throws Exception {
        try {
            // Creating objects of types Sedan, Ford, and Car
            Sedan sedanOne = new Sedan(200, 40000, "red", 17);

            Ford fordOne = new Ford(180, 25000, "green", 2016, 3000);
            Ford fordTwo = new Ford(230, 60000, "blue", 2019, 5000);

            Car carOne = new Car(160, 13000, "green");

            // Printing out the return value of the getSalesPrice() method of each object
            System.out.println("The sales price of this sedan is " + sedanOne.getSalesPrice());
            System.out.println("The sales price of this Ford is " + fordOne.getSalesPrice());
            System.out.println("The sales price of this Ford is " + fordTwo.getSalesPrice());
            System.out.println("The sales price of this Car is " + carOne.getSalesPrice());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}