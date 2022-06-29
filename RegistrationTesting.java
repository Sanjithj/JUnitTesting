package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationTesting {
	
	 public static void main(String[] args) {
		
	Scanner scannerObject = new Scanner(System.in);

	 System.out.println("Enter Your Email Address");
     String email = scannerObject.next();
     checkValidEmail(email);
	 
	 }
	 public static void checkValidEmail(String email){

	        boolean isEmail;
	        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
	        Pattern patternObject = Pattern.compile(emailRegex);
	        if (email == null) {
	            isEmail = false;
	        }
	        Matcher matcherObject = patternObject.matcher(email);
	        isEmail =  matcherObject.matches();

	        if(isEmail)
	            System.out.println(email+"  Valid Email\n");
	        else
	            System.out.println(email+"  Invalid Email ");
	    }
}

