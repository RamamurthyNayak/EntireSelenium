package Allprograms2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifySortedorNOT {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.Facebook.com");

		WebElement listbox = d.findElement(By.id("month"));

		Select s=new Select(listbox);
		
		//d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> allOptions = s.getOptions();
		
	
		ArrayList<String> allText1=new ArrayList<String>();

		for (WebElement option : allOptions) {
			allText1.add(option.getText());
		}
		ArrayList<String> allText2=new ArrayList<String>();
		Collections.sort(allText2);
		
		
		System.out.println("Defualt option order :"+allText1);
		

		if(allText1.equals(allText2)){
			System.out.println("ListBox contents are sorted");
		}
		else
		{
			System.out.println("Dropdown menu options are NOT sorted");
		}


	}

}
