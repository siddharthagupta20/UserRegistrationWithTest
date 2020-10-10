package com.cg.ur.test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try {
			assertTrue("Valid", ur.firstNameValidator("John"));
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	@Test
	public void givenLastName_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try {
			assertTrue("Valid", ur.lastNameValidator("Doe"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try {
			assertTrue("Valid", ur.emailValidator("johndoe-20@gmail.com"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenMobile_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try {
			assertTrue("Valid", ur.mobileNoValidator("11 1111111111"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void givenPassword_whenValid_shouldReturnValid() {
		UserRegistration ur = new UserRegistration();
		try {
			assertTrue("Valid", ur.passwordValidator("Johndoecool#1"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
