package Allprograms2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriB {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com");
		Set<String> allWHS = d.getWindowHandles();
		for (String wh : allWHS) {
			d.switchTo().window(wh);
			String titles = d.getTitle();
			System.out.println(titles);
			//if(titles.equals("Amazon"))
		d.quit();
		}
		
			
	}

}
