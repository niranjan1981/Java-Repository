package NiranjanJoshi.NiranjanClass;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
public class GmailLogin {
	
WebDriver driver;
	
	public GmailLogin(WebDriver driver){
		
		this.driver = driver;
	}

	@FindBy(xpath="//*[@id='Email']")
	public WebElement username;
	
	@FindBy(xpath="//*[@id='Passwd']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='signIn']")
	public WebElement signInButton;
	
	
	//Business Logic
	public void doLogin(String myUsername, String myPassword){
		
		username.sendKeys(myUsername);
		password.sendKeys(myPassword);
		signInButton.click();
	}
	
}
