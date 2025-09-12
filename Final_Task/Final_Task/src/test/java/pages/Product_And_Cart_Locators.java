package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.SignupLoactors;

public class Product_And_Cart_Locators {
	SignupLoactors sc=new SignupLoactors()
By productpage=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	
	By productSearch=By.xpath("//input[@type='text']");
	By search = By.id("submit_search");
	By Viewproduct=By.xpath("//a[@href='/product_details/7']");
	By addcart=By.xpath("//button[@type=\"button\"]");
	By con_shopping =By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By clickCart = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a");
	By proceedtoCheckout = By.xpath("//a[@class=\"btn btn-default check_out\"]");
	By placeOrder = By.xpath("//a[text()='Place Order']");
	By cardName = By.name("name_on_card");
	By cardNumber = By.name("card_number");
	By CVV = By.name("cvc");
	By expiry_month = By.name("expiry_month");
	By expiry_year = By.name("expiry_year");
	By Pay_and_Confirm_Order = By.id("submit");
	By downLoad = By.xpath("//a[@class='btn btn-default check_out']");
	By Continue = By.xpath("//a[@class='btn btn-primary']");
  @Test
  public void productpage() {
		sc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sc.driver.findElement(productpage).click();
		}
		public void productSearch(String sname) {
		sc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ps=sc.driver.findElement(productSearch);
		 //ps.click();
		 ps.sendKeys(sname);
		 
		}
		public void search() {
			sc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ps1=sc.driver.findElement(search);
		 //ps.click();
		 ps1.click();
		 }
		public void Viewproduct() {
			sc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement ps=driver.findElement(Viewproduct);
		 //ps.click();
		 ps.click();
		}
		public void addcart() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(addcart);
			 //ps.click();
			 ps.click();
			}
		//con_shopping
		public void con_shopping() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(con_shopping);
			 //ps.click();
			 ps.click();
			}
		//clickCart
		public void clickCart() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(clickCart);
			 //ps.click();
			 ps.click();
			}
		public void proceedtoCheckout() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(proceedtoCheckout);
			 //ps.click();
			 ps.click();
			}
		public void placeOrder() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(placeOrder);
			 //ps.click();
			 ps.click();
			}
		
		public void cardName(String CardName) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(cardName);
			 ps.sendKeys(CardName);
			}
		public void cardNumber(String CardName) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(cardNumber);
			 ps.sendKeys(CardName);
			}
		public void CVV(String CardName) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(CVV);
			 ps.sendKeys(CardName);
			}
		public void expiry_month(String CardName) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(expiry_month);
			 ps.sendKeys(CardName);
			}
		public void expiry_year(String CardName) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(expiry_year);
			 ps.sendKeys(CardName);
			}
		
		public void Pay_and_Confirm_Order() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(Pay_and_Confirm_Order);
			 ps.click();
			}
		
		
		
		public void downLoad() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(downLoad);
			 ps.click();
			 Thread.sleep(3000);
			}
		public void Continue() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 WebElement ps=driver.findElement(Continue);
			 ps.click();
			}

}
