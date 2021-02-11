package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account (1001, "Afonso", 0.0);
		BusinessAccount bacc = new BusinessAccount (1002, "Felipe", 0.0, 500.0);	
		
		//UPCASTING
		Account acc1 = bacc; // é possível pois pois BusinessAccount é uma Account
		Account acc2 = new BusinessAccount (1003,"Pedro", 0.0, 500.0);
		Account acc3 = new SavingsAccount (1004, "Silva", 0.0, 10.0);
		
		//DOWNCASTING
		
		//BusinessAccount acc4 = acc2; ERRO pois não é uma conversão natural
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; ERRO pois acc3 foi instanciado como SavingsAccount
		//E BusinessAccount é um Account e não um SavingsAccount
		//Corrigindo esse problema com a verificação antecipada com comando INSTANCEOF
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
				
		
	}

}
