package pages;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
 
public class SignupLoactors {
	
	WebDriver driver=new EdgeDriver();
	public WebDriver driver() {
		 WebDriver d=this.driver;
		 return d;
	}
	
	By signupname = By.xpath("//input[@placeholder='Name']");
	By signupemail = By.xpath("//input[@data-qa=\"signup-email\"]");
	By signupButton = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"); 
	By selectMale = By.id("id_gender1");
	By selectFemale = By.id("id_gender2");
	By password = By.id("password");
	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By company = By.id("company");
	By address = By.id("address1");
	
	By country = By.id("country");
	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By mobileNumber = By.id("mobile_number");

	By submit = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	By afterSubmit = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
	By logout = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

	By loginEmail = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
	By loginPassword = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	By login = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	//product page3
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
  

	public void signupName(String name) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	  WebElement sName = driver.findElement(signupname);
	  sName.sendKeys(name);
	  System.out.println("Name: "+sName.getAttribute("value"));
  }
  public void signupEmail(String email) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement sEmail = driver.findElement(signupemail);
	  sEmail.sendKeys(email);
	  System.out.println("Email: "+sEmail.getAttribute("value"));
  }
  public void clickSignup() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(signupButton).click();
  }
	
	
	
  public void selectTitle(String type) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  String displayType = "";
	  if(type.equals("Male")) {
		  WebElement male = driver.findElement(selectMale);
		  male.click();
		  displayType=male.getAttribute("value");
	  }else {
		  WebElement female = driver.findElement(selectFemale);
		  female.click();
		  displayType=female.getAttribute("value");
	  }
	  System.out.println("Gender: "+displayType);
  }
  public void enterPassword(String pword) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement p = driver.findElement(password);
	  p.sendKeys(pword);
	  System.out.println("Password "+p.getAttribute("value"));
  }
  public void enterFirstName(String fname) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement f = driver.findElement(firstName);
	  f.sendKeys(fname);
	  System.out.println("FirstName: "+f.getAttribute("value"));
  }
  public void enterLastName(String lname) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement l = driver.findElement(lastName);
	  l.sendKeys(lname);
	  System.out.println("Last Name "+l.getAttribute("value"));
  }
  public void enterCompany(String compny) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement c = driver.findElement(company);
	  c.sendKeys(compny);
	  System.out.println("Company "+c.getAttribute("value"));
  }

  public void enterAddress(String adrs) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement a = driver.findElement(address);
	  a.sendKeys(adrs);
	  System.out.println("Address "+a.getAttribute("value"));
  }
	public void selectCountry(String ctry) throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement c = driver.findElement(country);
		Select dropdown = new Select(c);
		dropdown.selectByVisibleText(ctry);
		System.out.println("Country: "+c.getAttribute("value"));
	}
	public void enterState(String ste) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement a = driver.findElement(state);
		  a.sendKeys(ste);
		  System.out.println("State "+a.getAttribute("value"));
	  }
	public void enterCity(String cty) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement a = driver.findElement(city);
		  a.sendKeys(cty);
		  System.out.println("City "+a.getAttribute("value"));
	  }
	public void enterZipcode(String pin) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement a = driver.findElement(zipcode);
		  a.sendKeys(pin);
		  System.out.println("Zipcode "+a.getAttribute("value"));
	  }
	public void enterNumber(String num) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement a = driver.findElement(mobileNumber);
		  a.sendKeys(num);
		  System.out.println("Mobile "+a.getAttribute("value"));
	  }
	public void createAccount() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(submit).click();
		  System.out.println("Account Created");
	}  
	public void continueButton() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(afterSubmit).click();
	}
	public void clickLogout() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(logout).click();
	}
	
	public void loginEmail(String email) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement l = driver.findElement(loginEmail);
		  l.sendKeys(email);
		  System.out.println("Login Email: "+l.getAttribute("value"));
	}
	public void loginPassword(String password) {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebElement p = driver.findElement(loginPassword);
		  p.sendKeys(password);
		  System.out.println("Login Password: "+p.getAttribute("value"));
	}
	public void loginButton() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(login).click();
	}
	public void productpage() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(productpage).click();
	}
	public void productSearch(String sname) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement ps=driver.findElement(productSearch);
	 //ps.click();
	 ps.sendKeys(sname);
	 
	}
	public void search() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement ps1=driver.findElement(search);
	 //ps.click();
	 ps1.click();
	 }
	public void Viewproduct() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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