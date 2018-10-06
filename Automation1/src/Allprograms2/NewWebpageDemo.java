package Allprograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWebpageDemo {


	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Desktop/New webpage.html");
		List<WebElement> allLinks= d.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);

		//for(int i=0;i<count;i++){
//		WebElement link = allLinks.get(i);
//		String text = link.getText();
//		String url = link.getAttribute("href");
//		System.out.println(text+"---->"+url);
			
			
			for (WebElement link : allLinks) {
				String text = link.getText();
				String url = link.getAttribute("href");
				System.out.println(text+"---->"+url);
				
			}


		}
	}

