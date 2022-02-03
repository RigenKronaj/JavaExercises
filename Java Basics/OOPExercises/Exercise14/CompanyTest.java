public class CompanyTest {
    public static void main(String[] args) throws Exception {
        try {
            // Creating new object of type Company
            Company company = new Company("Inteco");

            // Creating objects of types Apprentice, PartTime, OnJobTraining that extend Employees
            Apprentice apprentice = new Apprentice("test", "test", 20);
            PartTime partTime = new PartTime("test2", "test2", "partial");
            OnJobTraining onJobTraining = new OnJobTraining("test3", "test3", 3);

            // Adding objects to the array list
            company.addEmployee(apprentice);
            company.addEmployee(partTime);
            company.addEmployee(onJobTraining);

            // Printing out the descriptions of each object
            System.out.println(company.toString());
            System.out.println(apprentice.toString());
            System.out.println(partTime.toString());
            System.out.println(onJobTraining.toString());
        } catch (Exception e) {
            System.out.println("Exited with exception: " + e.getMessage());
        }
    }
}
