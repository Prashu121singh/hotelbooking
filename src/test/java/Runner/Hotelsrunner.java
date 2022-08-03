package Runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class;
import Pages.HotelPage;

public class Hotelsrunner extends BasePage{
// 
//	  	@Test(dataProvider="dataDriven" )
//	  	public void hotelRunner(String place,String InMonth,String InDate,String OutMonth,String OutDate) throws FileNotFoundException, IOException, InterruptedException  {
//	  		
	  	@Test
	  	public void hotelRunner() throws FileNotFoundException, IOException, InterruptedException {
	  		
	  		HotelPage hp = new HotelPage(driver);
	  		hp.hotel();
	  		
	  		String s=Utility_Class.getpfdata(1,0, "Sheet1");
//	  		String s=place;
	  		hp.city(s);
	  		
	  		String Month=Utility_Class.getpfdata(1,1, "Sheet1");
//	  		String Month=InMonth;
	  		String Date=Utility_Class.getpfdata(1,2, "Sheet1");
//	  		String Date=InDate;
	  		hp.checkin(Month, Date);
	  		
	  		String Month1=Utility_Class.getpfdata(1,3, "Sheet1");
	  		String Date1=Utility_Class.getpfdata(1,4, "Sheet1");
//	  		String Month1=OutMonth;
//	  		String Date1=OutDate;
	  		hp.checkout(Month1,Date1);
	  		
	  		hp.rooms();
	  		
	  		hp.search();
	  		
	  		hp.viewroom();
	  		
	  		hp.book();
	  		
	  		String Email=Utility_Class.getpfdata(1,5, "Sheet1");
	  		hp.email(Email);
	  		
	  		String Phone=Utility_Class.getpfdata(1,6, "Sheet1");
	  		hp.phone(Phone);
	  		
	  		String Adultfirst=Utility_Class.getpfdata(1,7, "Sheet1");
	  		hp.adultfirstname(Adultfirst);
	  		
	  		String Adultlast=Utility_Class.getpfdata(1,8, "Sheet1");
	  		hp.adultlastname(Adultlast);
	  		
	  		String Childfirst=Utility_Class.getpfdata(1,9, "Sheet1");
	  		hp.childfirstname(Childfirst);
	  		
	  		String Childlast=Utility_Class.getpfdata(1,10, "Sheet1");
	  		hp.childlastname(Childlast);
	  		
	  		hp.continuetopayment();
	  		
//	  		hp.upi(); 		
//	  		hp.upiid();
//	  		hp.wallet();
//	  		hp.radio();
	  		
	  		//hp.creditdebit();
	  		String Cardno=Utility_Class.getpfdata(1,11, "Sheet1");
	  		hp.cardno(Cardno);
	  		
	  		String Nameoncard=Utility_Class.getpfdata(1,12, "Sheet1");
	  		hp.nameoncard(Nameoncard);
	  		
	  		String Cvv=Utility_Class.getpfdata(1,13, "Sheet1");
	  		hp.cvv(Cvv);
	  		
	  		hp.checkbox();
	  		

	  		//hp.Backhomepage();
	  		

	  	}
}
	  

  

