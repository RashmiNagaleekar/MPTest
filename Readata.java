package SeleniumCodePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Readata {

	public static WebDriver wd;
	public static Properties prop = new Properties();
	public static Actions action;
	public static JavascriptExecutor js;
	
	public static void initialization() throws IOException{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rashm\\eclipse-workspace\\TestJavaProject\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		wd = new FirefoxDriver();
		
		String baseUrl = "https://testing.d3eymc78cqte40.amplifyapp.com/login";
		wd.get(baseUrl);
		wd.manage().window().maximize();
		System.out.println(wd.getTitle());
		
		File file = new File("C:\\Users\\rashm\\eclipse-workspace\\SeleniumCode\\src\\Propertiesa\\testdata.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		prop.load(fileInput);
		System.out.println(prop.getProperty("name"));

	}
	
	public void click(String key) {
		wd.findElement(By.xpath(prop.getProperty(key))).click();
				
	}

	
	  public void inputData(String key,String value) {
	  wd.findElement(By.xpath(prop.getProperty(key))).sendKeys(prop.getProperty(value)); 
	  }
	 
	  public void selection(String Key, String value) {

		  Select selection = new Select(wd.findElement(By.xpath(Key)));
		  selection.selectByVisibleText(prop.getProperty(value));

	  }
	  
	  public void chooseFile() throws InterruptedException, IOException
	  {
		  	js = (JavascriptExecutor) wd;
			WebElement item = wd.findElement(By.xpath("//*[contains(@id,'chakra-modal')]/div/form/div[5]/div[2]/input"));
			js.executeScript("arguments[0].scrollIntoView();", item);
			action = new Actions(wd);
			action.moveToElement(item).click().perform();
			Thread.sleep(1000);
			Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
			
	  }
	  
	  public void itemDetails() throws InterruptedException {
		  
			WebElement item1 = wd.findElement(By.xpath("//*[contains(@id,'chakra-modal')]/div/form/div[7]/div/div/div/div/div[1]"));
			action.moveToElement(item1).click().perform();
			action.sendKeys("Pharmeasy Hot Water Bag").perform();
			Thread.sleep(2000);
			action.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
			Thread.sleep(2000);
			action.click().perform();
			Thread.sleep(2000);

	  }
	  
}
