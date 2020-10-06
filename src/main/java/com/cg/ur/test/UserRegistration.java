package com.cg.ur.test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration implements UserValidator {

	private Scanner in;
	private Pattern pattern;

	public UserRegistration() {
		// TODO Auto-generated constructor stub
		in = new Scanner(System.in);
		pattern = Pattern.compile("");
	}

	public boolean firstNameValidator(String fname) throws FirstNameValidatorException {
		UserValidator urFirstName=(str)->{
			pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
			return pattern.matcher(str).find();
		};
		
		try {
			if (urFirstName.validator(fname))
				return true;
			else
				throw new FirstNameValidatorException("Enter a valid first name");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean lastNameValidator(String lname) throws LastNameValidatorException {
		UserValidator urLastName=(str)->{
			pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
			return pattern.matcher(str).find();
		};
		try {
			if (urLastName.validator(lname))
				return true;
			else
				throw new LastNameValidatorException("Enter a valid last name");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean emailValidator(String email) throws EmailValidatorException {
		UserValidator urEmail=(str)->{
			pattern = Pattern.compile("^[a-zA-Z]*([_+-.][a-zA-Z0-9]+){0,1}[@][a-z0-9]+[.][a-z]{2,3}([.][a-zA-Z]{2,3}){0,1}$");
			return pattern.matcher(str).find();
		};
		try {
			if (urEmail.validator(email))
				return true;
			else
				throw new EmailValidatorException("Enter valid email");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean mobileNoValidator(String mob) throws MobileNoValidatorException {
		UserValidator urMob=(str)->{
			pattern = Pattern.compile("^\\d{2} [1-9]\\d{9}$");
			return pattern.matcher(str).find();
		};
		try {

			if (urMob.validator(mob))
				return true;
			else
				throw new MobileNoValidatorException("Enter valid Mobile No");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean passwordValidator(String pass) throws PasswordValidatorException {
		UserValidator urPass=(str)->{
			pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?=.*\\W)(?!.*\\W\\w*\\W)(?!.*\\s).{8,}$");
			return pattern.matcher(str).find();
		};
		try {
			if (urPass.validator(pass))
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
		UserRegistration ur=new UserRegistration();
		System.out.println("Checking. Enter first name: ");
		String firstName=ur.in.next();
		try {
		if(ur.firstNameValidator(firstName)) {
			System.out.println("Valid");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}