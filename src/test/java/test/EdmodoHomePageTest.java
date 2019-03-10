package test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EdmodoHomePage;
import testbase.SetUp;

public class EdmodoHomePageTest extends SetUp{
	EdmodoHomePage t1;
	@BeforeMethod
	public void open(){
		openbrowser();
		t1=PageFactory.initElements(driver, EdmodoHomePage.class);
	}
	@Test(groups="home")
	public void testCase1() throws Exception{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Edmodo");
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC1.jpg");
	}
	@Test(groups="home")
	public void testCase2() throws Exception{
		boolean z=t1.admin();
		Assert.assertTrue(z);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC2.jpg");
		System.out.println(driver.getTitle());
	}
	@Test(groups="home")
	public void testCase4() throws Exception{
		boolean x=t1.teacher();
		Assert.assertTrue(x);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC4.jpg");
		System.out.println(driver.getTitle());
	}
	@Test(groups="home")
	public void testCase6() throws Exception{
		boolean x=t1.student();
		Assert.assertTrue(x);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC6.jpg");
		System.out.println(driver.getTitle());
	}
	@Test(groups="home")
	public void testCase8() throws Exception{
		boolean x=t1.parent();
		Assert.assertTrue(x);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC8.jpg");
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void close(){
		driver.close();
	}

}
