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

	public void emailValidator() {

		String email = "abc@yahoo.com";
		Pattern pattern = Pattern.compile(
				"^([a][b][c])([_+-.]{0,1}([a-zA-Z0-9]+))*[@][a-z0-9]+[.]([c][o][m]|[n][e][t])([.][a-zA-Z]{2,}){0,1}$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc-100@yahoo.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc.100@yahoo.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc111@abc.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc-100@abc.net";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc.100@abc.com.au";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc@1.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc@gmail.com.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Email is Valid " + email);
		else
			System.out.println("Incorrect Email " + email);

		email = "abc+100@gmail.com";
		matcher = pattern.matcher(email);
		b = matcher.find();
		if (b)
			System.out.println("Incorrect Email " + email);
		else
			System.out.println("Incorrect Email " + email);
	}

	public void mobileNoValidator() {
		System.out.println("Enter your Mobile No :");
		String mobileNo = in.nextLine();
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNo);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Mobile No is Validated");
		else
			System.out.println("Please enter the correct mobile no");
	}

	public void passwordValidator() {
		System.out.println("Enter your Password :");
		String password = in.next();
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Password is Validated");
		else
			System.out.println("Please enter the correct password");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
		UserRegistration newUser = new UserRegistration();
		// for first name
		//newUser.firstNameValidator();
		// for last name
		//newUser.lastNameValidator();
		// for mobile no
		//newUser.mobileNoValidator();
		// for password
		//newUser.passwordValidator();
		// for email
		newUser.emailValidator();
	}

}
