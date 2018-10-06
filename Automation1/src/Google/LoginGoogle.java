package Google;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginGoogle {

	//declaration
	@FindBy(xpath="//a")
	private List<WebElement> links;

	//Initialization

	public LoginGoogle(WebDriver d){
		PageFactory.initElements(d, this);
	}

	//Utilization

	public void PrintAllLinkCount(String un){
		int count = links.size();
		System.out.println(count);
		
	}

}



