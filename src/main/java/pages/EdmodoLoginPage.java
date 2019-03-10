package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.SetUp;

public class EdmodoLoginPage extends SetUp{
	@FindBy(xpath="//input[@type='text']")WebElement Uname;
	@FindBy(xpath="//input[@type='password']")WebElement Pwd;
	@FindBy(xpath="//*[@class='iCheck-helper']")WebElement RMe;
	@FindBy(xpath="//button[@type='submit']")WebElement Submit;
	@FindBy(xpath="//*[@class='btn btn-block btn-social btn-facebook btn-flat']")WebElement FB;
	@FindBy(xpath="//*[text()='I forgot my password']")WebElement FPwd;
	@FindBy(xpath="//*[@class='btn btn-block btn-social btn-google btn-flat']")WebElement Google;
	public EdmodoLoginPage (){
		PageFactory.initElements(driver, this);
	}
	public boolean login(String u,String p){
		Uname.clear();
		Uname.sendKeys(u);
		Pwd.clear();
		Pwd.sendKeys(p);
		RMe.click();
		boolean x=RMe.isEnabled();
		Submit.click();
		return x;
	}
	public boolean forgotPassword(){
		boolean y=FPwd.isDisplayed();
		FPwd.click();
		return y;
	}
	public boolean faceBookLogin(){
		boolean y=FB.isDisplayed();
		FB.click();
		return y;
	}
	public boolean googleLogin(){
		boolean y=Google.isDisplayed();
		Google.click();
		return y;
	}
	
}
