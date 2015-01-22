package NiranjanJoshi.NiranjanClass;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

public class GmailMainClass {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.get("https://www.gmail.com");
		
		GmailLogin newLogin = PageFactory.initElements(firefox, GmailLogin.class);
		newLogin.doLogin("nvkrjoshi.test", "nvkrjoshi");
		Thread.sleep(5000);
		firefox.getTitle();
		GmailInboxPage InboxPage = PageFactory.initElements(firefox, GmailInboxPage.class);
		InboxPage.composeClick();
		Thread.sleep(5000);
		
		InboxPage.composeEmail("asdjj", "ssdasd", "dasdas");
	}

}
