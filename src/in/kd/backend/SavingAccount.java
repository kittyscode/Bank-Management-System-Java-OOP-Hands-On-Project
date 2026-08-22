package in.kd.backend;

import java.math.BigDecimal;
//classes inherited from BankAccount
public class SavingAccount extends BankAccount {
	private BigDecimal interest;
	private BigDecimal interestAmount;

	SavingAccount(String customerName,long accountNumber,BigDecimal balance,BigDecimal interest){
		super(customerName, accountNumber, balance);
		this.interest=interest;
			
	}
	void calculateInterest() {
		interestAmount= getBalance().multiply(interest).divide(new BigDecimal(100));
		deposite(interestAmount);
		
	}
	BigDecimal getInterestAmount() {
		return interestAmount;
	}
	@Override
	 void withdraw(BigDecimal withdrawAmount) {
		BigDecimal  balance=getBalance();
		  if( 0<withdrawAmount.compareTo(new BigDecimal("0")) && balance.subtract(withdrawAmount).compareTo(new BigDecimal("1000"))>=0 ) {
			  super.withdraw(withdrawAmount);
			  
		     }else {
			  System.out.println("Insuficient Balance");
		  }
			  
		 
	  }
}
