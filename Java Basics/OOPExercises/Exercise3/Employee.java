public class Employee {

    // Declaring the attributes of the employee class
    private String firstName;
    private String lastName;
    public double salary;

    // Declaring the overload constructor
    public Employee(String name, String last, double sal)
    {
        firstName = name;
        lastName = last;
        if(sal < 0)
            salary = 0;
        else
            salary = sal;
    }

    // Setter methods
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Getter methods
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public double getSalary()
    {
        return salary;
    }
}
