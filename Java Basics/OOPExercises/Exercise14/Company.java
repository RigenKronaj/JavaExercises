import java.util.ArrayList;

public class Company {
    // Declaring attributes
    private String name;
    private ArrayList<Employees> employees = new ArrayList<Employees>();
    
    // Declaring overload constructor
    public Company(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method to add employees to an array list of type Employees
    public void addEmployee(Employees employee) {
        employees.add(employee);
    }

    // toString() that prints short description
    public String toString() {
        return "Company " + this.name + " has " + employees.size() + " employees";
    }
}
