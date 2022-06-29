package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationTesting {
	
	 public static void main(String[] args) {
		
	Scanner scannerObject = new Scanner(System.in);

	   System.out.println("Enter Your Mobile Number");
       String mobileNumber = scannerObject.next();
       checkMobileNumber(mobileNumber);

	 
	 }
	 public static void checkMobileNumber(String mobileNumber){

	        boolean isMobileNumber;
	        String mobileNumberRegex = "(91)?[7-9][0-9]{9}";
	        Pattern patternObject = Pattern.compile(mobileNumberRegex);
	        if (mobileNumber == null) {
	            isMobileNumber = false;
	        }
	        Matcher matcherObject = patternObject.matcher(mobileNumber);
	        isMobileNumber =  matcherObject.matches();

	        if(isMobileNumber)
	            System.out.println(mobileNumber+ "  Valid  Mobile Number\n");
	        else
	            System.out.println(mobileNumber+ "   Invalid Mobile Number");
	    }

	      
}

