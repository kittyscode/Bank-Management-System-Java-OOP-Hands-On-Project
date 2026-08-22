package in.kd.backend;

import java.math.BigDecimal;

public class BankManagement {

	public static void main(String[] args) {
		BankAccount ba=new BankAccount("Kirti",1234,new BigDecimal(50000));
		ba.deposite(new BigDecimal(2000));
		ba.withdraw(new BigDecimal(6000));
		System.out.println("Availanle Balance is "+ba.getBalance());
		System.out.println("customer name is: "+ba.getCustomerName());
		
		BankAccount ba1=new BankAccount("Kalpesh",12344,new BigDecimal(10000000));
		BankAccount ba2=new BankAccount("Darshu",12345,new BigDecimal(30000000));
	    ba1.deposite(new BigDecimal(50000));
		ba1.checkBalance();
		
		ba2.checkBalance();
		BankAccount.bankName="ABC Bank";
		System.out.println("Bank Name:"+BankAccount.bankName);
		System.out.println(ba1.bankName);
		
		
		SavingAccount sa=new SavingAccount("Kartik",2345,new BigDecimal(650000),new BigDecimal("0.7"));
		sa.deposite(new BigDecimal(25000));		
		sa.withdraw(new BigDecimal(5000));
		sa.calculateInterest();
		
		CurrentAccount ca=new CurrentAccount("Keshav", 12889, new BigDecimal("50000"));
		ca.withdraw(new BigDecimal("5000"));
	}
}
