package lLD_Lab_Sessions;

public class BankAccount {
	
	double balence;
	String ownerName;
	
	void deposit(double amount)
	{
		balence+=amount;
		System.out.println(balence);
	}
	
	void withdrawal(double amount)
	{
		if(amount<=balence)
		{
			balence-=amount;
			System.out.println(balence);
		}
	}

	public static void main(String[] args) {
		double balence=1000;
		String ownername="Rishabh";
		
		BankAccount bankAccount=new BankAccount();
		bankAccount.deposit(3000);
		bankAccount.withdrawal(500);

	}

}
