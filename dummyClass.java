package SeleniumCodePackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
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
		selection("orderPartner_xpath","orderPartner");
		inputData("Partnero_rder_Id_xpath","PartnerID");
		selection("Payment_Collection_xpath","Medpay");
		selection("deliveryPartner_xpath","Self Pickup");
		inputData("name_xpath","name");
		inputData("mobile_xpath","mobile");
		inputData("email_xpath","email");
		inputData("address_xpath","address");
		inputData("pincode_xpath","pincode");
		inputData("landmark_xpath","landmark");
		inputData("city_xpath","city");
		inputData("state_xpath","state");
		inputData("doctor_xpath","doctor");
		chooseFile();
		Thread.sleep(5000);
		itemDetails();
		Thread.sleep(2000);
		//click("submit_xpath");
		Thread.sleep(5000);
		wd.findElement(By.xpath("//button[@class='chakra-button css-1kh3ark']")).click();
		Thread.sleep(5000);
		String actualButtonCaption = wd.findElement(By.xpath("(//button[@class='chakra-text css-z28hru'])[1]")).getText();
		String ExpectedElement1="ABCD1234";
		Assert.assertEquals(actualButtonCaption, ExpectedElement1);
		System.out.println(actualButtonCaption);
		System.out.println("Assertion Passed");

	}
	
	
	@AfterTest
	 
	  public void closedriver(){
		  wd.close();
	   
	  }
	 

}