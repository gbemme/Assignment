// program to calculate heartbeat rate
import java.util.Scanner;
public class HeartRates{
    String firstname;
    String lastname;
    String dateOfBirth;
    int month;
    int day;
    int year;
    int age;
    int currentYear = 2019;
  
    int max=0;
    public HeartRates(String firstname,String lastname,String dateOfBirth){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
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

    public void setdateOfBirth(int month,int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public String getdateOfBirth(int month,int day,int year){
        dateOfBirth = month + "/"+ day + "/" + year;
        return dateOfBirth;
        
    }
    
    public int getAgeYear(int year){
         
         age = 2019 - year;
        return age;
    }
    public int getMaxHeartRate(){
        max = 220 - age;
        return max;
    }
    public double getTargetRate(){
        double target =  max * 0.5;
        return target;
    }
}
    class HeartRatesTest{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("enter firstname");
            String firstname = input.nextLine();

            System.out.println("enter lastname");
            String lastname = input.nextLine();

            System.out.println("enter month");
            int month = input.nextInt();

            System.out.println("enter day");
            int day = input.nextInt();

            System.out.println("enter year");
            int year = input.nextInt();
            String dateOfBirth;
            dateOfBirth = month + "/"+ day + "/" + year;

            HeartRates patient1 = new HeartRates(firstname,lastname,dateOfBirth);
                System.out.println(patient1.getFirstname());
                System.out.println(patient1.getLastname());
                System.out.println(patient1.getdateOfBirth(month,day,year));
                System.out.println(patient1.getAgeYear(year));
                System.out.println(patient1.getMaxHeartRate());
                System.out.println(patient1.getTargetRate());

        }
    } 



    
