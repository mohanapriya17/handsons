package com.usaa.assignment;

import java.util.List;
import java.util.Set;

import com.usaa.assignment.Account.BankAccount;
import com.usaa.assignment.Transaction.TransactionDetails;

public class Main {

	public static void main(String[] args) {
      
        	try {

    			List<Account> banklist = BankAccount.getInfo();
    		
    			
    			List<Transaction> bank1 = TransactionDetails.getTransaction();
    			List<Account> list = BankData.getMappedAccount(banklist, bank1);
    			System.out.format("\n%-5s %-20s %-20s %-20s %-20s %-20s %-20s", "S.No", "Name", "Bank", "Age", "Gender",
    					"TranscationDate", "TransactionAmount");

    			for (Account bank : list) {

    				Set<String> keysets = bank.getMapTransaction().keySet();
    				int sno = 1;
    				int index = 0;
    				for (String key : keysets) {
    					

    					 list1 = bank.getMapTransaction().keySet();
    					for (Transaction bnk : list1) {
    						if (index == 0)
    							System.out.format("\n%-5s %-20s %-20s %-20s %-20s %-20s %-20s", sno, bank.getName(),
    									bank.getBank(), bank.getAge(), bank.getGender(), bnk.getTransactionDate(),
    									bnk.getAmount());
    						else
    							System.out.format("\n%-5s %-20s %-20s %-20s %-20s %-20s %-20s", sno, bank.getName(),
    									bank.getBank(), bank.getAge(), bank.getGender(), bnk.getTransactionDate(),
    									bnk.getAmount());
    						index++;
    						sno++;
    					}
    					
    				}
        	}
        	}
        	
        	catch(Exception e) {
        		e.printStackTrace();
        	}
	}
}
    		
