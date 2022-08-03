package Pages;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;
//import LIbraryFiles.BasePage;

public class HotelPage extends BaseClass {
	WebDriver driver;                                    //global
	String p;

	//parameterized constructor
	public HotelPage(WebDriver driver){          
		this.driver= driver;

	}

	//For Clicking on Hotel
	public void hotel(){
		driver.findElement(By.xpath("(//a[contains(text(),'Hotels')])[1]")).click();  

	}

	//selecting place
	public void city(String place) {

		driver.findElement(By.xpath("//div[@class='htl_location']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'"+place+"')]")).click();
	}
	//passing month and date
	public void checkin(String Month,String Date) {
		driver.findElement(By.xpath("(//span[contains(text(),'"+Month+"')]//following::a[contains(text(),'"+Date+"')])[1]")).click();
	}

	public void checkout(String Month1,String Date1) {
		driver.findElement(By.xpath("(//span[contains(text(),'"+Month1+"')]//following::a[contains(text(),'"+Date1+"')])[1]")).click();
	}

	//selecting room and guest
	public void rooms() throws InterruptedException {

		Thread.sleep(2000);

		WebElement c=driver.findElement(By.xpath("//a[@id='Children_room_1_1_plus']"));
		c.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"exithotelroom\"]")).click();

		Thread.sleep(2000);
	}

	//clicking on search button
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
	}

//	// returning back to home page
//	public void backhomepage() {
//		driver.findElement(By.xpath("//i[@class='newHeaderLogo']")).click();
//	}

    //clicking on viewroom
	public void viewroom() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='bookhBtn ng-scope'])[2]")).click();
		p=driver.getWindowHandle();                                                     // for current window
		Thread.sleep(4000);
	}

	// clicking on booknow 
	public void book() throws InterruptedException {
		Set<String> allWindowHandles = driver.getWindowHandles();                       //for all windows available

		for(String handle : allWindowHandles)
		{
			if(handle!=p) {
				driver.switchTo().window(handle);
			}
		}
		driver.findElement(By.xpath("(//a[@class='fill-btn'])[1]")).click();
		Thread.sleep(2000);
	}

    // for entering email id
	public void email(String Email) {
		driver.findElement(By.xpath("//input[@id='txtEmailId']")).sendKeys(Email);
	}

	// for entering phone number
	public void phone(String Phone) {
		driver.findElement(By.xpath("//input[@id='txtCPhone']")).sendKeys(Phone);
	}
	
	// for entering adultfirstname
	public void adultfirstname(String Adultfirst) {
		driver.findElement(By.xpath("//input[@id='txtFirstName1']")).sendKeys(Adultfirst);
	}
	
	//for entering adultlastname
	public void adultlastname(String Adultlast) {
		driver.findElement(By.xpath("//input[@id='txtLastName1']")).sendKeys(Adultlast);
	}
	
	//for entering childfirstname
	public void childfirstname(String Childfirst) {
		driver.findElement(By.xpath("//input[@id='txtFirstNameChild1']")).sendKeys(Childfirst);
	}
	
	//for entering childlastname
	public void childlastname(String Childlast) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='txtLastNameChild1']")).sendKeys(Childlast);
		Thread.sleep(2000);
	}
	
	//for clicking on continuetopayment
	public void continuetopayment() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='coonpayment']")).click();
		Thread.sleep(2000);
	}
	
//	//for clicking on upi
//	public void upi() {
//		driver.findElement(By.linkText("UPI")).click();
//	}
//	
//	//for entering upi id
//	public void upiid() throws InterruptedException {
//		driver.findElement(By.xpath("//input[@id='txtUpi']")).sendKeys("1234567890");
//		Thread.sleep(3000);

//	}
	
//	public void wallet() {
//		driver.findElement(By.linkText("Wallets")).click();
//	}
//	
//	public void radio() {
//		driver.findElement(By.xpath("(//span[@class='checkmark_ntb'])[8]")).click();
//	}
	
//	public void creditdebit() {
//		driver.findElement(By.linkText("Credit/Debit/ATM Cards")).click();
//	}

	//for entering card number
	public void cardno(String Cardno) {
		driver.findElement(By.xpath("//input[@id='CC']")).sendKeys(Cardno);
	}
	
	//for entering name on card with expiry month and year 
	public void nameoncard(String Nameoncard) {
		driver.findElement(By.xpath("//input[@id='CCN']")).sendKeys(Nameoncard);
	
		Select select= new Select(driver.findElement(By.xpath("//select[@id='CCMM']")));
		select.selectByIndex(3);
		
		Select select1= new Select(driver.findElement(By.xpath("//select[@id='CCYYYY']")));
		select1.selectByIndex(2);
	}
	
	//for entering cvv
	public void cvv(String Cvv) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='CCCVV']")).sendKeys(Cvv);
				
	}
	
	//for clicking on checkbox
	public void checkbox() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}




