package com.usaa.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BankData {
	static BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
	public static List<Account> getMappedAccount(List<Account> bankdetail,
			List<Transaction> transactions) throws IOException {
		System.out.println("Enter the person data to be searched");
		String person = bufferedreader.readLine();
		
		
	Account account= new Account();
		account.setName(person);
		
		List<Account> bankUsers = new ArrayList<>();

		for (Account bank : bankdetail) {
			if (bank.getName().equals(person)) {
				bankUsers.add(new Account(bank.getName(), bank.getAge(), bank.getGender(), bank.getBank(),
						bank.getCardnumber(), bank.getCardlimit()));

			}
		}
		List<Account> userfinal = new ArrayList<>();

		for (Account accbank : bankUsers) {
			Account banks =getTransaction(accbank,transactions);
			if (banks != null) {
				userfinal.add(banks);
			}
		}

		return userfinal;
	}
	private static Account getTransaction(Account accbank, List<Transaction> transactions) {
		List<Transaction> translist = new ArrayList<>();
		for (Transaction banktrans : transactions) {
			if (banktrans.getCardNumber().equals(accbank.getCardnumber())) {
				translist.add(banktrans);
			}
		}

		Map<String, List<Transaction>> finaluser = new TreeMap<>();

		finaluser.put(accbank.getBank(),  translist);

		return new Account(accbank.getName(), accbank.getAge(), accbank.getGender(), accbank.getBank(),
				accbank.getCardnumber(),accbank.getCardlimit());


	
		


}

}
