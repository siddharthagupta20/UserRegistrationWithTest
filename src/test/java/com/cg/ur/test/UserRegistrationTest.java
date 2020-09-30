package com.cg.ur.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try{
			assertTrue("Valid", ur.firstNameValidator("John"));
		}
		catch(FirstNameValidatorException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try{
			assertTrue("Valid", ur.lastNameValidator("Doe"));
		}
		catch(LastNameValidatorException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmail_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try{
			assertTrue("Valid", ur.emailValidator("johndoe-20@gmail.com"));
		}
		catch(EmailValidatorException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMobile_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try{
			assertTrue("Valid", ur.mobileNoValidator("11 1111111111"));
		}catch(MobileNoValidatorException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenPassword_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try{
			assertTrue("Valid", ur.passwordValidator("Johndoecool#1"));
		}
		catch(PasswordValidatorException e) {
			e.printStackTrace();
		}
	}

}
