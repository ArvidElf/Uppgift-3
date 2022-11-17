package newVersionAssignment;

import java.util.ArrayList;

public class PersonRegister {

	private ArrayList<Person> keeps;
	private ArrayList<BankAccount> account;

	ArrayList<Person> register = new ArrayList<Person>();

	public void addPerson(Person person) {
		ArrayList<Person> newList = new ArrayList<Person>();
		newList.add(person);
		setRegister(newList);
	}

	public Person findPerson(String identificationNumber) {
		for (Person p : register) {
			if (p.getIdentificationNumber().equals(identificationNumber)) {
			//	System.out.println(p);
				return p;
			}

		}

		return null;

	}

	public BankAccount findAccount(String accountNumber) {
		for(BankAccount konto : account )
		if(konto.getAccountNumber().equals(accountNumber)) {
			return konto;
		}
		return null;
		

	}

	public double calculateTotalBalance() {		
		
		return 0;

	}

	// Getters and Setters
	public ArrayList<Person> getKeeps() {
		return keeps;
	}

	public void setKeeps(ArrayList<Person> keeps) {
		this.keeps = keeps;
	}

	public ArrayList<Person> getRegister() {
		return register;
	}

	public void setRegister(ArrayList<Person> register) {
		this.register = register;
	}

}
