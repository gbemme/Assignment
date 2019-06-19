import java.util.Scanner;
public class LargestNumer {
	public static void main(String[] args) {
	int counter = 1;
		int number=0;
		int largestNo =1;
		int secondLargest=0;
	
		Scanner input =  new Scanner(System.in);
		
	while(counter <= 10) {
			System.out.println("enter the number");
			  number = input.nextInt();
			  if(number>largestNo)
				  secondLargest=largestNo;
				  largestNo=number;
			  

		counter++;
	

		}
		System.out.println("largest value is:" + largestNo);
		System.out.println("second largest value is:" + secondLargest);
		
	
	
	}

}
