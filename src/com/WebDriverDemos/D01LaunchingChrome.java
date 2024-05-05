package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class D01LaunchingChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\Selenium_Jar_Files\\edgedriver_win64\\msedgedriver.exe");
       WebDriver driver = new EdgeDriver();
	}

}
