// program to calculate permutation
import java.util.Scanner;
public class Permutation{
    int num1;
    int num2;
    int permutation;

     Scanner input = new Scanner(System.in);
    public static void main(String[] args){

       
        System.out.println("Enter firstnumber");
        int firstnumber = input.nextInt();
        System.out.println("Enter secondnumber");
        secondnumber = input.nextInt();
        
         
         int number1 = firstnumber;
         int number2 = secondnumber;
         int fact;
        
        for(int j=1; j < fact; j++){
           int b = fact-j;

             fact *= b;

            
        }
    
            int c =  number1 - number2;
             int perm = c;

         for(int i=1; i<c; i++) {
                int e = c-i;
            perm *= e;

       }
       int result = fact / perm;
       System.out.println("result =" + result);

            

        
    }

}