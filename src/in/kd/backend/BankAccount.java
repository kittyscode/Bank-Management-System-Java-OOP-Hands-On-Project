package in.kd.backend;

import java.math.BigDecimal;

public class BankAccount {
  private String customerName;
  private long accountNumber;
  private BigDecimal balance;
  static String bankName="KD Bank";
  public BankAccount(String customerName, long accountNumber, BigDecimal balance) {
	this.customerName = customerName;
	this.accountNumber = accountNumber;
	this.balance = balance;
	
  }
  
  void deposite(BigDecimal deposite)
  {
	 if(deposite.compareTo(new BigDecimal("0"))>0){
		 
		 balance=balance.add(deposite);
		  System.out.println("Your balance is "+balance); 
	 }
	 
  }
  
  void withdraw(BigDecimal withdrawAmount) {
	  if( 0<withdrawAmount.compareTo(new BigDecimal("0")) && withdrawAmount.compareTo(balance)<=0) {
			  balance=balance.subtract(withdrawAmount);
			  System.out.println("Your balance is "+balance);
	     }else {
		  System.out.println("Insuficient Balance");
	  }
		  
	 
  }
  void checkBalance() {
	  
	  System.out.println("Available Balance is "+balance);
  }
  
  BigDecimal getBalance() {
	 
	  return balance;
	  
	  
  }
  String getCustomerName() {
	  return customerName;
  }
  
}
