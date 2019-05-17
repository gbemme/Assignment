// program to perform different operations
// author: Gbemisola
import java.util.Scanner;
public class Operation{


    public static void main(String[] args){
    int firstnumber;
    int secondnumber;
    char operator;
    int result;
    
        Scanner input = new Scanner(System.in);

        System.out.println("enter num1 : ");
        firstnumber = input.nextInt();
        System.out.println("enter the operator(*, +, /,% ,^ ) : ");
        operator = input.next().charAt(0);
        System.out.println("enter num2 : ");
        secondnumber = input.nextInt();
        if(operator =='*')
        {
            result = firstnumber * secondnumber;
            System.out.println("result = " +result);
         }
         else if(operator =='+')
         {
             result = firstnumber + secondnumber;
             System.out.println("result = " +result);
         }
         else if (operator =='/')
         {
             result = firstnumber / secondnumber;
             System.out.println("result = " +result);
         }

         else if (operator =='-')
         {
             result = firstnumber - secondnumber;
             System.out.println("result = " +result);
         }
         else if (operator =='%')
         {
             result = firstnumber % secondnumber;
             System.out.println("result = " +result);
         }
         else if (operator =='^')
         {
             result = firstnumber ^ secondnumber;
             System.out.println("result = " +result);
         }
         else{
             System.out.println("wrong operator!!!");
         }

    }

}