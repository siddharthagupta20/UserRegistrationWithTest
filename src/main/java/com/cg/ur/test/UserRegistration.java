package com.cg.ur.test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

	Scanner in = new Scanner(System.in);

	public boolean firstNameValidator(String fname) throws FirstNameValidatorException {
		String firstName = fname;
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
		try {
			if (b)
				return true;
			else
				throw new FirstNameValidatorException("Enter a valid name");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean lastNameValidator(String lname) throws LastNameValidatorException {
		String lastName = lname;
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
		Matcher matcher = pattern.matcher(lastName);
		Boolean b = matcher.find();
		try {
			if (b)
				return true;
			else
				throw new LastNameValidatorException("Enter a valid last name");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean emailValidator(String email) throws EmailValidatorException {
		String emailString = email;
		Pattern pattern = Pattern
				.compile("^[a-zA-Z]*([_+-.][a-zA-Z0-9]+){0,1}[@][a-z0-9]+[.][a-z]{2,3}([.][a-zA-Z]{2,3}){0,1}$");
		Matcher matcher = pattern.matcher(emailString);
		Boolean b = matcher.find();
		try {
			if (b)
				return true;
			else
				throw new EmailValidatorException("Enter valid email");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean mobileNoValidator(String mob) throws MobileNoValidatorException {
		String mobileNo = mob;
		Pattern pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
		Matcher matcher = pattern.matcher(mobileNo);
		Boolean b = matcher.find();
		try {

			if (b)
				return true;
			else
				throw new MobileNoValidatorException("Enter valid Mobile No");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean passwordValidator(String pass) throws PasswordValidatorException {
		String password = pass;
		Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
		Matcher matcher = pattern.matcher(password);
		Boolean b = matcher.find();
		try {
			if (b)
				return true;
			else
				throw new PasswordValidatorException("Enter valid Password");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");

	}
}