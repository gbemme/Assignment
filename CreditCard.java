
public class CreditCard {
	int acctNo;
	int prevBal;
	int charges;
	int credit;
	int creditLimit;
	public CreditCard(int acctNo,int prevBal,int charges,int credit,int creditLimit) {
		this.acctNo = acctNo;
		this.prevBal = prevBal;
		this.charges = charges;
		this.credit = credit;
		this.creditLimit = creditLimit;
	}
	public void calCreditLimit(int prevBal,int charges,int credit) {
		int newBal = prevBal + charges - credit;
			if(newBal > creditLimit) {
				//return newBal;
			System.out.println("new balance =" + newBal);
			//return newBal;
			
			}else{
			System.out.println("credit limit exceeded");
		}
	}
	
	

}
