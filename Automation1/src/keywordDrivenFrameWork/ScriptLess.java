package keywordDrivenFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Framework.Utility;

public class ScriptLess {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}

	public static void main(String[] args)throws InterruptedException {
		
		
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://demo.actitime.com");
		for (int i = 1; i<4; i++) {
			String k1 = Utility.getXLData("./input/data.xlsx", "Keys", i,0);	
			String k2 = Utility.getXLData("./input/data.xlsx", "Keys", i,1);	
			String k3 = Utility.getXLData("./input/data.xlsx", "Keys", i,2);	

			System.out.println("k1:"+k1);
			System.out.println("k2:"+k2);
			System.out.println("k3:"+k3);


			String xpath = Utility.getPropertyValue("./input/elements.properties", k2);

			if(k1.equals("enter")){
				d.findElement(By.xpath(xpath)).sendKeys(k3);
			}
			else if(k1.equals("click")){
				d.findElement(By.xpath(xpath)).click();
			}
			else{

				System.out.println("invalid k1");


			}
			Thread.sleep(1000);

		}

		d.close();
	}

}
