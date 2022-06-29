package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

class Testcode {

	@Test
    public void testFirstNameHappy() {
       RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.validateName("Sanjith");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testFirstNameSad() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.validateName("sanjith");
        Assert.assertEquals(false, isValid);
    }

   

    @Test
    public void testLastNameHappy() {
    	RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.validateName("Karan");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testLastNameSad() {
        RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.validateName("karan");
        Assert.assertEquals(false, isValid);
    }


    @Test
    public void testEmailHappy() {
        RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.validateEmail("raj.s@bridge.co.in");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testEmailSad() {
        RegistrationTesting userValidator = new  RegistrationTesting();
        boolean isValid = userValidator.validateEmail(".raj@bridge.co.in");
        Assert.assertEquals(false, isValid);
    }

    
    @Test
    public void testMobileNumberHappy() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.validateMobileNumber("91 988989898");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testMobileNumberSad() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.validateMobileNumber("91 987594");
        Assert.assertEquals(false, isValid);
    }

    

    @Test
    public void testPasswordHappy() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.validatePassword("Ragava@64");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testPasswordSad() {
    	RegistrationTesting  Validator = new  RegistrationTesting();
        boolean isValid = Validator.validatePassword("ragava@64");
        Assert.assertEquals(false, isValid);
    }


}
