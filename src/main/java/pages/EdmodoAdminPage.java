package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.SetUp;

public class EdmodoAdminPage extends SetUp {
	@FindBy(xpath="//*[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//a[@href='index.php']")WebElement dboard;
	@FindBy(xpath="html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/div[1]")WebElement tStudents;
	@FindBy(xpath="html/body/div[2]/div[1]/section[2]/div[1]/div[2]/div/div[1]")WebElement tEmployees;
	@FindBy(xpath="html/body/div[2]/div[1]/section[2]/div[1]/div[3]/div/div[1]")WebElement tCrouses;
	@FindBy(xpath="html/body/div[2]/div[1]/section[2]/div[1]/div[4]/div/div[1]")WebElement tBatches;
	@FindBy(xpath="html/body/div[2]/div[1]/section[2]/div[1]/div[4]")WebElement ex;
	
	public EdmodoAdminPage(){
		PageFactory.initElements(driver, this);
	}
	public boolean dashBoard(){
		boolean x=dashboard.isDisplayed();
		dashboard.click();
		dboard.click();
		return x;
	}
	public String totalStudents(){
		String title=tStudents.getText();
		String color=tStudents.getCssValue("background-color");
		System.out.println(color);
		return title;
	}
	public String totalEmployees(){
		String title=tEmployees.getText();
		String color=tEmployees.getCssValue("background-color");
		System.out.println(color);
		return title;
	}
	public String totalCourses(){
		String title=tCrouses.getText();
		String color=tCrouses.getCssValue("background-color");
		System.out.println(color);
		return title;
	}
	public String totalBatches(){
		String title=tBatches.getText();
		String color=tBatches.getCssValue("background-color");
		System.out.println(color);
		return title;
	}

}
