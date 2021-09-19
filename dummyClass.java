package SeleniumCodePackage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class dummyClass extends Readata {


	@BeforeTest
	public void initial() throws IOException{
		initialization();
	}
	
	@Test
	public void call() throws IOException, InterruptedException {
		
		
		
		inputData("Username_xpath","username");
		inputData("Password_xpath","password");
		click("LoginButton_xpath");
		Thread.sleep(2000);
		click("PlaceAnOrder_xpath");
		Thread.sleep(2000);
		inputData("Partnero_rder_Id_xpath","PartnerID");
		selection("Payment_Collection_xpath","Medpay");
		selection("deliveryPartner_xpath","Self Pickup");
		inputData("name_xpath","name");
		inputData("mobile_xpath","mobile");
		inputData("email_xpath","email");
		inputData("address_xpath","address");
		inputData("pincode_xpath","pincode");
		inputData("city_xpath","city");
		inputData("state_xpath","state");
		inputData("doctor_xpath","doctor");
		
		chooseFile();
		itemDetails();
		//click("submit_xpath");
		
	}

}
