package Allprograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownfetchonFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.facebook.com");

		WebElement listbox = d.findElement(By.id("month"));

		Select s=new Select(listbox);


		List<WebElement> allOptions = s.getOptions();


//				for(int i=1;i<allOptions.size();i++){
//				WebElement option = allOptions.get(i);
//				String text = option.getText();
//				System.out.println(text);




		for (WebElement option : allOptions) {

			System.out.println(option.getText());

		}


	}

}
