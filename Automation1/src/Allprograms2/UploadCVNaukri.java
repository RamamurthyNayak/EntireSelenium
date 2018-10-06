package Allprograms2;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UploadCVNaukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.get("https://www.naukri.com");
		d.findElement(By.xpath("//span[text()='Later']")).click();
		File f=new File("./CV/Ram_Resume.docx");
		String path=f.getAbsolutePath();
		d.findElement(By.id("input_resumeParser")).sendKeys(path);
		

		String msg = d.findElement(By.className("success")).getText();
		System.out.println(msg);
		
	}

}
