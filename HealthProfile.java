// program for healthprofile for patient
import java.util.Scanner;
public class HealthProfile{
     String firstname;
     String lastname;
     String dateOfBirth;
     int month;
     int day;
     int year;
     String gender;
     double height;
     double weight;
     int currentYear = 2019;
     int max = 0;
     int age;

     public HealthProfile(String firstname,String lastname,String dateOfBirth,String gender,double height,double weight){
         this.firstname = firstname;
         this.lastname = lastname;
         this.dateOfBirth = dateOfBirth;
         this.gender = gender;
         this.height = height;
         this.weight = weight;
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

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
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

    public double getBodyMass(){
        double bodyMass = (weight*703) / (height * height);
        return bodyMass;

    }


    
}
class HealthProfileTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter firstname");
            String firstname = input.nextLine();

            System.out.println("enter lastname");
            String lastname = input.nextLine();

            System.out.println("enter gender");
            String gender = input.nextLine();

            System.out.println("enter month");
            int month = input.nextInt();

            System.out.println("enter day");
            int day = input.nextInt();

            System.out.println("enter year");
            int year = input.nextInt();

            System.out.println("enter height");
            double height = input.nextDouble();

            System.out.println("enter weight");
            double weight = input.nextDouble();

            String dateOfBirth;
            dateOfBirth = month + "/"+ day + "/" + year;

        HealthProfile nurse = new HealthProfile(firstname,lastname,dateOfBirth,gender,height,weight);
        System.out.println("your firstname is:" + nurse.getFirstname());
        System.out.println("your lastname is:" + nurse.getLastname());
        System.out.println("your DOB is:" + nurse.getdateOfBirth(month,day,year));
        System.out.println("your gender is:" + nurse.getGender());
        System.out.println("your height is:" + nurse.getHeight());
        System.out.println("your weight is:" + nurse.getWeight());
        System.out.println("your age is:" + nurse.getAgeYear(year));
        System.out.println("your heartMax is:" + nurse.getMaxHeartRate());
        System.out.println("your target is:" + nurse.getTargetRate());
        System.out.println("your bodymass is:" + nurse.getBodyMass());
    }
}