package in.kd.backend;

import java.math.BigDecimal;

public class CurrentAccount extends BankAccount {
	CurrentAccount(String customerName,long accountnumber,BigDecimal balance){
		super(customerName, accountnumber, balance);
		
	} 
	@Override
	void withdraw(BigDecimal withdrawAmount) {
		
		  BigDecimal balance=getBalance();
		  if( 0<withdrawAmount.compareTo(new BigDecimal("0")) && withdrawAmount.compareTo(balance)<=0) {
			  super.withdraw(withdrawAmount);
			  
			 
		     }else {
			  System.out.println("Insuficient Balance");
		  }
			  
		 
	  }
}
