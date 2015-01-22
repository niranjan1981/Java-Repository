package NiranjanJoshi.NiranjanClass;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class GmailInboxPage {
	
	WebDriver driver;
	
	public GmailInboxPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	
	
	@FindBy(xpath="//*[@id=':4s']/div/div") 
	public WebElement composeButton ;
	
	
	
	//WebElement popUpRecepient = driver.findElement(By.xpath("//*[@id=':fr']")); //*[@id=':f7']
	@FindBy(xpath="//*[@id=':f7']")  
	public WebElement popUpRecepient;
	
	@FindBy(xpath="//*[@id=':fh']")
	public WebElement popUpSubject;
	
	@FindBy(xpath="//*[@id=':ef']")
	public WebElement popUpMessage;
	
	public void composeClick(){
		composeButton.click();
		
	}
	
	public void composeEmail(String recepient, String subject, String message){
		driver.switchTo().frame("canvas_frame");
		popUpRecepient.sendKeys(recepient);
		popUpSubject.sendKeys(subject);
		popUpMessage.sendKeys(message);
		
	}
}
