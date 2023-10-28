package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBckbtn;
	
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSelectDd() {
		return selectDd;
		
	}
	
public WebElement getFeedBckbtn() {
		return feedBckbtn;
		
	}
}
