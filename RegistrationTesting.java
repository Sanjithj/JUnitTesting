package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationTesting {
	
	 public static void main(String[] args) {
		
	Scanner scannerObject = new Scanner(System.in);

	  System.out.println("Enter the Password");
      String password = scannerObject.next();
      checkPassword(password);
      
	 
	 }
	 public static void checkPassword(String password){

	        boolean isPassword;
	        String passwordRegex = "^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8}$";
	        Pattern patternObject = Pattern.compile(passwordRegex);
	        if (password == null) {
	            isPassword = false;
	        }
	        Matcher matcherObject = patternObject.matcher(password);
	        isPassword =  matcherObject.matches();

	        if(isPassword)
	            System.out.println(password+"   Password is  Valid\n");
	        else
	            System.out.println(password+"   Password is Invalid");
	    }
	  
	      
}

