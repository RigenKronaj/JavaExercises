public class Employees {

    // Declaring attributes
    protected String name;
    protected String surname;

    // Declaring overload constructor
    public Employees(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // toString() that prints out short description
    public String toString() {
        return "This employee's name is " + this.name + " " + this.surname;
    }
}