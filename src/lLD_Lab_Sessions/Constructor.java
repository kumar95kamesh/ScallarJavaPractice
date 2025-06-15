package lLD_Lab_Sessions;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
	List<String> transactionLogList=new ArrayList<String>();
	double balence;
	void deposit(double amount)
	{
		balence+=amount;
		transactionLogList.add(" deposit "+amount+" updated balence "+balence);
	}
	void withdrawal(double amount)
	{
		if(balence>=amount)
		balence-=amount;
		transactionLogList.add(" withdrawal "+amount+" updated balence "+balence);
	}
	
	void printTransactionHistory()
	{
		for(String log:transactionLogList)
			System.out.println(log);
	}
	
	public Constructor()
	{
		balence=0;
		printTransactionHistory();
	}
	
	public Constructor(double balence)
	{
		this.balence=balence;
		printTransactionHistory();
	}

		 	

}
