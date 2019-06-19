/**
 * 
 */
package chapter4;

/**
 * @author User
 *
 */
public class Table {
	
	public static void main(String[] args) {
		
		int counter = 1;
		int row1 = 1;
		int row2 = 1;
		int row3 = 1;
		
		System.out.println("N" + "\t" + "N*10" + "\t" + "N*100" + "\t" + "N*1000" + "\t");
		while(counter<=5) {
			row1 = counter *10;
			row2 = counter *100;
			row3 = counter *1000;
				
			System.out.println(counter + "\t" + row1 +"\t" + row2 +"\t" + row3 + "\t");
			counter++;
		}
			
	}

}
