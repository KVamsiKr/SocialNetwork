package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EdmodoHomePage;
import pages.EdmodoLoginPage;
import testbase.SetUp;

public class EdmodoLoginPageTest extends SetUp {
	EdmodoHomePage t1;
	EdmodoLoginPage t2;
	@BeforeMethod
	public void open(){
		openbrowser();
		t1=PageFactory.initElements(driver, EdmodoHomePage.class);
		t2=PageFactory.initElements(driver, EdmodoLoginPage.class);
	}
	@Test(groups="login")
	public void testCase3() throws Exception{
		t1.admin();
		boolean z=t2.login("ramkig@gmail.com", "123456");
		Assert.assertEquals(z, true);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC3.jpg");
		System.out.println(driver.getTitle());
	}
	@Test(groups="login")
	public void testCase5() throws Exception{
		t1.teacher();
		boolean z=t2.login("vk.emp@kvk.in", "123456");
		Assert.assertEquals(z, true);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC5.jpg");
		System.out.println(driver.getTitle());
	}
	@Test(groups="login")
	public void testcase7() throws Exception{
		t1.student();
		boolean z=t2.login("vamsi@edmodo.in", "123456");
		Assert.assertEquals(z, true);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC7.jpg");
		System.out.println(driver.getTitle());	
	}
	@Test(groups="login")
	public void testcase9() throws Exception{
		t1.parent();
		boolean z=t2.login("krishna@edmodo.in", "123456");
		Assert.assertEquals(z, true);
		Thread.sleep(5000);
		screenShot("C:/Users/acer/Desktop/social network/Edmodo/ScreenshotsResult/TC9.jpg");
		System.out.println(driver.getTitle());	
	}
	@AfterMethod
	public void close(){
		driver.close();
	}
	
}
