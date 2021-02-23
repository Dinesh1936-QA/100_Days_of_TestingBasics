public class ProgramStatic {
    
static String CompanyName = "CJS Tech Solution Pvt Ltd,..", Month = "FEB";
String EmployeeName, Location, Designation, sex,empID;
double Basic, HRA, Conveyance, ESI,PF;
long mobileNumber;
int LOP;
static int WorkingDays = 30, Permission = 2, Year = 2021, OfficeLeave = 4;

    static {
        System.out.println("\t \t \t \t" + CompanyName );
        System.out.println("\n Month & Year: " +Month+ "-"+Year+ "\t \t \t \t Days: " + WorkingDays);
    }

    static int officeTotalWorkDays(){
        return WorkingDays-OfficeLeave;
    }

    public int totalWorkDaysOfEmp(){
        int days = ( (officeTotalWorkDays() - LOP) + Permission ) ;

        switch (days){
            case 27: {
                return days-1;
            }
            case 28: {

                return days-2;
            }
            default: {
                return days;
            }
        }

    }

    public double totalEarningOfEmp(){
       return Basic+Conveyance+HRA;
    }

    public double empSalaryBasedOnWorkDays(){
        return ( (totalEarningOfEmp() / officeTotalWorkDays()) * totalWorkDaysOfEmp() );
    }

    public double NetPayOfEmp(){
        return  (empSalaryBasedOnWorkDays() - totalDeductionFormEmpSalary());
    }

    public double  totalDeductionFormEmpSalary(){
        return PF+ESI;
    }

    public void PayDetails(){
        System.out.println("The Employee Name : " +EmployeeName);
        System.out.println("The Employee Designation  : " +Designation);
        System.out.println("The Employee ID : " +empID);
        System.out.println("The Employee Gender : " +sex);
        System.out.println("The Employee Location : " +Location);
        System.out.println("The Employee Contact Number : " + mobileNumber);
        System.out.println("The Employee Basic Salary : " + Basic);
        System.out.println("The Employee HRA Amount : " + HRA);
        System.out.println("The Employee Conveyance: " +Conveyance);
        System.out.println("The Employee Provident Fund amount : " +PF);
        System.out.println("The Employee ESI amount from salary : " +ESI);
        System.out.println("\n The Total working days of the employee : "+totalWorkDaysOfEmp());
        System.out.println("\nThe Total Earning: " +empSalaryBasedOnWorkDays()+"\t \t \t total deduction : "+totalDeductionFormEmpSalary());
        System.out.println("\nThe Employee NetPay Amount is : "+NetPayOfEmp());
    }

    public static void main(String[] args) {
        ProgramStatic ps = new ProgramStatic();
        ps.EmployeeName = "DINESH . N";
        ps.sex ="MALE";
        ps.empID = "COD 172";
        ps.Designation = "QA-PTY Team";
        ps.Location = "Kancheepuram";
        ps.mobileNumber = 8122551287L;
        ps.Basic = 5800.00;
        ps.HRA = 3250.00;
        ps.Conveyance = 500.00;
        ps.ESI = ps.HRA/25;
        ps.PF = ps.Basic/14.25;
        ps.LOP = 9;
        ps.PayDetails();
    }
}
