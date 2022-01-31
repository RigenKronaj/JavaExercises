public class EmployeeTest {
    public static void main(String[] args){
        Employee employeeOne = new Employee("John", "Doe", 500);
        Employee employeeTwo = new Employee("Jane", "Doe", 600);

        System.out.println("Employee One's salary is " + employeeOne.getSalary());
        System.out.println("Employee Two's salary is " + employeeTwo.getSalary());

        employeeOne.salary *= 1.1;
        employeeTwo.salary *= 1.1;
        
        System.out.println("Employee One's new salary is " + employeeOne.getSalary());
        System.out.println("Employee Two's new salary is " + employeeTwo.getSalary());
    }
}
