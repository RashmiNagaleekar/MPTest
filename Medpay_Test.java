package SeleniumCodePackage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Medpay_Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rashm\\eclipse-workspace\\TestJavaProject\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		
		String baseUrl = "https://testing.d3eymc78cqte40.amplifyapp.com/login";
		wd.get(baseUrl);
		wd.manage().window().maximize();
		System.out.println(wd.getTitle());
		wd.findElement(By.xpath("//input[@id='username']")).sendKeys("TestUser123");
		wd.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		wd.findElement(By.xpath("//button[@class='chakra-button css-1kz2znw']")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//button[@class='chakra-button css-11hsy1o']")).click();
		wd.findElement(By.xpath("//input[@id='partner_order_id']")).sendKeys("1234567");
		Select orderType = new Select(wd.findElement(By.id("order_type")));
		orderType.selectByVisibleText("Medicines");
		Select paymentCollection = new Select(wd.findElement(By.xpath("//select[@name='payment_collection']")));
		paymentCollection.selectByVisibleText("Medpay");
		Select deliveryPartner = new Select(wd.findElement(By.xpath("//select[@name='delivery_partner']")));
		deliveryPartner.selectByVisibleText("Self Pickup");
		wd.findElement(By.xpath("//input[@name='name']")).sendKeys("Rashmi");
		wd.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9620473820");
		wd.findElement(By.xpath("//input[@name='email']")).sendKeys("rashmi.nagaleekar23@gmail.com");
		wd.findElement(By.xpath("//input[@name='address']")).sendKeys("Nagarahole nagar");
		wd.findElement(By.xpath("//input[@id='landmark']")).sendKeys("Complex");
		wd.findElement(By.xpath("//input[@id='pin_code']")).sendKeys("560091");
		wd.findElement(By.xpath("//input[@name='city']")).sendKeys("Bengaluru");
		wd.findElement(By.xpath("//input[@name='state']")).sendKeys("Karnataka");
		
		
		JavascriptExecutor js = (JavascriptExecutor) wd;
		WebElement item = wd.findElement(By.xpath("//*[contains(@id,'chakra-modal')]/div/form/div[5]/div[2]/input"));
		js.executeScript("arguments[0].scrollIntoView();", item);
		Actions action = new Actions(wd);
		action.moveToElement(item).click().perform();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		
		
		WebElement item1 = wd.findElement(By.xpath("//*[contains(@id,'chakra-modal')]/div/form/div[7]/div/div/div/div/div[1]"));
		action = new Actions(wd);
		action.moveToElement(item1).click().perform();
		action.sendKeys("Pharmeasy Hot Water Bag").perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(2000);
		action.click().perform();
		Thread.sleep(2000);
		
		wd.findElement(By.xpath("//button[@class='chakra-button css-yg2rlj']")).click();
		
	}

}
