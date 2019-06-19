/**java application for gas mileage
 * 
 */

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class GasMileage {

	public static void main(String[] args) {

		int trip = 0;
		 int mile = 0;
		 int gallon = 0;
		 int counter = 0;
		 //double totalMile = 0;
		 int total = 0;
		 double average = 0.00;
		 int result = 0;
		 
		Scanner input = new Scanner(System.in);
		
			System.out.print("Enter number of trips or -1 to quit:");
				 trip = input.nextInt();
				 
				while (counter < trip) {
					System.out.println("Enter mile: ");
					mile = input.nextInt();
					if(mile== -1) {
						System.out.println("operation terminate");
						break;
					}
					System.out.println("Enter gallon: ");
					gallon = input.nextInt();
					//int userInput = input.nextInt();
					
					
					if(gallon== -1) {
						System.out.println("operation terminate");
						break;
					}
					  result =  mile/gallon;
					  System.out.println("result for each trip is :" + result);
					  
					   total = total + result;
					  
					 counter++;
					
				}
				 average = total / trip;
				System.out.println("the average result =" + average);
				
	}
}
