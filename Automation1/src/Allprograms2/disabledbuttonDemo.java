package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class disabledbuttonDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();

		d.get("file:///C:/Users/Admin/Desktop/disabledbuttondemo.html");

		//d.findElement(By.id("t1")).sendKeys("abc");---> this wont  work,so write it under inspect->Console

		String newName="document.getElementById('t1').value='Rahim';";//this is sourced from code in console

		JavascriptExecutor j=(JavascriptExecutor)d;

		j.executeScript(newName);


	}

}
