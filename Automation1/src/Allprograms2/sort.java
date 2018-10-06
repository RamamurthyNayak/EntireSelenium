package Allprograms2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sort {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.Facebook.com");

		WebElement listBox = d.findElement(By.id("day"));
		Select s=new Select(listBox);
		List<WebElement> compList = s.getOptions();

		ArrayList<String> allVal=new ArrayList<String>();

		for (WebElement ele : compList) {
			System.out.println("Default dropdown value:"+ele.getText());

			allVal.add(ele.getText());

		}

		Collections.sort(allVal);
		for (String SL : allVal) {
		System.out.println(SL);
		}

	}

}
