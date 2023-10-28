package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;
	
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	
	public WebElement getSearchTf() {
		return searchTf;
	}

	

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public void gearsButton() {
		gearsbtn.click();
		}
	public void SkillraryDemoApp() {
		skillrarydemoapp.click();
		}
	
	public void searchTexField(String data) {
		searchTf.sendKeys(data);
		}
	
	
}
