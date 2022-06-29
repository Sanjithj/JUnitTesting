package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

class Testcode {

	@Test
    public void testFirstNameHappy() {
       RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.Name("Sanjith");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testFirstNameSad() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.Name("sanjith");
        Assert.assertEquals(false, isValid);
    }

   

    @Test
    public void testLastNameHappy() {
    	RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.Name("Karan");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testLastNameSad() {
        RegistrationTesting Validator = new RegistrationTesting();
        boolean isValid = Validator.Name("karan");
        Assert.assertEquals(false, isValid);
    }


    @Test
    public void testEmailHappy() {
        RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.Email("raj.s@bridge.co.in");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testEmailSad() {
        RegistrationTesting userValidator = new  RegistrationTesting();
        boolean isValid = userValidator.Email(".raj@bridge.co.in");
        Assert.assertEquals(false, isValid);
    }

    
    @Test
    public void testMobileNumberHappy() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.MobileNumber("91 988989898");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testMobileNumberSad() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.MobileNumber("91 987594");
        Assert.assertEquals(false, isValid);
    }

    

    @Test
    public void testPasswordHappy() {
    	RegistrationTesting Validator = new  RegistrationTesting();
        boolean isValid = Validator.Password("Ragava@64");
        Assert.assertEquals(true, isValid);
    }
    @Test
    public void testPasswordSad() {
    	RegistrationTesting  Validator = new  RegistrationTesting();
        boolean isValid = Validator.Password("ragava@64");
        Assert.assertEquals(false, isValid);
    }


}
