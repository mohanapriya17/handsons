package com.usaa.assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
	private String cardNumber,transactionDate;;
	private long amount;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Transaction(String cardNumber, String transactionDate, long amount) {
		super();
		this.cardNumber = cardNumber;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static class TransactionDetails{
		private static List<Transaction> banktransaction = new ArrayList<Transaction>();

		public static List<Transaction> getTransaction() throws Exception {
			try {

				Transaction Bank = null;
				String details = "";
				BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Dell\\eclipse-workspace\\com.usaa.assignment\\src\\com\\usaa\\assignment\\TransactionDetails.csv")));

				br.readLine();
				while ((details = br.readLine()) != null) {

					String[] transcationget = details.split(",");
					if (transcationget .length > 0) {
						Bank = new Transaction();
						Bank.setCardNumber(transcationget [0]);
						Bank.setTransactionDate(transcationget [1]);
						Bank.setAmount(Long.parseLong(transcationget [2]));
						banktransaction.add(Bank);
					}
					
				}
				for (Transaction detail: banktransaction) {

					System.out.printf("CardNumber:%s , Transactiondate:%s  ,Amount:%d\n", detail.getCardNumber(),
							detail.getTransactionDate(), detail.getAmount());

				}
			

			
			} catch (Exception e) {
				System.out.println("hi");
			}

			
			return banktransaction;
		}
	}
	}


