package com.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;

public abstract class TC1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinuim\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		HomePage page= new HomePage(driver);
		page.searchFiled("Foodics");
		
		page.SearchBTN();
		
		page.clear();
		
		page.searchFiled("HI Im Ali");
		
		page.searchafterhome();
		
		

	}

}
