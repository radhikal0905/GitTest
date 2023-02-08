//Hello Radhika Changes from Test Branch

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	}

}
