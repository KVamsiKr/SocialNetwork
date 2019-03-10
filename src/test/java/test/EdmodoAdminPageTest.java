package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EdmodoAdminPage;
import pages.EdmodoHomePage;
import pages.EdmodoLoginPage;
import testbase.SetUp;

public class EdmodoAdminPageTest extends SetUp {
	EdmodoAdminPage t3;
	EdmodoHomePage t1;
	EdmodoLoginPage t2;
	@BeforeMethod
	public void open(){
		openbrowser();
		t1=PageFactory.initElements(driver, EdmodoHomePage.class);
		t2=PageFactory.initElements(driver, EdmodoLoginPage.class);
		t3=PageFactory.initElements(driver, EdmodoAdminPage.class);
	}
	@Test
	public void testCase10() throws Exception{
		t1.admin();
		t2.login("ramkig@gmail.com", "123456");
		boolean z=t3.dashBoard();
		Assert.assertTrue(z);
		Thread.sleep(5000);
		
		String title=t3.totalStudents();
		if(title.contains("TOTAL STUDENTS"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		String title1=t3.totalEmployees();
		if(title1.contains("Total Employees"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		String title2=t3.totalCourses();
		if(title2.contains("Total Courses"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		String title3=t3.totalBatches();
		if(title3.contains("Total batches"))
			System.out.println("pass");
		else
			System.out.println("fail");
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
