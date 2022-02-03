public class EmployeeTest {
    public static void main(String[] args) throws Exception{
        try {
            // Creating two new objects of type Employee
            Employee employeeOne = new Employee("John", "Doe", 500);
            Employee employeeTwo = new Employee("Jane", "Doe", 600);
    
            // Using a get method to get each object's salary
            System.out.println("Employee One's salary is " + employeeOne.getSalary());
            System.out.println("Employee Two's salary is " + employeeTwo.getSalary());
    
            // Multiplying each object's salary by 10%
            employeeOne.salary *= 1.1;
            employeeTwo.salary *= 1.1;
            
            // Printing out each object's new salary
            System.out.println("Employee One's new salary is " + employeeOne.getSalary());
            System.out.println("Employee Two's new salary is " + employeeTwo.getSalary());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}
