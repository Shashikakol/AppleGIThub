package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testscripts 
{
public static void main(String[] args) 
{
	System.setProperty("Webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	 FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://www.google.com/");
}
}
