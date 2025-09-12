package pages;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Signup {
	//SoftAssert sc=new SoftAssert();
	//Mentioning Global variable as WebDriver
	WebDriver wd;
	

	@Test
	public void signup() throws Exception {
		FileReader fr = new FileReader(
				"C:\\Users\\Sridhar.mandava\\Desktop\\Final_Task\\Final_Task\\src\\test\\java\\execute\\input.properties");
		Properties p = new Properties();
		p.load(fr);
		WebElement name = wd.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys(p.getProperty("name"));
		WebElement Email = wd.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));//sridhar.m@gmail.com
		Email.sendKeys(p.getProperty("email"));
		WebElement signup = wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		signup.click();
		Thread.sleep(2000);
		
		try {
		WebElement user=wd.findElement(By.xpath("//p[@style=\"color: red;\"]"));
		String s = user.getText();
		System.out.println(s);
		if(s.equals("Email Address already exist!")) {
			WebElement log = wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
			log.sendKeys(p.getProperty("email"));
			WebElement pass = wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
			pass.sendKeys(p.getProperty("pass"));
			WebElement click = wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
			click.click();
			
			WebElement logout = wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
			logout.click();
			
			
			
			
		}
		}
		catch(Exception e) {
	
		
		
		
		WebElement S=wd.findElement(By.id("uniform-id_gender1"));
		S.click();
		WebElement Password=wd.findElement(By.id("password"));
		Password.sendKeys(p.getProperty("pass"));
		Select date=new Select(wd.findElement(By.id("days")));
		date.selectByVisibleText(p.getProperty("date"));
		Select months=new Select(wd.findElement(By.id("months")));
		months.selectByVisibleText(p.getProperty("month"));
		Select year=new Select(wd.findElement(By.id("years")));
		year.selectByVisibleText(p.getProperty("year"));
		WebElement firstName=wd.findElement(By.id("first_name"));
		firstName.sendKeys(p.getProperty("name"));
		WebElement lastName=wd.findElement(By.id("last_name"));
		lastName.sendKeys(p.getProperty("lastName"));
		WebElement Company=wd.findElement(By.id("company"));
		Company.sendKeys(p.getProperty("Company"));
		WebElement Address=wd.findElement(By.id("address1"));
		Address.sendKeys(p.getProperty("Address"));
		Select Country=new Select(wd.findElement(By.id("country")));
		Country.selectByVisibleText(p.getProperty("Country"));
		WebElement State=wd.findElement(By.id("state"));
		State.sendKeys(p.getProperty("State"));
		WebElement City=wd.findElement(By.id("city"));
		City.sendKeys(p.getProperty("City"));
		WebElement pincode=wd.findElement(By.id("zipcode"));
		pincode.sendKeys(p.getProperty("pincode"));
		WebElement Phone=wd.findElement(By.id("mobile_number"));
		Phone.sendKeys(p.getProperty("Phone"));
		
		
		WebElement Submit_but=wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
		Submit_but.click();
		
		WebElement continue1 =wd.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		continue1.click();
		
		
		
		
		
		}	
		
		
	
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		FileReader fr = new FileReader(
				"C:\\Users\\Sridhar.mandava\\Desktop\\Final_Task\\Final_Task\\src\\test\\java\\execute\\input.properties");
		Properties p = new Properties();
		p.load(fr);
		wd = new ChromeDriver();
		wd.get(p.getProperty("url"));
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterTest
	public void afterTest() throws Exception {
		
		WebElement logout = wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		logout.click();
		
		Thread.sleep(2000);
		wd.quit();
	
	}
	

}
