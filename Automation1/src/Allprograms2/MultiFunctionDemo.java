package Allprograms2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFunctionDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver/geckodriver.exe");
	}


	public static void main(String[] args) {
		//To get the source code of entered pages//
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.naukri.com");
		/*String src = driver.getPageSource();
		System.out.println(src);*/

		/*------------------------------------------------------------------*/
		//to get the present website link name//
		/*String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();*/
		/*------------------------------------------------------------------*/

		driver.get("https://www.google.com");
		driver.navigate().to("https://www.naukri.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Dimension dime = driver.manage().window().getSize();
		System.out.println(dime);
		driver.quit();
	}
}
