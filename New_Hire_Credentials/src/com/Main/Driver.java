package com.Main;

import com.greatLearning.Employee.*;

import java.util.Scanner;

import com.Services.*;

public class Driver {
	public static void main(String[] args) {
		char[] generatedPassword;
		String email;
		Employee employee = new Employee("Rajat","Singh");
		CredentialsService cs = new CredentialsService();
		System.out.println(" Enter the Department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
			case 1:
			email = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "Technical");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, email, generatedPassword);
			break;
			case 2:
			email = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "Admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, email, generatedPassword);
			break;
			case 3:
			email = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "HR");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, email, generatedPassword);
			case 4:
			email = cs.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "Legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, email, generatedPassword);
		break;
		default:System.out.println(" Enter Correct Option");
	}

	}
}
