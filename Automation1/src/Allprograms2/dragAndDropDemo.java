package Allprograms2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = d.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = d.findElement(By.xpath("//h1[.='Block 3']"));

		
		Actions a=new Actions(d);
		a.dragAndDrop(source, target).perform();
		

		//*Uses of Action class
		
//		1.Mouse Hover
//		2.Composite action(hold Cntrl and Press/click link)
//		3.Context CLick(righ click on any link)
//		4.Double Click
//		5.Drag and Drop
		

	}

}
