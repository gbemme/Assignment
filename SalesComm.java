
public class SalesComm {
	double itemValue;
	double percentage = 0.09;
	double earningPerWeek = 200.00;
	int value = 0;
	public SalesComm(double itemValue) {
		this.itemValue = itemValue;
		//this.percentage = percentage;
		//this.earningPerWeek = earningPerWeek;
		
	}
	public void calSalesComm() {
		if(itemValue >= 0) {
			double percentPerSales = percentage * itemValue;
		 double salary = itemValue + earningPerWeek + percentPerSales; 

		
	   System.out.println("your earning for this week is :" + salary);
		}else {
			System.out.println("invalid value");
		}
	}

}
