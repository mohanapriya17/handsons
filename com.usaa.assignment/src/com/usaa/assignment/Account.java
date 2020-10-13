package com.usaa.assignment;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Account<Transcations> {
private String name;
private int age;
private String gender,bank,cardnumber;
private long cardlimit;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getCardnumber() {
	return cardnumber;
}
public void setCardnumber(String cardnumber) {
	this.cardnumber = cardnumber;
}
public long getCardlimit() {
	return cardlimit;
}
public void setCardlimit(long cardlimit) {
	this.cardlimit = cardlimit;
}
/**
 * @param name
 * @param age
 * @param gender
 * @param bank
 * @param cardnumber
 * @param cardlimit
 */
public Account(String name, int age, String gender, String bank, String cardnumber, long cardlimit) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.bank = bank;
	this.cardnumber = cardnumber;
	this.cardlimit = cardlimit;
}
/**
 * 
 */
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
private Map<String,List<Transcations>> mapTransaction= new TreeMap();
public Map<String, List<Transcations>> getMapTransaction() {
	return mapTransaction;
}
public void setMapTransaction(Map<String, List<Transcations>> mapTransaction) {
	this.mapTransaction = mapTransaction;
}
/**
 * @param name
 * @param age
 * @param gender
 * @param bank
 * @param cardnumber
 * @param cardlimit
 * @param mapTransaction
 */
public Account(String name, int age, String gender, String bank, String cardnumber, long cardlimit,
		Map<String, List<Transcations>> mapTransaction) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.bank = bank;
	this.cardnumber = cardnumber;
	this.cardlimit = cardlimit;
	this.mapTransaction = mapTransaction;
}
public static class BankAccount{
	public static List<Account> getInfo() throws Exception{
		
	 List<Account> account=new ArrayList<Account>();
	try {
		Account Account1=null;
		String details="";
		File file=new File("C:\\Users\\Dell\\eclipse-workspace\\com.usaa.assignment\\src\\com\\usaa\\assignment\\bankaccount.csv");
		BufferedReader buffereader=new BufferedReader(new FileReader(file));
	    details=buffereader.readLine();
	    while(details!=null) {
	    	String[] accountDetails=details.split(",");
	    	if(accountDetails.length!=0) {
	              Account1=new Account();
	              Account1.setName(accountDetails[0]);
	              Account1.setAge(Integer.parseInt(accountDetails[1]));
	              Account1.setGender(accountDetails[2]);
	              Account1.setBank(accountDetails[3]);
	              Account1.setCardnumber(accountDetails[4]);
	             Account1.setCardlimit(Long.parseLong(accountDetails[5]));
	              account.add(Account1);
	    	}
	    
	    	details=buffereader.readLine();
	    }
	    buffereader.close();
	    for (Account accountget : account) {
			System.out.printf("Name:%s, age:%d, Gender:%s, BankName:%s, Cardnumber:%s, CreditLimit:%d\n",
					accountget.getName(), accountget.getAge(), accountget.getGender(), accountget.getBank(), accountget.getCardnumber(),accountget.getCardlimit());

		}
	}
	
	
	catch(Exception e) {
		e.printStackTrace();
	}
	return account;
}
}
public Object getAmount() {
	// TODO Auto-generated method stub
	return null;
}
}

