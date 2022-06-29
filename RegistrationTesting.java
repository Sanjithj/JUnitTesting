package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationTesting {
	
	public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern patternObject = Pattern.compile(firstNameRegex);
        
        if (firstName == null) {
            isFirstName = false;
        }
        Matcher matcherObject = patternObject.matcher(firstName);
        isFirstName =  matcherObject.matches();

        if(isFirstName)
            System.out.println(firstName+  " Valid First Name");
        else
            System.out.println(firstName+  " Invalid First Name");
    }  
	
	public static void main(String[] args) {
		
	 Scanner scannerObject = new Scanner(System.in);

     System.out.println("Enter the First Name");
     String firstName = scannerObject.next();
     checkValidFirstName(firstName);
	}  

}
