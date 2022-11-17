package newVersionAssignment;

import java.util.Scanner;

public class Execute {

	public static void printMenu(String[] options) {
		for (String option : options) {
			System.out.println(option);
		}
		System.out.println("Choose your option:");
	}

	public static void main(String[] args) {
		// Scanner
		Scanner myScanner = new Scanner(System.in);
		// Instance of Person Register
		PersonRegister PR = new PersonRegister();

		// Instance of First Person
		Person person1 = new Person("ID1", "Arvid", 22);
		BankAccount konto1 = new BankAccount("Num1", 3000);
		BankAccount konto2 = new BankAccount("Num2", 7000);
		// Instance of Second Person
		Person person2 = new Person("ID2", "John", 23);
		BankAccount konto3 = new BankAccount("Num3", 200);
		BankAccount konto4 = new BankAccount("Num4", 800);

		// Adding Persons to Person Register
		// PR.addPerson(person1);
		// PR.addPerson(person2);
		PR.register.add(person1);
		PR.register.add(person2);

		// Setting owners to accounts
		konto1.setOwner(person1);
		konto2.setOwner(person1);
		konto3.setOwner(person2);
		konto4.setOwner(person2);
		// Adding Bank Accounts to each person

		person1.konton.add(konto1);
		person1.konton.add(konto2);
		person2.konton.add(konto3);
		person2.konton.add(konto4);

		String[] options = { "1- Info Person1 och konton 1", "2- Withdraw money from person1 account1 2",
				"3- Find person 3", "4- Option 4", "5- Option 5", "6- Option 6" };
		int option = 0;
		while (option != 6) {
			printMenu(options);
			option = myScanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("#######" + "\n" + "Name: " + person1.getName());
				System.out.println("Age: " + person1.getAge());
				System.out.println("Konton: " + person1.konton.size());
				System.out.println("KontoNR: " + konto1.getAccountNumber());
				System.out.println("Balance: " + konto1.getBalance());
			case 2:
				double amount = 0;
				System.out.println("How much would you like to Withdraw from Account:" + konto1.getAccountNumber()
						+ "\n" + "With balance: " + konto1.getBalance());
				amount = myScanner.nextDouble();
				konto1.withdraw(amount);
				System.out.println("The new balance is: " + konto1.getBalance());

			case 3:
				String IDnr;
				Person newPerson;
				BankAccount tmpKonto1;
				BankAccount tmpKonto2;
				System.out.println("Choose person by writing IDnr: ");
				IDnr = myScanner.next();
				PR.findPerson(IDnr);
				newPerson = PR.findPerson(IDnr);
				System.out.println("You have Chosen: " + newPerson.getName());
				System.out.println("Number of Accounts: " + newPerson.konton.size());
				tmpKonto1 = newPerson.konton.get(0);
				tmpKonto2 = newPerson.konton.get(1);
				System.out.println("##########");
				System.out.println("Info:" + "\n" + "------------" + "\n" + "Account 1" + "\n" + "AccNR:" + "\t"
						+ tmpKonto1.getAccountNumber() + "\n" + "Balance" + "\t" + tmpKonto1.getBalance() + "\n"
						+ "------------" + "\n " + "Account 2" + "\n" + "AccNR:" + "\t" + tmpKonto2.getAccountNumber()
						+ "\n" + "Balance" + "\t" + tmpKonto2.getBalance());
			case 4:
			case 5:

			}
		}
	}
}
