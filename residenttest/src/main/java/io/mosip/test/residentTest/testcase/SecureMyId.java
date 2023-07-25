package io.mosip.test.residentTest.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.mosip.test.residentTest.utility.BaseClass;
import io.mosip.test.residentTest.utility.Commons;

public class SecureMyId extends BaseClass{

	
	@Test(groups = "SMI")
	public void SecureMyId() throws Exception {
		LoginTest.loginTest();
		
		test=extent.createTest("Test SecureMyId", "verify SecureMyId");
		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus1"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Mobile OTP Authentication locked");
		
		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus1"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Mobile OTP Authentication UNlocked");
		
		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus2"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Demographic Authentication locked");
	
		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus2"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Demographic Authentication Unlocked");
		

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus3"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup")); 
		test.log(Status.INFO, "Click on Fingerprint Authentication locked");
		

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus3"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Fingerprint Authentication Unlocked");

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus4"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Iris Authentication locked");

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus4"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Iris Authentication Unlocked");

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus5"));
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Face Authentication locked");

		Commons.click(test,driver, By.id("uinservices/lockunlockauth"));
		Commons.click(test,driver, By.id("setAuthlockStatus5"));	
		Commons.click(test,driver, By.id("updateAuthlockStatusBtn"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		Commons.click(test,driver, By.id("confirmmessagepopup"));
		test.log(Status.INFO, "Click on Face Authentication Unlocked");
		
		
}
}