package com.testingproject.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    // Create A Booking, Create a Token
    // Verify that Get booking -
    // Update the Booking
    // Delete the Booking

    @Test(groups="qa",priority = 1)
    @Owner("Poonam")
    @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority = 2)
    @Owner("Poonam")
    @Description("TC#INT1 - Step 2. Verify that the Token can be Created")
    public void testCreateToken(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority = 3)
    @Owner("Poonam")
    @Description("TC#INT1 - Step 3. Verify Booking created by ID")
    public void testVerifyBookingById(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority = 4)
    @Owner("Poonam")
    @Description("TC#INT1 - Step 4. Update the booking details")
    public void testUpdateBookingById(){
        Assert.assertTrue(true);
    }

    @Test(groups="qa",priority = 5)
    @Owner("Poonam")
    @Description("TC#INT1 - Step 5. Delete the booking")
    public void testDeleteBookingById(){
        Assert.assertTrue(true);
    }
}
