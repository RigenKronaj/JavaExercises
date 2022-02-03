public class TestProgram {
    public static void main(String[] args) throws Exception {
        try {
            Circle circle = new Circle(); // Creating an object of type Circle
    
            // Showing the capabilities of the Circle class by calling the getter methods
            System.out.println("The radius is " + circle.getRadius());
            System.out.println("The area is " + circle.getArea());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}
