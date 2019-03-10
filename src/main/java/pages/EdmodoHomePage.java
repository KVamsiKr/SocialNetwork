package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.SetUp;

public class EdmodoHomePage extends SetUp {
	@FindBy(xpath="//*[text()='Admin Login']")WebElement adminLinkText;
	@FindBy(xpath="//*[text()='Teacher Login']")WebElement teacherLinkText;
	@FindBy(xpath="//*[text()='Parent Login']")WebElement parentLinkText;
	@FindBy(xpath="//*[text()='Student Login']")WebElement studentLinkText;
	public EdmodoHomePage(){
		PageFactory.initElements(driver, this);
	}
	public boolean admin(){
		boolean x=adminLinkText.isDisplayed();
		String y=adminLinkText.getText();
		System.out.println(y);
		adminLinkText.click();
		return x;
	}
	public boolean teacher(){
		boolean x=teacherLinkText.isDisplayed();
		String y=teacherLinkText.getText();
		System.out.println(y);
		teacherLinkText.click();
		return x;
	}
	public boolean parent(){
		boolean x=parentLinkText.isDisplayed();
		String y=parentLinkText.getText();
		System.out.println(y);
		parentLinkText.click();
		return x;
	}
	public boolean student(){
		boolean x=studentLinkText.isDisplayed();
		String y=studentLinkText.getText();
		System.out.println(y);
		studentLinkText.click();
		return x;
	}

}
