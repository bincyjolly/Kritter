package com.kritter;

import org.junit.Assert;
import org.testng.annotations.Test;


public class TestHelloWorld {

    @Test(priority = 1)
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@kritter.com");

    }
}
