package NiranjanJoshi.NiranjanClass;

import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxTestOne {

	public static void main(String[] args) {
		
		getTitle();
	
	}
	
	public static String getTitle(){
		
		FirefoxDriver firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.get("https://www.wikipedia.com");
		System.out.println(firefox.getTitle());
		return firefox.getTitle();
	}

}
