public class Apprentice extends Employees {
    // Declaring attributes
    private int age;

    // Declaring overload constructor
    public Apprentice(String name, String surname, int age) {
        super(name, surname);
        this.age = age;
    }

    // Getter and setter
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    // toString method for short description
    public String toString() {
        return "This apprentice's name is " + this.name + " " + this.surname + ", age " + this.age;
    }
}
