/**
 * 
 */
package chapter4;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class Palindrome {
	//private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the 5 digit");
		int value = input.nextInt();
	
		int result =0;
		int newValue = value;
		
		
		
		while(value>0) {
		
			int remainder= value%10;
			result= result*10 + remainder;
			value = value/10;
			
		
		}
		 if(result== newValue) {
		System.out.println("the digit is a palindrome");
		
	}
		else{
			System.out.println("it is not a palindrome");
		}

  }
}
