package Allprograms2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//To understand the usage of drop down menu options

public class MyHotelDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Desktop/MyHotel.html");
		WebElement listbox = d.findElement(By.id("SLV"));

		Select s=new Select(listbox);


		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		//s.selectByVisibleText("Poori");//even if the same action is repeated,it does not make any changes to functionality
		s.selectByVisibleText("Vada");

		List<WebElement> a = s.getAllSelectedOptions();
		System.out.println("Total count of selected items="+a.size());

		WebElement b = s.getFirstSelectedOption();
		System.out.println("Name of first option selected by sequence="+b.getText());

		List<WebElement> c = s.getOptions();
		System.out.println("Total size of options available ="+c.size());
	

		if(s.isMultiple()){

			System.out.println("Yes,we can deselect");

			s.deselectByIndex(0);
			s.deselectByValue("v");
			s.deselectByVisibleText("Dosa");
			s.deselectAll();
		}
		else{

			System.out.println("Sorry can't use deselect on single select list box");
		
		
		//for the second panel in web page
//		WebElement dropdown = d.findElement(By.id("MTR"));
//		
//		Select s=new Select(dropdown);
//		s.selectByIndex(1);
//		s.selectByValue("m");
//		s.selectByVisibleText("Milk");
//		List<WebElement> allOpt = s.getAllSelectedOptions();
//		System.out.println(allOpt.size());
//		List<WebElement> o = s.getOptions();
//		for (WebElement ops : o) {
//			System.out.println(ops.getText());
//			
//				}
//		System.out.println(s.isMultiple());
		}
	}

}



