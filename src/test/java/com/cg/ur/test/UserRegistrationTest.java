package com.cg.ur.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		assertTrue("Valid", ur.firstNameValidator("John"));

	}

	@Test
	public void givenLastName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		assertTrue("Valid", ur.lastNameValidator("Doe"));
	}

	@Test
	public void givenEmail_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		assertTrue("Valid", ur.emailValidator("johndoe-20@gmail.com"));
	}

	@Test
	public void givenMobile_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		assertTrue("Valid", ur.mobileNoValidator("11 1111111111"));
	}

	@Test
	public void givenPassword_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		assertTrue("Valid", ur.passwordValidator("Johndoecool#1"));
	}

}
