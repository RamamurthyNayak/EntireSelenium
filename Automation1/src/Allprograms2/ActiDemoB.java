package Allprograms2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDemoB {
	
	//Program to capture the title of Homepage
	
	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();

		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();

		//note: we  can  manage  with while loop also : while(true){
		for(int i=1;i<=100;i++){
			String title=d.getTitle();
			if(title.contains("Enter")){
				System.out.println(title);
				break;
				
			}
			else{
				System.out.println("Still login page:Iteration->"+i);
			}
		
		}
d.close();
	}

}
