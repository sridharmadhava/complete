package execute;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.SignupLoactors;

public class Exe_signup {

	SignupLoactors element = new SignupLoactors();
	WebDriver driver = element.driver();
	// likitxaaa
	@Test(priority = 1)
	public void LoginandSignup() throws Exception, InterruptedException {

		FileReader fr = new FileReader(
				"C:\\Users\\Sridhar.mandava\\Desktop\\Final_Task\\Final_Task\\src\\test\\java\\execute\\input.properties");
		Properties p = new Properties();
		p.load(fr);
		//WebDriver driver = element.driver();
		//driver.manage().window().maximize();

		driver.get(p.getProperty("url"));
Thread.sleep(5000);
		element.signupName(p.getProperty("name"));
		element.signupEmail(p.getProperty("email"));
		element.clickSignup();

		// supraja masanpally

		try {

			WebElement alertMessage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p"));
			String s = alertMessage.getText();
			if (s.equals("Email Address already exist!")) {
				element.loginEmail(p.getProperty("email"));
				element.loginPassword(p.getProperty("password"));
				element.loginButton();

			}
		}

		catch (Exception e) {

			element.selectTitle(p.getProperty("title"));
			element.enterPassword(p.getProperty("password"));
			element.enterFirstName(p.getProperty("firstname"));
			element.enterLastName(p.getProperty("lastname"));
			element.enterCompany(p.getProperty("company"));
			element.enterAddress(p.getProperty("address"));
			element.selectCountry(p.getProperty("country"));
			element.enterState(p.getProperty("state"));
			element.enterCity(p.getProperty("city"));
			element.enterZipcode(p.getProperty("zipcode"));
			element.enterNumber(p.getProperty("number"));

			element.createAccount();
			element.continueButton();

			// DOB
			// Your changes like try catch
 
		}
	}

	@Test(priority = 2, dependsOnMethods = { "LoginandSignup" })
	public void addcart() throws Exception {

		FileReader fr = new FileReader(
				"C:\\Users\\Sridhar.mandava\\Desktop\\Final_Task\\Final_Task\\src\\test\\java\\execute\\input.properties");
		Properties p1 = new Properties();
		p1.load(fr);
		element.productpage();
		element.productSearch(p1.getProperty("dressname"));
		element.search();
		element.Viewproduct();
		element.addcart();
		element.con_shopping();
		Thread.sleep(2000);
		element.clickCart();
		Thread.sleep(3000);
		element.proceedtoCheckout();
		element.placeOrder();
		element.cardName(p1.getProperty("CardName"));
		element.cardNumber(p1.getProperty("cardNumber"));
		element.CVV(p1.getProperty("CVV"));
		element.expiry_month(p1.getProperty("expiry_month"));
		element.expiry_year(p1.getProperty("expiry_year"));
		element.Pay_and_Confirm_Order();
		element.downLoad();
		element.Continue();
		
	}
	
	@AfterTest
	public void logOut() {

		
		element.clickLogout();
		driver.quit();
		
	}

}
