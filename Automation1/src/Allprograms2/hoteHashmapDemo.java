package Allprograms2;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hoteHashmapDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/Admin/Desktop/MyHotel2.html");

		WebElement listBox = d.findElement(By.id("SLV"));
		Select s=new Select(listBox);
		List<WebElement> allOptions = s.getOptions();

		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();

		for (WebElement option : allOptions) {

			String key = option.getText();
			
			
			if(map.containsKey(key)){
				Integer value = map.get(key);
				value++;
				map.put(key, value);

			}
			else{
				map.put(key, 1);
			}

		}

		//Q5
		System.out.println("List goes :"+map);

		//Q6
		String n="Idly";
		if(map.get(n)>1){
			System.out.println(n+" is duplicated,i mean displayed multiple times under drop down menu");
		}
		else{
			System.out.println(n+"is not duplication");
		}

		//Q7

		System.out.println("Q7:"+map.keySet());
		//Q8
		for (String key : map.keySet()) {
			if(map.get(key)==1){
				System.out.println("Key:no duplicates"+key);
			}

		}

		//Q9
		for (String key : map.keySet()) {

			if(map.get(key)>1){
				System.out.println("unique:mean which are double"+key);

			}

			
		}

		d.close();
	}
}
