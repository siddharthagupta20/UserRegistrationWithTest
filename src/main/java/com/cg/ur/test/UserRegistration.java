package com.cg.ur.test;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
	
	public void firstNameValidator(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean b = matcher.find();
        if(b)
        	System.out.println("First Name is Validated");
        else
        	System.out.println("Please enter the name as mentioned");
        
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
        System.out.println("Enter your first name :");
        System.out.println("First letter should be capital and shuold have min 3 characters");
        Scanner in = new Scanner(System.in);
        UserRegistration newUser = new UserRegistration();
        newUser.firstNameValidator(in.next());
        in.close();
	}

}