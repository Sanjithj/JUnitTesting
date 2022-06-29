package com.bridgelabz;

public class RegistrationTesting {
	
	public boolean Name(String name) {

        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
        return name.matches(nameRegex);
    }
    public boolean Email(String email) {

        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        return email.matches(emailRegex);
    }

    public boolean MobileNumber(String mobileNumber) {

        String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
        return mobileNumber.matches(mobileNumberRegex);
    }

    public boolean Password(String password) {

        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
        return password.matches(passwordRegex);
    }


}