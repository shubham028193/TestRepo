
package com.WebDriverDemos;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	

	public class D02LaunchingFirefox {

		public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver","E:\\Selenium_Jar_Files\\edgedriver_win64\\msedgedriver.exe");
			 
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in/");
			
			driver.close();
		}  

	}

