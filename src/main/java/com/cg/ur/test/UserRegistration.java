package com.cg.ur.test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	Scanner in = new Scanner(System.in);

	public void firstNameValidator() {
		System.out.println("Enter your first name :");
		System.out.println("First letter should be capital and shuold have min 3 characters");
		String firstName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		if (b)
			System.out.println("First Name is Validated");
		else
			System.out.println("Please enter the First name as mentioned");

	}

	public void lastNameValidator() {
		System.out.println("Enter your last name :");
		System.out.println("First letter should be capital and shuold have min 3 characters");
		String lastName = in.next();
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Last Name is Validated");
		else
			System.out.println("Please enter the Last name as mentioned");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
		UserRegistration newUser = new UserRegistration();
		// for first name
		newUser.firstNameValidator();
		// for last name
		newUser.lastNameValidator();

	}

}
