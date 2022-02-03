public class OnJobTraining extends Employees{
    // Declaring attributes
    private int duration;

    // Declaring overload constructor
    public OnJobTraining(String name, String surname, int duration){
        super(name, surname);
        this.duration = duration;
    }

    // Getter and setter
    public int getDuration(){
        return this.duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    // toString() that prints short description
    public String toString()
    {
        return "This on-job-trainee's name is " + this.name + " " + this.surname + ", on contract for " + this.duration + " years.";
    }

}
