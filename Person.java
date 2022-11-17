package newVersionAssignment;

import java.util.HashMap;
import java.util.ArrayList;

public class Person {
	private String identificationNumber;
	private String name;
	private int age;
	private PersonRegister står;
	private ArrayList<BankAccount> account;
	ArrayList<BankAccount> konton = new ArrayList<BankAccount>();

	public Person(String identificationNumber, String name, int age) {
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.age = age;
		this.account = new ArrayList<BankAccount>();

	}
	

	// Methods
	public void addAccount(BankAccount account) {
		ArrayList<BankAccount> newList = new ArrayList<BankAccount>();
		newList.add(account);
		setAccount(newList);
		
	//	this.account.add(account);
	}

	public BankAccount findAccount(String accountNumber) {
		for (BankAccount account : account) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}

		return null;

	}

	public double calculateTotalBalance() {
		for(BankAccount account : account) {
			
		}
		return 0;

	}

	// Getters and Setters

	public ArrayList<BankAccount> getAccount() {
		
		return account;
	}


	public void setAccount(ArrayList<BankAccount> account) {
		this.account = account;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

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


	public PersonRegister getStår() {
		return står;
	}


	public void setStår(PersonRegister står) {
		this.står = står;
	}

}
