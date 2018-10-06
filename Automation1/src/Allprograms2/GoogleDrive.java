package Allprograms2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDrive {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
			}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://drive.google.com");

	}

}
