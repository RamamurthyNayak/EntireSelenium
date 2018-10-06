package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageScrollDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();

		d.get("https://www.actitime.com/license-agreement");
		//String xp = "//h2[text()='15. Miscellaneous']";
		String xp = "//h3[text()='13. Export Controls']";
		
		WebElement e = d.findElement(By.xpath(xp));
		
		int x = e.getLocation().getX();
		System.out.println(x);
		int y = e.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollTo("+x+","+y+")");//scrolls downwords to "Miscelleneous"  header 
			
		}

	}


