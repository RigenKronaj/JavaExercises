public class PartTime extends Employees {

    // Declaring attributes
    private String type;

    // Declaring overload constructor
    public PartTime(String name, String surname, String type){
        super(name, surname);
        if(type.toLowerCase() == "fixed" || type.toLowerCase() == "indefinite" || type.toLowerCase() == "partial")
            this.type = type;
        else
            System.out.println("Please enter a correct value: Fixed, Indefinite or Partial.");
    }

    // Getter and setter
    public String getType(){
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    // toString() that prints short description
    public String toString()
    {
        return "This part time employee's name is " + this.name + " " + this.surname + ", and his type is " + this.type;
    }

}
