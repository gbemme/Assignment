// program to display date
public class Date{
    int month;
    int day;
    int year;
    public Date(int month, int day, int year){
       this.month = month;
       this.day = day;
       this.year = year; 
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public String displayDate(){
        String date = month + "/"+ day + "/" + year;
        return date;

    }

}
    class DateTest{
        public static void main(String[] args){
            Date today = new Date(05,10,1994);
            System.out.println("today's date is :" + today.displayDate());
        }
    }// ends
