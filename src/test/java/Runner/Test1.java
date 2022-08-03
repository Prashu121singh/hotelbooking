package Runner;

import org.testng.annotations.Test;

import LIbraryFiles.BasePage;

public class Test1 extends BasePage {

	@Test(dataProvider="dataDriven" )
	public void test1(String place,String InMonth,String InDate,String OutMonth,String OutDate){
		
		System.out.println(place +" | "+InMonth +" | "+InDate +" | "+OutMonth+" | "+ OutDate);
	}
}
