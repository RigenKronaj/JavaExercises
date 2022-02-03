public class Author {
    // Declaring the attributes of the Author class
    private String name;
    private String email;
    private char gender;

    // Declaring the overload constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if(gender != 'm' || gender != 'f')
            this.gender = 'f';
        else
            this.gender = gender;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Creating a new toString() method to print out the description of the Author
    public String toString() {
        return ("Author [name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "]");
    }
}
