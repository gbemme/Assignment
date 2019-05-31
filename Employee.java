// program for employee
public class Employee{
    private String firstname;
    private String lastname;
    private double salary;
    //private double yearlySalary;
    //private double yearlyRaise;
    
    public Employee(String firstname,String lastname,double salary){
        this.firstname = firstname;
        this.lastname =  lastname;
        this.salary = salary;


    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public double getYearlySalary(){
        double yearlySalary = salary * 12;
        return yearlySalary;
    }
    // public double getYearlyRaise(){
    //     double yearlyRaise = double yearlySalary*1.1;
    //     return yearlyRaise;

    //}
        //if(double salary<=0){
            //return salary == 0;
        //}
    
    
    
}
class EmployeeTest{
    public static void main(String[] args){
        Employee staff1 = new Employee("ibrahim","ajao",20000.00);
        System.out.println("your yearly salary is :" + staff1.getYearlySalary());
        //System.out.println("your yearly raise:" + staff1.getYearlyRaise());
        Employee staff2 = new Employee("nimat","imran",5000.00);
        System.out.println("your yearly salary is :" + staff2.getYearlySalary());
        //System.out.println("your yearly raise :" + staff2.getYearlyRaise());
    }
}