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
		System.out.println("Enter your Email :");
		String email = in.next();
		Pattern pattern = Pattern
				.compile("^([a-z]){1,}([.+_-]{0,1}[0-9a-z]*){0,1}(@){1}([0-9a-z]*)(.([a-z]){2,3}){1}(.[a-z]){2}?$");
		Matcher matcher = pattern.matcher(email);
		Boolean b = matcher.find();
		if (b)
			System.out.println("Email is Validated");
		else
			System.out.println("Please enter the correct mail id");
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
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9]).{8,}");
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
		newUser.firstNameValidator();
		// for last name
		newUser.lastNameValidator();
		// for email
		newUser.emailValidator();
		// for mobile no
		newUser.mobileNoValidator();
		// for password
		newUser.passwordValidator();
	}

}
