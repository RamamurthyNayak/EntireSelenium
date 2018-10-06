package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageWithFrameAndTextField {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Desktop/p1.html");

		//using Index : entering the value in text2 field within "frame"and then into Text1

		d.switchTo().frame("f1");
		d.findElement(By.id("t2")).sendKeys("A");
		d.switchTo().parentFrame();
		d.findElement(By.id("t1")).sendKeys("A");

		//using ID : entering the value in text2 field within "frame" and then into Text1
		
		d.switchTo().frame("f1");
		d.findElement(By.id("t2")).sendKeys("B");
		d.switchTo().defaultContent();
		d.findElement(By.id("t1")).sendKeys("B");
		
		//using address : entering the value in text2 field within "frame" and then into Text1
		
			WebElement e = d.findElement(By.tagName("iframe"));
			d.switchTo().frame(e);
			d.findElement(By.id("t2")).sendKeys("C");
			d.switchTo().parentFrame();
			d.findElement(By.id("t1")).sendKeys("C");
		
		
	}

}
