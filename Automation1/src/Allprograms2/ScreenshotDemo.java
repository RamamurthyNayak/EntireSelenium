package Allprograms2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./MozillaDriver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException {
		Date d=new Date();//Date from util section
		//Date contains : OS will not allow it as file name
		String v = d.toString();
		System.out.println(v);
		
		String v2 = v.replaceAll(":", "-");//replace all:-
		System.out.println(v2);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
				
		TakesScreenshot t=(TakesScreenshot)driver;//Type casting
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+v2+".png";
		System.out.println(path);
		File destFile=new File(path);
		FileUtils.copyDirectory(srcFile, destFile);
		driver.close();

	}

}
