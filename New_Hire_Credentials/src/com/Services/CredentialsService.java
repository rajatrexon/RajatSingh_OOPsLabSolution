package com.Services;

import java.util.Random;

import com.greatLearning.Employee.Employee;

public class CredentialsService {
	
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numerals = "0123456789";
		String specialChar = "!@#$%^&<>_";

		String values = capitalLetters + smallLetters + numerals + specialChar;

		char[] password = new char[8];

		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			int getvalues = random.nextInt(values.length());
			password[i]= values.charAt(getvalues);
			
		}
		return password;
	}
	
	public String generateEmail(String firstName , String lastName , String department) {
		return firstName + lastName + "@" + department + ".greatLearning.com"; 
	}
	public void showCredentials(Employee employee , String email , char[] generatedPassword) {
		System.out.println("Hello "+ employee.getFirstName() + " "+ employee.getLastName() + " your generated credentials are as follow");
		System.out.println("email id --> "+ email );
		System.out.println("password --> "+ generatedPassword);
	}
}
