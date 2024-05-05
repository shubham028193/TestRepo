package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\Selenium_Jar_Files\\edgedriver_win64\\msedgedriver.exe");
		String expTitle = "Google", actTitle;
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		actTitle = driver.getTitle();
		System.out.println("Title is: " + actTitle);
		
		/*if(expTitle.equals(actTitle))
		{
			System.out.println("Title matching!!! Test case Pass");
		}
		else
		{
			System.out.println("Title NOT matching!!! Test case Fail");
		}*/
		
		if(actTitle.contains("oogl"))
			System.out.println("Title matching!!! Test case Pass");
		else
			System.out.println("Title NOT matching!!! Test case Fail");
		
		driver.close();
	}

}