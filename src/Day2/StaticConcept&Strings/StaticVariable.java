public class StaticVariable {
    static int bonus ;
    String Month;
    String Employee;
    String Company;
    static int Salary;


    public static void main(String[] args) {
        // we no need to create object for the static variable
        bonus = 500;
        StaticVariable sv = new StaticVariable();
        System.out.println("The Company Name: " + (sv.Company = "ABC pvt ltd"));
        System.out.println("Present Month: " +(sv.Month = "February"));
        System.out.println("The Employee Name: " +(sv.Employee="Varun .K"));
        //We can also able to create object for the static variable (but it is unwanted one)
        System.out.println("The Basic Salary: " +(sv.Salary=10000));

        int TotalSalary = Salary + bonus;

        System.out.println("\n The Total Salary of " +sv.Month+ " Month for Mr. " + sv.Employee+ " is : Rs." +TotalSalary);
    }
}
