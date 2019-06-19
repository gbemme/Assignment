package chapter4;
import java.util.Scanner;

public class HollowSquare {
	public static void main(String[] args) {
//		int side1=1;
//		int left_side=1;
//		int right_side=1;
//		int down=1;
//		int counter =1;
//		while(counter<=5) {
//			System.out.print("*");
//			if(counter==5) {
//				System.out.println();
//				while(left_side<=5) {
//					System.out.print("*   ");
//					System.out.print("");
//					System.out.print("*   ");
//					System.out.println();
//					left_side++;
//				}
//			}
//			counter++;
//		}
//		while(down<=5) {
//			System.out.print("*");
//			down++;
//		}
//
		int value=5;
		int top;
		int side1;
		int side2;
		int down;
		int counter =1;
		while(counter<=1) {
			top = 1;
			while(top<=value) {
				System.out.print("* ");
				top++;
			}
			side1=1;
			while(side1<=value) {
				System.out.println("*");

					side1++;
			}
					side2=10;
					while(side2!=value) {
						System.out.println("\t  * \t");
						side2++;
						
					}
			
//			side2=1;
//			while(side2<=value) {
//				System.out.println("f");
//				side2++;
//			}
//			
			
			counter++;
		
		}
	}
}
			

	
		 
		
	
	


