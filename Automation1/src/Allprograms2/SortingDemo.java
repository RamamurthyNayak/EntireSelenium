package Allprograms2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.Facebook.com");
		
		WebElement listbox = d.findElement(By.id("month"));
		
		Select s=new Select(listbox);
		List<WebElement> allOptions = s.getOptions();
				
		ArrayList<String> allText=new ArrayList<String>();
				
		for (WebElement option : allOptions) {
			allText.add(option.getText());
			
		}
		
		Collections.sort(allText);
		for (String text : allText) {
			System.out.println(text);
		}
		d.close();
	}

}
